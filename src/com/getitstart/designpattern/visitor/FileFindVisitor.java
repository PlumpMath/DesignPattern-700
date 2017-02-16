package com.getitstart.designpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVisitor extends Visitor {
	private List<File> foundFiles = new ArrayList<File>();
	private String suffix;
	
	public FileFindVisitor(String suffix){
		this.suffix = suffix;
	}
	
	@Override
	public void visit(File file) {
		if(file.getName().endsWith(suffix)){
			foundFiles.add(file);
		}
	}

	@Override
	public void visit(Directory directory) {
		Iterator<Entry> it = directory.iterator();
		while(it.hasNext()){
			Entry entry = it.next();
			entry.accept(this);
		}
	}
	
	public Iterator<File> getFoundFiles(){
		return foundFiles.iterator();
	}

}
