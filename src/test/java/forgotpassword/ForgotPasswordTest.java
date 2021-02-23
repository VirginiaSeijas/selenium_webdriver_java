package forgotpassword;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.EmailSentPage;

import static org.testng.Assert.assertTrue;


public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testSuccessfulRetrievePassword(){
        ForgotPasswordPage forgotPasswordPage =  homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickButtonRetrieve();
        assertTrue(emailSentPage.getMessageText()
                .contains("Your e-mail's been sent!"),
                "the message is incorrect");
    }

}
