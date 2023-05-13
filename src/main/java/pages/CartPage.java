package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    @CacheLookup
    @FindBy(name = "uid")
    private WebElement userId;



    @CacheLookup
    @FindBy(name = "btnAddToCart")
    private WebElement AddtoCartButton;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public void removeFromCart(){

    }

    public void addToCart(int id){

    }
}
