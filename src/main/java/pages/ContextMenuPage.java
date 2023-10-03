package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By hotSpot = By.id("hot-spot");
    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickHotSpot(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(hotSpot)).perform();
    }
    public String getHotSpotText(){
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
