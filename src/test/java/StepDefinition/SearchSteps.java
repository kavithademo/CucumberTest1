package StepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.After;
import io.cucumber.java.en.And;

public class SearchSteps {
    private WebDriver driver;

    public SearchSteps(SharedSteps sharedSteps) {
        this.driver = sharedSteps.getDriver();
    }
    
    @Given("I am on the home page")
    public void iAmOnTheHomePage() {

        driver.get("https://demowebshop.tricentis.com/");
    }

    @When("I type {string} in search textbox")
    public void iTypeSearchTextInSearchTextbox(String searchText) throws Throwable {
        WebElement searchInput = driver.findElement(By.id("small-searchterms"));
        searchInput.clear();
        searchInput.sendKeys(searchText);
    }

    @And("I click on the search button")
    public void iClickOnTheSearchButton() throws Throwable {
        WebElement searchButton = driver.findElement(By.className("search-box-button"));
        searchButton.click();
        
    }
  
    @After
    public void tearDown() {
    //Browser close
    driver.quit();
}
    /*
    @Then("should get result for {string}")
    public void shouldGetResultForSearchText(String searchText) throws Throwable {
        WebElement searchResultTitle = driver.findElement(By.className("product-title"));
        String resultText = searchResultTitle.getText().toLowerCase();
    }
    */
}