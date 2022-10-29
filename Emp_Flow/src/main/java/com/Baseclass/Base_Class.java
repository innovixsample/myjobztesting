package com.Baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class {

public static WebDriver driver;  

public static String value;

public static WebDriver getBrowser(String type) {

if(type.equalsIgnoreCase("chrome")) {

System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");

driver = new ChromeDriver();

} else if(type.equalsIgnoreCase("firefox")) {

System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver");
     
driver = new FirefoxDriver();
   
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.manage().window().maximize();

return driver;

}

public static void clickOnElement(WebElement element) {

element.click();

}

public static void inputValueElement(WebElement element,String value) {

element.sendKeys(value);

}

public static void getURL(String url) {

// driver.get(url);

driver.get("http://192.168.0.77:4202");

}

public static String particularData(int sheet, int row, int cell, String path) throws Exception {

File f = new File(path);

FileInputStream fis = new FileInputStream(f);

Workbook wb = new XSSFWorkbook(fis);

Sheet sheetAt = wb.getSheetAt(sheet);

Row r = sheetAt.getRow(row);

Cell c = r.getCell(cell);

CellType cellType = c.getCellType();

if (cellType.equals(CellType.STRING)) {

value = c.getStringCellValue();

}

else if (cellType.equals(CellType.NUMERIC)) {

double d = c.getNumericCellValue();
int val = (int) d;
value = String.valueOf(val);

}

wb.close();

return value;

}

}