package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IframePage {
    private WebDriver driver;
    private String iframeID = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By indentbutton = By.xpath("//button[@title='Increase indent']");
    private void switchToIframe(){
        driver.switchTo().frame(iframeID);
    }
    public IframePage(WebDriver driver){
        this.driver = driver;
    }
    public void clearTextArea(){
        switchToIframe();
        driver.findElement(textArea).clear();
        exitIframe();
    }
    private void exitIframe(){
        driver.switchTo().parentFrame();
    }
    public void sendTextArea(String text){
        switchToIframe();
        driver.findElement(textArea).sendKeys(text);
        exitIframe();
    }
    public void clickIndentButton(){
        driver.findElement(indentbutton).click();
    }
    public String getIframeText(){
        switchToIframe();
        String iframeText = driver.findElement(textArea).getText();
        exitIframe();
        return iframeText;
    }

}
