package OcElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BaseDriver1;


public class OcElements extends  BaseDriver1{
    public OcElements() {
        PageFactory.initElements(BaseDriver1.driver, this);
    }





    //Locator'lar
    @FindBy(css = "a[class='zak-button']") //Anasayfada sağ üstteki demo butonu            //
    public WebElement demoButton;                                                            //
    @FindBy(xpath = "//span[text()='Explore OpenMRS 2']") //Explore openMrs butonu           //  Demo sayfasına ulaşmak için
    public WebElement openMrsButton;                                                         //
    @FindBy(xpath = "//span[text()='Enter the OpenMRS 2 Demo']") //Enter openMrs butonu      //
    public WebElement enterOpenMrsButton;
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
