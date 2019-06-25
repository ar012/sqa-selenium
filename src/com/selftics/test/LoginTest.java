package com.selftics.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver = Base.getDriver();
		
		// go to automationpractice.com
		driver.get("http://automationpractice.com");
		
		// click sign in button/link
		
		// find sign in element
		WebElement element = driver.findElement(By.className("login"));
		// click on found element
		element.click();
		
		// enter 'test@timeandtraining.net' in email address text field
		// find email address textbox
		element = driver.findElement(By.id("email"));
		
		// enter text: test@timeandtraining.net
		element.sendKeys("sysmer012@gmail.com");
		
		// enter password
		driver.findElement(By.id("passwd")).sendKeys("4ejic3XjGVNxNzS");
		
		// enter submit button
		driver.findElement(By.id("SubmitLogin")).click();
		
		// text reading
		WebElement signout_button = driver.findElement(By.className("logout"));
		WebElement page_header = driver.findElement(By.className("page-heading"));
		
		
//		String signout_button_text = signout_button.getText();
		String header_text = page_header.getText();
		
		
//		System.out.println(signout_button_text);
		System.out.println(header_text);
		
		if (header_text.equals("MY ACCOUNT")) {
			System.out.println("Login Test is Passed");
		} else {
			System.out.println("Login Test is Failed");
		}
		
	}

}
