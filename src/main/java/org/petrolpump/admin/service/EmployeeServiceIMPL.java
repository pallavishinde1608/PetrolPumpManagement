package org.petrolpump.admin.service;

import java.util.List;

import org.petrolpump.admin.model.EmployeeModel;
import org.petrolpump.admin.repository.*;
public class EmployeeServiceIMPL implements EmployeeService{
EmployeeRepository erepo=new EmployeeRepositoryIMPL();
	@Override
	public boolean isAddEmployee(EmployeeModel emodel) {
		
		return erepo.isAddEmployee(emodel);
	}
	@Override
	public List<EmployeeModel> getAllEmployee() {
		
		return erepo.getAllEmployee();
	}
	@Override
	public boolean allocateMachine(int eid, int mid, String... x) {
		// TODO Auto-generated method stub
		return erepo.allocateMachine(eid, mid, x);
	}
	@Override
	public boolean isDeleteEmpById(int eid) {
		
		return erepo.isDeleteEmpById(eid);
	}
	@Override
	public boolean isUpdateEmp(EmployeeModel emodel) {

		return erepo.isUpdateEmp(emodel);
	}
	@Override
	public int verifyEmployee(String email, String contact) {
		// TODO Auto-generated method stub
		return erepo.verifyEmployee(email, contact);
	}
	

}
