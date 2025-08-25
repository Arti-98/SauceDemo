package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Pages.BasePage;

public class CartPage extends BasePage {

    private By checkoutBtn = By.id("checkout");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductInCart(String productName) {
        By item = By.xpath("//div[@class='inventory_item_name' and text()='" + productName + "']");
        return driver.findElements(item).size() > 0;
    }

    public void proceedToCheckout() {
        click((WebElement) checkoutBtn);
    }
}
