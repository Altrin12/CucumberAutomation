package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;

	@FindBy(name = "email_create")
	private WebElement emaill;

	@FindBy(xpath = "//span[normalize-space()='Create an account']")
	private WebElement signin;


	public Login_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmaill() {
		return emaill;
	}

	public WebElement getSignin() {
		return signin;
	}
}
