package Cks_Test;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		
		ExcelDataConfig excel=new ExcelDataConfig("/Chandra_Workspace/Cks/src/TestData/datatable4.xlsx");
		
		System.out.println(excel.getData(1, 1, 0));
		System.out.println(excel.getRowCount("sheet 2"));
		System.out.println(excel.getColumnCount("sheet 2"));

	}

}
