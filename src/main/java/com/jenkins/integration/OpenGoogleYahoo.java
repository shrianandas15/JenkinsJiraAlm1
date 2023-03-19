package com.jenkins.integration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.DriverObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogleYahoo extends DriverObject {

	@BeforeTest
	public void pub() {
		DriverObject.objectCreation();
	}

	@Test
	public void google() {
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();*/
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		System.out.println("Google opened");
		//driver.quit();
	}

	@Test
	public void yahoo() {
		/*WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();*/
		driver.get("https://www.yahoo.com/?guccounter=1");
		driver.manage().window().maximize();
		System.out.println("yahoo opened");
		//driver.quit();
	}

}
