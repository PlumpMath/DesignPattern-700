package com.getitstart.designpattern.factorymethod.idcard;

import java.util.ArrayList;
import java.util.List;

import com.getitstart.designpattern.factorymethod.framework.Factory;
import com.getitstart.designpattern.factorymethod.framework.Product;

public class IDCardFactory extends Factory {
	private List<String> owners = new ArrayList<String>();
	
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}

	public List<String> getOwners(){
		return owners;
	}
}
