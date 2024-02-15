package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class LoginSteps {
    private WebDriver driver;

    public LoginSteps(SharedSteps sharedSteps) {
        this.driver = sharedSteps.getDriver();
    }
    @Given("I am on the after login home page")
    public void iAmOnTheHomePage() {
     
        driver.get("https://demowebshop.tricentis.com/");
    }

    @When("I click on the login link")
    public void iClickOnTheLoginLink() {
        WebElement loginLink = driver.findElement(By.cssSelector("a.ico-login"));
        loginLink.click();
    }

    @And("I will enter the {string} in Email tab")
    public void iWillEnterTheEmailIDInEmailTab(String email) {
        WebElement emailInput = driver.findElement(By.id("Email"));
        emailInput.sendKeys(email);
    }

    @And("I will enter the {string} in Password tab")
    public void iWillEnterThePasswordInPasswordTab(String password) {
        WebElement passwordInput = driver.findElement(By.id("Password"));
        passwordInput.sendKeys(password);
    }

    @And("I will click on the Login button")
    public void iWillClickOnTheLoginButton() {
        WebElement loginButton = driver.findElement(By.className("login-button"));
        loginButton.click();
    }

    @Then("It should get login and show {string}")
    public void itShouldGetLoginAndShowStatus(String status) {
       System.out.println("Login is"+status);
    }

}