package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Constants.Constant;

public class ExcelUtility {
	static FileInputStream f;// existing Java Class-to read the excel document(in byte form) present in the
	// path mentioned in line 18
static XSSFWorkbook w;// reusing existing class
static XSSFSheet sh;// reusing existing class

public static String readStringData(int row, int col,String Sheet) throws IOException// to read string data
{
f = new FileInputStream(Constant.FILEPATH);
w = new XSSFWorkbook(f);// object created for workbook
sh = w.getSheet(Sheet);// reading that particular sheet data
XSSFRow r = sh.getRow(row);// to get data from particular row
XSSFCell c = r.getCell(col);// to get data from particular column
return c.getStringCellValue();// to get string data value from excel
}

public static String readIntegerData(int row, int col,String Sheet) throws IOException// to read Integer data
{
f = new FileInputStream(Constant.FILEPATH);
w = new XSSFWorkbook(f);
sh = w.getSheet(Sheet);
XSSFRow r = sh.getRow(row);
XSSFCell c = r.getCell(col);
int val = (int) c.getNumericCellValue();// convert double to int using typecasting
return String.valueOf(val);// convert int to string using valueOf() method
//return val;
}
}
