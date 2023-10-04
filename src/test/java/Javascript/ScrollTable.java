package Javascript;

import Base.BaseTests;
import org.testng.annotations.Test;

public class ScrollTable extends BaseTests {
    @Test
    public void testScroll(){
        homePage.clickLargeDOM().scrollToTable();
    }
}
