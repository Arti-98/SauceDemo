package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Pages.BasePage;

public class ProductsPage extends BasePage {

    private By pageTitle = By.cssSelector("span.title");
    private By cartIcon = By.className("shopping_cart_link");
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductsPage() {
        return getText(pageTitle).equalsIgnoreCase("Products");
    }

    private String getText(By pageTitle2) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addToCart(String productName) {
        By addBtn = By.xpath("//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button");
        click(addBtn);
    }

    private void click(By addBtn) {
		// TODO Auto-generated method stub
		
	}

	public void goToCart() {
        click(cartIcon);
    }
}
