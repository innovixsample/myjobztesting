package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class view_profile {
	
	public WebDriver driver;
	
	public view_profile(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getRoundicon() {
		return roundicon;
	}

	@FindBy(xpath="//img[@class='rounded-circle ng-star-inserted']")
	private WebElement roundicon;
	
	public WebElement getViewpro() {
		return viewpro;
	}

	@FindBy(xpath="//a[text()='View profile']")
	private WebElement viewpro;

	public WebElement getEdit() {
		return Edit;
	}

	@FindBy(xpath="//button[@class='btn rounded-pill pxp-section-cta btn']")
	private WebElement Edit;

	public WebElement getCompanyname() {
		return companyname;
	}

	@FindBy(xpath="//input[@placeholder='company@email.com']")
	private WebElement companyname;
	
	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	@FindBy(xpath="//input[@placeholder='Eg. 9876543210']")
	private WebElement mobilenumber;

	public WebElement getWebsite() {
		return website;
	}

	@FindBy(xpath="//input[@placeholder='Eg. www.abc.com']")
	private WebElement website;

	public WebElement getAbout() {
		return about;
	}

	@FindBy(xpath="//div[@class='ProseMirror NgxEditor__Content']")
	private WebElement about;

	public WebElement getIndustry() {
		return industry;
	}

	@FindBy(id="mat-select-0")
	private WebElement industry;

	public WebElement getFounded() {
		return founded;
	}

	@FindBy(xpath="//input[@placeholder='Eg. 2001']")
	private WebElement founded;

	public WebElement getComsize() {
		return comsize;
	}

	@FindBy(id="mat-select-2")
	private WebElement comsize;
	
	public WebElement getAddress1() {
		return address1;
	}

	@FindBy(xpath="//textarea[@placeholder='Eg. 104, Bussa Indl Estate, Hanuman Lane']")
	private WebElement address1;

	public WebElement getAddress2() {
		return address2;
	}

	@FindBy(xpath="//textarea[@placeholder='Eg. Behind Satyam Cinema, Ranjit Nagar']")
	private WebElement address2;

	public WebElement getState() {
		return State;
	}

	@FindBy(id="mat-select-4")
	private WebElement State;

	public WebElement getDistrict() {
		return District;
	}

	@FindBy(id="mat-select-6")
	private WebElement District;

	public WebElement getCity() {
		return City;
	}

	@FindBy(id="mat-select-8")
	private WebElement City;

	public WebElement getDocumentname() {
		return Documentname;
	}

	@FindBy(id="mat-select-10")
	private WebElement Documentname;

	public WebElement getDocumentnumber() {
		return documentnumber;
	}

	@FindBy(xpath="//input[@placeholder='E.g. 2022010200025']")
	private WebElement documentnumber;
	
	public WebElement getUpdate() {
		return update;
	}

	@FindBy(xpath="//button[@class='btn rounded-pill pxp-section-cta ng-star-inserted']")
	private WebElement update;

	public WebElement getHom() {
		return hom;
	}

	@FindBy(xpath="//button[@class='btn rounded-pill pxp-section-cta ng-star-inserted']")
	private WebElement hom;

}
