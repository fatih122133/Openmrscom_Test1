package RunOperations;

import OcElements.OcElements;
import Utility.BaseDriver;
import org.testng.annotations.Test;

public class Test_Case3 extends BaseDriver {
    OcElements oc;
    @Test
    public void Logout() {
        //Cikis butonuna tiklar.
        oc.logoutBtn.click();

    }
}