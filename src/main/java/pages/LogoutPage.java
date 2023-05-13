package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends BasePage{

    @CacheLookup
    @FindBy(name = "uid")
    private WebElement userId;



    @CacheLookup
    @FindBy(name = "btnLogout")
    private WebElement loginButton;

    public LogoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void Logout(String token) {


    }
}
