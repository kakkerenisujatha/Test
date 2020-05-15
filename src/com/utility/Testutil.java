package com.utility;

import java.util.ArrayList;

import com.Excel.utility.Xls_Reader;




public class Testutil<reader> {
		static Xls_Reader reader;
	
	public static  ArrayList<Object[]> getDatafromExcel() {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
		
	reader = new Xls_Reader("C:/Users/kakke/eclipse-workspace/Data sample sujatha/JavaTraningSession/src/com/TestData/ebay.com.xlsx");
		     }
		 catch (Exception e)
		 {
			e.printStackTrace();
		}
	
		
		for (int rowNum = 2; rowNum <= reader.getRowCount("ebay"); rowNum++) {
			
			String username = reader.getCellData("ebay","username", rowNum);
			String password = reader.getCellData("ebay","password", rowNum);
			
			
			Object ob[] = {username, password};
			
		
			myData.add(ob);
			
		
		}
	
return myData;
}
}
