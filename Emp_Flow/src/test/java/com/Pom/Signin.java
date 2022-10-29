package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	
	public WebDriver driver;

	public Signin(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getPopup() {
		return popup;
	}

	@FindBy(xpath="//button[@class='btn btn-basic btn-wh active']")
	private WebElement popup;

	public WebElement getLan() {
		return Lan;
	}

	@FindBy(xpath="(//img[@alt='Card image cap'])[1]")
	private WebElement Lan;
	
	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath="(//input[@placeholder='Mobile Number / Email'])[2]")
	private WebElement username;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(id="pxp-signin-password")
	private WebElement password;

	public WebElement getSubmit() {
		return Submit;
	}

	@FindBy(xpath="//a[text()='Sign In']")
	private WebElement Submit;

}
