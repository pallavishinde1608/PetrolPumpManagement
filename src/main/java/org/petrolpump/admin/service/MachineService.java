package org.petrolpump.admin.service;

import java.util.List;

import org.petrolpump.admin.model.MachineModel;

public interface MachineService {
	public boolean isAddMachine(MachineModel model,String typeid[],String capacity[]);
    public List<Object[]> getAllMachine();
    public boolean isDeleteMachineById(int mid);
    public boolean isUpdatemachine(MachineModel model);

}
