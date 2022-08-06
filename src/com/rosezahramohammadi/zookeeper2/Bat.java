package com.rosezahramohammadi.zookeeper2;

public class Bat extends Mammal{
	
	public Bat() {
		super();
		this.energyLevel = 400;
	}
	
	public void fly() {
		energyLevel -= 50;
		setEnergyLevel(energyLevel);
		System.out.println("pings" + energyLevel);
	}
	
	public void eatHumans() {
		energyLevel +=25;
		System.out.println("yummy!" + energyLevel);
	}
	
	public void attackTown() {
		energyLevel -=100;
		System.out.println("The city is on fireee!" + energyLevel);
	}

}
