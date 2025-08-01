package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	public static String getParticularData(int rowValue, int columnValue) {
			String data=null;
		try {
		File file=new File("C:\\Users\\Logambal\\Documents\\DataDriven.xlsx");
		XSSFWorkbook book= new XSSFWorkbook(file);
		Sheet sheet = book.getSheet("sheet1");
		Row row = sheet.getRow(rowValue);
		Cell cell = row.getCell(columnValue);
		//format  every cell using DataFormatter class
		DataFormatter dataformat= new DataFormatter();
		 data = dataformat.formatCellValue(cell);
		System.out.println(data);
		book.close();
			
		
		} catch (Exception e) {
			e.printStackTrace(); 	
		}
		return data;
	}
	
	public static void getAllColumnData() {
		try {
			File file=new File("C:\\Users\\Logambal\\Documents\\DataDriven.xlsx");
			XSSFWorkbook book =new XSSFWorkbook(file);
			Sheet sheet = book.getSheetAt(0);
			Row row = sheet.getRow(0);
			
			for (int i = 0; i <row.getLastCellNum(); i++) {
				Cell cell = row.getCell(i);
				//format  every cell using DataFormatter class
				DataFormatter dataformat = new DataFormatter();
				String data = dataformat.formatCellValue(cell);
				System.out.println(data);
			}
			book.close();}
		catch (Exception e){
			e.printStackTrace();
			
		}
			
}
	public static void getAllData() {
		
		try {
			File file=new File("C:\\Users\\Logambal\\Documents\\DataDriven.xlsx");
			XSSFWorkbook book =new XSSFWorkbook(file);
			Sheet sheet = book.getSheetAt(0);
			for (int i = 1; i <=sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j < row.getLastCellNum(); j++) {
					Cell cell = row.getCell(j);
					//format  every cell using DataFormatter class
					DataFormatter dataformat = new DataFormatter();
					String data = dataformat.formatCellValue(cell);
					System.out.println(data);
				} 
			}
			book.close();}
		catch (Exception e){
			e.printStackTrace();
			
		}}
		
	public static void writeData() {
		try { 
			File file=new File("C:\\Users\\Logambal\\Documents\\DataDriven.xlsx");
			FileInputStream fileinput=new FileInputStream(file);
			XSSFWorkbook book =new XSSFWorkbook(fileinput);
			
			book.createSheet("Class").createRow(0).createCell(0).setCellValue("Logambal");
			FileOutputStream fileoutput= new FileOutputStream(file);
			book.write(fileoutput);
			book.close();
		   System.out.println("Successfully Created");
		
			
		}catch(Exception e){
			
		}
		
		
	}
public static void main(String[] args) {
	//getParticularData(1, 1);
	//getAllColumnData();
	//getAllData();
	writeData();
}
}
