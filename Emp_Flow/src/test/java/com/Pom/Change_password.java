package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Change_password {

	public WebDriver driver;
	
	public WebElement getIconclick() {
		return iconclick;
	}

	@FindBy(xpath="//img[@class='rounded-circle ng-star-inserted']")
	private WebElement iconclick;
	
	public WebElement getChangepwd() {
		return changepwd;
	}

	@FindBy(xpath="(//a[text()='Change password'])[2]")
	private WebElement changepwd;
	
	public WebElement getCurrentpwd() {
		return currentpwd;
	}

	@FindBy(xpath="//input[@placeholder='Current password']")
	private WebElement currentpwd;

	public WebElement getButtonpwd() {
		return buttonpwd;
	}

	@FindBy(xpath="(//a[text()='Verify'])[3]")
	private WebElement buttonpwd;
	
	public Change_password(WebDriver driver2) {
		
	this.driver=driver2;
	
	PageFactory.initElements(driver, this);
	
	}
	
}
