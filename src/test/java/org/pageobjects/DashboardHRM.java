package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utills.PageFactory;

public class DashboardHRM extends PageFactory
{
    public WebElement dashboard()
    {
        return driver.findElement(By.xpath("//ul/li[contains(.,'Dashboard')]"));
    }
    public WebElement orgbuzzlatestpost()
    {
        return driver.findElement(By.xpath("//p[contains(.,'Buzz Latest Posts')]//following::p[1]"));
    }
    public WebElement orgbuzz()
    {
        return driver.findElement(By.xpath("//textarea"));
    }
    public WebElement orgpost()
    {
        return driver.findElement(By.xpath("//button[contains(.,'Post')]"));
    }
    public WebElement orgtime()
    {
        return driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main orangehrm-attendance-card-action']"));

    }


}
