package org.utills;

import org.example.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class PageFactory
{
    public static WebDriver driver;
    public WebDriver launchbrowser() throws IOException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get(PropertyReader.getconfig("appurl"));
        return driver;
    }
}
