package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {

	public static void main(String[] args) throws IOException {
		File scr = new File("D:\\ReadExcelFeb26.xlsx");
		FileInputStream fis = new FileInputStream(scr);
		XSSFWorkbook  wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1  =  wb.getSheetAt(0);
		
		sheet1.getRow(0).createCell(2).setCellValue("hi");
		sheet1.getRow(1).createCell(2).setCellValue("how");
		sheet1.getRow(2).createCell(2).setCellValue("are");
		sheet1.getRow(3).createCell(2).setCellValue("you");
		
		
		FileOutputStream fout = new FileOutputStream(scr);
		wb.write(fout);
		wb.close();
		   

	}

}
