package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonPage extends BasePage{



    public CommonPage(WebDriver driver){
        //Used by class constructors to invoke constructors of its parent class.
        super(driver);
        visit("candidates");
    }


}
