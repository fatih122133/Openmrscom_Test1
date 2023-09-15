package RunOperations;

import OcElements.OcElements;
import Utility.BaseDriver;
import Utility.Func;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case9 extends BaseDriver {

    @Test
    public void Test_Case9() {

        OcElements or=new OcElements();

        or.dataMana.click();
        Func.Wait(2);
        or.merge.click();
        Func.Wait(2);
        or.ID1.sendKeys("100J51");
        Func.Wait(2);
        or.ID2.sendKeys("100J43");
        Func.Wait(2);
        or.contine.click();
        Func.Wait(2);
        or.contine2.click();
        Func.Wait(2);
        or.sag.click();
        new Actions(driver).scrollByAmount(0, 1000).build().perform();
        Func.Wait(2);
        or.yes.click();

        wait.until(ExpectedConditions.visibilityOf(or.idConfirm));
        Assert.assertTrue(or.idConfirm.isEnabled());

    }
}



