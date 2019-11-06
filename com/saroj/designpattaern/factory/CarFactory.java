package com.saroj.designpattaern.factory;

public abstract class CarFactory {

	public CarFactory(CarType model) {
		this.model=model;
		arrangeParts();
	}

	private void arrangeParts() {
		// TODO Auto-generated method stub
		
	}

	 // Do subclass level processing in this method
    protected abstract void construct();
	
    private CarType model = null;

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
    
}
