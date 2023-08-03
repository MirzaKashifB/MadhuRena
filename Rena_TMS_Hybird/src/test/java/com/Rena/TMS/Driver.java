package com.Rena.TMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Driver {

	@Test
	public void execute() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("done");
		driver.quit();
	}
}
