import com.aventstack.extentreports.Status;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;

public class AddToCartTests extends BaseTest {
    LoginPage loginPage;


    @Test
    public void addToCart(int id){
        reportUtility.createATestCase("Add to cart ");
        reportUtility.addTestLog(Status.INFO,"Performing Add to cart");
        CartPage cart = new CartPage(driver);
        cart.addToCart(id);
        String expectedTitle = "Item removed";
        String actualTitle = cmnDriver.getTitleOfPage();
        reportUtility.addTestLog(Status.INFO,"Comparing expected and actual titles");
        Assert.assertEquals(actualTitle,expectedTitle);
    }


    @Test
    public void removeCart(String  id){
        reportUtility.createATestCase("remove from cart ");
        reportUtility.addTestLog(Status.INFO,"Performing remove from cart");
        CartPage cart = new CartPage(driver);
        cart.removeFromCart();
        String expectedTitle = "Item removed";
        String actualTitle = cmnDriver.getTitleOfPage();
        reportUtility.addTestLog(Status.INFO,"Comparing expected and actual titles");
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
