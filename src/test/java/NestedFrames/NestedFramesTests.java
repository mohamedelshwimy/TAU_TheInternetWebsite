package NestedFrames;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.FramesPage;

import static org.testng.Assert.assertEquals;

public class NestedFramesTests extends BaseTests {
    @Test
    public void testLeft(){
        FramesPage framesPage = homePage.clickFrame();
        framesPage.clickNestedFrames();
        assertEquals(framesPage.getLeftFrameText(),"LEFT","Error Left");
    }
    @Test
    public void testBottom(){
        FramesPage framesPage = homePage.clickFrame();
        framesPage.clickNestedFrames();
        assertEquals(framesPage.getBottomFrameText(),"BOTTOM","Error bottom");
    }
}
