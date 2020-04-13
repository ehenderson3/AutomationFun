package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaffingRecruiterDashPage extends BasePage{
    By newCandidateButton = By.cssSelector(".sc-dnqmqq.cCJjNx");



    public StaffingRecruiterDashPage(WebDriver driver){
        //Used by class constructors to invoke constructors of its parent class.
        super(driver);
        visit("https://staffing-manager.dev.surgeforward.com/recruiter-dashboard");
    }


   // public void clickConfirmButton(){
   //     click(jSConfirmButton);
   // }

//    public void dismissConfirmAlert(){
//        dealWithAlert();
//    }



}
