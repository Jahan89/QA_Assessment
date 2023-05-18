import com.aventstack.extentreports.Status;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTests extends BaseTest {
    LoginPage loginPage;

    @Parameters({"username", "password"})
    @Test
    public void verifyUserLoginWithCorrectCredentials(String username, String password) {
        reportUtility.createATestCase("Verify user Login with correct credentials");
        reportUtility.addTestLog(Status.INFO, "Performing Login");
        loginPage = new LoginPage(driver, username);
        loginPage.loginwebsite(username, password);

        reportUtility.addTestLog(Status.INFO, "Comparing expected and actual titles");

    }
    @Parameters({"username", "password"})
    @Test

    public void verifyUserLoginWithCorrectCredentials(String username, String password)
    {
        (String username;  "standard_user");
        loginPage(password, "secret_sauce");


    @Parameters({"username", "password"})
    @Test
    public void verifyUserLoginWithlocked_out_user(String username, String password) {
        reportUtility.createATestCase("Verify user Login with locked_out_user credentials");
        reportUtility.addTestLog(Status.INFO, "Performing Login");
        loginPage = new LoginPage(driver, username);
        loginPage.loginwebsite();verifyUserLoginWithCorrectCredentials();, password);

        String actualTitle = cmnDriver.getTitleOfPage();
        reportUtility.addTestLog(Status.INFO, "Comparing expected and actual titles");

    }

    public void verifyUserLoginWithLocked_out_user(String username, String password)
    {
        loginPage(verifyUserLoginWithlocked_out_user(); "locked_out_user");
        loginPage(password, "secret_sauce");
        LoginPage;

    }

}
    @Parameters({"username","password"})
    @Test
    public void verifyUserLoginWithproblem_user(String username, String password){
        reportUtility.createATestCase("Verify user Login with problem_ credentials");
        reportUtility.addTestLog(Status.INFO,"Performing Login");
        loginPage = new LoginPage(driver, username);
        loginPage.logintoapplication(username,password);

        String actualTitle = cmnDriver.getTitleOfPage();
        reportUtility.addTestLog(Status.INFO,"Comparing expected and actual titles");

    }
    public void verifyUserLoginWithproblem_user(String username, String password)
    {
        loginPage(verifyUserLoginWithproblem_user(); "problem_user");
        loginPage(password, "secret_sauce");
        LoginPage;

    @Parameters({"username","password"})
    @Test
    public void verifyUserLoginWith_performance_glitch_user(String username, String password){
        reportUtility.createATestCase("Verify user Login with glitch credentials");
        reportUtility.addTestLog(Status.INFO,"Performing Login");
        loginPage = new LoginPage(driver, username);
        loginPage.logintoapplication(verifyUserLoginWith_performance_glitch_user,password);

        String actualTitle = cmnDriver.getTitleOfPage();
        reportUtility.addTestLog(Status.INFO,"Comparing expected and actual titles");

    }
        public void verifyUserLoginWith_performance_glitch_user(String username, String password)
        {
            loginPage(verifyUserLoginWithproblem_user(); "pperformance_glitch_userr");
            loginPage(password, "secret_sauce");
            loginPage("login-button");


        }

        @Parameters({"username", "password"})
        @Test
        public void VerifyUserLoginWithperformance_glitch_user(String username, String password) {
        reportUtility.createATestCase("Verify user Login with performance_glitch_user credentials");
        reportUtility.addTestLog(Status.INFO, "Performing Login");
        loginPage = new LoginPage(driver, username);
        loginPage.loginwebsite();();, password);

        String actualTitle = cmnDriver.getTitleOfPage();
        reportUtility.addTestLog(Status.INFO, "Comparing expected and actual titles");

    }

        public void verifyUserLoginWithLocked_out_user(String username, String password)
        {
            loginPage(verifyUserLoginWith_performance_glitch_user(); "lperformance_glitch_userr");
            loginPage(password, "secret_sauce");
            logingbutton;
    }
    }