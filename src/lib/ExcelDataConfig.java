package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	
	XSSFWorkbook  wb;
	XSSFSheet sheet1;
	private XSSFRow row   =null;
	
	
	public ExcelDataConfig(String excelpath) {
		
		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	public int getRowCount(String sheetName){
		int index = wb.getSheetIndex(sheetName);
		if(index==-1)
			return 0;
		else{
		sheet1 = wb.getSheetAt(index);
		int number=sheet1.getLastRowNum()+1;
		return number;
		}
		
	}
	public int getColumnCount(String sheetName){
		// check if sheet exists
		if(!isSheetExist(sheetName))
		 return -1;
		
		sheet1 = wb.getSheet(sheetName);
		row = sheet1.getRow(0);
		//System.out.println(row);
		
		if(row==null)
			return -1;
		
		return row.getLastCellNum();
		
		
		
	}
	  // find whether sheets exists	
		public boolean isSheetExist(String sheetName){
			int index = wb.getSheetIndex(sheetName);
			if(index==-1){
				index=wb.getSheetIndex(sheetName.toUpperCase());
					if(index==-1)
						return false;
					else
						return true;
			}
			else
				return true;
		}
		

public String getData(int sheetNumber, int row, int column) {
	
	sheet1=wb.getSheetAt(sheetNumber);
	String data=sheet1.getRow(row).getCell(column).getStringCellValue();
	return data;
	
}
}
