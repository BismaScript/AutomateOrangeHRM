package org.utills;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.pageobjects.*;

public class AllClasses extends PageFactory
{
    LoginHRM objlogin;
    AdminHRM objadmin;
    PIMHRM objpim;
    LeaveHRM objleave;
    PerformanceHRM objperformance;
    DashboardHRM objdashboard;

    public LoginHRM getObjlogin()
    {
        return objlogin= new LoginHRM();
    }
    public AdminHRM getObjadmin() {
        return objadmin= new AdminHRM();
    }
    public PIMHRM getObjpim()
    {
        return objpim= new PIMHRM();
    }
    public LeaveHRM getobjleave() { return objleave = new LeaveHRM();}
    public PerformanceHRM getobjperformance() {return objperformance = new PerformanceHRM();}
    public DashboardHRM getObjdashboard() { return objdashboard= new DashboardHRM();}

}
