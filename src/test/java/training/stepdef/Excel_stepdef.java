package training.stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import training.driverclass;
import training.pageobjectfiles.Excel_page;

import java.io.IOException;


public class Excel_stepdef extends driverclass {

    public Excel_page excel_page = PageFactory.initElements(driver,Excel_page.class);

    @Given("^I readthe Excel file \"([^\"]*)\" from \"([^\"]*)\"$")
    public void iReadtheExcelFileFrom(String filename, String directory) throws IOException {
        excel_page.readExcel(filename,directory);
    }
}
