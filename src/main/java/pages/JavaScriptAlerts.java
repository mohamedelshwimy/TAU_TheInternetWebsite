package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlerts {
    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[contains(.,'Click for JS Alert')]");
    private By triggerConfirmButton = By.xpath("//button[contains(.,'Click for JS Confirm')]");
    private By triggerPrompt = By.xpath("//button[contains(.,'Click for JS Prompt')]");
    private By resultText = By.id("result");

    //Alert Button Methods
    public JavaScriptAlerts(WebDriver driver){
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String alertResultText(){
        return driver.findElement(resultText).getText();
    }

    //Confirm Button Methods
    public void clickConfirmButton(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String confirmAlertText(){
        return driver.switchTo().alert().getText();
    }

    //Prompt Button Methods
    public void clickPrompt(){
        driver.findElement(triggerPrompt).click();
    }
    public void fillPrompt(String string){
        driver.switchTo().alert().sendKeys(string);
    }
    public void promptAccept(){
        driver.switchTo().alert().accept();
    }
}
