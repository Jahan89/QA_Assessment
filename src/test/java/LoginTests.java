import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {
    LoginPage loginPage;

    @Parameters({"username","password"})
    @Test
    public void verifyUserLoginWithCorrectCredentials(String username, String password){
        reportUtility.createATestCase("Verify user Login with correct credentials");
        reportUtility.addTestLog(Status.INFO,"Performing Login");
        loginPage = new LoginPage(driver);
        loginPage.loginToApplication(username,password);

        reportUtility.addTestLog(Status.INFO,"Comparing expected and actual titles");

    }


    @Parameters({"username","password"})
    @Test
    public void verifyUserLoginWithlocked_out_user(String username, String password){
        reportUtility.createATestCase("Verify user Login with locked_out_user credentials");
        reportUtility.addTestLog(Status.INFO,"Performing Login");
        loginPage = new LoginPage(driver);
        loginPage.loginToApplication(username,password);

        String actualTitle = cmnDriver.getTitleOfPage();
        reportUtility.addTestLog(Status.INFO,"Comparing expected and actual titles");

    }

    @Parameters({"username","password"})
    @Test
    public void verifyUserLoginWithproblem_user(String username, String password){
        reportUtility.createATestCase("Verify user Login with problem_ credentials");
        reportUtility.addTestLog(Status.INFO,"Performing Login");
        loginPage = new LoginPage(driver);
        loginPage.loginToApplication(username,password);

        String actualTitle = cmnDriver.getTitleOfPage();
        reportUtility.addTestLog(Status.INFO,"Comparing expected and actual titles");

    }


    @Parameters({"username","password"})
    @Test
    public void verifyUserLoginWith_performance_glitch_user(String username, String password){
        reportUtility.createATestCase("Verify user Login with glitch credentials");
        reportUtility.addTestLog(Status.INFO,"Performing Login");
        loginPage = new LoginPage(driver);
        loginPage.loginToApplication(username,password);

        String actualTitle = cmnDriver.getTitleOfPage();
        reportUtility.addTestLog(Status.INFO,"Comparing expected and actual titles");

    }



}
