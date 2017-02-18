package com.getitstart.designpattern.memento.game;

import java.util.ArrayList;
import java.util.List;

public class Memento {
	int money;
	ArrayList<String> fruits;
	
	public int getMoney(){
		return money;
	}
	
	Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList<String>();
		
	}
	
	void addFruit(String fruit){
		fruits.add(fruit);
	}
	
	List<String> getFruits(){
		return (List<String>) fruits.clone();
	}
}
