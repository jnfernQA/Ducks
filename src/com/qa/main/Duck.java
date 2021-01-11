package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class Duck {
	
	private String name;
	private boolean isAMallard;
	private int lifeSpan;
	private int wingSpan;
	
	//Method
	
	public Duck(String name, boolean isAMallard, int lifeSpan, int wingSpan) {
		this.name = name;
		this.isAMallard = isAMallard;
		this.lifeSpan = lifeSpan;
		this.wingSpan = wingSpan;
	}
	
	//Duck Manager
	static List<Duck> ducks = new ArrayList<>();
	
	public Duck findtheMallard(boolean isAMallard) {
		for (Duck d : ducks) {
			if (d.getIsAMallard() == true) {
				System.out.println(ducks);
				return d;
			}else {
				System.out.println(ducks);
			}
		}
		System.out.println("Input to Find the Mallard is true or false");
		return null;
	}
	
	
	//getters and setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean getIsAMallard() {
		return isAMallard;
	}
	
	public void setIsAMallard(boolean isAMallard) {
		this.isAMallard = isAMallard;
	}
	
	public int getLifeSpan() {
		return lifeSpan;
	}
	
	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}
	
	public int getWingSpan() {
		return wingSpan;
	}
	
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	
	@Override
	public String toString() {
		return "Duck [name = " + name + ", Is it a Mullard = "+ isAMallard +", LifeSpan = "+ lifeSpan+" years, Wing-Span = "+ wingSpan+" cm]";
	}

}
