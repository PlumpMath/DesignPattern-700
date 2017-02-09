package com.getitstart.designpattern.singleton;

public class SingletonB {
	private static SingletonB sl;
	private SingletonB(){
		
	}
	public static synchronized SingletonB getInstence(){
		if(sl == null){
			sl = new SingletonB();
		}
		return sl;
	}
}
