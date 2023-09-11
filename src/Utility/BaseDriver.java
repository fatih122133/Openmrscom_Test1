package Utility;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;

    @BeforeClass
    public void baslangicIslemleri() {
        Logger logger = Logger.getLogger(""); // output yapılan logları al.
        logger.setLevel(Level.SEVERE); // sadece ERROR ları göster

        driver = new ChromeDriver(); // jenkins deyken : sen head olmadan yani hafızada çalış
        //driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        loginTesti();
    }

    public void loginTesti() {
        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        WebElement inputEmail = driver.findElement(By.name("username"));
        inputEmail.sendKeys("admin");

        WebElement inputpassword = driver.findElement(By.name("password"));
        inputpassword.sendKeys("Admin123");

        WebElement locationSesson = driver.findElement(By.xpath("//li[text()='Inpatient Ward']"));
        locationSesson.click();


        WebElement loginBtn = driver.findElement(By.id("loginButton"));
        loginBtn.click();


    }

    @AfterClass
    public void bitisIslemleri() { // tearDown


        driver.quit();
    }

    @AfterMethod
    public void SS(ITestResult result){
        if (ITestResult.FAILURE == result.getStatus()) {
            // Test failed, take a screenshot
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            String screenshotName = result.getName() + "_" + System.currentTimeMillis() + ".png";
            File destination = new File("/Users/apple/Desktop/IdeaProjects/OcMRS-Test/src/ErrorSS/scrennShot/" + screenshotName);

            try {
                FileHandler.copy(source, destination);
                System.out.println("Screenshot taken: " + screenshotName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}