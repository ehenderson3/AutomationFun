package TestObjects;

import PageObjects.StaffingCandidatesPage;
import PageObjects.StaffingRecruiterDashPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaffingInterviewTests {

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
    public void SendCandidateToInterviewTeam(){

        //Locate or create a new user

        //Click the "Send to interviewing team" button and validate that the success toaster appears

        //Go to the interviewers Dashboard

        //Maybe wait until the spinner disappears

        //Validate that you've landed on the Interview request page

        //Locate and select the newly added candidate

        //Assign an interviewer to the candidate

        //Validate the cookie trail

        //validate the assigned Interviewer

        //Schedule a date validate that the interview date is correct

    }

}


