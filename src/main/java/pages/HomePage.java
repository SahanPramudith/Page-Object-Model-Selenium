package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public  HomePage(WebDriver driver){
        this.driver=driver;
    }

    //a[normalize-space()='REGISTER']
    //By ink=By.ByLinkText("REGISTER");

    By register_buttonLocator= new By.ByLinkText("REGISTER");

    public void click_register_button(){
        driver.findElement(register_buttonLocator).click();
    }
}
