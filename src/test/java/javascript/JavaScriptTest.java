package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptTest extends BaseTest {

    @Test
    public void testScrollTable(){
        homePage.clickLargeDOM().scrollToTable();
    }

    @Test
    public void testInfiniteScroll(){
        homePage.clickInfiniteScroll().scrollParagraph(5);
    }
}
