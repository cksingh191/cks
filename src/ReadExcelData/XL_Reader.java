package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XL_Reader {

	public static void main(String[] args) throws Exception {
		
		File src=new File("/Chandra_Workspace/Cks/src/TestData/datatable4.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowCount=sheet1.getLastRowNum();
		System.out.println("Total rows is--"+rowCount);
		//wb.close();
		for(int i=1;i<=rowCount;i++) {
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data from row"+"-"+ i+"---"+ data0);
		}
		wb.close();

	}

}
