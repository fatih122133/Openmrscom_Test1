package RunOperations;

import Utility.BaseDriver1;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import OcElements.OcElements;
import org.testng.asserts.SoftAssert;



public class Test_Case8 extends BaseDriver1 {

    OcElements oc;

    @Test
    public void Test_Case8() {
        SoftAssert _softassert = new SoftAssert();
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

        String fullText = oc.gosterilenGirisler.getText();
        //Bu kisim bize sayfanin altindaki Showing 1 to 15 to 48(degisebilir) gosteriyor
        String[] words = fullText.split(" ");
        //split methodu ile arrayi bir diziye donusturuyoruz ("1" "15" "of" "48") word adli degiskende sakliyoruz
        int toplamGiris = Integer.parseInt(words[words.length - 2]);
        // words isimli dizimizin sondan 2. yani burada 48 degerini tam sayi yapiyoruz (int)
        //toplamGiris adli bir tam sayi degiskene atiyoruz.
        System.out.println("Toplam Giriş: " + toplamGiris);

        int pageNumber = oc.pageNumber.size(); //toplam sayfa sayisi
        int satirSayisi = 0;

        // İlk sayfadan başla ve tüm sayfaları gezerek satır sayısını topla
        for (int i = 0; i < pageNumber; i++) {
            oc.pageNumber.get(i).click();
            satirSayisi += oc.sayfaSatirlari.size();
        }
        System.out.println("Toplam Satır Sayısı: " + satirSayisi);

        _softassert.assertEquals(satirSayisi, toplamGiris, "Toplam giriş sayısı ile tablodaki satır sayısı eşleşmiyor!");

        _softassert.assertAll();
    }
}