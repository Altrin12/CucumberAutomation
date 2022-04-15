package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

	public WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	private WebElement column;

	@FindBy(xpath = "//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")
	private WebElement check22;

	@FindBy(id = "cgv")
	private WebElement cgv;
	
	@FindBy(xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
	private WebElement checkout;

	public OrderPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getColumn() {
		return column;
	}

	public WebElement getCheck22() {
		return check22;
	}

	public WebElement getCgv() {
		return cgv;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
}
