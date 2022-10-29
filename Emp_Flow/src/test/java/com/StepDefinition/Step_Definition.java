package com.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Page.Page_Object_Manager;
import com.Baseclass.Base_Class;
import com.Helper.File_Reader_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class {
	
	public static WebDriver driver= getBrowser("chrome");
	
	static String employer = System.getProperty("user.dir") + "/Excel/dataread.xlsx"; 
	   
	public static Page_Object_Manager pom =new Page_Object_Manager(driver);
	
	@Given("user Launch The Application")
	public void user_Launch_The_Application() throws Throwable {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		
//		getURL(url);
		
		driver.get("http://192.168.0.77:4202");
		
	}
	
	//Signin
	
	@When("click On The Popup button")
	public void click_On_The_Popup_button() {
		clickOnElement(pom.getInstancesign().getPopup());
	}

	@When("click On The Hinto button")
	public void click_On_The_Hinto_button() {
		clickOnElement(pom.getInstancesign().getLan());
	}

	@When("user Enter The Username In Username Field")
	public void user_Enter_The_Username_In_Username_Field() throws Exception {
		inputValueElement(pom.getInstancesign().getUsername(), particularData (0,1,0, employer));
	}

	@When("user Enter The Password In Password Field")
	public void user_Enter_The_Password_In_Password_Field() throws Exception {
		inputValueElement(pom.getInstancesign().getPassword(), particularData (0,1,1, employer));
	}

	@Then("click On The Signin button & Navigate To The Home Screen")
	public void click_On_The_Signin_button_Navigate_To_The_Home_Screen() {
		clickOnElement(pom.getInstancesign().getSubmit());
	}
	
//	// Language
	
	@Given("Click On The Licon button")
	public void click_On_The_Licon_button() {
		clickOnElement(pom.getInstanceLanguage().getLicon());
    }

	@Given("Click On The English button")
	public void click_On_The_English_button() {
		clickOnElement(pom.getInstanceLanguage().getEnglish());
	}

	@Given("Click On The Aicon button")
	public void click_On_The_Aicon_button() {
		clickOnElement(pom.getInstanceLanguage().getAicon());
	}

	@Given("Click On The Tamil button")
	public void click_On_The_Tamil_button() {
		clickOnElement(pom.getInstanceLanguage().getTamil());
	}

	@Given("Click On The Nicon button")
	public void click_On_The_Nicon_button() {
		clickOnElement(pom.getInstanceLanguage().getNicon());
	}

	@Given("Click On The Hindi button")
	public void click_On_The_Hindi_button() {
		clickOnElement(pom.getInstanceLanguage().getHindi());
	}

	@Given("Click On The Gicon button")
	public void click_On_The_Gicon_button() {
		clickOnElement(pom.getInstanceLanguage().getGicon());
	}

	@Given("Click On The Telugu button")
	public void click_On_The_Telugu_button() {
		clickOnElement(pom.getInstanceLanguage().getTelugu());
	}

	@Given("Click On The Uicon button")
	public void click_On_The_Uicon_button() {
		clickOnElement(pom.getInstanceLanguage().getUicon());
	}

	@Given("Click On The Kannada button")
	public void click_On_The_Kannada_button() {
		clickOnElement(pom.getInstanceLanguage().getKannada());
	}
	
	//Change_Password
	
	@When("click On The Icon button")
	public void click_On_The_Icon_button() {
		clickOnElement(pom.getInstancelog().getIconclick());
	}

	@When("click On The Change Password button")
	public void click_On_The_Change_Password_button() {
		clickOnElement(pom.getInstancelog().getChangepwd());
	}

	@When("user Enter The Current Password In Current Password Field")
	public void user_Enter_The_Current_Password_In_Current_Password_Field() {
		inputValueElement(pom.getInstancelog().getCurrentpwd(), "11022001");
	}

	@When("click On The Verify button")
	public void click_On_The_Verify_button() {
		clickOnElement(pom.getInstancelog().getButtonpwd());
	}
	
	//View Profile
	
	@When("click On The Icons button")
	public void click_On_The_Icons_button() {
		clickOnElement(pom.getInstancevp().getRoundicon());
	}

	@When("click On The View Profile button")
	public void click_On_The_View_Profile_button() {
		clickOnElement(pom.getInstancevp().getViewpro());
	}

	@When("click On The Edit button")
	public void click_On_The_Edit_button() {
		clickOnElement(pom.getInstancevp().getEdit());
	}

	@When("user Enter The Company Name In Company Name Field")
	public void user_Enter_The_Company_Name_In_Company_Name_Field() {
		pom.getInstancevp().getCompanyname().clear();
		inputValueElement(pom.getInstancevp().getCompanyname(), "fita123@facademy.com");
	}

	@When("user Enter The Mobile Number In Mobile Number Field")
	public void user_Enter_The_Phone_Number_In_Phone_Number_Field() {
		pom.getInstancevp().getMobilenumber().clear();
		inputValueElement(pom.getInstancevp().getMobilenumber(), "9884766906");
	}

	@When("user Enter The Website In Website Field")
	public void user_Enter_The_Website_In_Website_Field() {
		pom.getInstancevp().getWebsite().clear();
		inputValueElement(pom.getInstancevp().getWebsite(), "www.fitaacademy.com");
	}

	@When("user Enter The About In About Field")
	public void user_Enter_The_About_In_About_Field() {
		pom.getInstancevp().getAbout().clear();
		inputValueElement(pom.getInstancevp().getAbout(), "Nice place to learn the technology");
	}

	@When("click On The Industry button")
	public void click_On_The_Industry_button() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		try {
			js.executeScript("arguments[0].scrollIntoView();", pom.getInstancevp().getIndustry());
			inputValueElement(pom.getInstancevp().getIndustry(), "Health care");
		} catch (Exception e) {
			js.executeScript("arguments[0].scrollIntoView();", pom.getInstancevp().getIndustry());
			inputValueElement(pom.getInstancevp().getIndustry(), "Health care");
		}
	}

	@When("user Enter The Founded In Founded Field")
	public void user_Enter_The_Founded_In_Founded_Field() {
		pom.getInstancevp().getFounded().clear();
		inputValueElement(pom.getInstancevp().getFounded(), "1990");
	}

	@When("Click On The Company Size button")
	public void click_On_The_Company_Size_button() {
		inputValueElement(pom.getInstancevp().getComsize(), "100 - 150 employees");
	}

	@When("user Enter The Address In Address Field")
	public void user_Enter_The_Address_In_Address_Field() {
		pom.getInstancevp().getAddress1().clear();
		inputValueElement(pom.getInstancevp().getAddress1(), "Bharathi dhasan colony");
	}

	@When("user Enter The Addresss In Addresss Field")
	public void user_Enter_The_Addresss_In_Addresss_Field() {
		pom.getInstancevp().getAddress2().clear();
		inputValueElement(pom.getInstancevp().getAddress2(), "Guduvanchery chennai");
	}

	@When("click On The State button")
	public void click_On_The_State_button() {
		inputValueElement(pom.getInstancevp().getState(), "Tamil Nadu");
	}

	@When("click On The District button")
	public void click_On_The_District_button() {
		inputValueElement(pom.getInstancevp().getDistrict(), "Chennai");
	}

	@When("click On The City button")
	public void click_On_The_City_button() {
		inputValueElement(pom.getInstancevp().getCity(), "Chennai Central");
	}

	@When("click On The Document Name button")
	public void click_On_The_Document_Name_button() {
		inputValueElement(pom.getInstancevp().getDocumentname(), "GST Document");
	}

	@When("user Enter The Document Number In Document Number Field")
	public void user_Enter_The_Document_Number_In_Document_Number_Field() {
		pom.getInstancevp().getDocumentnumber().clear();
		inputValueElement(pom.getInstancevp().getDocumentnumber(), "123456789012");
	}

	@When("click On The Update button")
	public void click_On_The_Update_button() {
		clickOnElement(pom.getInstancevp().getUpdate());
	}
	
