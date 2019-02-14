package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc_01 {
	
	@Test
	
	public static void launchBrowser()
	{
		System.out.println("Launching browser");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("Launching browser is completed");
	}

}
