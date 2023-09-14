package RunOperations;

import Utility.BaseDriver;
import Utility.Func;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case1 extends BaseDriver {
        @Test
        public void test1() {
            driver.get("https://openmrs.org/");

            WebElement demo = driver.findElement(By.partialLinkText("Demo"));
            demo.click();
            Func.Wait(2);

            WebElement explore = driver.findElement(By.linkText("Explore OpenMRS 2"));
            explore.click();
            Func.Wait(2);

            WebElement exploreDemo = driver.findElement(By.linkText("Enter the OpenMRS 2 Demo"));
            exploreDemo.click();
            Func.Wait(2);

            WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
            username.sendKeys("admin");
            Func.Wait(2);


            WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
            password.sendKeys("Admin123");
            Func.Wait(2);

            WebElement login = driver.findElement(By.xpath("//input[@id='loginButton']"));
            login.click();

            WebElement hatausarname = driver.findElement(By.cssSelector("label[for='sessionLocation'] [class='location-error']"));
            Func.Wait(2);

            Assert.assertTrue(hatausarname.isDisplayed(), "Hatalı usarname");
            Func.Wait(2);

            try {
                WebElement hatamesaji = driver.findElement(By.cssSelector("div[id='error-message'] [class='icon-exclamation-sign']"));
                Func.Wait(2);

                Assert.assertTrue(hatamesaji.isDisplayed(), "Hata mesajı gözüktü");
                Func.Wait(2);
            } catch (Exception e) {

            }
        }
    }