//	//Schedule_Candidates
	
	@When("Click On The Candidate button")
	public void click_On_The_Candidate_button() {
		clickOnElement(pom.getInstancesche().getCandidate());
	}

	@When("Click On The Apploed Candidate button")
	public void click_On_The_Apploed_Candidate_button() {
		clickOnElement(pom.getInstancesche().getApplied_Can());
	}

	@When("Click On The Dots button")
	public void click_On_The_Dots_button() throws Exception {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		clickOnElement(pom.getInstancesche().getDots());
	}

	@When("Click On The Schduled button")
	public void click_On_The_Schduled_button() throws Exception {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try { clickOnElement(pom.getInstancesche().getSchedule());
		} catch (Exception e) {
			clickOnElement(pom.getInstancesche().getSchedule());
		}
	}

	@When("Click On The Date Input button")
	public void click_On_The_Date_Input_button() {
		clickOnElement(pom.getInstancesche().getDateinput_click());
	}

	@When("Click On The Date button")
	public void click_On_The_Date_button() throws Exception {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clickOnElement(pom.getInstancesche().getDate_click());
	}

	@When("Click On The Set button")
	public void click_On_The_Set_button() throws Exception {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clickOnElement(pom.getInstancesche().getSet());
	}

	@When("Click On The Interviewmode button")
	public void click_On_The_Interviewmode_button() {
		clickOnElement(pom.getInstancesche().getInterview_mode());
	}

	@When("Click On The Create button")
	public void click_On_The_Create_button() {
		clickOnElement(pom.getInstancesche().getCreate());  
	}

	@When("Click On The Schedule button")
	public void click_On_The_Schedule_button() {
		clickOnElement(pom.getInstancesche().getSchedule_button());
	}
	
	//Candidates_Rescheduled

	@When("Click On The Candidates button")
	public void click_On_The_Candidates_button() {
		 clickOnElement(pom.getInstanceresche().getCandidates());
	}

	@When("Click On The Schedule Radio button")
	public void click_On_The_Schedule_Radio_button() {
		clickOnElement(pom.getInstanceresche().getSchedradio());
	}

	@When("Click On The Dot button")
	public void click_On_The_Dot_button() throws Exception {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clickOnElement(pom.getInstanceresche().getDot());
	}

	@When("Click On The Rescheduled button")
	public void click_On_The_Rescheduled_button() throws Exception {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clickOnElement(pom.getInstanceresche().getRescheduled());
	}

