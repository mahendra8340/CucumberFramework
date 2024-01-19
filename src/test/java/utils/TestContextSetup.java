package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjets.pageObjectManager;

public class TestContextSetup {
	
	
	public WebDriver driver;
	public String landProdName;
	public pageObjectManager PageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	public TestContextSetup() throws IOException
	{
		testBase=new TestBase(); 
		PageObjectManager=new pageObjectManager(testBase.WebDriverManager());
		genericUtils=new GenericUtils(testBase.WebDriverManager());
		driver=PageObjectManager.driver;
	}

}
