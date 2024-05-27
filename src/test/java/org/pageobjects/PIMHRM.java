package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utills.PageFactory;

public class PIMHRM extends PageFactory
{
    public WebElement orgpim()
    {
        return driver.findElement(By.xpath("//ul//li/a[contains(.,'PIM')]"));
    }
    public WebElement orgAddemp()
    {
        return driver.findElement(By.xpath("//button[contains(.,'Add')]"));
    }
    public WebElement orgempimg()
    {
        return driver.findElement(By.xpath("//input[@type='file']"));
    }
    public WebElement orgempfullname()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Employee Full Name')]//parent::div//following-sibling::div/child::div[1]"));

    }
    public WebElement orgempmidname()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Employee Full Name')]//parent::div//following-sibling::div/child::div[2]"));

    }
    public  WebElement orgemplastname()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Employee Full Name')]//parent::div//following-sibling::div/child::div[3]"));
    }
    public  WebElement orgempid()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Employee Id')]//parent::div/following-sibling::div"));
    }
    public WebElement orgotherid()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Other Id')]//parent::div/following-sibling::div/input"));
    }
    public WebElement orgnickname()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Nickname')]//parent::div/following-sibling::div"));
    }
    public WebElement orgdriverlicense()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Driver')]//parent::div/following-sibling::div/input"));

    }
    public WebElement orglicenseexpiry()
    {
        return driver.findElement(By.xpath("//label[contains(.,'License Expiry')]//parent::div/following-sibling::div"));

    }
    public WebElement orgssn()
    {
        return driver.findElement(By.xpath("//label[contains(.,'SSN')]//parent::div/following-sibling::div"));
    }
    public WebElement orgnationality()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Nationality')]//parent::div/following-sibling::div"));

    }
    public WebElement orgmaritalstatus()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Marital Status')]/parent::div/following-sibling::div"));
    }
    public WebElement orgdateofbirth()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Date of Birth')]/parent::div/following-sibling::div"));
    }
    public WebElement orggender()
    {
        //indexing for male n female
        return driver.findElement(By.xpath("//label[contains(.,'Female')]"));
        //
        //label[contains(.,'Gender')]/parent::div/following-sibling::div/child::div[1]
    }
    public WebElement orgsave()
    {
        return driver.findElement(By.xpath("//div[contains(.,'Required')]/child::button"));
    }
    public WebElement orgreports()
    {
        return driver.findElement(By.xpath("//ul//li//a[contains(.,'Reports')]"));
    }
    public WebElement orgreportname()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Report Name')]"));
    }
    public WebElement orgaddreport()
    {
        return driver.findElement(By.xpath("//button[contains(.,'Add')]"));
    }


}
