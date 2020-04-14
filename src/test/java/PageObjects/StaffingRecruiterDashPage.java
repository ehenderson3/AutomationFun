package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaffingRecruiterDashPage extends BasePage{
//Locators


    public StaffingRecruiterDashPage(WebDriver driver){
        //Used by class constructors to invoke constructors of its parent class.
        super(driver);
        visit("recruiter-dashboard");
    }

    public void openCandidatesPage(){


    }






}
