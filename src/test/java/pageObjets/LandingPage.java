package pageObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	By search=By.className("search-keyword");
	By productName=By.cssSelector("h4.product-name");
	WebDriver driver;
	By topDeals=By.linkText("Top Deals");
	By increment=By.cssSelector("a.increment");
	By addToCart=By.cssSelector(".product-action button");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}


	
	public void searchItem(String productName) throws InterruptedException
	{
		driver.findElement(search).sendKeys(productName);
		Thread.sleep(1000);
	}
	
	public void incrementQty(int qty)
	{
		int i=qty-1;
		while(i>0)
		{
			
			driver.findElement(increment).click();
			i--;
		}
	}
	
	
	public void addToCart()
	{
		driver.findElement(addToCart).click();
		
	}
	
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}


	public void selectTopDeals()
	{
		driver.findElement(topDeals).click();
	}

	public String getTitleLandingPage()
	{
		return driver.getTitle();
	}
	

}
