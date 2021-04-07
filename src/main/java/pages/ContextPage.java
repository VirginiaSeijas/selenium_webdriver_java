package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextPage {
    private WebDriver driver;
    private By contextSpot = By.id("hot-spot");

    public ContextPage (WebDriver driver){
        this.driver = driver;
    }

    public void clickRigthContext(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(contextSpot)).perform();
    }

    public void alertClickOK(){
        driver.switchTo().alert().accept();
    }
}
