package context;

import base.BaseTest;
import org.testng.annotations.Test;

public class ContextTest extends BaseTest {

    @Test
    public void CickOnContextSuccess(){
        var contextPage = homePage.clickContext();
        contextPage.clickRigthContext();
        contextPage.alertClickOK();


    }
}
