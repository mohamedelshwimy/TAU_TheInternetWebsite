package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By nestedFrames = By.linkText("Nested Frames");
    private String topFrame = "frame-top";
    private String leftFrame ="frame-left";
    private String bottomFrame = "frame-bottom";
    private By body = By.tagName("body");
    public FramesPage(WebDriver driver){
        this.driver = driver;
    }
    public FramesPage clickNestedFrames(){
        driver.findElement(nestedFrames).click();
        return new FramesPage(driver);
    }
    public void switchToFrame(String frame){
        driver.switchTo().frame(frame);
    }
    private void exitFrame(){
        driver.switchTo().parentFrame();
    }
    public String getLeftFrameText(){
        switchToFrame(topFrame);
        switchToFrame(leftFrame);
        String frameText = driver.findElement(body).getText();
        exitFrame();
        return frameText;
    }
    public String getBottomFrameText(){
        switchToFrame(bottomFrame);
        String frameText = driver.findElement(body).getText();
        exitFrame();
        return frameText;
    }
}
