package com.selftics.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssXpath {

	public static void main(String[] args) {
		
		WebDriver driver = Base.getDriver();
		driver.get("http://automationpractice.com");
		
//		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
		driver.findElement(By.cssSelector("#block_top_menu > ul > li.sfHoverForce > a")).click();

	}

}
