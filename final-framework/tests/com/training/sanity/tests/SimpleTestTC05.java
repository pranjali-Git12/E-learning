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
import com.training.pom.HomePagePOMTC5;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class SimpleTestTC05 {

	private WebDriver driver; 
	private String baseUrl; 
	private HomePagePOMTC5 homepagePOMTC5; 
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
		homepagePOMTC5 = new HomePagePOMTC5(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		driver.get(baseUrl);
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}
	
//manzoor
//mehadi
//manzoor@gmail.com	
	
	// I have created my account with below  details same I have give in code , 
	//coding is running well but at last getting message as 'This log in already in use' . I have tried with some other credential as well but same message I am getting.
	
	
	@Test
	public void signUpPassTest() {
		homepagePOMTC5.clicksignUp(baseUrl);
		homepagePOMTC5.sendfirstname("pranjali");
		homepagePOMTC5.sendlastname("Ilame");
		homepagePOMTC5.sendemail("pranjali@gmail.com");
		homepagePOMTC5.sendusername("pranjali");
		homepagePOMTC5.sendpass("pranjali");
		homepagePOMTC5.sendpass2("pranjali");
		homepagePOMTC5.sendphoneNumber("9562076453	");
		homepagePOMTC5.selectLanguage("English");
		homepagePOMTC5.sendCodeText("pr");
		homepagePOMTC5.sendSkypeText("pr");
		homepagePOMTC5.sendLinkUrl("pr");
		homepagePOMTC5.clickSubmitReg(); 
			screenShot.captureScreenShot("SubmitRegdeatils");
	}
	
}


