package RunOperations;

import OcElements.OcElements;
import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case2 extends BaseDriver {
    @Test
    public void Test_Case2(){

        OcElements oc=new OcElements();
        wait.until(ExpectedConditions.elementToBeClickable(oc.logoutBtn));
        //Giriş sayfasına ulaşıldığını kontrol eder.
        Assert.assertTrue(driver.getCurrentUrl().contains("page"));

    }
}
