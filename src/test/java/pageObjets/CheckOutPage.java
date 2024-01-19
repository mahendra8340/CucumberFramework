package pageObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
	WebDriver driver;
	By checkout=By.cssSelector("img[alt='Cart']");
	By proccedtoCheckout=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoCode=By.className("promoBtn");
	By placeOrder=By.xpath("//button[contains(text(),'Place Order')]");
	
	
	
	
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
	}

	
	public void checkOutItems() throws InterruptedException
	{
		driver.findElement(checkout).click();
		Thread.sleep(1000);
		driver.findElement(proccedtoCheckout).click();
		//Thread.sleep(1000);
	}
	
	public Boolean verifyPromocode()
	{
		return driver.findElement(promoCode).isDisplayed();
	}
	

	public Boolean verifyPlaceOrder()
	{
		return driver.findElement(placeOrder).isDisplayed();
	}
	
	
}
