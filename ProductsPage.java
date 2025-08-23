package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    WebDriver driver;
    
    @FindBy(className = "title")
    WebElement pageTitle;
    
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addBackpackToCart;
    
    @FindBy(className = "shopping_cart_badge")
    WebElement cartBadge;
    
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public String getPageTitle() {
        return pageTitle.getText();
    }
    
    public void addBackpackToCart() {
        addBackpackToCart.click();
    }
    
    public String getCartItemCount() {
        return cartBadge.getText();
    }
}