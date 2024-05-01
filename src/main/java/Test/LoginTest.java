package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void testLoginWithValidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("tester1@simplestream.com");
        loginPage.enterPassword("TestLogin");
        loginPage.clickLoginButton();

        // Assuming successful login redirects to the homepage
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.wwgoa.com/");
    }
    @Test
    public void testLoginWithInvalidCredentials() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("test2@simplestream.com");
        loginPage.enterPassword("invalid_password");
        loginPage.clickLoginButton();

        // Assuming error message is displayed for invalid credentials
        Assert.assertTrue(loginPage.getErrorMessage().contains("Unknown email address. Check again or try your username."));
    }
}
