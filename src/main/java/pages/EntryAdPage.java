package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    private WebDriver driver;
    private By closeModal = By.xpath("//p[contains(.,'Close')]");
    public EntryAdPage (WebDriver driver){
        this.driver = driver;
    }
    public void clickCloseModal(){
        driver.findElement(closeModal).click();
    }
}
