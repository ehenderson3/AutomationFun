package TestObjects;

import PageObjects.StaffingRecruiterDashPage;
import PageObjects.StaffingCandidatesPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class StaffingCreateCandidateTests {

    private StaffingRecruiterDashPage recruiter;
    private StaffingCandidatesPage candidates;

    private WebDriver driver;

    @Before
    public void Setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/enriquehenderson/IdeaProjects/JavaSelenium/Vendor/chromedriver");
        driver = new ChromeDriver();
        recruiter = new StaffingRecruiterDashPage(driver);
        candidates = new StaffingCandidatesPage(driver);

    }

    @Test
    public void CreateCandidate(){

        //Select the Recruiter tab

        //Maybe wait until the spinner disappears

        //Select the Add New Candidate button

        //Enter name email position phone and recommended by

        //Enter link to resume availability and time zone

        //Add the candidate by selecting the Add button

        //Validate that the candidate was created

    }



}


