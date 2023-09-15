package RunOperations;

import Utility.BaseDriver1;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import OcElements.OcElements;

public class Test_Case1 extends BaseDriver1 {

    OcElements oc;

    @Test(dataProvider = "loginData")
    public void openMRSTest(String user, String passwordd) {
        driver.get("https://openmrs.org/");

        oc = PageFactory.initElements(driver, OcElements.class);

        oc.demoButton.click();
        oc.openMrsButton.click();
        oc.enterOpenMrsButton.click();

        oc.userName.sendKeys(user);
        oc.password.sendKeys(passwordd);
        oc.inpatientWard.click();

        oc.loginbutton.click();
        Assert.assertTrue(oc.errorMessage.isDisplayed(), "Hatalı username veya şifre");

        oc.userName.clear();
        oc.userName.sendKeys("admin");
        oc.password.clear();
        oc.password.sendKeys("Admin123");

        oc.inpatientWard.click();
        oc.loginbutton.click();
    }

    @DataProvider
    public Object[][] loginData() {
        return new Object[][]{
                {"A", " "},
                {"AAAdmin", "Admin123"},
                {"adminn", "admin321"},
                {"user", "user123"},
                {"User", "user123"},
                {"Fatih", "fatih123"}};
    }
}

