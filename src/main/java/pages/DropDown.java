package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDown {
    private WebDriver driver;
    public DropDown(WebDriver driver){
        this.driver=driver;
    }
    private By dropDown = By.id("dropdown") ;
    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private Select findDropDownElement(){
        return new Select(driver.findElement(dropDown));
    }

    //Chapter 10: Optional Independent Exercise
    //1- Add JavaScript to change that dropdown, and then select both Option 1 and Option 2
    //2- In your test, verify that you have those two selected, and that they're “Option 1” and “Option 2”
    public void jsDropDown(){
        var jsExecutor = ((JavascriptExecutor)driver);
        String script = "arguments[0].setAttribute('multiple', '')";
        jsExecutor.executeScript(script,findDropDownElement());
    }
}
