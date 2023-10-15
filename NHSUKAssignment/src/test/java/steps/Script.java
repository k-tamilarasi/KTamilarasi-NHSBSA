package steps;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script {

	WebDriver driver;

	@Given("I am a citizen of the UK_England")
	public void i_am_a_citizen_of_the_UK_England() {
		driver = new ChromeDriver();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		driver.manage().window().maximize();
		driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics")).click();
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-england")).click();
	}

	@When("I put my circumstances into the Checker tool for England")
	public void i_put_my_circumstances_into_the_Checker_tool_for_England() {
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); // GP Practice
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-not-registered")).click(); // Dental Practice
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("dob-day")).sendKeys("06");
		driver.findElement(By.id("dob-month")).sendKeys("09");
		driver.findElement(By.id("dob-year")).sendKeys("1990");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); // partner
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); // tax benefits
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); // pregnancy
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); // illness armed forces
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); // diabetes question
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); // medical conditions
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); // glaucoma
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); // care home
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); // property
		driver.findElement(By.id("next-button")).click();

	}

	@Then("I should get a result of whether I will get help or not for England")
	public void i_should_get_a_result_of_whether_I_will_get_help_or_not_for_England() throws IOException {
		getscreenshot();
		driver.close();
	}

	@Given("I am a citizen of the UK_Scotland")
	public void i_am_a_citizen_of_the_UK_Scotland() {
		driver = new ChromeDriver();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		driver.manage().window().maximize();
		driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics")).click();
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-scotland")).click();
		driver.findElement(By.id("next-button")).click();
	}

	@When("I put my circumstances into the Checker tool for Scotland")
	public void i_put_my_circumstances_into_the_Checker_tool_for_Scotland() {
		driver.findElement(By.id("radio-yes")).click(); //Highlands and Islands
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-not-registered")).click(); //Dental Practice
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("dob-day")).sendKeys("06");
		driver.findElement(By.id("dob-month")).sendKeys("09");
		driver.findElement(By.id("dob-year")).sendKeys("1990");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); //partner
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); //tax benefits
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); //pregnancy
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); //illness armed forces
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); //care home
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); //property
		driver.findElement(By.id("next-button")).click();
	}

	@Then("I should get a result of whether I will get help or not for Scotland")
	public void i_should_get_a_result_of_whether_I_will_get_help_or_not_for_Scotland() throws IOException {
		getscreenshot();
		driver.close();
	}

	@Given("I am a citizen of the UK_Wales")
	public void i_am_a_citizen_of_the_UK_Wales() {
		driver = new ChromeDriver();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		driver.manage().window().maximize();
		driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics")).click();
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-wales")).click();
		driver.findElement(By.id("next-button")).click();
	}

	@When("I put my circumstances into the Checker tool for Wales")
	public void i_put_my_circumstances_into_the_Checker_tool_for_Wales() {
		driver.findElement(By.id("radio-no")).click(); //GP Practice
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-not-registered")).click(); //Dental Practice
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("dob-day")).sendKeys("06");
		driver.findElement(By.id("dob-month")).sendKeys("09");
		driver.findElement(By.id("dob-year")).sendKeys("1990");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); //partner
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); //tax benefits
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); //pregnancy
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); //illness armed forces
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); //diabetes question
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); //glaucoma
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); //care home
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-no")).click(); //property
		driver.findElement(By.id("next-button")).click();
	}

	@Then("I should get a result of whether I will get help or not for Wales")
	public void i_should_get_a_result_of_whether_I_will_get_help_or_not_for_Wales() throws IOException {
		getscreenshot();
		driver.close();
	}

	@Given("I am a citizen of the UK_Northern Ireland")
	public void i_am_a_citizen_of_the_UK_Northern_Ireland() {
		driver = new ChromeDriver();
		driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
		driver.manage().window().maximize();
		driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics")).click();
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("radio-nire")).click();
	}

	@When("I put my circumstances into the Checker tool for Northern Ireland")
	public void i_put_my_circumstances_into_the_Checker_tool_for_Northern_Ireland() {
		driver.findElement(By.id("next-button")).click();
	}

	@Then("I should get a result of whether I will get help or not for Northern Irelenad")
	public void i_should_get_a_result_of_whether_I_will_get_help_or_not_for_Northern_Irelenad() throws IOException {
		getscreenshot();
		driver.close();
	}
	
	private void getscreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("target/Screenshots/Screenshot" +System.currentTimeMillis()+ ".png"));

	}

}
