package com.qa.testscripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.qa.pages.SeleniumPages;

public class TC_Selenium extends Testdata{
	
	SeleniumPages sspage;
	@Test
	public void Starting() throws IOException {
		sspage=new SeleniumPages(Driver);
		SeleniumPages.search.sendKeys("Selenium");
		String s=SeleniumPages.dropdown.getText();
		File f=((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\GOD\\Desktop\\Selenium ss"));
		System.out.println(s);
		
		
	}

}
