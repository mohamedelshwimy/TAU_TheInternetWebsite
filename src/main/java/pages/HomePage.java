package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    public LoginPage clickFormAuth(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDown clickDropDown(){
        clickLink("Dropdown");
        return new DropDown(driver);
    }
    public ForgotPassword clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPassword(driver);
    }
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public HorizontalSlider clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }
    public JavaScriptAlerts clickjavaScriptAlerts(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlerts(driver);
    }
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public EntryAdPage clickEntryAd(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }
    public ContextMenuPage clickContextMenu(){
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public IframePage clickIframe(){
        clickLink("WYSIWYG Editor");
        return new IframePage(driver);
    }
    public FramesPage clickFrame(){
        clickLink("Frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeDOMPage clickLargeDOM(){
        clickLink("Large & Deep DOM");
        return new LargeDOMPage(driver);
    }
    public InfiniteScrollPage clickInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindows clickMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindows(driver);
    }
}
