package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public WebDriver driver;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement topmenu2;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]/div")
	private WebElement center;

	@FindBy(xpath = "//a[normalize-space()='Faded Short Sleeve T-shirts']")
	private WebElement tshirt;

	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement icon1;

	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement icon2;

	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
	private WebElement button;

	@FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
	private WebElement checkout;


	public ProductPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getTopmenu2() {
		return topmenu2;
	}

	public WebElement getCenter() {
		return center;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getIcon1() {
		return icon1;
	}

	public WebElement getIcon2() {
		return icon2;
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getCheckout() {
		return checkout;
	}
}
