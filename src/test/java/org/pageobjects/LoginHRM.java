package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utills.PageFactory;

public class LoginHRM extends PageFactory
{
    public WebElement orgusername()
    {
        return driver.findElement(By.name("username"));

    }
    public WebElement orgpass()
    {
        return driver.findElement(By.name("password"));
    }
    public WebElement orgsubmit()
    {
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }
}
