package SetupClass.StepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import SetupClass.Setupclass;
import cucumber.api.java.en.Given;
import cucumber.api.Scenario;
import cucumber.api.java.en.Then;
import cucumber.api.java.After;


	public class TakeImageStep extends Setupclass {
		@After
		public void tearDown(Scenario scenario) {
		    if (scenario.isFailed()) {	    	
		      log.info("Scenario failed, now taking screenshot");
		      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		      scenario.embed(screenshot, "image/png");
		    }
		}
	}
