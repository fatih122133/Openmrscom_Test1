package RunOperations;

import OcElements.OcElements;
import Utility.BaseDriver1;
import Utility.Func;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

    public class Test_Case4 extends BaseDriver1 {
        OcElements ep ;
        Func func;
        @Test
        public void Test_Case4() {

            ep = new OcElements();
            func=new Func();
            PageFactory.initElements(driver, ep);

            ep.demoButton.click();
            ep.openMrsButton.click();
            ep.enterOpenMrsButton.click();

            ep.userName.click();
            ep.userName.sendKeys("admin");
            ep.password.sendKeys("Admin123");

            String randomValue = func.getRandomValue();
            ep.listItem = driver.findElement(By.xpath("//li[@value='" + randomValue + "']"));
            ep.listItem.click();

            ep.loginbutton.click();
            ep.registerButton.click();

            ep.givenName.sendKeys("Techno");
            ep.middleName.sendKeys("Study");
            ep.familyName.sendKeys("Team8");

            ep.continueButton1.click();
            ep.male.click();
            ep.continueButton2.click();
            ep.day.sendKeys("15");

            func.selectByVisibleText(ep.monthSelect, "May");
            ep.year.sendKeys("2023");

            ep.continueButton3.click();

            ep.address1.sendKeys("116 Village");
            ep.address2.sendKeys("Blvd");
            ep.city.sendKeys("Princeton");
            ep.state.sendKeys("NJ");
            ep.countryField.sendKeys("USA");
            ep.postalCode.sendKeys("08540");

            ep.continueButton4.click();
            ep.phoneNumber.sendKeys("609 480 6691");
            ep.continueButton5.click();

            func.selectByVisibleText(ep.relationTypeSelect,"Parent");
            ep.personName.sendKeys("Campus Techno");
            ep.continueButton6.click();

            ep.confirm.click();

            func.verifyContainsText(ep.PatientName, "Techno");
            func.verifyContainsText(ep.PatientID, "Patient ID");
        }

    }
