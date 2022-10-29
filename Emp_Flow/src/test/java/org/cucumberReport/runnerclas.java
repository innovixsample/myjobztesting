package org.cucumberReport;
import org.utility.JvmReport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", glue="com.StepDefinition",dryRun=false,
monochrome=true,
//tags= {"@smoketest"},
plugin= {"pretty","html:target/Reports",
		"json:target/Reports/output.json",
"junit:target/Reports/fb.xml"
		
		}

)  

public class runnerclas {
	
	@AfterClass
	public static void jvmReportGeneration() {

		JvmReport.generatejvmReport(System.getProperty("user.dir")+"/target/Reports/output.json");

	}

}