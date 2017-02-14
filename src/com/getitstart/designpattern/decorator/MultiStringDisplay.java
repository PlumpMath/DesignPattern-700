package com.getitstart.designpattern.decorator;

import java.util.ArrayList;

public class MultiStringDisplay extends Display {
	private ArrayList<String> stringList = new ArrayList<String>();
	private int maxColumns = 0;
	
	public void add(String string){
		stringList.add(string);
		if(string.getBytes().length > maxColumns){
			maxColumns = string.getBytes().length;
		}
	}
	
	@Override
	public int getColumns() {
		return maxColumns;
	}

	@Override
	public int getRows() {
		return stringList.size();
	}

	@Override
	public String getRowText(int row) {
		return stringList.get(row);
	}

}
