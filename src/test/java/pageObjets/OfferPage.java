package pageObjets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	
	WebDriver driver;
	By productName=By.xpath("//*[@class='table table-bordered']//td[1]");
	
	public OfferPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void searchItem(String productName) throws InterruptedException
	{
		driver.findElement(By.id("search-field")).sendKeys(productName);
		Thread.sleep(1000);
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
}
