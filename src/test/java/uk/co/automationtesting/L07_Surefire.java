package uk.co.automationtesting;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class L07_Surefire {
    WebDriver driver;

    @Test
    public void testing() {
        Assert.assertEquals("demo", "demo");
    }
}
