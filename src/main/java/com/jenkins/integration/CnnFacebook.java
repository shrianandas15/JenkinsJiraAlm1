package com.jenkins.integration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import driver.DriverObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CnnFacebook extends DriverObject {

	@Test
	public void cnn() {
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();*/
		driver.get("https://edition.cnn.com/?refresh=1");
		driver.manage().window().maximize();
		System.out.println("cnn opened");
		//driver.quit();
	}

	@Test
	public void facebook() {
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();*/
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("facebook opened");
		//driver.quit();
		//new line
	}
	
	@AfterTest
	public void quitmethod() {
		driver.quit();
	}
}
