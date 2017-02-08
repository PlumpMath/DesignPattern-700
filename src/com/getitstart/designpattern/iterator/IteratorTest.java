package com.getitstart.designpattern.iterator;

public class IteratorTest {

	public static void main(String[] args) {
		BookShelf bs = new BookShelf();
		bs.appendBook(new Book("test1"));
		bs.appendBook(new Book("test2"));
		bs.appendBook(new Book("test3"));
		bs.appendBook(new Book("test4"));
		
		Iterator bsi = bs.iterator();
		
		while(bsi.hasNext()){
			System.out.println(((Book)bsi.next()).getName());
		}
	}

}
