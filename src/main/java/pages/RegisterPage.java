package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver driver;
    public RegisterPage(WebDriver driver){
        this.driver=driver;
    }

        By firstName=By.xpath("//input[@name='firstName']");
        By lastName=By.xpath("//input[@name='lastName']");
        By phone= By.xpath("//input[@name='phone']");
        By userName=By.xpath("//input[@id='email']");
//        By address=By.xpath("//input[@name='address1']");
//        By city=By.xpath("//input[@name='city']");
//        By sate=By.xpath("//input[@name='state']");
//        By postalCode=By.xpath("//input[@name='postalCode']");
        By country=By.xpath("//select[@name='country']");
       // By email=By.xpath("//input[@id='email']");
        By password =By.xpath("//input[@name='password']");
        By confirmPassword=By.xpath("//input[@name='confirmPassword']");
        By submit=By.xpath("//input[@name='submit']");

        public void setFirstName(String FirstName){
            driver.findElement(firstName).sendKeys(FirstName);
        }
        public void setLastName(String LastName){
            driver.findElement(lastName).sendKeys(LastName);
        }
        public void setCountry(){
            WebElement element = driver.findElement(country);
            Select select = new Select(element);
            select.selectByIndex(3);
        }

        public void setUserName(String Username){
            driver.findElement(userName).sendKeys(Username);
            System.out.println("Username = " + Username);
        }
        public void setPassword(String Password){
            driver.findElement(password).sendKeys(Password);
        }
        public void setConfirmPassword(String comP){
            driver.findElement(confirmPassword).sendKeys(comP);
        }

        public void clickSubmit(){
            driver.findElement(submit).click();
        }

}
