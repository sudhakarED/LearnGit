package com.nit.springapps.core;

public class Engine {

	private int engineId;
	private String engineModel;
	private String fuelType;

	public int getEngineId() {
		return engineId;
	}

	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}

	public String getEngineModel() {
		return engineModel;
	}

	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineModel=" + engineModel + ", fuelType=" + fuelType + "]";
	}
//changing engine again

//changing engine

}
