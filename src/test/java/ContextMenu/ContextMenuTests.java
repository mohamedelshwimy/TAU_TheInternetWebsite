package ContextMenu;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import static org.testng.Assert.*;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testContextMenu(){
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.clickHotSpot();
        String alertText = contextMenuPage.getHotSpotText();
        assertEquals(alertText,"You selected a context menu","no match");
        contextMenuPage.acceptAlert();
    }
}
