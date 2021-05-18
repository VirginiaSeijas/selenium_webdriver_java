package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public ForgotPasswordPage clickForgotPassword(){
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider(){
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickJavaScriptAlert(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }

    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ModalPage clickModal(){
        driver.manage().deleteAllCookies();
        clickLink("Entry Ad");
        return new ModalPage(driver);
    }

    public ContextPage clickContext(){
        clickLink("WYSIWYG Editor");
        return new ContextPage(driver);
    }

    public IframePage clickIframe(){
        clickLink("WYSIWYG Editor");
        return new IframePage(driver);
    }

    public FramesPage clickFrame(){
        clickLink("Frames");
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickLoading(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeDeepDomPage clickLargeDOM(){
        clickLink("Large & Deep DOM");
        return new LargeDeepDomPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

}
