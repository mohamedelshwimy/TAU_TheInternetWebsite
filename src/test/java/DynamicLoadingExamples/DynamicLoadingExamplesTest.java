package DynamicLoadingExamples;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingEx1;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingExamplesTest extends BaseTests {
    @Test
    public void testDynamicLoadingEx1(){
        DynamicLoadingEx1 dynamicLoadingEx1 = homePage.clickDynamicLoading().clickEx1();
        dynamicLoadingEx1.clickStart();
        assertEquals(dynamicLoadingEx1.getLoadedText(),"Hello World!","Error msg");
    }
    @Test
    public void testDynamicLoadingEx2(){
        DynamicLoadingEx1 dynamicLoadingEx2 = homePage.clickDynamicLoading().clickEx2();
        dynamicLoadingEx2.clickStart2();
        assertEquals(dynamicLoadingEx2.getLoadedText(),"Hello World!","Error msg 2");
    }
}
