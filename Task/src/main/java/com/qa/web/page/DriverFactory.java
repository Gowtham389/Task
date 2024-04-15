package com.qa.web.page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	Properties prop;
	WebDriver driver;
	public WebDriver init_driver(Properties prop){
		
		String browser = prop.getProperty("Browser");
	System.out.println("Browser name is " + browser);
	
	if(browser.equalsIgnoreCase("Chrome")) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	 }
	else if(browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		} 
		else if(browser.equalsIgnoreCase("IE"))
		{
			WebDriverManager.iedriver().setup();
		driver = new EdgeDriver();
		} 
		else {
			
			System.out.println("enter the vaild browser" + browser);
		}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("Url"));
	
	
	return driver;
	
	
	
	
	}
	
	
	
	
	//return properties
	public Properties init_prop() {
		
		prop = new Properties();
		
		FileInputStream ip = null;
		try {
			ip= new FileInputStream("./properties/TestData.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	return prop;
	}
	
	
}
