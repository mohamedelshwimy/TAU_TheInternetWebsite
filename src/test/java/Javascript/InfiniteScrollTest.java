package Javascript;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.InfiniteScrollPage;

public class InfiniteScrollTest extends BaseTests {
    @Test
    public void testInfiniteScroll(){
        InfiniteScrollPage infiniteScrollPage = homePage.clickInfiniteScroll();
        infiniteScrollPage.scrollToParagraph(5);
    }
}
