package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Schedule_job {
	
	public WebDriver driver;

	public Schedule_job(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCandidate() {
		return candidate;
	}

	@FindBy(xpath="(//a[@class='nav-link text-primary'])[1]")
	private WebElement candidate;	

	public WebElement getApplied_Can() {
		return applied_Can;
	}

	@FindBy(xpath="(//input[@class='form-check-input me-2 ng-untouched ng-pristine ng-valid'])[1]")
	private WebElement applied_Can;

	public WebElement getDots() {
		return Dots;
	}

	@FindBy(xpath="(//button[@class='mat-focus-indicator mat-menu-trigger mat-icon-button mat-button-base'])[1]")
	private WebElement Dots;

	public WebElement getSchedule() {
		return schedule;
	}

	@FindBy(xpath="(//button[@role='menuitem'])[1]")
	private WebElement schedule;

	public WebElement getDateinput_click() {
		return dateinput_click;
	}

	@FindBy(xpath="//input[@placeholder='Date Time']")
	private WebElement dateinput_click;

	public WebElement getDate_click() {
		return date_click;
	}

	@FindBy(xpath="//span[text()='20']")
	private WebElement date_click;

	public WebElement getSet() {
		return set;
	}

	@FindBy(xpath="//span[text()='Set']")
	private WebElement set;
	
	public WebElement getInterview_mode() {
		return Interview_mode;
	}

	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement Interview_mode;

	public WebElement getCreate() {
		return Create;
	}

	@FindBy(xpath="//button[text()='create']")
	private WebElement Create;

	public WebElement getSchedule_button() {
		return Schedule_button;
	}

	@FindBy(xpath="//button[@class='btn btn-primary ng-star-inserted a-enabled']")
	private WebElement Schedule_button;
	
}
