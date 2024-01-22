package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {

	TestContextSetup testConextSetup;

	public Hooks(TestContextSetup testConextSetup) {
		this.testConextSetup = testConextSetup;
	}

	@After
	public void AfterScenario() {
		testConextSetup.driver.quit();
	}
	
	@AfterStep
	public void addScreenshot(Scenario scenario) throws WebDriverException, IOException
	{
		if(scenario.isFailed())
		{
			File srcPath=((TakesScreenshot) testConextSetup.testBase.WebDriverManager()).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(srcPath);
			scenario.attach(fileContent, "image/png", "image1");
		}
		
	}
	
}
