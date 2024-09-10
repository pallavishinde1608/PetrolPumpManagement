package org.petrolpump.admin.repository;

import java.util.List;

import org.petrolpump.admin.model.FuelTypeModel;

public interface FuelRepository {
	public boolean isAddFuelType(FuelTypeModel fmodel);
	public List<FuelTypeModel> getAllFuelType();
	public boolean isDeleteFuelById(int typeid);
	public boolean isUpdateFuel(FuelTypeModel fmodel);

}
