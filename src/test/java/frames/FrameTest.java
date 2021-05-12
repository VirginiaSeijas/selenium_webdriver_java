package frames;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.NestedFramePage;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTest {

    @Test
    public void testIframe(){
        var editorPage = homePage.clickIframe();
        editorPage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "World";

        editorPage.setTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1 +text2, "The text of the frame is not correct");
    }

    @Test
    public void testNestedFrames(){
        FramesPage framesPage = homePage.clickFrame();
        NestedFramePage nestedFramePage = framesPage.clickNestedFrames();
        assertEquals(nestedFramePage.getTitleFrameLeft(), "LEFT", "the title is not correct");
    }
}
