package com.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;


	public Configuration_Reader() throws Throwable {

	File f = new File("/home/ist-001/eclipse-workspace/Employer_Flow/src/test/java/com.properties/Configure.properties");

	FileInputStream fis = new FileInputStream(f);

	p = new Properties();

	p.load(fis);


	}
	   
	public String getUrl() throws Throwable {

	String url = p.getProperty("url");

	return url;

	}

}
