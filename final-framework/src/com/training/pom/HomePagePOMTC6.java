package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMTC6 {

	private WebDriver driver; 
	public HomePagePOMTC6(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="login")
	private WebElement userName; 
	
	//*[@id="login"]
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="submitAuth")
	private WebElement loginBtn; 
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String pass) {
		this.pass.clear(); 
		this.pass.sendKeys(pass); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
}
