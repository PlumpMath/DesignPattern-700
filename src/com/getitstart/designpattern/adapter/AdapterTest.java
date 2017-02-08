package com.getitstart.designpattern.adapter;

import java.io.IOException;

public class AdapterTest {

	public static void main(String[] args) {
		FileIO f = new FlieProperties();
		try {
			f.readFromFile("doc/file.txt");
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("doc/newfile.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
