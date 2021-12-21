package SetupClass.StepDefinition;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import SetupClass.Setupclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class sli_with_escapekey extends Setupclass {

	@Given("user is on Home Page")
	public void user_is_on_home_page() throws Throwable {

		log.info("It's opening the website URL");
		Thread.sleep(2000);
		driver.get(AppURL);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	@Then("Enter data in search filed")
	public void enter_data_in_search_filed() throws Throwable {
		WebElement search_field = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search-input']")));
		search_field.sendKeys("HR");
		Thread.sleep(3000);
	}

	@Then("press escape key")
	public void press_escape_key() throws Throwable {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(3000);
		} catch (AWTException e) {
		}
	}

	@Then("verify the pop-up")
	public void verify_the_pop_up() throws Throwable {
		try {
			Thread.sleep(1000);
			boolean pop_up_Value = driver.findElement(By.xpath("//ul[@id='sli_autocomplete']")).isDisplayed();
			System.out.println("pop-up is displayed  " + pop_up_Value);

			assertTrue(pop_up_Value == false);
			boolean start_Browser = driver
					.findElement(By.xpath(
							"//div[@class='exposub_contnt']//a[@class='hvr-rectangle-out'][normalize-space()='Start Now']"))
					.isDisplayed();
			System.out.println("images are displayed=  " + start_Browser);
			assertTrue(start_Browser == true);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
		}
	}

	@Then("Click on login button")
	public void click_on_login_button() throws Throwable {
		
		WebElement sign_In = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Login']")));
		js.executeScript("arguments[0].click();", sign_In);
		//sign_In.click();
		Thread.sleep(2000);
	}

	@Then("Enter free valid username and password")
	public void enter_free_valid_username_and_password() throws Throwable {
		try {
			WebElement email = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='E-mail Address']")));
			email.sendKeys("nisha.dhiman@slidetech.in");
			WebElement password = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Password']")));
			password.sendKeys("Qwerty");
			WebElement login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Submit']")));
			login_btn.click();

			Thread.sleep(3000);
		} catch (InterruptedException e) {
		
		}
	}

	@Then("Enter Data in Search filed")
	public void Enter_data_in_search_filed() throws Exception {
		WebElement search_field1 = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search-input']")));
		search_field1.sendKeys("HR");
		Thread.sleep(3000);

	}

	@Then("Press Escape key")
	public void press_Escape_key() throws Throwable {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(1000);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(3000);
		} catch (AWTException e) {
		}
	}

	@Then("verify the Pop-up")
	public void verify_the_Pop_up() throws Throwable {
		try {
			Thread.sleep(2000);
			boolean pop_up_Value1 = driver.findElement(By.xpath("//ul[@id='sli_autocomplete']")).isDisplayed();
			System.out.println("pop-up is displayed  " + pop_up_Value1);
			assertTrue(pop_up_Value1 == false);

			// clear the search field
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='search-input']"))).clear();

			Thread.sleep(3000);

			WebElement sign_Out = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Logout']")));
			js.executeScript("arguments[0].click();", sign_Out);
		} catch (InterruptedException e) {
			
		}
	}

}
