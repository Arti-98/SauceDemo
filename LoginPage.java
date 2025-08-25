package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.BasePage;

public class LoginPage extends BasePage {

    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginBtn = By.id("login-button");
    private By errorMsg = By.cssSelector("h3[data-test='error']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.saucedemo.com/");
    }

    public void login(String user, String pass) {
        type(username, user);
        type(password, pass);
        click(loginBtn);
    }

    private void click(By loginBtn2) {
		// TODO Auto-generated method stub
		
	}

	private void type(By username2, String user) {
		// TODO Auto-generated method stub
		
	}

	public boolean isErrorDisplayed() {
        return driver.findElements(errorMsg).size() > 0;
    }
}
