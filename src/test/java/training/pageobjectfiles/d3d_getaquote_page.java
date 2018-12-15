package training.pageobjectfiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import training.driverclass;

import static junit.framework.TestCase.assertEquals;


public class d3d_getaquote_page extends driverclass {
    @FindBy(xpath = "html/body/div[1]/header/div[1]/div[2]/div/aside/div/ul/li[3]/div/div/a")
    private WebElement onlinedemo_ele;

    @FindBy(name = "first-name")
    private WebElement firstname_ele;

    @FindBy(name = "last-name")
    private WebElement lastname_ele;

    @FindBy(name = "your-email")
    private WebElement email_ele;

    @FindBy(name="tel-879")
    private WebElement phonenumber_ele;

    @FindBy(name="your-subject")
    private WebElement subject_ele;

    @FindBy(name="your-message")
    private WebElement message_ele;

    @FindBy(name="captcha-005")
    private WebElement captcha_ele;

    @FindBy(xpath="html/body/div[1]/div[1]/div/div/main/article/div/div/div/div/div[1]/div/div[3]/form/p[4]/input")
    private  WebElement sendmsg_ele;

    @FindBy(xpath="html/body/div[1]/div[1]/div[2]/div[1]/main/article/div/div/div/div/div/div/div/h2")
    private WebElement header_ele;
    private WebDriverWait wait = new WebDriverWait(driver,10);

    public void method1() {
        onlinedemo_ele.click();
    }
    public void method2(String firstname) {
        firstname_ele.sendKeys(firstname);
    }
    public void method3(String lastname) {
        lastname_ele.sendKeys(lastname);
    }
    public void method4(String email) {
        email_ele.sendKeys(email);
    }
    public void method5(String phonenumber){
        phonenumber_ele.sendKeys(phonenumber);
    }
    public void method6(String subject){
        subject_ele.sendKeys(subject);
    }
    public void method7(String message){
        message_ele.sendKeys(message);
    }
    public void method8(String captcha){
        captcha_ele.sendKeys(captcha);
    }
    public void method9(){
        sendmsg_ele.click();
    }
    public void emailnotificationAssertions(String expected_Result){
        wait.until(ExpectedConditions.visibilityOf(header_ele));
        System.out.println(expected_Result);
        String actual_result = null;
        actual_result = header_ele.getText();
        assertEquals(expected_Result,actual_result);
    }

}
