package com.Runnerclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Baseclass.Base_Class;
import com.Helper.File_Reader_Manager;
import com.Page.Page_Object_Manager;
import com.Pom.Home_WMY;
import com.Pom.Lan_Popup;
import com.Pom.Log_out;
import com.Pom.Post_Job;
import com.Pom.Schedule_job;
import com.Pom.Sign_Up;
import com.Pom.Signin;

public class Runner_Class extends Base_Class {
	
	static String employer = System.getProperty("user.dir") + "Excel/dataread.xlsx"; 
	
	public static WebDriver driver= getBrowser("chrome");
	   
	public static Page_Object_Manager pom =new Page_Object_Manager(driver);

	   public static void main(String[]args) throws Throwable {
		   
		   String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		   
		   getURL(url);
		   //driver.get("http://192.168.0.77:4202");
		   	    	 	
	 		//Signing
	 		
		    //Signin sign = new Signin(driver);
		   
	 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 		
	 		clickOnElement(pom.getInstancesign().getPopup());
	 		
	 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 		
	 		clickOnElement(pom.getInstancesign().getLan());
	 		
	 		inputValueElement(pom.getInstancesign().getUsername(), particularData (0,1,0, employer));

	 		inputValueElement(pom.getInstancesign().getPassword(), particularData (0,1,1, employer));

	 		clickOnElement(pom.getInstancesign().getSubmit());
	 		
            //Language
			
			//Lan_Popup Language = new Lan_Popup(driver);	
			  
			  Thread.sleep(4000);
			
			  clickOnElement(pom.getInstanceLanguage().getLicon());
			
			  clickOnElement(pom.getInstanceLanguage().getEnglish());
		      
		      Thread.sleep(4000);
		      
		      clickOnElement(pom.getInstanceLanguage().getAicon());
		      
		      clickOnElement(pom.getInstanceLanguage().getTamil());
		      
		      Thread.sleep(4000);
		      
		      clickOnElement(pom.getInstanceLanguage().getNicon());
		      
		      clickOnElement(pom.getInstanceLanguage().getHindi());
		      
		      Thread.sleep(4000);
		      
		      clickOnElement(pom.getInstanceLanguage().getGicon());
		      
		      clickOnElement(pom.getInstanceLanguage().getTelugu());
		      
		      Thread.sleep(4000);
		      
		      clickOnElement(pom.getInstanceLanguage().getUicon());
		      
		      clickOnElement(pom.getInstanceLanguage().getKannada());
	 		
	 		//Change password
	 		
//	 		Change_Pwd Log =new Change_Pwd(driver);

	 		clickOnElement(pom.getInstancelog().getIconclick());

	 		clickOnElement(pom.getInstancelog().getChangepwd());

	 		inputValueElement(pom.getInstancelog().getCurrentpwd(), "11022001");

	 		clickOnElement(pom.getInstancelog().getButtonpwd());
	 		
	 		driver.navigate().back();
			
			// View Profile
	 		
			//View_Profile vp =new View_Profile(driver);
			
			clickOnElement(pom.getInstancevp().getRoundicon());
	
			clickOnElement(pom.getInstancevp().getViewpro());
		
			clickOnElement(pom.getInstancevp().getEdit());

			pom.getInstancevp().getCompanyname().clear();
			inputValueElement(pom.getInstancevp().getCompanyname(), particularData (0,1,3, employer));

			pom.getInstancevp().getMobilenumber().clear();
			inputValueElement(pom.getInstancevp().getMobilenumber(), particularData (0,1,4, employer));

			pom.getInstancevp().getWebsite().clear();
			inputValueElement(pom.getInstancevp().getWebsite(), particularData (0,1,5, employer));

			pom.getInstancevp().getAbout().clear();
			inputValueElement(pom.getInstancevp().getAbout(), particularData (0,1,6, employer));

			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			try {
				js.executeScript("arguments[0].scrollIntoView();", pom.getInstancevp().getIndustry());
				inputValueElement(pom.getInstancevp().getIndustry(), particularData (0,1,7, employer));
			} catch (Exception e) {
				js.executeScript("arguments[0].scrollIntoView();", pom.getInstancevp().getIndustry());
				inputValueElement(pom.getInstancevp().getIndustry(), particularData (0,1,7, employer));
			}

			pom.getInstancevp().getFounded().clear();
			inputValueElement(pom.getInstancevp().getFounded(), particularData (0,1,8, employer));
			
			inputValueElement(pom.getInstancevp().getComsize(), particularData (0,1,9, employer));

			pom.getInstancevp().getAddress1().clear();
			inputValueElement(pom.getInstancevp().getAddress1(), particularData (0,1,10, employer));

			pom.getInstancevp().getAddress2().clear();
			inputValueElement(pom.getInstancevp().getAddress2(), particularData (0,1,11, employer));
			
			inputValueElement(pom.getInstancevp().getState(), particularData (0,1,12, employer));
			
			inputValueElement(pom.getInstancevp().getDistrict(), particularData (0,1,13, employer));
			
			inputValueElement(pom.getInstancevp().getCity(), particularData (0,1,14, employer));
			
			inputValueElement(pom.getInstancevp().getDocumentname(), particularData (0,1,15, employer));
			
			pom.getInstancevp().getDocumentnumber().clear();
			inputValueElement(pom.getInstancevp().getDocumentnumber(), particularData (0,1,16, employer));
	
			clickOnElement(pom.getInstancevp().getUpdate());
			
		    WebElement hom = driver.findElement(By.xpath("//a[text()='Home']"));
		    clickOnElement(pom.getInstancevp().getHom());
			
			//candidates -- Schedule
			
			//Schedule_job sche = new Schedule_job(driver);
			
			driver.navigate().refresh();
			
	        clickOnElement(pom.getInstancesche().getCandidate());

	        clickOnElement(pom.getInstancesche().getApplied_Can());
	        
	        clickOnElement(pom.getInstancesche().getDots());

	        clickOnElement(pom.getInstancesche().getSchedule());
	      
	        Thread.sleep(2000);
			try {
				WebElement dateinput_click = driver.findElement(By.xpath("//input[@placeholder='Date Time']"));
				clickOnElement(pom.getInstancesche().getDateinput_click());
				
			       } catch (Exception e)  {
			    	   WebElement dateinput_click = driver.findElement(By.xpath("//input[@placeholder='Date Time']"));
						clickOnElement(pom.getInstancesche().getDateinput_click());
			    }
			
			clickOnElement(pom.getInstancesche().getDate_click());
			
			Thread.sleep(2000);
			
			clickOnElement(pom.getInstancesche().getSet());
		        
			clickOnElement(pom.getInstancesche().getInterview_mode());
				
			clickOnElement(pom.getInstancesche().getCreate());   
				
			clickOnElement(pom.getInstancesche().getSchedule_button());
			
			// Candidates -- Reschedule
			
			//Reschedule_job resche = new Reschedule_job(driver);
            
            clickOnElement(pom.getInstanceresche().getCandidates());	
            
    		Thread.sleep(2000);
    		
    		clickOnElement(pom.getInstanceresche().getSchedradio());
    		
    		Thread.sleep(1000);
    		
    		clickOnElement(pom.getInstanceresche().getDot());
    	
    		clickOnElement(pom.getInstanceresche().getRescheduled());
    		
//    		clickOnElement(pom.getInstanceresche().getResbutton());
  
    		clickOnElement(pom.getInstanceresche().getClse());
    		
//    		// HomePage
   		
//    		//Home_WMY home = new Home_WMY(driver);
    		
    		clickOnElement(pom.getInstancehome().getMonth());
    		
    		Thread.sleep(2000);
    		
    		clickOnElement(pom.getInstancehome().getYear());
    		
    		try {
    			clickOnElement(pom.getInstancehome().getPost());
    		} catch (Exception e) {
    			clickOnElement(pom.getInstancehome().getPost());
    		}
    		
    		Thread.sleep(2000);
    		
    		clickOnElement(pom.getInstancehome().getAircraft());
    		
    		Thread.sleep(2000);
    		
    		clickOnElement(pom.getInstancehome().getThreedots());
    		
    		Thread.sleep(2000);
    		
    		clickOnElement(pom.getInstancehome().getEdit());
    		
    		try {	
    		clickOnElement(pom.getInstancehome().getUpdatebutton());	
    		} catch (Exception e) {
        		clickOnElement(pom.getInstancehome().getUpdatebutton());
    		}
            
	 		//Roles
	 		
	 	//	Roless role= new Roles(driver);
	 		
	 		driver.navigate().refresh();
	 	
			clickOnElement(pom.getInstancerole().getRoles());
			
			clickOnElement(pom.getInstancerole().getAddrole());
			
			inputValueElement(pom.getInstancerole().getFirstname(), "Saras");
			
			inputValueElement(pom.getInstancerole().getLastname(), "T");
			
			inputValueElement(pom.getInstancerole().getEmail(), "saras@gmail.com");
		
			inputValueElement(pom.getInstancerole().getPhone(), "946525323");
		
			inputValueElement(pom.getInstancerole().getDesignation(), "Senior Executive");
			
			inputValueElement(pom.getInstancerole().getStatus(), "Active");
			
			clickOnElement(pom.getInstancerole().getActivity());
			
			clickOnElement(pom.getInstancerole().getCreatebutton());	
			
		//Logout
			
			//Log_out logout = new Log_out(driver);
			
			clickOnElement(pom.getInstancelogout().getLoicon());
			
			clickOnElement(pom.getInstancelogout().getLogoutbutton());
			
			
		// Signup
			
			//Sign_Up signup = new Sign_Up(driver);
			
			clickOnElement(pom.getInstancesignup().getSignn());
			
			clickOnElement(pom.getInstancesignup().getSignupb());
			
			try {
			inputValueElement(pom.getInstancesignup().getSignmob(), particularData (0,1,17, employer));
			} catch(Exception e) {
			inputValueElement(pom.getInstancesignup().getSignmob(), particularData (0,1,17, employer));
			}

			inputValueElement(pom.getInstancesignup().getSignpass(), particularData (0,1,18, employer));

			clickOnElement(pom.getInstancesignup().getSignupbutton());
			
			clickOnElement(pom.getInstancesignup().getVerify());
			
	  // Post Job
			
			Post_Job postjob = new Post_Job(driver);
			
			WebElement managejob = driver.findElement(By.xpath("(//a[text()='Manage Jobs'])[1]"));
			clickOnElement(pom.getInstancepostjob().getManagejob());
			
			WebElement postjo = driver.findElement(By.xpath("//a[@class='btn rounded-pill pxp-nav-btn']"));
			clickOnElement(pom.getInstancepostjob().getPostjo());
			
		    WebElement jobtitle = driver.findElement(By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c85-89 ng-untouched ng-pristine ng-invalid cdk-text-field-autofill-monitored']"));
		    inputValueElement(pom.getInstancepostjob().getJobtitle(), particularData (0,1,19, employer));
		    
		    WebElement vaccancy = driver.findElement(By.xpath("//input[@class='mat-input-element mat-form-field-autofill-control ng-tns-c85-90 ng-pristine ng-invalid cdk-text-field-autofill-monitored ng-touched']"));
		    inputValueElement(pom.getInstancepostjob().getJobtitle(), particularData (0,1,20, employer));
		    
		    WebElement category = driver.findElement(By.id("mat-select-26"));
		    inputValueElement(pom.getInstancepostjob().getCategory(), particularData (0,1,21, employer));
		    
	   }

}