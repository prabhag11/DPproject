package training.pageobjectfiles;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class Excel_page {

//Read the directory
    String DIR=System.getProperty("user.dir")+"/src/test/jave/training/";
    public void readExcel(String filename, String directory) throws IOException {
//need maven depenpency for "Workbook"--excel poi maven dependency
        String dir_filename = DIR +directory+"/"+filename;
        Workbook workbook = WorkbookFactory.create(new File(dir_filename));
        System.out.println(workbook);
//read the sheet from the workbook
        Sheet sheet = workbook.getSheetAt(0);
        DataFormatter df = new DataFormatter();
        String cellvalue = df.formatCellValue((Cell) sheet.getRow(0));

        System.out.println(cellvalue);
    }
}
