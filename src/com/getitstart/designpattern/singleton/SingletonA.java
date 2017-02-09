package com.getitstart.designpattern.singleton;

public class SingletonA {
	private static SingletonA sl = new SingletonA();
	private SingletonA(){
		System.out.println("got a new instence");
	}
	public static SingletonA getInstence(){
		return sl;
	}
}
