package com.selftics.test;

import org.openqa.selenium.WebDriver;

public class Test {

	public static void main(String[] args) {

		
		WebDriver driver = Base.getDriver();
		
		// Navigating website
//		driver.get("http://www.google.com");
		driver.get("http://automationpractice.com");
	}

}
