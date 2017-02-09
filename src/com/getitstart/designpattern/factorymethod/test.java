package com.getitstart.designpattern.factorymethod;

import com.getitstart.designpattern.factorymethod.framework.Factory;
import com.getitstart.designpattern.factorymethod.framework.Product;
import com.getitstart.designpattern.factorymethod.idcard.IDCardFactory;

public class test {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("小明");
		Product card2 = factory.create("小红");
		Product card3 = factory.create("小刚");
		card1.use();
		card2.use();
		card3.use();
	}

}
