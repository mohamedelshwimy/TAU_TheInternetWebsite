package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By fileUpload = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadText = By.id("uploaded-files");
    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickUpload(){
        driver.findElement(uploadButton).click();
    }
    public void uploadFile(String filePath){
        driver.findElement(fileUpload).sendKeys(filePath);
        clickUpload();
    }
    public String getUploadText(){
        return driver.findElement(uploadText).getText();
    }

}
