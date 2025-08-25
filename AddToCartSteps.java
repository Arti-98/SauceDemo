package stepDefinitions;

import io.cucumber.java.en.*;
import net.bytebuddy.asm.Advice.AssignReturned.Factory;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import BStackDemo.CartPage;
import BStackDemo.LoginPage;
import PageObject.ProductsPage;

public class AddToCartSteps extends Factory {

    private LoginPage login;
    private ProductsPage products;
    private CartPage cart;

    @Given("I login with {string} and {string}")
    public void i_login_with_and(String user, String pass, WebDriver driver) {
        login = new LoginPage(driver);
        login.open();
        login.login(user, pass);
        products = new ProductsPage(driver);
        Assert.assertTrue(products.isOnProductsPage(), "Login failed!");
    }

    @When("I add {string} to the cart")
    public void i_add_to_the_cart(String item) {
        products.addToCart(item);
        products.goToCart();
    }

    @Then("the cart should contain {string}")
    public void the_cart_should_contain(String item, WebDriver driver) {
        cart = new CartPage(driver);
        Assert.assertTrue(cart.isProductInCart(item), "Cart does not contain: " + item);
    }
}
