package com.getitstart.designpattern.absractfactory;

public class test {

	public static void main(String[] args) {
		WidgetFactory motiffa = new MotifWidgetFactory();
		WidgetFactory pmfa = new PMWidgetFactory();
		
		Window motifwin = motiffa.createWindow();
		Window pmwin = pmfa.createWindow();
		ScrollBar motifsb = motiffa.createScrollBar();
		ScrollBar pmsb = pmfa.createScrollBar();
		
		System.out.println("motif");
		System.out.println(motifwin);
		System.out.println(motifsb);
		
		System.out.println("pm");
		System.out.println(pmwin);
		System.out.println(pmsb);
	}

}
