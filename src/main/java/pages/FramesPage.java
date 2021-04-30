package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {

    private WebDriver driver;
    private By nestedFrames = By.xpath("//a[text()='Nested Frames']");


    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    public NestedFramePage clickNestedFrames(){
        driver.findElement(nestedFrames).click();
        return new NestedFramePage(driver);
    }
}
