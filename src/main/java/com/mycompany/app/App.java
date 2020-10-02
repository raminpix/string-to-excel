package com.mycompany.app;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

public class App {
	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("d:\\workbook.xlsx");
		SXSSFWorkbook workbook = new SXSSFWorkbook();
		Sheet sh = workbook.createSheet();
		Row row = sh.createRow(0);
		Cell cell = row.createCell(0);
		cell.setCellValue("Viva Excel");
		workbook.write(out);
		out.close();
		System.out.println("DONE !");
	}
}
