package TestObjects;

import PageObjects.AlertsPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

    private AlertsPage alert;
    private WebDriver driver;

    @Before
    public void Setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/enriquehenderson/IdeaProjects/JavaSelenium/Vendor/chromedriver");
        driver = new ChromeDriver();
        alert = new AlertsPage(driver);
    }

    @Test
    public void JavaScriptConfirmAlertTest(){
        alert.clickConfirmButton();
        alert.dismissConfirmAlert();
    }

    @Test
    public void GitAddTest(){
        alert.clickConfirmButton();
        alert.dismissConfirmAlert();
    }

    @Test
    public void FirstBranch(){
        alert.clickConfirmButton();
        alert.dismissConfirmAlert();
    }

    @Test
    public void CopyBranch(){
        alert.clickConfirmButton();
        alert.dismissConfirmAlert();
    }

    @Test
    public void MergeConflictDemo(){
        // Change using a branch
    }

}


