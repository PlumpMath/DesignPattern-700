package com.getitstart.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
	private List<Book> books;
	
	public BookShelf(){
		books = new ArrayList<Book>();
	}
	
	public Book getBookAt(int index){
		return books.get(index);
	}
	
	public void appendBook(Book book){
		books.add(book);
	}
	
	public int getLength(){
		return books.size();
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
