package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfermation {

	public WebDriver driver;


	@FindBy(css = "#id_gender1")
	private WebElement idgen;

	@FindBy(xpath = "//input[@id='customer_firstname']")
	private WebElement firstname;

	@FindBy(id = "customer_lastname")
	private WebElement lastname;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(name = "passwd")
	private WebElement passwordd;

	@FindBy(xpath = "//*[@id=\"days\"]/option[19]")
	private WebElement days;

	@FindBy(xpath = "//*[@id=\"months\"]/option[5]")
	private WebElement months;

	@FindBy(xpath = "//*[@id=\"years\"]/option[31]")
	private WebElement years;

	@FindBy(id = "newsletter")
	private WebElement newsletter;

	@FindBy(id = "optin")
	private WebElement options;

	@FindBy(id = "firstname")
	private WebElement frstnme;

	@FindBy(id = "lastname")
	private WebElement lstnme;

	@FindBy(id = "company")
	private WebElement apple;

	@FindBy(id = "address1")
	private WebElement address1;

	@FindBy(id = "address2")
	private WebElement address2;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(xpath = "//*[@id=\"id_state\"]/option[6]")
	private WebElement idstate;

	@FindBy(id = "postcode")
	private WebElement postcode;

	@FindBy(id = "other")
	private WebElement other;

	@FindBy(id = "phone")
	private WebElement phone;

	@FindBy(id = "phone_mobile")
	private WebElement mobile;

	@FindBy(id = "alias")
	private WebElement ali;

	@FindBy(id = "alias")
	private WebElement alias;

	@FindBy(xpath = "//*[@id=\"submitAccount\"]/span")
	private WebElement submitaccount;

	public PersonalInfermation(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getIdgen() {
		return idgen;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswordd() {
		return passwordd;
	}

	public WebElement getDays() {
		return days;
	}

	public WebElement getMonths() {
		return months;
	}

	public WebElement getYears() {
		return years;
	}

	public WebElement getNewsletter() {
		return newsletter;
	}

	public WebElement getOptions() {
		return options;
	}

	public WebElement getFrstnme() {
		return frstnme;
	}

	public WebElement getLstnme() {
		return lstnme;
	}

	public WebElement getApple() {
		return apple;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getIdstate() {
		return idstate;
	}

	public WebElement getPostcode() {
		return postcode;
	}

	public WebElement getOther() {
		return other;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getAli() {
		return ali;
	}

	public WebElement getAlias() {
		return alias;
	}

	public WebElement getSubmitaccount() {
		return submitaccount;
	}

}





























