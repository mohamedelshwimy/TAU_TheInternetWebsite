package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By example1 = By.xpath("//a[contains(@href,'loading/1')]");
    private By example2 = By.xpath("//a[contains(@href,'loading/2')]");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }
    public DynamicLoadingEx1 clickEx1(){
        driver.findElement(example1).click();
        return new DynamicLoadingEx1(driver);
    }
    public DynamicLoadingEx1 clickEx2(){
        driver.findElement(example2).click();
        return new DynamicLoadingEx1(driver);
    }

}
