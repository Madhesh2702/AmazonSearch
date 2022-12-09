package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPages{
	WebDriver Driver;
	@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")
	public static WebElement search;
	@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]")
	public static WebElement dropdown;
	
	public SeleniumPages(WebDriver Driver) {
		this.Driver=Driver;
		PageFactory.initElements( Driver,this);
	}

}
