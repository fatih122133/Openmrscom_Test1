package RunOperations;

public class Test_Case9 {

    @Test
    public void test2() {

        driver.get("https://openmrs.org/");

        // WebElement logout=driver.findElement(By.linkText("Logout"));
        // logout.click();

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
        MyFunc.Wait(2);

        WebElement Reg = driver.findElement(By.cssSelector("ul[id='sessionLocation'] [id='Registration Desk']"));
        Reg.click();
        MyFunc.Wait(2);


        WebElement login2 = driver.findElement(By.xpath("//input[@id='loginButton']"));
        login2.click();
        MyFunc.Wait(2);

        WebElement datamana = driver.findElement(By.cssSelector("a[id='coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension'] [class='icon-hdd']"));
        datamana.click();
        MyFunc.Wait(2);

        WebElement merge = driver.findElement(By.xpath("//a[@id='coreapps-mergePatientsHomepageLink-app']"));
        merge.click();
        MyFunc.Wait(2);

        WebElement ID1 = driver.findElement(By.xpath("//input[@id='patient1-text']"));
        ID1.sendKeys("100HWJ ");
        MyFunc.Wait(2);

        WebElement ID2 = driver.findElement(By.xpath("//input[@id='patient2-text']"));
        ID2.sendKeys(" 100J19");
        MyFunc.Wait(2);

        // WebElement BOS=driver.findElement(By.cssSelector("input[id='patient2']"));
        // BOS.click();

        WebElement contine = driver.findElement(By.cssSelector("input[id='confirm-button']"));
        contine.click();
        MyFunc.Wait(2);

        WebElement contine2 = driver.findElement(By.cssSelector("input[id='confirm-button']"));
        contine2.click();
        MyFunc.Wait(2);

        WebElement sağ = driver.findElement(By.cssSelector("div[id='second-patient'] "));
        sağ.click();
        MyFunc.Wait(2);

        new Actions(driver).scrollByAmount(0, 1000).build().perform();
        MyFunc.Wait(2);

        WebElement uyarı = driver.findElement(By.partialLinkText("Merging cannot be undone"));
        Assert.assertTrue("Uyarı gözüktü", uyarı.isDisplayed());

        WebElement uyarı2 = driver.findElement(By.partialLinkText("Please check records before continuing"));
        Assert.assertTrue("uyarı2 gözüzktü", uyarı2.isDisplayed());

        WebElement yes = driver.findElement(By.cssSelector("input[id='confirm-button']"));
        yes.click();


    }
}


}
