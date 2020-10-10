package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	static FileInputStream fi;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	static FileOutputStream fo;
	
	public  ExcelReader() {
		// TODO Auto-generated constructor stub
	}
	
	public ExcelReader(String path,String sheetname) throws IOException{
	
		fi=new FileInputStream(path);
		wb=new XSSFWorkbook(fi);
		sh= wb.getSheet(sheetname);
	}
	
	public static int totalrowsinexcel(){
		return sh.getLastRowNum();
	}
	
	public static  int totalcolsinexcel(int rownum){
		return sh.getRow(rownum).getLastCellNum();
	}
	
	public static String getCellData(int rownum,int colnum){

         XSSFRow row =sh.getRow(rownum);
         XSSFCell cell=row.getCell(colnum);
         return cell.getStringCellValue();
		
	}
	
	public static void writeData(int rownum,int colnum,String text) throws IOException{
		
		XSSFRow row =sh.createRow(rownum);
        XSSFCell cell=row.createCell(colnum);
        cell.setCellValue(text);
	}
	
	public static void saveWorkBook(String path) throws IOException{
		 fo=new FileOutputStream(path);
		wb.write(fo);
		fo.close();
		wb.close();
		fi.close();
	}

}
