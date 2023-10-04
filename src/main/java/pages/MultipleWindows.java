package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindows {
    private WebDriver driver;
    private By openNewWindow = By.xpath("//a[contains(.,'Click Here')]");
    public MultipleWindows(WebDriver driver){
        this.driver = driver;
    }
    public void clickOpenWindow(){
        driver.findElement(openNewWindow).click();
    }

}
