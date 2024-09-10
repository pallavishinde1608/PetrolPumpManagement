package org.petrolpump.admin.service;

import java.util.List;

import org.petrolpump.admin.model.MachineModel;
import org.petrolpump.admin.repository.MachineRepositoryIMPL;

public class MachineServiceIMPL implements MachineService{
	MachineRepositoryIMPL m=new MachineRepositoryIMPL();
	@Override
	public boolean isAddMachine(MachineModel model,String typeid[],String capacity[]) {
		
		return m.isAddMachine(model,typeid,capacity);
	}
	public List<Object[]> getAllMachine() {
      
		return m.getAllMachine();
	}
	@Override
	public boolean isDeleteMachineById(int mid) {
		
		return m.isDeleteMachineById(mid);
	}
	@Override
	public boolean isUpdatemachine(MachineModel model) {
	
		return m.isUpdateMachine(model);
	}

}