//	@When("Click On The Reschedule button")
//	public void click_On_The_Reschedule_button() throws Exception {
//		Thread.sleep(3000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		clickOnElement(pom.getInstanceresche().getResbutton());
//	}
	
	@When("Click On The Close button")
	public void click_On_The_Close_button() throws Exception {
		Thread.sleep(3000);
		clickOnElement(pom.getInstanceresche().getClse());
	}

	
	//Home
	
	@When("Click On The Month button")
	public void click_On_The_Month_button() {
		clickOnElement(pom.getInstancehome().getMonth());
	}

	@When("Click On The Year button")
	public void click_On_The_Year_button() throws Exception {
		clickOnElement(pom.getInstancehome().getYear());
	}

	@When("Click On The Post button")
	public void click_On_The_Post_button() throws Exception {
		try {
			clickOnElement(pom.getInstancehome().getPost());
		} catch (Exception e) {
			clickOnElement(pom.getInstancehome().getPost());
		}
	}

	@When("Click On The Aircraft button")
	public void click_On_The_Aircraft_button() throws Exception {
		Thread.sleep(3000);
		clickOnElement(pom.getInstancehome().getAircraft());
	}

	@When("Click On The Threedots button")
	public void click_On_The_Threedots_button() throws Exception {
		Thread.sleep(3000);
		clickOnElement(pom.getInstancehome().getThreedots());
	}

	@When("Click On The Edits button")
	public void click_On_The_Edits_button() throws Exception {
		Thread.sleep(3000);
		clickOnElement(pom.getInstancehome().getEdit());
	}

	@When("Click On The Updates button")
	public void click_On_The_Updates_button() throws Exception {
		Thread.sleep(3000);
		try {	
    		clickOnElement(pom.getInstancehome().getUpdatebutton());	
    		} catch (Exception e) {
        		clickOnElement(pom.getInstancehome().getUpdatebutton());
    		}
	}
	
