package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalPage {

    private WebDriver driver;
    private By modalTitle = By.className("modal-title");
    private By modalBody = By.className("modal-body");
    private By modalButton = By.className("modal-footer");


    public ModalPage(WebDriver driver){
        this.driver = driver;
    }

    public void waitUntilTitleIsVisible(){
        WebDriverWait wait = new WebDriverWait(driver,4);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalTitle)));
    }

    public void clickClose(){
        driver.findElement(modalButton).click();
    }

    public String getModalTitle(){
        return driver.findElement(modalTitle).getText();
    }

    public String getModalBody(){
        return driver.findElement(modalBody).getText();
    }
}


