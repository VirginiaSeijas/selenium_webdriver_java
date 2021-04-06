package modal;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ModalPage;

import static org.testng.Assert.assertEquals;

public class ModalTest extends BaseTest {

    @Test
    public void testGetModalTest(){
        ModalPage modalPage = homePage.clickModal();
        modalPage.waitUntilTitleIsVisible();
        assertEquals(modalPage.getModalTitle(), "THIS IS A MODAL WINDOW", "The title is not correct");
        assertEquals(modalPage.getModalBody(),"It's commonly used to encourage a user to take an action (e.g., give their e-mail address to sign up for something or disable their ad blocker).",
                "The Body is not correct");
        modalPage.clickClose();
    }
}
