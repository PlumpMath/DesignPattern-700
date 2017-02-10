package com.getitstart.designpattern.absractfactory;

public class MotifWidgetFactory extends WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new MotifScrollBar();
	}

	@Override
	public Window createWindow() {
		return new MotilfWindow();
	}

}
