package PageObject;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private static final String PAGE_URL = "https://www.saucedemo.com/";

    @FindBy(id = "user-name")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    // SauceDemo shows errors in an <h3 data-test="error">...</h3>
    @FindBy(css = "h3[data-test='error']")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    /** Open login page and wait until ready */
    public LoginPage open() {
        driver.get(PAGE_URL);
        wait.until(ExpectedConditions.visibilityOf(usernameField));
        return this;
    }

    public LoginPage typeUsername(String username) {
        wait.until(ExpectedConditions.elementToBeClickable(usernameField)).clear();
        usernameField.sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password) {
        wait.until(ExpectedConditions.elementToBeClickable(passwordField)).clear();
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
        return this;
    }

    /** One-call login helper */
    public void login(String username, String password) {
        typeUsername(username);
        typePassword(password);
        clickLogin();
    }

    public boolean isErrorVisible() {
        return wait.until(ExpectedConditions.visibilityOf(errorMessage)).isDisplayed();
    }

    public String getErrorText() {
        return wait.until(ExpectedConditions.visibilityOf(errorMessage)).getText().trim();
    }
}
