package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet2");
		
		XSSFRow row =sh.createRow(14);
		XSSFCell cell=row.createCell(4);
		cell.setCellValue("Hello Welcome to Selenium training");
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\ExcelOperations.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
		fi.close();
//		
//		wb.createSheet("sheet3");
//		//XSSFSheet sh=wb.getSheet("Sheet2");
		

	}

}
