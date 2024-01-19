package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjets.LandingPage;
import pageObjets.OfferPage;
import utils.TestContextSetup;

public class OfferPageStepDeifnitions {
	
	String searchProd,landProdName;

	TestContextSetup testContextSetup;
	
	public OfferPageStepDeifnitions(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	@Then("^user search for same shortname (.+) in offers page to check if product exist with same name$")
	public void user_search_for_same_shortname_in_offers_page_to_check_if_product_exist(String productName) throws InterruptedException {
	    
		switchToOffersPage();
		OfferPage offerPage=testContextSetup.PageObjectManager.getOfferPage();
		offerPage.searchItem(productName);
		searchProd=offerPage.getProductName();
		
	}
	
	
	public void switchToOffersPage()
	{
		LandingPage landingpage=testContextSetup.PageObjectManager.getLandingPage();
		landingpage.selectTopDeals();
		testContextSetup.genericUtils.switchWindowToChild();
	}
	
	@Then("validates landingPage name and search page name")
	public void validates_names()
	{
		
		System.out.println(searchProd+" "+testContextSetup.landProdName);
		Assert.assertEquals(searchProd, testContextSetup.landProdName );
	}

}
