package org.petrolpump.admin.repository;

import java.util.ArrayList;
import java.util.List;

import org.petrolpump.admin.config.DBConfig;
import org.petrolpump.admin.model.FuelTypeModel;

public class FuelRepositoryIMPL extends DBConfig implements FuelRepository{
   List<FuelTypeModel> list=new ArrayList<FuelTypeModel>();
	@Override
	public boolean isAddFuelType(FuelTypeModel fmodel) {
		try {
			stmt=conn.prepareStatement("insert into fueltype values('0',?)");
			stmt.setString(1,fmodel.getName());
			return stmt.executeUpdate()>0?true:false;
			
		}
		catch(Exception ex)
		{
			System.out.println("Error is fuel type not added.."+ex);
			return false;
		}
		
	}

	@Override
	public List<FuelTypeModel> getAllFuelType() {
		try {
			stmt=conn.prepareStatement("select *from fueltype");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				FuelTypeModel fmodel=new FuelTypeModel();
				fmodel.setId(rs.getInt(1));
				fmodel.setName(rs.getString(2));
				list.add(fmodel);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex)
		{
			return null;
		}
		
	}

	@Override
	public boolean isDeleteFuelById(int typeid) {
		try {
			stmt=conn.prepareStatement("delete from fueltype where typeid=?");
			stmt.setInt(1, typeid);
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is not delete.."+ex);
			return false;
		}
		
	}

	@Override
	public boolean isUpdateFuel(FuelTypeModel fmodel) {
		 try {
	    	  stmt=conn.prepareStatement("update fueltype set type=? where typeid=?");
	    	 stmt.setString(1,fmodel.getName());
	    	  stmt.setInt(2,fmodel.getId());
	    	  int value=stmt.executeUpdate();
	    	  return value>0?true:false;
	      }
	      catch(Exception ex)
	      {
	    	  System.out.println("Error is "+ex);
	    	  return false;
	      }
		
	}

}
