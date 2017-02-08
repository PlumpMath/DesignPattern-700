package com.getitstart.designpattern.iterator;

public class BookShelfIterator implements Iterator {
	private BookShelf bookShelf;
	private int index = 0;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}		
	
	@Override
	public boolean hasNext() {
		if(index < bookShelf.getLength()){
			return true;
		}
		return false;
	}

	@Override
	public Book next() {
		return bookShelf.getBookAt(index++);
	}

}
