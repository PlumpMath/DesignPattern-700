package com.getitstart.designpattern.decorator;

public class Test {

	public static void main(String[] args) {
		maultitest();
	}
	
	public static void normaltest(){
		Display b1 = new StringDisplay("Hello, world");
		Display b2 = new SideBorder(b1,'#');
		Display b3 = new FullBorder(b2);
		b1.show();
		b2.show();
		b3.show();
		Display b4 = 
				new SideBorder(
					new FullBorder(
						new FullBorder(
							new SideBorder(
								new FullBorder(new StringDisplay("你好，世界。")),'*'
							)
						)
					),'/'
				);
		
		b4.show();		
	}
	
	public static void updowntest(){
		Display b1 = new StringDisplay("Hello, world");
		Display b2 = new UpDownBorder(b1,'-');
		Display b3 = new SideBorder(b2,'*');
		b1.show();
		b2.show();
		b3.show();
		Display b4 = 
				new FullBorder(
					new UpDownBorder(
						new SideBorder(
							new UpDownBorder(
								new SideBorder(new StringDisplay("你好，世界。"),'*'),
							'='
						),
						'|'
					),
					'/'
				)
				);
		
		b4.show();		
	}
	
	public static void maultitest(){
		MultiStringDisplay md = new MultiStringDisplay();
		md.add("早上好。");
		md.add("下午好。");
		md.add("晚安，明天见。");
		md.show();
		
		Display d1 = new SideBorder(md, '#');
		d1.show();
		
		Display d2 = new FullBorder(md);
		d2.show();
		
		
	}

}
