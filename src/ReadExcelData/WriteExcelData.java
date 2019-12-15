package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) {
		try {
			File file=new File("/Chandra_Workspace/Cks/src/TestData/HalfEbayTestData.xlsx");
			FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheetAt(1);
			
			int rowcount=sheet.getLastRowNum() +1;
			String[] value= {"Aaryan","Sunita" };
			XSSFRow row=sheet.createRow(rowcount);
			
			for(int i=0;i<2;i++) {
				XSSFCell cell=row.createCell(i);
				cell.setCellValue(value[i]);
			}
			FileOutputStream fos=new FileOutputStream(file);
			wb.write(fos);
			fis.close();
			wb.close();
			fos.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
