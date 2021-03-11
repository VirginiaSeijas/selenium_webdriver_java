package Alerts;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class AlertsTest extends BaseTest {

    @Test
    public void testAcceptAlert(){
        var alertPage = homePage.clickJavaScriptAlert();
        alertPage.triggerAlert();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResult(), "You successfully clicked an alert", "Result text is incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertPage = homePage.clickJavaScriptAlert();
        alertPage.triggerConfirm();
        String TEXT = alertPage.alert_getText();
        alertPage.alert_clickToDismiss();
        assertEquals(TEXT, "I am a JS Confirm", "Result message is incorrect");
    }

    @Test
    public void testSendKeysFromAlert(){
        var alertPage = homePage.clickJavaScriptAlert();
        alertPage.triggerPrompt();
        String TEXT = "You rock";
        alertPage.alert_sendKeys(TEXT);
        alertPage.alert_clickToAccept();
        assertEquals("You entered: "+TEXT, "You entered: You rock","Result text is incorrect");
    }

}
