package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_Up {
	
	public Sign_Up(WebDriver driver2) {
		
        this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver driver;

	public WebElement getSignn() {
		return signn;
	}

	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement signn;

	public WebElement getSignupb() {
		return signupb;
	}

	@FindBy(xpath="//b[text()='Sign Up']")
	private WebElement signupb;

	public WebElement getSignmob() {
		return signmob;
	}

	@FindBy(id="pxp-signup-mobile")
	private WebElement signmob;

	public WebElement getSignpass() {
		return signpass;
	}

	@FindBy(xpath="//input[@placeholder='Create password']")
	private WebElement signpass;

	public WebElement getSignupbutton() {
		return signupbutton;
	}

	@FindBy(xpath="//a[text()='Signup']")
	private WebElement signupbutton;

	public WebElement getVerify() {
		return verify;
	}

	@FindBy(xpath="(//a[text()='Verify'])[1]")
	private WebElement verify;

}