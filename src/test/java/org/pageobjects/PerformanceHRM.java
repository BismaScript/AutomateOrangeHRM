package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utills.PageFactory;

public class PerformanceHRM extends PageFactory {
    public WebElement performance()
    {
        return  driver.findElement(By.xpath("//ul/li/a[contains(.,'Performance')]"));
    }
    public WebElement orgconfigure()
    {
        return driver.findElement(By.xpath("//li[contains(.,'Configure')]"));
    }
    public WebElement orgtrack()
    {
        return driver.findElement(By.xpath("//li[contains(.,'Configure')]//child::a[contains(.,'Tracker')]"));
    }
    public WebElement orgaddtracker()
    {
        return driver.findElement(By.xpath("//Button[contains(.,'Add')]"));
    }
    public WebElement orgtrackername()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Tracker Name')]//following::input[1]"));

    }
    public WebElement orgempname()
    {
        return driver.findElement(By.xpath("//div[contains(.,'Employee Name')]/following::input"));
    }
    public WebElement orgreviewers()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Reviewers')]//following::input"));
    }
    public WebElement orgsave()
    {
        return driver.findElement(By.xpath("//button[contains(.,'Save')]"));
    }
    public WebElement orgsearch(){ return driver.findElement(By.xpath("//button[contains(.,'Search')]"));
    }

}
