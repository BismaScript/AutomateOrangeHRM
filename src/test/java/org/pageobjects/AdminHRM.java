package org.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utills.PageFactory;

public class AdminHRM extends PageFactory {
    public WebElement orgname() {
        return driver.findElement(By.xpath("//label[contains(.,'Username')]/parent::div/following-sibling::div"));
    }
    public WebElement orguserrole() {
        return driver.findElement(By.xpath("//label[contains(.,'User Role')]/parent::div/following-sibling::div"));
    }
    public WebElement orgempname() {
        return driver.findElement(By.xpath("//label[contains(.,'Employee Name')]/parent::div/following-sibling::div"));
    }
    public WebElement orgstatus() {
        return driver.findElement(By.xpath("//label[contains(.,'Status')]/parent::div/following-sibling::div"));
    }

    public WebElement orgsearch(){
        return driver.findElement(By.xpath("//button[contains(.,'Search')]"));
    }
    public WebElement orgadminadd()
    {
        return driver.findElement(By.xpath("//button[contains(.,'Add')]"));
    }
    public WebElement orgadminpass()
    {
        return driver.findElement(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//child::input"));
    }
    public WebElement orgconfirmpass()
    {
        return driver.findElement(By.xpath("//label[contains(.,'Confirm Password')]//parent::div//following-sibling::div"));

    }
    public WebElement orgsubmit()
    {
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }
}


