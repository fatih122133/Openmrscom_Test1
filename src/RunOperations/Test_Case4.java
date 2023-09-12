package RunOperations;

import OcElements.OcElements;
import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

    public class Test_Case4 extends BaseDriver {

        OcElements ep ;

        @Test
        public void Test_Case4() {

            ep = new OcElements();
            PageFactory.initElements(driver, ep);

            ep.demoButton.click();
            ep.openMrsButton.click();
            ep.enterOpenMrsButton.click();

            ep.userName.click();
            ep.userName.sendKeys("admin");
            ep.password.sendKeys("Admin123");

            List<String> values = Arrays.asList("6", "4", "3", "7", "2", "5");
            String randomValue = values.get(new Random().nextInt(values.size()));
            ep.listItem = driver.findElement(By.xpath("//li[@value='" + randomValue + "']"));
            ep.listItem.click();

            ep.loginbutton.click();

            ep.registerButton.click();

            ep.givenName.sendKeys("Trump");
            ep.middleName.sendKeys("John");
            ep.familyName.sendKeys("Donald");

            ep.continueButton1.click();
            ep.male.click();
            ep.continueButton2.click();
            ep.day.sendKeys("14");

            Select monthSelect = new Select(ep.monthSelect);
            monthSelect.selectByVisibleText("June");

            ep.year.sendKeys("1946");

            ep.continueButton3.click();

            ep.address1.sendKeys("Donald Boulevard");
            ep.address2.sendKeys("5th avenue");
            ep.city.sendKeys("Queens");
            ep.state.sendKeys("New York");
            ep.countryField.sendKeys("USA");
            ep.postalCode.sendKeys("11106");

            ep.continueButton4.click();
            ep.phoneNumber.sendKeys("212 646 1010");
            ep.continueButton5.click();

            Select relationSelect = new Select(ep.relationTypeSelect);
            relationSelect.selectByVisibleText("Parent");

            ep.personName.sendKeys("Melania Trump");
            ep.continueButton6.click();

            ep.confirm.click();

            WebElement patientName = driver.findElement(By.cssSelector(".PersonName-givenName"));
            WebElement patientID= driver.findElement(By.xpath("//em[text()='Patient ID']"));

            String expectedPatientName = "Trump";
            String expectedPatientID = "Patient ID";

            Assert.assertEquals(patientName.getText(), expectedPatientName, "Patient name does not match!");
            Assert.assertEquals(patientID.getText(), expectedPatientID, "Patient ID does not match!");
        }

    }
