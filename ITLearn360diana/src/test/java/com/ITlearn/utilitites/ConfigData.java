package com.ITlearn.utilitites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigData {
	 Properties pro;
	public  ConfigData()
	{
		File src = new File ("./Configuration/config.properties");
	try {
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties ();
		pro.load(fis);
	}
		catch (Exception e) {
		
System.out.println("Not able to load config file "+e.getMessage());
			}
	}
	
	public  String getBrowser()
	{
	return pro.getProperty("browser");

	}
	public String geturl()
	{
		return pro.getProperty("url");
	}

}
