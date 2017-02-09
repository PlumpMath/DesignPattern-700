package com.getitstart.designpattern.builder;

public class test {
	public static void main(String[] args) {
		TextBuilder textbuilder= new TextBuilder();
		Director director = new Director(textbuilder);
		director.construct();
		String result = textbuilder.getResult();
		System.out.println(result);
	}
}