//	//Roles

	@When("Click On The Roles button")
	public void click_On_The_Roles_button() {
		clickOnElement(pom.getInstancerole().getRoles());
	}

	@When("Clilck On The Add Roles button")
	public void clilck_On_The_Add_Roles_button() {
		clickOnElement(pom.getInstancerole().getAddrole());
	}

	@When("user Enter The Firstname In Firstname Field")
	public void user_Enter_The_Firstname_In_Firstname_Field() {
		inputValueElement(pom.getInstancerole().getFirstname(), "Swatha");
	}

	@When("user Enter The Lastname In Lastname Field")
	public void user_Enter_The_Lastname_In_Lastname_Field() {
		inputValueElement(pom.getInstancerole().getLastname(), "T");
	}

	@When("user Enter The Email In Email Field")
	public void user_Enter_The_Email_In_Email_Field() {
		inputValueElement(pom.getInstancerole().getEmail(), "swatha@gmail.com");
	}
	
	@When("user Enter The Phone In Phone Field")
	public void user_Enter_The_Phone_In_Phone_Field() {
		inputValueElement(pom.getInstancerole().getPhone(), "9465215423");
	}

	@When("user Enter The Designation in Designation Field")
	public void user_Enter_The_Designation_in_Designation_Field() {
		inputValueElement(pom.getInstancerole().getDesignation(), "Senior Executive");
	}

	@When("Click On The Status button")
	public void click_On_The_Status_button() {
		inputValueElement(pom.getInstancerole().getStatus(), "Active");
	}

	@When("Click On The Activity button")
	public void click_On_The_Activity_button() {
		clickOnElement(pom.getInstancerole().getActivity());
	}
	
	@When("Click On The Creates button")
	public void click_On_The_Creates_button() {
		clickOnElement(pom.getInstancerole().getCreatebutton());
	}
	
	//Logout 
	
	@When("Click On The Loicon button")
	public void click_On_The_Loicon_button() {
		clickOnElement(pom.getInstancelogout().getLoicon());
	}

	@When("Click On The Logout button")
	public void click_On_The_Logout_button() {
		clickOnElement(pom.getInstancelogout().getLogoutbutton());
	}
	
	//Signup
	
	@When("click On The Signin button")
	public void click_On_The_Signin_button() {
		clickOnElement(pom.getInstancesignup().getSignn());
	}
	
	@When("click On The Signup button")
	public void click_On_The_Signup_button() {
		clickOnElement(pom.getInstancesignup().getSignupb());
	}
	
	@When("user Enter The Signmob in Signmob Field")
	public void user_Enter_The_Signmob_in_Signmob_Field() throws Exception {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
		inputValueElement(pom.getInstancesignup().getSignmob(), particularData (0,1,17, employer));
		} catch(Exception e) {
		inputValueElement(pom.getInstancesignup().getSignmob(), particularData (0,1,17, employer));
		}	
	}

	@When("user Enter The Signpass in Signpass Field")
	public void user_Enter_The_Signpass_in_Signpass_Field() throws Exception {
		inputValueElement(pom.getInstancesignup().getSignpass(), particularData (0,1,18, employer));
	}

	@Then("Click On The Signupp button")
	public void click_On_The_Signupp_button() {
		clickOnElement(pom.getInstancesignup().getSignupbutton());
	}
	
//	@Then("Click On The Verifyy button")
//	public void click_On_The_Verifyy_button() throws Exception {
//		Thread.sleep(9000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		clickOnElement(pom.getInstancesignup().getVerify());
//	}
	
//	@When("click On The Manage Jobs button")
//	public void click_On_The_Manage_Jobs_button() {
//		clickOnElement(pom.getInstancepostjob().getManagejob() );
//	}
//
//	@When("click On The Post Job button")
//	public void click_On_The_Post_Job_button() {
//		clickOnElement(pom.getInstancepostjob().getPostjo());
//	}
//
//	@When("user Enter The Job Title in Job Title Field")
//	public void user_Enter_The_Job_Title_in_Job_Title_Field() throws Exception {
//		 inputValueElement(pom.getInstancepostjob().getJobtitle(), particularData (0,1,19, employer));
//	}
//
//	@When("user Enter The Vaccancy in Vaccancy Field")
//	public void user_Enter_The_Vaccancy_in_Vaccancy_Field() throws Exception {
//		 inputValueElement(pom.getInstancepostjob().getJobtitle(), particularData (0,1,20, employer));
//	}
//
//	@When("user Enter The Category in Category Field")
//	public void user_Enter_The_Category_in_Category_Field() throws Exception {
//		inputValueElement(pom.getInstancepostjob().getCategory(), particularData (0,1,21, employer));
//	}
	
}