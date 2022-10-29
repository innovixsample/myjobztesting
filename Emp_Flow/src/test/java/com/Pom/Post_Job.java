package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Post_Job {
	
	public WebDriver driver;

	public Post_Job(WebDriver driver2) {
		
        this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getManagejob() {
		return managejob;
	}

	@FindBy(xpath="(//a[text()='Manage Jobs'])[1]")
	private WebElement managejob;

	public WebElement getPostjo() {
		return postjo;
	}

	@FindBy(xpath="//a[@class='btn rounded-pill pxp-nav-btn']")
	private WebElement postjo;

	public WebElement getJobtitle() {
		return jobtitle;
	}

	@FindBy(xpath="//input[@placeholder='Add title...']")
	private WebElement jobtitle;

	public WebElement getVaccancy() {
		return vaccancy;
	}

	@FindBy(xpath="//input[@placeholder='vacancy']")
	private WebElement vaccancy;

	public WebElement getCategory() {
		return category;
	}

	@FindBy(id="mat-select-26")
	private WebElement category;
	
}