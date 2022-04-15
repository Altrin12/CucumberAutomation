package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.CategoryPage;
import com.pom.ConfermationPage;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.OrderPage;
import com.pom.PaymentPage;
import com.pom.PersonalInfermation;
import com.pom.ProductPage;

public class PageObjectManager {

	public WebDriver driver;

	private Home_Page HP;

	private Login_Page LP;

	private PersonalInfermation PI;

	private CategoryPage CP;

	private ProductPage PP;

	private OrderPage OP;

	private PaymentPage PMP;

	private ConfermationPage CMP;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Home_Page getHP() {
		if (HP==null) {
			HP = new Home_Page(driver);
		}
		
		return HP;
	}

	public Login_Page getLP() {
		if (LP==null) {
			LP = new Login_Page(driver);
		}
		return LP;
	}

	public PersonalInfermation getPI() {
		if (PI==null) {
			PI = new PersonalInfermation(driver);
		}
		return PI;
	}

	public CategoryPage getCP() {
		if (CP==null) {
			CP = new CategoryPage(driver);
		}
		return CP;
	}

	public ProductPage getPP() {
		if (PP==null) {
			PP = new ProductPage(driver);
		}
		return PP;
	}

	public OrderPage getOP() {
		if (OP==null) {
			OP = new OrderPage(driver);
		}
		return OP;
	}

	public PaymentPage getPMP() {
		if (PMP==null) {
			PMP = new PaymentPage(driver);
		}
		return PMP;
	}

	public ConfermationPage getCMP() {
		if (CMP==null) {
			CMP = new ConfermationPage(driver);
		}
		return CMP;
	}
}
