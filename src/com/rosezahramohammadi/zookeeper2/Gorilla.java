package com.rosezahramohammadi.zookeeper2;

public class Gorilla extends Mammal{
	
	public Gorilla() {
		super();
		this.energyLevel = 100;
	}
	public void throwSomething() {
		energyLevel -= 5;
		setEnergyLevel(energyLevel);
		System.out.println("Gorilla has thrown sth " + energyLevel);
	}
	public void eatBananas() {
		energyLevel += 10;
		setEnergyLevel(energyLevel);
		System.out.println("Gorilla is happy " + getEnergyLevel());
	}
	
	public void climb() {
		energyLevel -= 10;
		setEnergyLevel(energyLevel);
		System.out.println("Grilla has climbed the tree");
	}

}
