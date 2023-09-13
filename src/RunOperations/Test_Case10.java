package RunOperations;

import OcElements.OcElements;
import Utility.BaseDriver;
import Utility.Func;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case10 extends BaseDriver {
    OcElements oc ;
    @Test
    public void wrongTime() {

        //Randevu Planlama sekmesini tiklar.
        oc.appointmentScheduling.click();
        //Randevulari Yonet Sekmesine Tiklar
        oc.manageAppointments.click();
        Func.Wait(2);
        //Arama butonuna( gerkli veriyi  ) yazar.
        oc.search.sendKeys("Can");
        Func.Wait(2);
        //Gerekli kisi bulunana kadar arar bulununca click atar.
        wait.until(ExpectedConditions.elementToBeClickable(oc.personClick));
        oc.personClick.click();
        // Hata mesaji kontrolu yapar.
        Assert.assertTrue(oc.noteerrorMessage.isEnabled(), "Dont Enable Error Message");
    }
}
