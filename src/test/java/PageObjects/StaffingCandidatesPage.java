package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaffingCandidatesPage extends BasePage{
    By firstNameField = By.cssSelector(".sc-fjdhp.hoaBsb");
    By lastNameField = By.cssSelector(".sc-gzVnrw.krgvBX.form-control");
    By emailField = By.cssSelector(".sc-gzVnrw.krgvBX.form-control");
    By priorityCheckbox = By.cssSelector(".form-check-input.form-check-input");
    By devCheckbox = By.cssSelector(".form-check-input.form-check-input");
    By desCheckbox = By.xpath("//*[]contains(@value, 'name')]");
    By devOpsCheckbox = By.cssSelector(".ml-5.form-check-input.form-check-input");
    By securityCheckbox = By.cssSelector(".form-check-input.form-check-input");
    By qACheckbox = By.cssSelector(".form-check-input.form-check-input");
    By qATCheckbox = By.cssSelector(".form-check-input.form-check-input");
    By otherCheckbox = By.cssSelector(".form-check-input.form-check-input");





    //form-check-input form-check-input



    public StaffingCandidatesPage(WebDriver driver){
        //Used by class constructors to invoke constructors of its parent class.
        super(driver);
        visit("http://staffing-manager.dev.surgeforward.com/candidates");
    }


   // public void clickConfirmButton(){
   //     click(jSConfirmButton);
   // }

//    public void dismissConfirmAlert(){
//        dealWithAlert();
//    }



}
