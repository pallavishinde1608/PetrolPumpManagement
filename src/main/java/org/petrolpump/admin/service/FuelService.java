package org.petrolpump.admin.service;

import java.util.List;

import org.petrolpump.admin.model.FuelTypeModel;
import org.petrolpump.admin.model.MachineModel;

public interface FuelService {
      public boolean isAddFuelModel(FuelTypeModel fmodel);
      public List<FuelTypeModel> getAllFuelType();
	  public boolean isDeleteFuelById(int mid);
	  public boolean isUpdateFuel(FuelTypeModel fmodel);
      
}
