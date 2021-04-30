package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.xml.xpath.XPath;

public class NestedFramePage {

    private WebDriver driver;
    private String frameTopName = "frame-top";
    private String frameLeftName = "frame-left";
    private By leftFrameName = By.xpath("html/body");

    public NestedFramePage(WebDriver driver){
        this.driver = driver;
    }

    public String getTitleFrameLeft(){
        driver.switchTo().frame(frameTopName);
        driver.switchTo().frame(frameLeftName);
        String title = driver.findElement(leftFrameName).getText();
        return title;
    }
}
