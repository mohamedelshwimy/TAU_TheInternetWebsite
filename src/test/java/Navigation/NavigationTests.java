package Navigation;

import Base.BaseTests;
import Utils.WindowManager;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertTrue;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigations(){
        homePage.clickDynamicLoading().clickEx1();
        getWindowManager().goBack();
        getWindowManager().refresh();
        getWindowManager().goForward();
        getWindowManager().goTo("https://www.google.com");
    }
    @Test
    public void testSwitchTabs(){
        homePage.clickMultipleWindows().clickOpenWindow();
        getWindowManager().switchTabs("New Window");
    }
    //Chapter 11 Optional Independent Exercise
    //1- Simulate a right click.
    //2- Open a new tab
    //3- After opening this link in a new tab, switch over to it and verify that the “Start” button is there.
    @Test
    public void testNewTab(){
        var buttonPage = homePage.clickDynamicLoading().rightClickOnExample1Link();
        getWindowManager().switchToNewTab();
        assertTrue(buttonPage.isStartButtonDisplayed(), "Start button is not displayed");
    }
}
