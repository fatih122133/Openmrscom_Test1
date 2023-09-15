package RunOperations;

import Utility.BaseDriver1;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import OcElements.OcElements;


public class Test_Case7 extends BaseDriver1 {

    OcElements oc;

    @Test
    public void Test_Case7() {

        oc = PageFactory.initElements(driver, OcElements.class);

        oc.demoButton.click();
        oc.openMrsButton.click();
        oc.enterOpenMrsButton.click();

        oc.userName.click();
        oc.userName.sendKeys("admin");
        oc.password.sendKeys("Admin123");
        oc.inpatientWard.click();
        oc.loginbutton.click();
        oc.findPatient.click();
        oc.kayitliHasta.click();
        oc.deleteButton.click();

        String fullText = oc.patientDeletionMessage.getText();
        String prefix = "Are you sure you want to DELETE the patient ";
        String patientFullName = fullText.replace(prefix, "");
        System.out.println("patientName = " + patientFullName);

        oc.kayitSilme.sendKeys(patientFullName);
        oc.ksConfirm.click();

    }

    @Test
    public void Test_Case7Negative() {

        oc = PageFactory.initElements(driver, OcElements.class);

        oc.demoButton.click();
        oc.openMrsButton.click();
        oc.enterOpenMrsButton.click();

        oc.userName.click();
        oc.userName.sendKeys("admin");
        oc.password.sendKeys("Admin123");
        oc.inpatientWard.click();
        oc.loginbutton.click();
        oc.findPatient.click();
        oc.search.click();
        oc.search.sendKeys("100200");


        Assert.assertTrue(oc.noMatchingRecordsFound.isDisplayed(), "No matching records found!");


    }

}
