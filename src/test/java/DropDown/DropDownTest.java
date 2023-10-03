package DropDown;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropDownTest extends BaseTests {
    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropDown("Option 1");
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"incorrect number of selections");
        assertTrue(selectedOptions.contains("Option 1"), "Option not selected");
    }
}
