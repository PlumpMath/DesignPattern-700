package com.getitstart.designpattern.adapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Properties;

public class FlieProperties implements FileIO{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
	private Properties pt = new Properties();
	
	@Override
	public void readFromFile(String filename) throws IOException {
		InputStream fileStream = new FileInputStream(new File(filename));
		pt.load(fileStream);
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		OutputStream fileStream = new FileOutputStream(new File(filename));
		String header = "written by FileProperties";
		pt.store(fileStream, header);
	}

	@Override
	public void setValue(String key, String value) {
		pt.setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return pt.getProperty(key);
	}
	
}
