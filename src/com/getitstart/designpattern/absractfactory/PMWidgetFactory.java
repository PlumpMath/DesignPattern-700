package com.getitstart.designpattern.absractfactory;

public class PMWidgetFactory extends WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new PMScrollBar();
	}

	@Override
	public Window createWindow() {
		return new PMWindow();
	}

}
