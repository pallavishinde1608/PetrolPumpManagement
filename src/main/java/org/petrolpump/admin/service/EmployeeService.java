package org.petrolpump.admin.service;

import java.util.List;

import org.petrolpump.admin.model.EmployeeModel;
import org.petrolpump.admin.model.FuelTypeModel;

public interface EmployeeService {
    public boolean isAddEmployee(EmployeeModel emodel);
    public List<EmployeeModel> getAllEmployee();
    public boolean allocateMachine(int eid,int mid,String ...x);
    public boolean isDeleteEmpById(int eid);
	public boolean isUpdateEmp(EmployeeModel emodel);
	public int verifyEmployee(String email,String contact); 

}
