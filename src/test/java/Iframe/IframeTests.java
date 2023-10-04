package Iframe;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.IframePage;

import static org.testng.Assert.assertEquals;

public class IframeTests extends BaseTests {
    @Test
    public void testIframe(){
        IframePage iframePage = homePage.clickIframe();
        iframePage.clearTextArea();
        iframePage.sendTextArea("Hello ");
        iframePage.clickIndentButton();
        iframePage.sendTextArea("World!");
        assertEquals(iframePage.getIframeText(),"Hello World!","error msg");
    }
}
