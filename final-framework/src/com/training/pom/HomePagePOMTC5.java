package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMTC5 {

	private WebDriver driver; 
	public HomePagePOMTC5(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(partialLinkText="Sign up!")
	private WebElement signUp; 
		
	@FindBy(id="registration_firstname")
	private WebElement firstname;
	
	@FindBy(id="registration_lastname")
	private WebElement lastname; 
	
	@FindBy(id="registration_email")
	private WebElement email;
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(id="pass1")
	private WebElement pass;
	
	
	@FindBy(id="pass2")
	private WebElement pass2;
	
	@FindBy(id="registration_phone")
	private WebElement phoneNumber;
	
	
		
	@FindBy(xpath= "//select[@id ='registration_language']")
	private WebElement Language;
	
	
	@FindBy(id="registration_official_code")
	private WebElement CodeText;
	
	@FindBy(id="extra_skype")
	private WebElement SkypeText;
	
	@FindBy(id="extra_linkedin_url")
	private WebElement LinkUrl;
	
	@FindBy(name="extra_linkedin_url")
	private WebElement LinkedIn;
		
	@FindBy(xpath=".//*[@id='registration_submit']")
	private WebElement SubmitReg;
	
	
	public void clicksignUp(String signUp) {
    this.signUp.click();
	
	}
	
	public void sendfirstname(String firstname) {
		this.firstname.clear();
		this.firstname.sendKeys(firstname);
	}
	
	public void sendlastname(String lastname) {
		this.lastname.clear();
		this.lastname.sendKeys(lastname);
	}
	
		
	public void sendemail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	public void sendusername(String username) {
		this.username.clear();
		this.username.sendKeys(username);
	}
		
	public void sendpass(String pass) {
		this.pass.clear(); 
		this.pass.sendKeys(pass); 
	}
	
	public void sendpass2(String pass2) {
		this.pass2.clear(); 
		this.pass2.sendKeys(pass2); 
	}
	
	public void sendphoneNumber(String phoneNumber) {
		this.phoneNumber.clear(); 
		this.phoneNumber.sendKeys(phoneNumber); 
	}
	
		
	public void sendLanguage(String Language) {
		this.Language.clear(); 
		this.Language.sendKeys(Language); 
	}
	
	public void sendCodeText(String CodeText) {
		this.CodeText.clear(); 
		this.CodeText.sendKeys(CodeText); 
	}
	
	public void sendSkypeText(String SkypeText) {
		this.SkypeText.clear(); 
		this.SkypeText.sendKeys(SkypeText); 
	}
	
	public void sendLinkUrl(String LinkUrl) {
		this.LinkUrl.clear(); 
		this.LinkUrl.sendKeys(LinkUrl); 
	}
	
	public void clickSubmitReg() {
	this.SubmitReg.click(); 
	}

	public void selectLanguage(String string) {
		Select m= new Select(driver.findElement(By.id("registration_language")));
		m.selectByVisibleText("English");
		
		
	}
	
	
	
	
}

