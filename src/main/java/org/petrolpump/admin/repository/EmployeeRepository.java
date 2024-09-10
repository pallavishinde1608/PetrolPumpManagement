package org.petrolpump.admin.repository;

import java.util.List;

import org.petrolpump.admin.model.EmployeeModel;

public interface EmployeeRepository {
    public boolean isAddEmployee(EmployeeModel emodel);
    List<EmployeeModel> getAllEmployee();
    public boolean allocateMachine(int eid,int mid,String ...x);
	public boolean isDeleteEmpById(int eid);
	public boolean isUpdateEmp(EmployeeModel emodel);
	public int verifyEmployee(String email,String contact);
}
