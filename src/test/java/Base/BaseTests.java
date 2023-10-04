package Base;

import Utils.WindowManager;
import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver(getChromeOptions());
        goToHomePage();
        //setCookies();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

        //In case of Event Reporter
        /*
        driver = new EventFiringWebDriver(new ChromeDriver());
        driver.register(new EventReporter());
         */
    }
    @BeforeMethod
    public void goToHomePage(){
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenShot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenShot, new File("resources/ScreenShots/"+ result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        return options;
    }
    private void setCookies(){
        Cookie cookie = new Cookie
                .Builder("tau", "123")
                .domain("https://the-internet.herokuapp.com/")
                .build();
        driver.manage().addCookie(cookie);
    }
}
