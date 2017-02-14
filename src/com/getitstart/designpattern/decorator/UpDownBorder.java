package com.getitstart.designpattern.decorator;

public class UpDownBorder extends Border {
	private char borderChar;
	public UpDownBorder(Display display, char borderChar){
		super(display);
		this.borderChar = borderChar;
	}
	
	@Override
	public int getColumns() {
		return display.getColumns();
	}

	@Override
	public int getRows() {
		return 2+display.getRows();
	}

	@Override
	public String getRowText(int row) {
		if(row == 0){
			return "+" + makeLine(borderChar, display.getColumns()) + "+";
		} else if (row == display.getRows() + 1){
			return "+" + makeLine(borderChar, display.getColumns()) + "+";
		} else {
		    return display.getRowText(row - 1);
		}
		
	}

	private String makeLine(char ch, int count){
		StringBuffer buf = new StringBuffer();
		for(int i = 0; i < count; i++){
			buf.append(ch);
		}
		return buf.toString();
	}
	
}
