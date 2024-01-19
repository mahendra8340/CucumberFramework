package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjets.CheckOutPage;
import utils.TestContextSetup;

public class CheckOutPageStepDefinitions {
	


	TestContextSetup testContextSetup;
	WebDriver driver;
	CheckOutPage checkOutPage;
	
	public CheckOutPageStepDefinitions(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.driver=testContextSetup.driver;
		this.checkOutPage =testContextSetup.PageObjectManager.CheckOutPage(); 
	}
	
	  
	@Then("Verify user has ability to enter promo code and place the order")
	public void Verify_user_has_ability_to_enter_promo_code()
	{
		
		Assert.assertTrue(checkOutPage.verifyPromocode());
		Assert.assertTrue(checkOutPage.verifyPlaceOrder());
	}
	
	@Then("^user proceeds to checkout and validates the (.+) items in checkout page$")
	public void user_proceeds_to_checkOut(String vegName) throws InterruptedException
	{
		checkOutPage.checkOutItems();
		

	}

	
	
	

}
