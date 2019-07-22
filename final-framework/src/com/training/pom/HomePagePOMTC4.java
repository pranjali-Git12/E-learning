package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOMTC4 {

	private WebDriver driver; 
	public HomePagePOMTC4(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
		
	@FindBy(xpath="//ul[@class ='nav nav-pills nav-stacked']//a[text()=' I lost my password ']")
	private WebElement LostPassword;
	
		
	@FindBy(id="lost_password_user")
	private WebElement username;
	
	@FindBy(id="lost_password_submit")
	private WebElement SendMsg; 
	
	@FindBy(name="login")
	private WebElement userName; 
	
	//*[@id="login"]
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="submitAuth")
	private WebElement loginBtn; 
	
	public void clickLostPassword(String LostPassword) {
    this.LostPassword.click();
	
	}
	
	public void sendusername(String username) {
		this.username.clear();
		this.username.sendKeys(username);
	}
		
	
	public void clickSendMsg() {
	this.SendMsg.click(); 
	}
	
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
	
	


