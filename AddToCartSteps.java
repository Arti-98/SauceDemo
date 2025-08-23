package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import BStackDemo.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartSteps<ProductsPage> {
    WebDriver driver;
    LoginPage loginPage;
    ProductsPage productsPage;
    
    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        WebDriverManager.chromedriver().setup();
        driver = (WebDriver) new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        
        loginPage = new LoginPage(driver);
        loginPage.loginToApplication("standard_user", "secret_sauce");
        
    }

    @When("the user adds the {string} to the cart")
    public void the_user_adds_the_to_the_cart(String productName) {
        ((Object) productsPage).addBackpackToCart();
    }

    @Then("the shopping cart icon should show a count of {string}")
    public void the_shopping_cart_icon_should_show_a_count_of(String expectedCount) {
        Assert.assertEquals(((Object) productsPage).getCartItemCount(), expectedCount);
        driver.quit();
    }
}