package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steporient {
	WebDriver d ;
	
	@Given("user is entering google.com")
	public void user_is_entering_google_com() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Selenium Jar\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
				d = new ChromeDriver();
				d.get("https://www.google.com/");
				d.manage().window().maximize();
	}

	@When("user clicks the search box")
	public void user_clicks_the_search_box() throws Exception {
		Thread.sleep(5000);
	    d.findElement(By.name("q")).click();
	}

	@When("types the search term as {string}")
	public void types_the_search_term_as(String name) {
	    d.findElement(By.name("q")).sendKeys(name);
	    
	}

	@Then("the user should see the search results for Krishna")
	public void the_user_should_see_the_search_results_for_Krishna() throws Exception {
	    d.findElement(By.name("q")).sendKeys(Keys.RETURN);
	  boolean status =  d.findElement(By.partialLinkText("krish")).isDisplayed();
	    if(status) {
	    	System.out.println("Result is Displayed");
	    	Thread.sleep(3000);
	    	d.close();
	    }
		
	}
}
