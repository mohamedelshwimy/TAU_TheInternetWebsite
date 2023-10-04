package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingEx1 {
    private WebDriver driver;
    private By startButton = By.xpath("//button[contains(.,'Start')]");
    private By loading = By.id("loading");
    private By loadedText = By.id("finish");
    public DynamicLoadingEx1(WebDriver driver) {
        this.driver = driver;
    }
    public void clickStart(){
        driver.findElement(startButton).click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
        FluentWait wait = new FluentWait(driver).
                withTimeout(Duration.ofSeconds(5)).
                pollingEvery(Duration.ofSeconds(1)).
                ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loading)));
    }
    public void clickStart2(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(loadedText));
    }
    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }

    public boolean isStartButtonDisplayed() {
        return driver.findElement(startButton).isDisplayed();
    }
}
