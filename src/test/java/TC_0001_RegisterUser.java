import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;

public class TC_0001_RegisterUser {

    WebDriver driver;
    @BeforeMethod
    public void openPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void Test001(){
        HomePage homePage = new HomePage(driver);
        homePage.click_register_button();

    }

    @AfterMethod
    public void AfterMethord(){
        driver.quit();
    }


}
