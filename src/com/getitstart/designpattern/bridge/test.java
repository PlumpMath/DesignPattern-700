package com.getitstart.designpattern.bridge;

public class test {

	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("hello,china."));
		Display d2 = new CountDisplay(new StringDisplayImpl("hello,world."));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("hello,Universe."));
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
	}

}
