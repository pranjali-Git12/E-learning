package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.HomePagePOMTC4;
import com.training.pom.HomePagePOMTC5;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SimpleTestTC04 {

	private WebDriver driver; 
	private String baseUrl; 
	private HomePagePOMTC4 homepagePOMTC4; 
	private static Properties properties; 
	private ScreenShot screenShot; 
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		homepagePOMTC4 = new HomePagePOMTC4(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	

	
	@Test
	public void LostPasswordTest() {
		homepagePOMTC4.clickLostPassword(baseUrl);
		homepagePOMTC4.sendusername("pranjali");
		homepagePOMTC4.clickSendMsg(); 
		homepagePOMTC4.sendUserName("pranjali");
		homepagePOMTC4.sendPassword("pranjali");
		homepagePOMTC4.clickLoginBtn();
			screenShot.captureScreenShot("LostPassworddeatils");
	}
	
}


