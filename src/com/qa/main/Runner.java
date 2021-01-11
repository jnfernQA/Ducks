package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Duck duck1 = new Duck("Mallard", true, 12, 80);
		Duck duck2 = new Duck("Marbled Duck", false, 10, 40);
		Duck duck3 = new Duck("Alabio Duck", false, 10,50);
		
		Duck.ducks.add(duck1);
		Duck.ducks.add(duck2);
		Duck.ducks.add(duck3);
		
		//1.Print out Entire Duck List
		System.out.println(Duck.ducks.toString());
		
		//2.Print out the Duck that is a Mallard
		
		//System.out.println(Duck.ducks.findtheMallard(true));

	}

}
