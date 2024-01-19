package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjets.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {
	


	TestContextSetup testContextSetup;
	LandingPage landingPage;
	
	public LandingPageStepDefinitions(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.landingPage=new LandingPage(testContextSetup.driver);
	}
	
	
	@Given("user is on GreenCart landingPage")
	public void user_is_on_green_cart_landing_page() {
		
	Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
	
	}
	  
	
	@When("^user search with Shortname (.+) and extracted actual name of the product$")
	public void user_search_with_shortname_and_extracted_actual_name_of_the_product(String productName) throws InterruptedException {
		
		landingPage.searchItem(productName);
		testContextSetup.landProdName=landingPage.getProductName().split(" ")[0];
			
	}
	
	@When("added {string} items of the selected product to cart")
	public void add_items_toCart(String qty)
	{
		landingPage.incrementQty(Integer.parseInt(qty));
		landingPage.addToCart();
	}
	

	

}
