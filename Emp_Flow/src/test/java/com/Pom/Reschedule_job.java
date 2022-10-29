package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reschedule_job {
	
	public WebDriver driver;

	public Reschedule_job(WebDriver driver2) {
		
        this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCandidates() {
		return candidates;
	}

	@FindBy(xpath="(//a[@class='nav-link text-primary'])[1]")
	private WebElement candidates;

	public WebElement getSchedradio() {
		return schedradio;
	}

	@FindBy(xpath="(//input[@class='form-check-input me-2 ng-untouched ng-pristine ng-valid'])[2]")
	private WebElement schedradio;

	public WebElement getDot() {
		return dot;
	}

	@FindBy(xpath="(//button[@aria-haspopup='menu'])[1]")
	private WebElement dot;

	public WebElement getRescheduled() {
		return rescheduled;
	}

	@FindBy(xpath="//button[@title='Scheduled']")
	private WebElement rescheduled;

	public WebElement getResbutton() {
		return resbutton;
	}

	@FindBy(xpath="//button[text()='Reschedule']")
	private WebElement resbutton;

	public WebElement getClse() {
		return clse;
	}

	@FindBy(xpath="(//button[text()='Close'])[2]")
	private WebElement clse;
    
}
