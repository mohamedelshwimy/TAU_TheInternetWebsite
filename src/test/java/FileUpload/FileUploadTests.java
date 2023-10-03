package FileUpload;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        String path = "H:\\ITI\\Test Automation University\\Selenium WebDriver with Java\\Projects\\Base\\src\\main\\java\\pages\\FileUploadPage.java";
        fileUploadPage.uploadFile(path);
        assertEquals(fileUploadPage.getUploadText(),"FileUploadPage.java","Msgs not matched");
    }

}
