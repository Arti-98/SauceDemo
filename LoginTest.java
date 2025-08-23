package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BStackDemo.LoginPage;
import Project.Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;
    
    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = (WebDriver) new ChromeDriver();
        driver.manage().window().maximize();
        ((WebDriver) driver).get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }
    
    @Test
    public void testSuccessfulLogin() {
        ((LoginPage) loginPage).loginToApplication("standard_user", "secret_sauce");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }
    
    @Test(dataProvider = "invalidCredentials")
    public void testInvalidLogin(String username, String password) {
        loginPage.loginToApplication(username, password);
        Assert.assertTrue(((LoginPage) loginPage).getErrorMessage().contains("Username and password do not match"));
    }
    
    @DataProvider
    public Object[][] invalidCredentials() {
        return new Object[][] {
            {"wrong_user", "secret_sauce"},
            {"standard_user", "wrong_password"},
            {"", "secret_sauce"},
            {"standard_user", ""}
        };
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}