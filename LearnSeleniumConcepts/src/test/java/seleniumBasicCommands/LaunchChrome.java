package seleniumBasicCommands;

import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class LaunchChrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new ChromeDriver();

		File file = new File("/media/ram/16DCC976DCC950A3/testExcl/testlife.xlsx");
		FileInputStream inputstream = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getFirstRowNum());
		System.out.println(rowcount);
		for (int i = 0; i<rowcount+1; i++)
//			for (int i = 0; i <= sheet.getLastRowNum(); i++)

		{

			Row row = sheet.getRow(i);
			System.out.println(row.getLastCellNum()+"cell num last");

        	for(int j=0; j<row.getLastCellNum(); j++)
			//for (int j = 0; j < rowcount + 1; j++) 
			{
				System.out.print(row.getCell(j).getStringCellValue() + "|| ");
				System.out.println();

			}

		}

	}

}
