package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static Utility.BaseDriver.wait;

public class Func {

    public static void Wait(int sn) {
        try {
            Thread.sleep(sn * 1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void verifyContainsText(WebElement element, String value) {
        if (wait == null) {

        } else {
            wait.until(ExpectedConditions.textToBePresentInElement(element, value));
            Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));
        }
    }
        public String getRandomValue () {
            List<String> values = Arrays.asList("6", "4", "3", "7", "2", "5");
            return values.get(new Random().nextInt(values.size()));
        }

        public void selectByVisibleText (WebElement element, String visibleText){
            Select select = new Select(element);
            select.selectByVisibleText(visibleText);
        }
    public void hoverFunction(WebElement element){
        Actions actions=new Actions(BaseDriver1.driver);
        Action action = actions.moveToElement(element).build();
        action.perform();
    }

    }
