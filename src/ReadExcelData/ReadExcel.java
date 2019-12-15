package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {
		
		
		try {
			File file=new File("/Chandra_Workspace/Cks/src/TestData/HalfEbayTestData.xlsx");
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(0);
			
			int rowcount=sheet.getLastRowNum() +1;
			for(int i=1;i<rowcount;i++) {
				XSSFRow row=sheet.getRow(i);
				for(int j=0;j<row.getLastCellNum();j++) {
					System.out.print(row.getCell(j)+"-----");
				}
				System.out.println();
			}
			fis.close();
			wb.close();
		
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
