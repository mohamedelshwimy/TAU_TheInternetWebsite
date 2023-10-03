package javaScriptAlerts;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.JavaScriptAlerts;
import static org.testng.Assert.*;

public class JavaScriptAlertsTests extends BaseTests {

    @Test
    public void testAlert(){
        JavaScriptAlerts javaScriptAlerts = homePage.clickjavaScriptAlerts();
        javaScriptAlerts.triggerAlert();
        javaScriptAlerts.acceptAlert();
        assertEquals(javaScriptAlerts.alertResultText(),"You successfully clicked an alert","result text error");
    }

    @Test
    public void testConfirmAlert(){
        JavaScriptAlerts javaScriptAlerts = homePage.clickjavaScriptAlerts();
        javaScriptAlerts.clickConfirmButton();
        assertEquals(javaScriptAlerts.confirmAlertText(),"I am a JS Confirm","Error confirm text");
        javaScriptAlerts.dismissAlert();
    }
}
