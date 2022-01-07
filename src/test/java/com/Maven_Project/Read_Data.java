package com.Maven_Project;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	public static void read_Particular_Data() throws IOException {
		File f = new File("C:\\Users\\rajes\\eclipse-workspace\\Maven_Project\\data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		} else if (cellType.equals(cellType.NUMERIC)) {
			double cellValue = cell.getNumericCellValue();
			int value = (int) cellValue;
			System.out.println(value);
		}
		System.out.println("***********************");
	}

	public static void all_Data() throws Exception {
		File f = new File("C:\\\\Users\\\\rajes\\\\eclipse-workspace\\\\Maven_Project\\\\data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int NumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < NumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int NumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < NumberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String cellValue = cell.getStringCellValue();
					System.out.println(cellValue);
				} else if (cell.equals(cellType.NUMERIC)) {
					double cellValue = cell.getNumericCellValue();
					int value = (int) cellValue;
					System.out.println(value);
				}
			}
		}
		System.out.println("***********************");
	}

	public static void all_Row() throws Exception {
		File f = new File("C:\\\\Users\\\\rajes\\\\eclipse-workspace\\\\Maven_Project\\\\data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			Cell cell = row.getCell(0);
			CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			} else if (cellType.equals(cellType.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int value = (int) cellValue;
				System.out.println(value);
			}
		}
		System.out.println("***********************");
	}

	public static void all_Columns() throws Exception {
		File f = new File(
				"C:\\\\\\\\Users\\\\\\\\rajes\\\\\\\\eclipse-workspace\\\\\\\\Maven_Project\\\\\\\\data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(0);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < numberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			} else if (cellType.equals(cellType.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int value = (int) cellValue;
				System.out.println(value);
			}
		}

	}

	public static void main(String[] args) throws Throwable {
		read_Particular_Data();
		all_Data();
		all_Row();
		all_Columns();
	}
}