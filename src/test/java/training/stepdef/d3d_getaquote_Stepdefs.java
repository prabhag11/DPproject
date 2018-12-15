package training.stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import training.driverclass;
import training.pageobjectfiles.d3d_getaquote_page;

public class d3d_getaquote_Stepdefs extends driverclass {

    public d3d_getaquote_page get = PageFactory.initElements(driver, d3d_getaquote_page.class);


    @Given("^I entered URL \"([^\"]*)\"$")
    public void iEnteredURL(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    @When("^I click on Online Demo$")
    public void iClickOnOnlineDemo() {
        get.method1();
    }

    @Given("^I entered first name as \"([^\"]*)\"$")
    public void iEnteredFirstNameAs(String firstname) {
        get.method2(firstname);
    }

    @And("^I entered last name as \"([^\"]*)\"$")
    public void iEnteredLastNameAs(String lastname) {
        get.method3(lastname);
    }

    @And("^I entered email as \"([^\"]*)\"$")
    public void iEnteredEmailAs(String emailid) {
        get.method4(emailid);
    }

    @And("^I entered phone number as \"([^\"]*)\"$")
    public void iEnteredPhoneNumberAs(String phonenumber) {
        get.method5(phonenumber);
    }

    @And("^I entered subject as \"([^\"]*)\"$")
    public void iEnteredSubjectAs(String subject) {
        get.method6(subject);
    }

    @And("^I entered message as \"([^\"]*)\"$")
    public void iEnteredMessageAs(String message) {
        get.method7(message);
    }

    @And("^I entered the Captcha Code \"([^\"]*)\"$")
    public void iEnteredTheCaptchaCode(String captcha) {
        get.method8(captcha);
    }
//    @And("^I entered the Captcha Code$")
//    public void iEnteredTheCaptchaCode(String captcha) {
//        captcha="xyz";
//        get.method8(captcha);
//    }

    @When("^I click on button Send message$")
    public void iClickOnButtonSendMessage() {
        get.method9();
    }


    @Then("^I should see the message as \"([^\"]*)\"$")
    public void iShouldSeeTheMessageAs(String expected_Result) {
        get.emailnotificationAssertions(expected_Result);

    }
}
