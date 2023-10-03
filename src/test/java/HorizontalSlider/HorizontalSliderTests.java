package HorizontalSlider;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSlider;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void setSlider(){
        HorizontalSlider horizontalSlider = homePage.clickHorizontalSlider();
        String sliderValue = "4";
        horizontalSlider.setSliderValue("4");
        assertEquals(horizontalSlider.getSliderValue(), sliderValue,"Slider value is incorrect");
    }
}
