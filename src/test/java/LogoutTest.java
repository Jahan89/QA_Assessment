import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.LogoutPage;

public class LogoutTest extends BaseTest {
    LoginPage loginPage;


    @Test
    public void logout(String token){
        reportUtility.createATestCase("Verify user Logout");
        reportUtility.addTestLog(Status.INFO,"Performing Logout");
        LogoutPage logoutPage= new LogoutPage(driver);
        logoutPage.Logout(token);
        String expectedTitle = "user logout";
        String actualTitle = cmnDriver.getTitleOfPage();
        reportUtility.addTestLog(Status.INFO,"Comparing expected and actual titles");
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
