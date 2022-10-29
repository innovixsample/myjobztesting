package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Roless {
	
	public WebDriver driver;

	public Roless(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRoles() {
		return roles;
	}

	@FindBy(xpath="(//a[@class='nav-link text-primary'])[3]")
	private WebElement roles;
	
	public WebElement getAddrole() {
		return Addrole;
	}

	@FindBy(xpath="//a[@class='btn rounded-pill pxp-nav-btn']")
	private WebElement Addrole;

	public WebElement getFirstname() {
		return Firstname;
	}

	@FindBy(id="mat-input-0")
	private WebElement Firstname;
	
	public WebElement getLastname() {
		return Lastname;
	}

	@FindBy(id="mat-input-1")
	private WebElement Lastname;

	public WebElement getEmail() {
		return Email;
	}

	@FindBy(id="mat-input-2")
	private WebElement Email;
	
	public WebElement getPhone() {
		return Phone;
	}

	@FindBy(id="mat-input-3")
	private WebElement Phone;
	
	public WebElement getDesignation() {
		return Designation;
	}

	@FindBy(id="mat-input-4")
	private WebElement Designation;
	
	public WebElement getStatus() {
		return Status;
	}

	@FindBy(id="mat-select-0")
	private WebElement Status;
	
	public WebElement getActivity() {
		return Activity;
	}

	@FindBy(xpath="(//mat-chip[@class='mat-chip mat-focus-indicator mat-primary mat-standard-chip ng-star-inserted'])[2]")
	private WebElement Activity;
	
	public WebElement getCreatebutton() {
		return createbutton;
	}

	@FindBy(xpath="//button[@class='btn rounded-pill pxp-section-cta ng-star-inserted']")
	private WebElement createbutton;

}
