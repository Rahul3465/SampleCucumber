package stepdefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination
{
	WebDriver driver ;
	
	/*
	 *
	 *This code for Scenario 1
	 * 
	 *@Given("User is on net banking landing page$")
	public void user_is_on_net_banking_landing_page() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver_mac_2.43");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.flipkart.com");
		System.out.println("Opened the applicaton successfully");
	}

	@When ("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password() throws Throwable
	{
		driver.findElement(By.xpath("/html/body/div[2]//div[2]/div/form/div[1]/input")).sendKeys("rhl6555@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]//div[2]/div/form/div[2]/input")).sendKeys("9700009142");
		driver.findElement(By.xpath("/html/body/div[2]//div[2]/div/form/div[3]/button")).click();
		System.out.println("Logged in successfully");
	}

	@Then ("^Home page is displayed$")
	public void home_page_is_displayed() throws Throwable
	{
		System.out.println("Home Page Displaying");
	}

	@And ("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable
	{
		System.out.println("Cards are displaying");
		driver.close();
	}*/

	/*
	 * 
	 * This code is for scenario 2
	 * 
	 * @Given("User is on net banking landing page$")
	public void user_is_on_net_banking_landing_page() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver_mac_2.43");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.flipkart.com");
		System.out.println("Opened the applicaton successfully");
	}

	@When("^User login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_username_and_password(String arg1, String arg2) throws Throwable
	{
		driver.findElement(By.xpath("/html/body/div[2]//div[2]/div/form/div[1]/input")).sendKeys(arg1);
		driver.findElement(By.xpath("/html/body/div[2]//div[2]/div/form/div[2]/input")).sendKeys(arg2);
		driver.findElement(By.xpath("/html/body/div[2]//div[2]/div/form/div[3]/button")).click();
		System.out.println("Logged in successfully");

	}
	
	@Then("^Home page displayed was displayed \"([^\"]*)\"$")
	public void home_page_displayed_was_displayed(String arg1) throws Throwable
	{  
		System.out.println(arg1);
	}

	@Then("^Cards was displayed \"([^\"]*)\"$")
	public void cards_was_displayed(String arg1) throws Throwable
	{
		System.out.println(arg1);
		driver.quit();
	}*/
	
	
	/*
	 * 
	 * This code for Scenario 3
	 * 
	 * @Given("^User is on net banking landing page$")
	public void user_is_on_net_banking_landing_page() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver_mac_2.43");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.flipkart.com");
		System.out.println("Opened the applicaton successfully");
	}

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password(DataTable data) throws Throwable
    {
    	List<List<String>> obj = data.raw();
    	String arg1 = obj.get(0).get(0);
    	String arg2 = obj.get(0).get(1);
    	driver.findElement(By.xpath("/html/body/div[2]//div[2]/div/form/div[1]/input")).sendKeys(arg1);
		driver.findElement(By.xpath("/html/body/div[2]//div[2]/div/form/div[2]/input")).sendKeys(arg2);
		driver.findElement(By.xpath("/html/body/div[2]//div[2]/div/form/div[3]/button")).click();
		System.out.println("Logged in successfully");
    }

    @Then("^Home page id displayed$")
    public void home_page_id_displayed() throws Throwable
    {
    	System.out.println("Home Page Displaying");
    	driver.quit();
    }*/
	
	
	@Given("^User is on net banking landing page$")
    public void user_is_on_net_banking_landing_page() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver_mac_2.43");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.flipkart.com");
		System.out.println("Opened the applicaton successfully");
    }

    @When("^User login into application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable
    {
    	driver.findElement(By.xpath("/html/body/div[2]//div[2]/div/form/div[1]/input")).sendKeys(username);
		driver.findElement(By.xpath("/html/body/div[2]//div[2]/div/form/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[2]//div[2]/div/form/div[3]/button")).click();
		System.out.println("Logged in successfully");
    }

    @Then("^Home page is displayed$")
    public void home_page_is_displayed() throws Throwable
    {
    	System.out.println("Home Page Displaying");
    	driver.quit();
    }



}
