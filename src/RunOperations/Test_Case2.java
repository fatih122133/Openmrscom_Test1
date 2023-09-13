package RunOperations;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Case2 extends BaseDriver {
    @Test
    public void Test_Case2(){

        Assert.assertTrue(driver.getCurrentUrl().contains("page"));

    }
}
