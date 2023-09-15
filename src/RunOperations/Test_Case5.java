package RunOperations;

import OcElements.OcElements;
import Utility.BaseDriver1;
import Utility.Func;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Test_Case5 extends BaseDriver1 {
    OcElements ep;
    Func func;
    @Test
    public void Test_Case5(){

        ep = new OcElements();
        func=new Func();
        PageFactory.initElements(driver, ep);

        ep.demoButton.click();
        ep.openMrsButton.click();
        ep.enterOpenMrsButton.click();

        ep.userName.click();
        ep.userName.sendKeys("admin");
        ep.password.sendKeys("Admin123");
        ep.inpatientWard.click();
        ep.loginbutton.click();

        wait.until(ExpectedConditions.visibilityOf(ep.userIcon));
        func.hoverFunction(ep.userIcon);
        ep.myAccountIcon.click();

    }
}
