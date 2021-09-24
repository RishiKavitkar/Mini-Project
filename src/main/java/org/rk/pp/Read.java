package org.rk.pp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	
	public static void main(String[] args) throws IOException {
		
		File loc= new File("C:\\Users\\admin\\eclipse-workspace\\DellUser\\Excel\\rishi.xlsx");
		  
		
		FileInputStream f = new FileInputStream(loc);
		
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		
		String sh1 = s.getRow(1).getCell(0).getStringCellValue();
		String sh2 = s.getRow(2).getCell(0).getStringCellValue();
		String sh3 = s.getRow(3).getCell(0).getStringCellValue();
		
		
		
		
		
		
		
		
	}
	
	

}
