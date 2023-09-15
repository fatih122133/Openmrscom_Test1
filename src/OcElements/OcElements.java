package OcElements;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class OcElements extends  BaseDriver { public OcElements() {
    PageFactory.initElements(BaseDriver.driver, this);
}


    //Locator'lar
    @FindBy(css = "a[class='zak-button']") //Anasayfada sağ üstteki demo butonu            //
    public WebElement demoButton;                                                            //
    @FindBy(xpath = "//span[text()='Explore OpenMRS 2']") //Explore openMrs butonu           //  Demo sayfasına ulaşmak için
    public WebElement openMrsButton;                                                         //
    @FindBy(xpath = "//span[text()='Enter the OpenMRS 2 Demo']") //Enter openMrs butonu      //
    public WebElement enterOpenMrsButton;


    @FindBy(xpath= "//li[@value=' + randomValue +']") // S Location for this session random secim icin
    public WebElement listItem;

    @FindBy(xpath = "//input[@id='username']") //login kısmı username Labelı
    public WebElement userName;
    @FindBy(xpath = "//input[@id='password']")//login kısmı password Labelı
    public WebElement password;
    @FindBy(linkText = "Logout")//Logout butonu

    public WebElement logoutBtn;
    @FindBy(xpath = "//div[@id='error-message']")//login bölümü hatalı giriş yapıldığında çıkan hata logunun locator'u
    public WebElement errorMessage;

    @FindBy(xpath = "//td[@valign='top']") //Hasta arama ksımında hasta bulunamadığı zaman çıkan "No matching records found" yazısının locator'u, Assert için
    public WebElement notMatch;

    @FindBy(xpath = "//li[@id='Inpatient Ward']") //login kısmı  Inpatient Ward seçeneği
    public WebElement inpatientWard;

    @FindBy(xpath ="//input[@id='loginButton']") //login buttonu
    public WebElement loginbutton;

    @FindBy (xpath ="//span[@class='recent-lozenge']" ) //murat herhangi bir kayitli hastanin lokasyonu
    public WebElement kayitliHasta;

    @FindBy (xpath="//div[@class='col-11 col-lg-10' and contains(text(), 'Delete Patient')]")  // murat kayitli hasta silme
    public WebElement deleteButton;

    @FindBy(xpath = "(//p[@class='dialog-instructions'])[2]")
    public WebElement patientDeletionMessage;

    @FindBy(css = "td.dataTables_empty")
    public WebElement noMatchingRecordsFound;

    @FindBy (id="delete-reason") //murat hasta kaydi silmek icin delete tusu
    public WebElement kayitSilme;

    @FindBy (xpath="(//button[@class='confirm right'])[6]") //murat hasta kaydi silmek icin confirm tusu
    public WebElement ksConfirm;

    @FindBy(css = "div[id='patient-search-results-table_paginate'] >span>a[tabindex]") //murat sayfa sayisi
    public  List<WebElement> pageNumber;
    @FindBy(css = "tbody[role='alert']>tr") //murat sayfa satirlari
    public List<WebElement> sayfaSatirlari;

    @FindBy(id = "patient-search-results-table_info") //murat gosterilen hasta kayitlari
    public WebElement gosterilenGirisler;

    @FindBy (xpath= "(//i[@class='icon-user'])[2]") //S Hasta kayit kayit butonu
    public WebElement registerButton;

    @FindBy(css = "input[name='givenName']") //S hasta adi
    public WebElement givenName;

    @FindBy(css = "input[name='middleName']") //S hasta 2.ad
    public WebElement middleName;

    @FindBy(css = "input[name='familyName']") //S hasta soyad
    public WebElement familyName;

    @FindBy(css = "icon.fas.fa-chevron-right") //S devam et butonu
    public WebElement continueButton1;

    @FindBy(css = "option[value='M']") //S hasta cinsiyet
    public WebElement male;

   // @FindBy(xpath = "(//input[@id='submit'])[1]") //S yeni confirm butonu sonradan eklemisler
   // public WebElement NewConfirm;

    @FindBy(css = "icon.fas.fa-chevron-right") //S devam et butonu
    public WebElement continueButton2;

    @FindBy(name = "birthdateDay") //S hasta dogum bilgisi
    public WebElement day;

    @FindBy(name = "birthdateMonth") //S hasta dogum bilgisi
    public WebElement monthSelect;

    @FindBy(name = "birthdateYear") //S hasta dogum bilgisi
    public WebElement year;

    @FindBy(css = "icon.fas.fa-chevron-right") //S devam et butonu
    public WebElement continueButton3;

    @FindBy(id = "address1") //S hasta adres
    public WebElement address1;

    @FindBy(id = "address2") //S hasta adres
    public  WebElement address2;

    @FindBy(id = "cityVillage") //S hasta adres
    public WebElement city;

    @FindBy(id = "stateProvince") //S hasta adres
    public  WebElement state;

    @FindBy(id = "country") //S hasta adres
    public WebElement countryField;

    @FindBy(id = "postalCode") //S hasta adres
    public WebElement postalCode;

    @FindBy(css = "icon.fas.fa-chevron-right") //S devam et butonu
    public WebElement continueButton4;

    @FindBy(css = "input[name='phoneNumber']") //S hasta telefon numarasi
    public WebElement phoneNumber;

    @FindBy(css = "icon.fas.fa-chevron-right") //S devam et butonu
    public WebElement continueButton5;

    @FindBy(id= "relationship_type") // S Hasta yakini relationship
    public WebElement relationTypeSelect;

    @FindBy(css = "input[ng-model='relationship.name']") //S Hasta refekatci icin
    public WebElement personName;

    @FindBy(css = "icon.fas.fa-chevron-right") //S devam et butonu
    public WebElement continueButton6;

    @FindBy(id = "submit") // S kayit onayi icin
    public WebElement confirm;

    @FindBy(css = ".PersonName-givenName")
    public WebElement PatientName;  // S hasta ismi formda gorme

    @FindBy(xpath = "//em[text()='Patient ID']")
    public WebElement PatientID;     // S hasta kayit numarasini formda gorme


    @FindBy(xpath = "//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']") //demo anasayfadaki Find Patient Buttonu
    public WebElement findPatient;

    @FindBy(xpath = "//input[@id='patient-search']")    // Find Patient içindeki Search byID... Labelı
    public WebElement searchLabelImp;

    @FindBy (xpath = "//td[text()='100HM1']") //Hastanın Id kısmı Assert için.
    public WebElement patientId;

    @FindBy(xpath = "//td[text()='NTest hars']") //Hastanın Name  kısmı Assert için.
    public WebElement patientName;
    @FindBy(id = "appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension")// Appointment scheduling butonu
    public WebElement appointmentScheduling;
    @FindBy(linkText = "Manage Appointments") // Manage Appointments Butonu
    public WebElement manageAppointments;
    @FindBy(id = "patient-search") // Hasta arama için açılan search butonu .
    public WebElement search;
    @FindBy(xpath = "//tr[@class='odd']")// aradıgım kullanıcının tıklama Locatoru .
    public  WebElement personClick;
    @FindBy(xpath = "//div[@class='note error']//p") //Randevu alırken çıkan büyük  hata
    public WebElement noteerrorMessage;

}
