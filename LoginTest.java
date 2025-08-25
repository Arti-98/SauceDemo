package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BStackDemo.LoginPage;
import PageObject.ProductsPage;
import net.bytebuddy.asm.Advice.AssignReturned.Factory;

public class LoginTest extends Factory {

    @DataProvider(name = "users")
    public Object[][] users() {
        return new Object[][]{
                {"standard_user", "secret_sauce", true},
                {"locked_out_user", "secret_sauce", false},
                {"problem_user", "secret_sauce", true}
        };
    }

    @Test(dataProvider = "users")
    public void testLogin(String username, String password, boolean expectedSuccess) {
        WebDriver driver = null;
		LoginPage login = new LoginPage(driver);
        (login).open();
         (login).login(username, password);

        if (expectedSuccess) {
            ProductsPage products = new ProductsPage(driver);
            Assert.assertTrue(products.isOnProductsPage(), "Login should succeed for: " + username);
        } else {
            Assert.assertTrue(login.isErrorDisplayed(), "Error should display for: " + username);
        }
    }
}
