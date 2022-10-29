package org.utility;

	
	import java.io.File;
	import java.util.ArrayList;
	import java.util.List;

	import net.masterthought.cucumber.Configuration;
	import net.masterthought.cucumber.ReportBuilder;


	public class JvmReport {
	  public static void generatejvmReport(String jsonPath) {
	  File f =new File(System.getProperty("user.dir")+"/target/Reports/JvmReport");
	 
	  Configuration con =new Configuration(f,"my job application");
	  con.addClassifications("platform name", "ubuntu");
	  con.addClassifications("Browser name", "chrome");
	  con.addClassifications("Browser version", "106");
	 
	 
	  List<String> li=new ArrayList<String>();
	  li.add(jsonPath);
	 
	  ReportBuilder r =new ReportBuilder(li, con);
	  r.generateReports();
	 
	  }
	  }

