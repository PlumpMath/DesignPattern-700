package com.getitstart.designpattern.strategy;

public class test {
	public static void main(String[] args) {
		String[] data = {
				"Dumpt","Bowman","Carroll","Elfland","Alice",
		};
		SortAndPrint sap = new SortAndPrint(data, new QuickSort());
		sap.excute();
	}
}
