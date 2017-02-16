package com.getitstart.designpattern.visitor;

import java.util.Iterator;

public class test {
	public static void test1(){
		try{
			System.out.println("Making root entries...");
			Directory rootdir = new Directory("root");
			Directory bindir = new Directory("bin");
			Directory tmpdir = new Directory("tmp");
			Directory usrdir = new Directory("usr");
			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);
			bindir.add(new File("vi", 10000));
			bindir.add(new File("latex", 20000));
			rootdir.accept(new ListVisitor());
			
			System.out.println("");
			System.out.println("Makeing user entries...");
			Directory yuki = new Directory("yuki");
			Directory hanako = new Directory("hanako");
			Directory tomura = new Directory("tomura");
			usrdir.add(yuki);
			usrdir.add(hanako);
			usrdir.add(tomura);
			yuki.add(new File("diary.html", 100));
			yuki.add(new File("Composite.java", 200));
			hanako.add(new File("memo.tex", 300));
			tomura.add(new File("game.doc", 400));
			tomura.add(new File("junk.mail", 500));
			rootdir.accept(new ListVisitor());
			} catch (FileTreatmentException e){
				e.printStackTrace();
			}
	}
	
	public static void test2(){
		try{
			System.out.println("Making root entries...");
			Directory rootdir = new Directory("root");
			Directory bindir = new Directory("bin");
			Directory tmpdir = new Directory("tmp");
			Directory usrdir = new Directory("usr");
			rootdir.add(bindir);
			rootdir.add(tmpdir);
			rootdir.add(usrdir);
			bindir.add(new File("vi", 10000));
			bindir.add(new File("latex", 20000));
			
			System.out.println("");
			System.out.println("Makeing user entries...");
			Directory yuki = new Directory("yuki");
			Directory hanako = new Directory("hanako");
			Directory tomura = new Directory("tomura");
			usrdir.add(yuki);
			usrdir.add(hanako);
			usrdir.add(tomura);
			yuki.add(new File("diary.html", 100));
			yuki.add(new File("Composite.java", 200));
			hanako.add(new File("memo.tex", 300));
			hanako.add(new File("index.html", 300));
			tomura.add(new File("game.doc", 400));
			tomura.add(new File("junk.mail", 500));
			
			FileFindVisitor ffv = new FileFindVisitor(".html");
			rootdir.accept(ffv);
			
			System.out.println("HTML files are:");
			Iterator<File> it = ffv.getFoundFiles();
			while(it.hasNext()){
				File file = it.next();
				System.out.println(file.toString());
			}
		} catch (FileTreatmentException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		test2();
	}

}
