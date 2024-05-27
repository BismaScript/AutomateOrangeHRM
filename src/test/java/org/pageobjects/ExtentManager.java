package org.pageobjects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import static org.example.testexecution.extent;

public class ExtentManager {
    private static ExtentReports extent;
    public static ExtentReports createInstance()
    {
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
         extent = new ExtentReports();
         extent.attachReporter(htmlReporter);
        /* ExtentTest test1 = extent.createTest("OrangeHRM Testing", "Test to validate login ");
       test1.log(Status.INFO, "Valid");
        test1.pass("maximize has done");
        ExtentTest test2 =extent.createTest("");
        extent.flush();*/
        return extent;
    }
public static ExtentReports getInstance(){
        if(extent == null){
            createInstance();
        }
        return extent;
}
}
