package com.step.definition;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.automationbase.Base_Class;
import com.pageobjectmanager.PageObjectManager;
import com.test.runner.TestRunner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class{
	public static WebDriver driver = TestRunner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	@Before
	public static void beforeHooks(Scenario s) {
		System.out.println("Scenario Name : "+s.getName());
	}

	@After
	public static void afterHooks(Scenario s) throws Throwable {
		if (s.isFailed()) {
			TakesScreenshot tss=(TakesScreenshot) driver;
			File f = tss.getScreenshotAs(OutputType.FILE);
			File destination = new File("C:\\Users\\altri\\eclipse-workspace\\CucumberAutomationTest\\ScreenShort\\pic.png");
			FileUtils.copyFile(f, destination);
		}
		System.out.println("Scenario Status : "+s.getStatus());
	}

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		getUrl("http://automationpractice.com/index.php");
	}

	@Then("^user Click On The Login Button And It Navigates To Account Creation Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_Account_Creation_Page() throws Throwable {
		implicitwait(10, TimeUnit.SECONDS);
		clickOnElement(pom.getHP().getLogin());
	}

	@When("^user Enter The \"([^\"]*)\" In Email Id Field$")
	public void user_Enter_The_In_Email_Id_Field(String email) throws Throwable {
		inputValueElement(pom.getLP().getEmaill(),email);
	}

	@Then("^user Click On The Create An Account Button And Its Navigate To Create An Account Page$")
	public void user_Click_On_The_Create_An_Account_Button_And_Its_Navigate_To_Create_An_Account_Page() throws Throwable {
		clickOnElement(pom.getLP().getSignin());
	}

	@When("^user Select The Title$")
	public void user_Select_The_Title() throws Throwable {
		implicitwait(10, TimeUnit.SECONDS);
		clickOnElement(pom.getPI().getIdgen());
	}

	@When("^user Enter The \"([^\"]*)\" In First Name Field$")
	public void user_Enter_The_In_First_Name_Field(String firstName) throws Throwable {
		inputValueElement(pom.getPI().getFirstname(),firstName);
	}

	@When("^user Enter The \"([^\"]*)\" In Last Name Field$")
	public void user_Enter_The_In_Last_Name_Field(String lastName) throws Throwable {
		inputValueElement(pom.getPI().getLastname(),lastName);
	}

	@When("^user Click The Email Id In Email Id Field$")
	public void user_Click_The_Email_Id_In_Email_Id_Field() throws Throwable {
		clickOnElement(pom.getPI().getEmail());
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		inputValueElement(pom.getPI().getPasswordd(),password);
	}

	@When("^user Enter The Date Of Birth In Date Of Birth Field$")
	public void user_Enter_The_Date_Of_Birth_In_Date_Of_Birth_Field() throws Throwable {
		clickOnElement(pom.getPI().getDays());
	}

	@When("^user Enter The Month Of Birth In Month Of Birth Field$")
	public void user_Enter_The_Month_Of_Birth_In_Month_Of_Birth_Field() throws Throwable {
		clickOnElement(pom.getPI().getMonths());
	}

	@When("^user Enter The Year Of Birth In Year Of Birth Field$")
	public void user_Enter_The_Year_Of_Birth_In_Year_Of_Birth_Field() throws Throwable {
		clickOnElement(pom.getPI().getYears());
	}

	@When("^user Select The Sign Up For Our Newsletter$")
	public void user_Select_The_Sign_Up_For_Our_Newsletter() throws Throwable {
		clickOnElement(pom.getPI().getNewsletter());
	}

	@When("^user Select The Receive Special Offers From Our Partners$")
	public void user_Select_The_Receive_Special_Offers_From_Our_Partners() throws Throwable {
		clickOnElement(pom.getPI().getOptions());
	}

	@When("^user Click The First Name In First Name Field$")
	public void user_Click_The_First_Name_In_First_Name_Field() throws Throwable {
		clickOnElement(pom.getPI().getFrstnme());
	}

	@When("^user Click The Last Name In Last Name Field$")
	public void user_Click_The_Last_Name_In_Last_Name_Field() throws Throwable {
		clickOnElement(pom.getPI().getLstnme());
	}

	@When("^user Enter The \"([^\"]*)\" In The Company Field$")
	public void user_Enter_The_In_The_Company_Field(String company) throws Throwable {
		inputValueElement(pom.getPI().getApple(),company);
	}

	@When("^user Enter The \"([^\"]*)\" In Address Field$")
	public void user_Enter_The_In_Address_Field(String address) throws Throwable {
		inputValueElement(pom.getPI().getAddress1(),address);
	}

	@When("^user Enter The \"([^\"]*)\" In Address Line (\\d+) Field$")
	public void user_Enter_The_In_Address_Line_Field(String address2, int arg2) throws Throwable {
		inputValueElement(pom.getPI().getAddress2(),address2);
	}

	@When("^user Enter The \"([^\"]*)\" In The City Field$")
	public void user_Enter_The_In_The_City_Field(String city) throws Throwable {
		inputValueElement(pom.getPI().getCity(),city);
	}

	@When("^user Select The State In State Field$")
	public void user_Select_The_State_In_State_Field() throws Throwable {
		clickOnElement(pom.getPI().getIdstate());
	}

	@When("^user Enter The \"([^\"]*)\" In Zip Code Field$")
	public void user_Enter_The_In_Zip_Code_Field(String zipCode) throws Throwable {
		inputValueElement(pom.getPI().getPostcode(),zipCode);
	}

	@When("^user Enter The \"([^\"]*)\" In Additional Information Field$")
	public void user_Enter_The_In_Additional_Information_Field(String additionalInformation) throws Throwable {
		inputValueElement(pom.getPI().getOther(),additionalInformation);
	}

	@When("^user Enter The \"([^\"]*)\" In Home Phone Field$")
	public void user_Enter_The_In_Home_Phone_Field(String phone) throws Throwable {
		inputValueElement(pom.getPI().getPhone(),phone);
	}

	@When("^user Enter The \"([^\"]*)\" In Mobile Phone Field$")
	public void user_Enter_The_In_Mobile_Phone_Field(String mobile) throws Throwable {
		inputValueElement(pom.getPI().getMobile(),mobile);
	}

	@When("^user Enter The \"([^\"]*)\" In Alias Field$")
	public void user_Enter_The_In_Alias_Field(String alias) throws Throwable {
		clearElement(pom.getPI().getAli());
		inputValueElement(pom.getPI().getAlias(),alias);
	}

	@Then("^user Click On The Register Button And Its Navigate To Account Page$")
	public void user_Click_On_The_Register_Button_And_Its_Navigate_To_Account_Page() throws Throwable {
		clickOnElement(pom.getPI().getSubmitaccount());
	}

	@Then("^user Click On The Register Button And Its Navigate To My Account Page$")
	public void user_Click_On_The_Register_Button_And_Its_Navigate_To_My_Account_Page() throws Throwable {
		clickOnElement(pom.getCP().getTopmenu1());
		clickOnElement(pom.getPP().getTopmenu2());	
	}

	@Then("^user Click On The Women Button And Its Navigate To Category Page$")
	public void user_Click_On_The_Women_Button_And_Its_Navigate_To_Category_Page() throws Throwable {
		clickOnElement(pom.getPP().getCenter());
	}

	@Then("^user Click The Faded Short Sleeve T-shirts And Its Navigate To Product Page$")
	public void user_Click_The_Faded_Short_Sleeve_T_shirts_And_Its_Navigate_To_Product_Page() throws Throwable {

		clickOnElement(pom.getPP().getTshirt());
	}

	@When("^user Click The Plus Button Thrice In Quantity Field$")
	public void user_Click_The_Plus_Button_Thrice_In_Quantity_Field() throws Throwable {
		clickOnElement(pom.getPP().getIcon1());
		clickOnElement(pom.getPP().getIcon2());
	}

	@Then("^user Click The Add To Cart Button And Its Pop Up Notification$")
	public void user_Click_The_Add_To_Cart_Button_And_Its_Pop_Up_Notification() throws Throwable {
		clickOnElement(pom.getPP().getButton());
	}

	@Then("^user Click The Proceed To Check Out Button And Its Navigate To Order Page$")
	public void user_Click_The_Proceed_To_Check_Out_Button_And_Its_Navigate_To_Order_Page() throws Throwable {
		clickOnElement(pom.getPP().getCheckout());
	}

	@Then("^user Click The Proceed To Check Out Button And Its Navigate To Step One Page$")
	public void user_Click_The_Proceed_To_Check_Out_Button_And_Its_Navigate_To_Step_One_Page() throws Throwable {
		clickOnElement(pom.getOP().getColumn());
	}

	@Then("^user Click The Proceed To Check Out Button And Its Navigate To Order Two Page$")
	public void user_Click_The_Proceed_To_Check_Out_Button_And_Its_Navigate_To_Order_Two_Page() throws Throwable {
		clickOnElement(pom.getOP().getCheck22());
	}

	@When("^user Click Check Box In I Agree Field$")
	public void user_Click_Check_Box_In_I_Agree_Field() throws Throwable {
		clickOnElement(pom.getOP().getCgv());
	}

	@Then("^user Click The Proceed To Check Out Button And Its Navigate To Shipping Page$")
	public void user_Click_The_Proceed_To_Check_Out_Button_And_Its_Navigate_To_Shipping_Page() throws Throwable {
		clickOnElement(pom.getOP().getCheckout());
	}

	@Then("^user Click The Pay By Bank Where Button And Its Navigate To Payment Page$")
	public void user_Click_The_Pay_By_Bank_Where_Button_And_Its_Navigate_To_Payment_Page() throws Throwable {
		clickOnElement(pom.getPMP().getPayment());
	}

	@Then("^user Click The I Confirm My Order Button And Its Navigate To Complete Page$")
	public void user_Click_The_I_Confirm_My_Order_Button_And_Its_Navigate_To_Complete_Page() throws Throwable {
		clickOnElement(pom.getCMP().getNavigate());
	}
}
