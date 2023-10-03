package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecuredArea {
    private WebDriver driver;
    public SecuredArea(WebDriver driver){
        this.driver = driver;
    }
    private By statusAlert = By.id("flash");
    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }

}
