package RunOperations;
import OcElements.OcElements;
import Utility.BaseDriver;
import Utility.Func;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case6 extends BaseDriver {
        OcElements ep;
        @Test
        public void Test_Case6() {

                OcElements ep=new OcElements();

                wait.until(ExpectedConditions.elementToBeClickable(ep.findPatient));
                ep.findPatient.click();
                ep.searchLabelImp.sendKeys("100J43");
                Func.Wait(3);
                wait.until(ExpectedConditions.visibilityOf(ep.patientId));
                Assert.assertTrue(ep.patientId.getText().contains("100J43"));
                ep.searchLabelImp.clear();
                ep.searchLabelImp.sendKeys("japonya");
                Func.Wait(3);
                wait.until(ExpectedConditions.visibilityOf(ep.patientName));
                Assert.assertTrue(ep.patientName.getText().toLowerCase().contains("japonya"));
                ep.searchLabelImp.clear();
                //--Negative--
                ep.searchLabelImp.sendKeys("aydıner");
                Func.Wait(3);
                System.out.println(ep.notMatch.getText());
                Assert.assertTrue(ep.notMatch.getText().contains("No matching records"));
        }
}

