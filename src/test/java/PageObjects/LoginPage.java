package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{






    public LoginPage(WebDriver driver){
        //Used by class constructors to invoke constructors of its parent class.
        super(driver);
        visit("candidates");
    }





}
