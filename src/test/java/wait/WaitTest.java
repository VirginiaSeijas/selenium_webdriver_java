package wait;

import base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class WaitTest extends BaseTest {

    @Test
    public void testWaitUntilHiden(){
        var loadingPage = homePage.clickLoading().clickExample1();
        loadingPage.clickStartButton();
        assertEquals(loadingPage.getTextLoaded(), "Hello World!", "The text displayed is not correct");
    }
}