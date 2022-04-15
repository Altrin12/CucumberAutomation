package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfermationPage {

	public WebDriver driver;

	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button/span")
	private WebElement navigate;

	public ConfermationPage(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getNavigate() {
		return navigate;
	}
	
	
	
}
