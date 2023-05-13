package commonLibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtoCarttests {
    @CacheLookup
    @FindBy(name = "uid")
    private WebElement userId;



    @CacheLookup
    @FindBy(name = "btnAddToCart")
    private WebElement AddtoCartButton;

    public initDriver(WebDriver driver) {
        super (driver);
        PageFactory.initElements(driver,this);
    }

    public void removeFromCart(){

    }

    public void addToCart(int id){

    }
}
