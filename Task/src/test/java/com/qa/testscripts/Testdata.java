package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.SeleniumPages;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testdata {
	WebDriver Driver;
	SeleniumPages spage;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void setup(String Browser,String Url) {
		if(Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			Driver=new ChromeDriver();
			
		}
		if(Browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			Driver=new EdgeDriver();
		}
		if(Browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			Driver=new FirefoxDriver();
		}
		spage=new SeleniumPages(Driver);
		Driver.manage().window().maximize();
		Driver.get(Url);
		
	}
	@AfterClass
	public void Teardown() throws InterruptedException {
		Thread.sleep(3000);
		Driver.close();
	}

}
