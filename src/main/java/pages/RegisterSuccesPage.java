package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RegisterSuccesPage {

    WebDriver driver;
    public RegisterSuccesPage(WebDriver driver){
        this.driver=driver;
    }

    //b[contains(text(),'Dear')]
    By successPage=By.xpath("//b[contains(text(),'Dear')]");
    public void successPage(){
        String successText = driver.findElement(successPage).getText();
        Assert.assertTrue(successText.contains("Dear"),"Registration attempt fail");
    }
}
