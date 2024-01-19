package pageObjets;

import org.openqa.selenium.WebDriver;

public class pageObjectManager {
	
	
	public WebDriver driver;
	public LandingPage landingPage;
	public OfferPage offerPage;
	public CheckOutPage checkOutPage;
	
	public pageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}

	public LandingPage getLandingPage()
	{
		landingPage=new LandingPage(driver);
		return landingPage;
	}
	
	public OfferPage getOfferPage()
	{
		offerPage=new OfferPage(driver);
		return offerPage;
	}
	
	public CheckOutPage CheckOutPage()
	{
		checkOutPage=new CheckOutPage(driver);
		return checkOutPage;
	}
}
