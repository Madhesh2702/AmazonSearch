package com.qa.testscripts;

import org.testng.annotations.Test;

import com.qa.pages.SeleniumPages;

public class TC_Selenium extends Testdata{
	
	SeleniumPages sspage;
	@Test
	public void Starting() {
		sspage=new SeleniumPages(Driver);
		SeleniumPages.search.sendKeys("Selenium");
		String s=SeleniumPages.dropdown.getText();
		System.out.println(s);
		
		
	}

}
