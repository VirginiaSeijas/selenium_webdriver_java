package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingExample1Page {

    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingButton = By.id("loading");
    private By textLoaded = By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver){
        this.driver =  driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loadingButton)));
    }

    public String getTextLoaded(){
        return driver.findElement(textLoaded).getText();
    }
}