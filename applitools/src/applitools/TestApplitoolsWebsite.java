package applitools;

import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.applitools.eyes.Eyes;
import com.applitools.eyes.RectangleSize;

public class TestApplitoolsWebsite {

    public static void main(String[] args) throws URISyntaxException, InterruptedException {

        WebDriver driver = new FirefoxDriver();

        Eyes eyes = new Eyes();
        // This is your api key, make sure you use it in all your tests.
        eyes.setApiKey("998kwmnk7SSfjGbWwBpRezpH105yQDhv5WBT29cF0XQXJ0110");

        try {
            // Start visual testing with browser viewport set to 1024x768.
            // Make sure to use the returned driver from this point on.
            driver = eyes.open(driver, "Applitools", "Test Web Page", new RectangleSize(1024, 768));

            driver.get("http://applitools.com");

            // Visual validation point #1
//            eyes.checkWindow("Main Page");

            driver.findElement(By.cssSelector(".read_more")).click();

            // Visual validation point #2
//            eyes.checkWindow("Features page");

            // End visual testing. Validate visual correctness.
            eyes.close();
        } finally {
            // Abort test in case of an unexpected error.
            eyes.abortIfNotClosed();
            driver.quit();
        }
    }
 }