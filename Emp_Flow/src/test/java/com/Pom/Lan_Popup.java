package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lan_Popup {
	
	public WebDriver driver;

	public Lan_Popup(WebDriver driver2) {
		
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getLicon() {
		return Licon;
	}

	@FindBy(xpath="//img[@class='ml-0 web_language']")
	private WebElement Licon;

	public WebElement getEnglish() {
		return English;
	}

	@FindBy(xpath="//button[@class='btn btn-basic btn-wh active']")
	private WebElement English;

	public WebElement getAicon() {
		return Aicon;
	}

	@FindBy(xpath="//img[@class='ml-0 web_language']")
	private WebElement Aicon;

	public WebElement getTamil() {
		return Tamil;
	}

	@FindBy(xpath="(//button[@class='btn btn-basic btn-wh'])[1]")
	private WebElement Tamil;

	public WebElement getNicon() {
		return Nicon;
	}

	@FindBy(xpath="//img[@class='ml-0 web_language']")
	private WebElement Nicon;

	public WebElement getHindi() {
		return Hindi;
	}

	@FindBy(xpath="(//button[@class='btn btn-basic btn-wh'])[2]")
	private WebElement Hindi;

	public WebElement getGicon() {
		return Gicon;
	}

	@FindBy(xpath="//img[@class='ml-0 web_language']")
	private WebElement Gicon;

	public WebElement getTelugu() {
		return Telugu;
	}

	@FindBy(xpath="(//button[@class='btn btn-basic btn-wh'])[3]")
	private WebElement Telugu;

	public WebElement getUicon() {
		return Uicon;
	}

	@FindBy(xpath="//img[@class='ml-0 web_language']")
	private WebElement Uicon;

	public WebElement getKannada() {
		return Kannada;
	}

	@FindBy(xpath="(//button[@class='btn btn-basic btn-wh'])[4]")
	private WebElement Kannada;

}