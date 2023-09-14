package RunOperations;

public class Test_Case2 {
    @Test
    public void test1() {
        driver.get("https://openmrs.org/");

        WebElement demo = driver.findElement(By.partialLinkText("Demo"));
        demo.click();
        MyFunc.Wait(2);

        WebElement explore = driver.findElement(By.linkText("Explore OpenMRS 2"));
        explore.click();
        MyFunc.Wait(2);

        WebElement exploreDemo = driver.findElement(By.linkText("Enter the OpenMRS 2 Demo"));
        exploreDemo.click();
        MyFunc.Wait(2);

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("admin");
        MyFunc.Wait(2);


        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Admin123");
        MyFunc.Wait(2);

        WebElement login = driver.findElement(By.xpath("//input[@id='loginButton']"));
        login.click();

        WebElement hatausarname = driver.findElement(By.cssSelector("label[for='sessionLocation'] [class='location-error']"));
        MyFunc.Wait(2);

        Assert.assertTrue("Hatalı usarname", hatausarname.isDisplayed());
        MyFunc.Wait(2);

        try {
            WebElement hatamesaji = driver.findElement(By.cssSelector("div[id='error-message'] [class='icon-exclamation-sign']"));
            MyFunc.Wait(2);

            Assert.assertTrue("Hata mesajı gözüktü", hatamesaji.isDisplayed());
            MyFunc.Wait(2);
        } catch (Exception e) {

        }


        BekleVeKapat();
    }

}
