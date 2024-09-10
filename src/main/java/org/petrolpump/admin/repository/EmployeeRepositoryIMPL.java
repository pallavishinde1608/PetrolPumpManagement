package org.petrolpump.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.petrolpump.admin.config.DBConfig;
import org.petrolpump.admin.model.EmployeeModel;

public class EmployeeRepositoryIMPL extends DBConfig implements EmployeeRepository{
     int empId=0;
     List<EmployeeModel> list=new ArrayList<EmployeeModel>();
	public int getEmployeeIdAutomatic()
    {
    	try {
    		stmt=conn.prepareStatement("select max(eid) from employee");
    		rs=stmt.executeQuery();
    		if(rs.next())
    		{
    			empId=rs.getInt(1);
    			
    		}
    		return ++empId;
    		
    	}
    	catch(Exception ex)
    	{
    	   return -1;
    	}
    }
	
	public boolean isAddEmployee(EmployeeModel emodel)
	{
		try {

			int eid=this.getEmployeeIdAutomatic();
			stmt=conn.prepareStatement("insert into employee values(?,?,?,?,?,?)");
		    stmt.setInt(1, eid);
		    stmt.setString(2,emodel.getName());
		    stmt.setString(3,emodel.getEmail());
		    stmt.setString(4,emodel.getContact());
		    stmt.setString(5,emodel.getAddress());
		    stmt.setInt(6,emodel.getSal());
		    int value=stmt.executeUpdate();
		    return value>0?true:false;
		
		}
		catch(Exception ex)
		{
			System.out.println("erro in add employee is "+ex);
			return false;
		}
	}
	public List<EmployeeModel> getAllEmployee()
	{
		try{
			stmt=conn.prepareStatement("select *from employee");
			rs=stmt.executeQuery();
			while(rs.next())
			{
			    EmployeeModel emodel=new EmployeeModel();
				emodel.setId(rs.getInt("eid"));
				emodel.setName(rs.getString("name"));
				emodel.setEmail(rs.getString("email"));
				emodel.setContact(rs.getString("contact"));
				emodel.setAddress(rs.getString("address"));
				emodel.setSal(rs.getInt("salary"));
				list.add(emodel);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex)
		{
			System.out.println("error is employee not view.."+ex);
			return null;
		}
		
		
	}

	@Override
	public boolean allocateMachine(int eid, int mid, String... x) {
		try {
			stmt=conn.prepareStatement("insert into employeemachinejoin value(?,?,?,?,?)");
			stmt.setInt(1,eid);
			stmt.setInt(2, mid);
			stmt.setString(3,x[0]);
			stmt.setString(4, x[1]);
			String split[]=x[2].split("-");
			java.sql.Date d=new java.sql.Date(Integer.parseInt(split[0])-1900,Integer.parseInt(split[1]),Integer.parseInt(split[2]));
			stmt.setDate(5,d);
//			 String newYear=dateSplit[2].substring(2,dateSplit[2].length());
//			  Date sqlDate=new Date((Integer.parseInt(newYear)+100),m,Integer.parseInt(dateSplit[0]));
			  
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("error allocate machine "+ex);
			return false;
		}
		
	}

	@Override
	public boolean isDeleteEmpById(int eid) {
		try {
			stmt=conn.prepareStatement("delete from employee where eid=?");
			stmt.setInt(1,eid);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is employee not delete.."+ex);
			return false;
		}
		
	}

	@Override
	public boolean isUpdateEmp(EmployeeModel emodel) {
		 try {
	    	  stmt=conn.prepareStatement("update employee set name=?,email=?,contact=?,address=?,salary=? where eid=?");
	    	 stmt.setString(1,emodel.getName());
	    	 stmt.setString(2,emodel.getEmail());
	    	 stmt.setString(3,emodel.getContact());
	    	 stmt.setString(4,emodel.getAddress());
	    	 stmt.setInt(5, emodel.getSal());
	    	  stmt.setInt(6,emodel.getId());
	    	  int value=stmt.executeUpdate();
	    	  return value>0?true:false;
	      }
	      catch(Exception ex)
	      {
	    	  System.out.println("Error is "+ex);
	    	  return false;
	      }
	}

	@Override
	public int verifyEmployee(String email,String contact) {
		try {
			stmt=conn.prepareStatement("select *from employee where email=? and contact=?");
			stmt.setString(1, email);
            stmt.setString(2, contact);
            rs=stmt.executeQuery();
            if(rs.next())
            {
            	return rs.getInt(1);
            }
            else {
            	return 0;
            }
		}
		
			catch(Exception ex)
			{
				System.out.println("Error is "+ex);
				return 0;
			}
		
	}
}
	
