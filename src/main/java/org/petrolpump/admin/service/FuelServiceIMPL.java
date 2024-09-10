package org.petrolpump.admin.service;

import java.util.List;

import org.petrolpump.admin.model.FuelTypeModel;
import org.petrolpump.admin.repository.*;
public class FuelServiceIMPL implements FuelService{
	FuelRepository frepo=new FuelRepositoryIMPL();
	public boolean isAddFuelModel(FuelTypeModel fmodel) {
		
		return frepo.isAddFuelType(fmodel);
	}
	@Override
	public List<FuelTypeModel> getAllFuelType() {
		
		return frepo.getAllFuelType();
	}
	@Override
	public boolean isDeleteFuelById(int typeid) {
		
		return frepo.isDeleteFuelById(typeid);
	}
	@Override
	public boolean isUpdateFuel(FuelTypeModel fmodel) {
		
		return frepo.isUpdateFuel(fmodel);
	}
	

}
