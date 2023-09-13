package RunOperations;

public class Test_Case10 {
    @Test
    public void wrongTime() {
        OcElements oc = new OcElements();

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
