package com.rosezahramohammadi.zookeeper2;

public class Mammal {
	protected int energyLevel;

	public Mammal() {
	}

	public int getEnergyLevel() {
		System.out.println(energyLevel);
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
