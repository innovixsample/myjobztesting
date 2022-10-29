package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_WMY {
	
	public Home_WMY(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebDriver driver;

	public WebElement getMonth() {
		return Month;
	}

	@FindBy(xpath="//button[text()='Month']")
	private WebElement Month;

	public WebElement getYear() {
		return Year;
	}

	@FindBy(xpath="//button[text()='Year']")
	private WebElement Year;

	public WebElement getPost() {
		return Post;
	}
	
	@FindBy(xpath="//span[@class='fa fa-angle-right']")
	private WebElement Post;	

	public WebElement getAircraft() {
		return Aircraft;
	}

	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement Aircraft;

	public WebElement getThreedots() {
		return Threedots;
	}

	@FindBy(xpath="//button[@aria-haspopup='menu']")
	private WebElement Threedots;
	
	public WebElement getEdit() {
		return Edit;
	}

	@FindBy(xpath="(//button[@role='menuitem'])[1]")
	private WebElement Edit;

	public WebElement getUpdatebutton() {
		return Updatebutton;
	}

	@FindBy(xpath="//button[@class='btn rounded-pill pxp-section-cta']")
	private WebElement Updatebutton;
		
	}
