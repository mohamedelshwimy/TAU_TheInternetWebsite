package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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

    //Chapter 11 Optional Independent Exercise
    //1- Simulate a right click.
    //2- Open a new tab
    //3- After opening this link in a new tab, switch over to it and verify that the “Start” button is there.
    public DynamicLoadingEx1 rightClickOnExample1Link(){
        driver.findElement(example1).sendKeys(Keys.CONTROL, Keys.RETURN);
        return new DynamicLoadingEx1(driver);
    }

}
