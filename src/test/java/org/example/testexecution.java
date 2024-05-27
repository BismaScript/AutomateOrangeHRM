package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pageobjects.AdminHRM;
import org.pageobjects.ExtentManager;
import org.pageobjects.LoginHRM;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.utills.AllClasses;
import org.utills.PageFactory;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class testexecution extends PageFactory
{

   AllClasses objallclass;
   WebDriverWait objwebdriverwait = new WebDriverWait(driver, Duration.ofSeconds(20));
   private static ExtentTest test;
   private static ExtentReports extent;


    public testexecution() throws IOException {
    }


        @BeforeClass
        public void browserlaunch () throws IOException {
            launchbrowser();
            objallclass = new AllClasses();

        }

        @Test(priority = 1)
        public void login () throws InterruptedException, IOException
        {
            objwebdriverwait.until(ExpectedConditions.visibilityOf(objallclass.getObjlogin().orgusername()));
            objallclass.getObjlogin().orgusername().sendKeys(PropertyReader.getconfig("uname"));
            objallclass.getObjlogin().orgpass().sendKeys(PropertyReader.getconfig("pass"));
            objallclass.getObjlogin().orgsubmit().click();
            TimeUnit.SECONDS.sleep(3);


            extent = ExtentManager.getInstance();
            ExtentTest test1= extent.createTest("OrangeHRM Testing", "Test to validate login ") ;
           try{
            Assert.assertEquals(driver.findElement(By.xpath("//h5[contains(.,'System Users')]")).getText(), "System Users");
            test1.log(Status.PASS, "Successful login");
           }
           catch (Error error)
           {           test1.log(Status.FAIL, "Invalid Cridentionals");}
            //ExtentManager.getInstance().flush();

        }
        @Test(priority = 2)
        public void admin () throws InterruptedException, IOException
        {
            objallclass.getObjadmin().orgname().click();
            new Actions(driver).sendKeys(PropertyReader.getconfig("name")).release().perform();
            objallclass.getObjadmin().orguserrole().click();
            new Actions(driver).sendKeys("A").pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).release().perform();
            objallclass.getObjadmin().orguserrole().click();
            objallclass.getObjadmin().orgempname().click();
            new Actions(driver).sendKeys(PropertyReader.getconfig("empname")).pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).release().perform();
            objallclass.getObjadmin().orgstatus().click();
            new Actions(driver).sendKeys("Enabled").pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).release().perform();
            objallclass.getObjadmin().orgsearch().click();

            objallclass.getObjadmin().orgadminadd().click();
            objallclass.getObjadmin().orguserrole().click();
            new Actions(driver).sendKeys("A").pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).release().perform();
            objallclass.getObjadmin().orguserrole().click();
            objallclass.getObjadmin().orgempname().click();
            new Actions(driver).sendKeys(PropertyReader.getconfig("empname")).pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).release().perform();
            objallclass.getObjadmin().orgstatus().click();
            new Actions(driver).sendKeys("Enabled").pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).release().perform();
            objallclass.getObjadmin().orgname().click();
            new Actions(driver).sendKeys("Admin123").release().perform();
            objallclass.getObjadmin().orgadminpass().click();
            new Actions(driver).sendKeys("admin123").pause(Duration.ofSeconds(3)).release().perform();
            objallclass.getObjadmin().orgconfirmpass().click();
            new Actions(driver).sendKeys("admin123").pause(Duration.ofSeconds(3)).release().perform();
            objallclass.getObjadmin().orgsubmit().click();
            Thread.sleep(5000);

            extent = ExtentManager.getInstance();
            ExtentTest test2= extent.createTest("Admin Page", "Test to validate adding new user ") ;
            try{
                Assert.assertEquals(driver.findElement(By.xpath("//h5[contains(.,'System Users')]")).getText(), "System Users");
                test2.log(Status.PASS, "Successfully added");
            }
            catch (Error error)
            {           test2.log(Status.FAIL, "Invalid information");}
           // ExtentManager.getInstance().flush();



        }
        @Test(priority = 3)
        public void pim () throws InterruptedException, IOException
        {
            objallclass.getObjpim().orgpim().click();
            objallclass.getObjpim().orgAddemp().click();
            objwebdriverwait.until(ExpectedConditions.visibilityOf(objallclass.getObjpim().orgempfullname()));
            objallclass.getObjpim().orgempfullname().click();

            new Actions(driver).sendKeys("Bisma").pause(Duration.ofSeconds(3)).sendKeys(Keys.ENTER).release().perform();
            objallclass.getObjpim().orgempmidname().click();
            new Actions(driver).sendKeys("Manzoor").pause(Duration.ofSeconds(3)).sendKeys(Keys.ENTER).release().perform();
            objallclass.getObjpim().orgemplastname().click();
            new Actions(driver).sendKeys("Ali").pause(Duration.ofSeconds(3)).sendKeys(Keys.ENTER).release().perform();
            objallclass.getObjpim().orgempimg().sendKeys("C:/Users/bisma/OneDrive/Desktop/emp-imp.png");
            objallclass.getObjpim().orgempid().click();
            new Actions(driver).sendKeys("13").pause(Duration.ofSeconds(3)).release().perform();
            Thread.sleep(5000);

            objwebdriverwait.until(ExpectedConditions.visibilityOf(objallclass.getObjpim().orgempid()));
            new Actions(driver).moveToElement(objallclass.getObjpim().orgotherid()).click().sendKeys("168").build().perform();
            new Actions(driver).moveToElement(objallclass.getObjpim().orgdriverlicense()).click().sendKeys("kji123").pause(Duration.ofSeconds(3)).build().perform();
            objallclass.getObjpim().orglicenseexpiry().click();
            new Actions(driver).sendKeys("2025-03-03").pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN).release().perform();
            objallclass.getObjpim().orgnationality().click();
            new Actions(driver).sendKeys("Pakistan").pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).release().perform();
            objallclass.getObjpim().orgmaritalstatus().click();
            new Actions(driver).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).pause(Duration.ofSeconds(3)).sendKeys(Keys.ENTER).release().perform();
            Thread.sleep(3000);
            objallclass.getObjpim().orgdateofbirth().click();
            new Actions(driver).sendKeys("1999-18-11").pause(Duration.ofSeconds(3)).release().perform();
            objallclass.getObjpim().orggender().click();
            Thread.sleep(3000);
            objallclass.getObjpim().orgsave().click();
            Thread.sleep(3000);
            extent = ExtentManager.getInstance();
            ExtentTest test3= extent.createTest("PIM Page", "Test to validate adding employee details ") ;
            try{
                Assert.assertEquals(driver.findElement(By.xpath("//h6[contains(.,'Personal Details')]")).getText(), "Personal Details");
                test3.log(Status.PASS, "Successfully added");
            }
            catch (Error error)
            {           test3.log(Status.FAIL, "Invalid information");}


        }
        @Test(priority = 4)
        public void leave () throws InterruptedException, IOException

        {
            objallclass.getobjleave().orgleave().click();
            objallclass.getobjleave().orgapply().click();
            objallclass.getobjleave().orgleavetype().click();
            new Actions(driver).sendKeys("C").pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).release().perform();
            objallclass.getobjleave().orgfromdate().click();
            new Actions(driver).sendKeys("2024-11-06").pause(Duration.ofSeconds(3)).sendKeys(Keys.ENTER).release().perform();
            objallclass.getobjleave().orgcomments().sendKeys("Important");

            objallclass.getobjleave().orgapplybutton().click();

            Thread.sleep(2000);
            extent = ExtentManager.getInstance();
            ExtentTest test4= extent.createTest("Leave Page", "Test to validate apply leave function") ;
            try{
                Assert.assertEquals(driver.findElement(By.xpath("//h6[contains(.,'Apply Leave')]")).getText(), "Apply Leave");
                test4.log(Status.PASS, "Successfully applied");
            }
            catch (Error error)
            {           test4.log(Status.FAIL, "Invalid");}


            objallclass.getobjleave().orgmyleave().click();
            objallclass.getobjleave().orgfromdate().click();
            new Actions(driver).sendKeys("2024-11-06").pause(Duration.ofSeconds(3)).sendKeys(Keys.ENTER).release().perform();
            Thread.sleep(2000);
            objallclass.getobjleave().orgleavetype().click();
            new Actions(driver).sendKeys("C").pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).release().perform();
            Thread.sleep(3000);
            objallclass.getobjleave().orgsearch().click();
        }
        @Test(priority = 5)
        public void performance () throws InterruptedException, IOException {
            objallclass.getobjperformance().performance().click();
            Thread.sleep(3000);
            objallclass.getobjperformance().orgconfigure().click();
            objallclass.getobjperformance().orgtrack().click();
            objallclass.getobjperformance().orgaddtracker().click();
            objallclass.getobjperformance().orgtrackername().sendKeys("A");
            objallclass.getobjperformance().orgempname().click();
            new Actions(driver).sendKeys("Bisma Manzoor Ali").pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).release().perform();
            Thread.sleep(3000);
            objallclass.getobjperformance().orgreviewers().click();
            new Actions(driver).sendKeys("A").pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).perform();
            Thread.sleep(3000);
            objallclass.getobjperformance().orgsave().click();
            Thread.sleep(5000);

            extent = ExtentManager.getInstance();
            ExtentTest test5= extent.createTest("Performance Page", "Test to validate adding employee details ") ;
            try{
                Assert.assertEquals(driver.findElement(By.xpath("//h5[contains(.,'Performance Trackers')]")).getText(), "Performance Trackers");
                test5.log(Status.PASS, "Successfully added");
            }
            catch (Error error)
            {           test5.log(Status.FAIL, "Invalid information");}

            objallclass.getobjperformance().orgempname().click();
            new Actions(driver).sendKeys("Bisma Manzoor Ali").pause(Duration.ofSeconds(3)).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).release().perform();
            objallclass.getobjperformance().orgsearch().click();
        }
        @Test(priority = 6)
        public void dashboard () throws InterruptedException, IOException
        {
            objallclass.getObjdashboard().dashboard().click();
            Thread.sleep(3000);
            objallclass.getObjdashboard().orgbuzzlatestpost().click();
            objallclass.getObjdashboard().orgbuzz().sendKeys("I have completed testing");
            objallclass.getObjdashboard().orgpost().click();
            Thread.sleep(5000);
            objallclass.getObjdashboard().dashboard().click();
            extent = ExtentManager.getInstance();
            ExtentTest test6= extent.createTest("Dashboard Page", "Test to validate adding buzz to newsfeed ") ;
            try{
                Assert.assertEquals(driver.findElement(By.xpath("//h6[contains(.,'Dashboard')]")).getText(), "Dashboard");
                test6.log(Status.PASS, "Successfully added");
            }
            catch (Error error)
            {           test6.log(Status.FAIL, "Invalid");}

            objallclass.getObjdashboard().orgtime().click();


            ExtentManager.getInstance().flush();
            driver.quit();


        }


    }



