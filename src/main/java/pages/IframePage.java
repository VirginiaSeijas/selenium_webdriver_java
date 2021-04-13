package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IframePage {

    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIdentButton = By.xpath("//button[@title = 'Decrease indent']");


    public IframePage(WebDriver driver){
        this.driver = driver;
    }

    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String Text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(Text);
        switchToMainArea();
    }

    public String getTextFromEditor(){
        switchToEditArea();
        String text =  driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void decreaseIndention(){
        driver.findElement(decreaseIdentButton).click();
    }

    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

}
