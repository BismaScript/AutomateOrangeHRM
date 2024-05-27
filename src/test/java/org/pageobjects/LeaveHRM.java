package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utills.PageFactory;

public class LeaveHRM extends PageFactory {
    public WebElement orgleave()
        {
        return driver.findElement(By.xpath("//ul/li/a[contains(.,'Leave')]/child::span"));
    }
    public WebElement orgapply()
    {
        return driver.findElement(By.xpath("//ul/li/a[contains(.,'Apply')]"));

    }
    public WebElement orgleavetype(){
        return driver.findElement(By.xpath("//label[contains(.,'Leave Type')]/parent::div/following-sibling::div"));
    }
    public WebElement orgfromdate()
    {
        return driver.findElement(By.xpath("//label[contains(.,'From Date')]/parent::div/following-sibling::div"));
    }
    public WebElement orgtodate()
    {
        return driver.findElement(By.xpath("//label[contains(.,'To Date')]/parent::div/following-sibling::div"));
    }
    public WebElement orgpartialdays()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Partial Days')]/parent::div/following-sibling::div"));
    }
    public WebElement orgduration()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Duration')]/parent::div/following-sibling::div"));
    }
    public WebElement orgcomments()
    {
        return driver.findElement(By.tagName("textarea"));
    }
    public WebElement orgapplybutton()
    {
        return driver.findElement(By.xpath("//button[contains(.,'Apply')]"));
    }
    public WebElement orgmyleave()
    {
        return driver.findElement(By.xpath("//ul/li/a[contains(.,'My Leave')]"));
    }
    public WebElement orgsearch()
    {
        return driver.findElement(By.xpath("//button[contains(.,'Search')]"));
    }
    public WebElement orgentitlement()
    {
        return driver.findElement(By.xpath("//ul/li/span[contains(.,'Entitlements')]/following::ul/li[1]"));
    }
    public WebElement orgaddto()
    {
        return driver.findElement(By.xpath("//div[contains(.,'Individual Employee')]/child::label"));
    }
    public WebElement orgempname()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Employee Name')]/parent::div/following-sibling::div"));
    }
    public WebElement orgleaveperiod()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Leave Period')]/parent::div/following-sibling::div"));
    }
    public WebElement orgentittle()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Entitlement')]/parent::div/following-sibling::div/input"));
    }

}
