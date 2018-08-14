package stepDefinitionAsda;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebConnector;

public class AsdaGlueCode extends WebConnector {

	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
		driver.get(baseurl);
	}

	@Then("I should see asda home {string} page title")
	public void i_should_see_asda_home_page_title(String string) {
		Assert.assertEquals(string, driver.getTitle());
	}

	// pass
	@Given("click to search groceries or george {string} button")
	public void click_to_search_groceries_or_george_button(String string) throws InterruptedException {
		driver.findElement(By.xpath(string)).click();
		Thread.sleep(3000);
	}

	@When("I enter {string} item")
	public void i_enter_item(String string) throws InterruptedException {
		driver.findElement(By.xpath(string)).sendKeys("Cucumber");
		Thread.sleep(3000);
	}

	@Given("I click the {string} icon search")
	public void i_click_the_icon_search(String string) {
		driver.findElement(By.xpath(string)).click();
	}

	@Then("I should see {string}")
	public void i_should_see(String string) {
		Assert.assertEquals(string, driver.getTitle());

		// that ends verify search box
	}

// verify find a store
	@When("I click {string} button")
	public void i_click_button(String string) {
		driver.findElement(By.xpath(string)).click();
	}

	@Then("I should see {string} title")
	public void i_should_see_title(String string) {
		Assert.assertEquals(string, driver.getTitle());
		// String title = driver.getTitle();
		// System.out.println(title);
	}

	// To verify help
	@When("I click {string} yellow button")
	public void i_click_yellow_button(String string) {
		driver.findElement(By.xpath(string)).click();
		
	}

	// Scenario Outline: Verify tabs in the home page
	@When("I click on {string} link")
	public void i_click_on_link(String string) {
		driver.findElement(By.xpath(string)).click();
	}

	// Scenario Outline: Verify tabs in the home page
	@Then("the page url should contain {string}")
	public void the_page_url_should_contain(String string) {
		String title = driver.getTitle();
		System.out.println(title);

	}

	// verify asda mobile yet to work
	@When("I click on the {string} button")
	public void i_click_on_the_button(String string) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.xpath(string)).click();
		Thread.sleep(2000);

	}

	// verify asda mobile yet to work
	@Then("I should be able to see {string} title")
	public void i_should_be_able_to_see_title(String string) {
		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Assert.assertEquals(string, driver.getTitle());

	}

	// List ALL <a> tagName on the home page
	@Then("I should see all tagName on the home page")
	public void i_should_see_all_tagName_on_the_home_page() {
	    List<WebElement> links = driver.findElements(By.tagName("a"));
	    int noButtons=links.size();
	    System.out.println("No. of buttons on the home page "+noButtons);
	    if(noButtons>0) {
	    	for(WebElement link:links)
	    		System.out.println(link.getText());
	    }
	}

	@Then("I should see all buttonTags on the home page")
		public void i_should_see_all_buttonTags_on_the_home_page() {
		    List<WebElement> links = driver.findElements(By.tagName("button"));
		    int noButtons=links.size();
		    System.out.println("No. of buttons on the home page "+noButtons);
		    if(noButtons>0) {
		    	for(WebElement link:links)
		    		System.out.println(link.getText());
	}
}
//	@When("I click on {string}")
//	public void i_click_on(String string) {
//		JavascriptExecutor dd = (JavascriptExecutor)driver;
//		dd.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//	    WebElement ele = driver.findElement(By.xpath(string));
//	    ele.click();
//	}

	@When("I click on {string}")
	public void i_click_on(String string) {
WebElement ele = driver.findElement(By.xpath("element_xpath"));
JavascriptExecutor executor = (JavascriptExecutor)driver;
executor.executeScript("arguments[0].click();", ele);
}
}
