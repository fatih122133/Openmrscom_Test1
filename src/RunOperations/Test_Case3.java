package RunOperations;

import OcElements.OcElements;
import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Test_Case3 extends BaseDriver {
    OcElements oc;
    @Test
    public void Logout() {

        OcElements oc=new OcElements();

        wait.until(ExpectedConditions.elementToBeClickable(oc.logoutBtn));
        //Cikis butonuna tiklar.
        oc.logoutBtn.click();

    }
}