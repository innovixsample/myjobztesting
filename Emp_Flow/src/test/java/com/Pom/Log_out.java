package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Log_out {
	
	public Log_out(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver driver;

	public WebElement getLoicon() {
		return Loicon;
	}

	@FindBy(xpath="//img[@class='rounded-circle ng-star-inserted']")
	private WebElement Loicon;

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}

	@FindBy(xpath="(//a[text()='Logout'])[2]")
	private WebElement logoutbutton;

}
