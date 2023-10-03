package Login;
import Base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecuredArea;
import static org.testng.Assert.*;

public class LoginTest extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuth();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecuredArea securedArea = loginPage.clickLogin();
        assertTrue(securedArea.getAlertText().contains("You logged into a secure area!"));
    }

}
