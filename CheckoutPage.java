package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.BasePage;

public class CheckoutPage extends BasePage {

    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueBtn = By.id("continue");
    private By finishBtn = By.id("finish");
    private By confirmationMsg = By.className("complete-header");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void fillCustomerInfo(String f, String l, String zip) {
        type(firstName, f);
        type(lastName, l);
        type(postalCode, zip);
        click((WebElement) continueBtn);
    }

    private void type(By firstName2, String f) {
		// TODO Auto-generated method stub
		
	}

	public void completeOrder() {
        click((WebElement) finishBtn);
    }

    public boolean isOrderConfirmed() {
        return getText((WebElement) confirmationMsg).contains("THANK YOU");
    }
}
