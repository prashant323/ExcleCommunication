package feb14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class writefile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\VedRaj\\Desktop\\radical\\Data1.xls");
		FileInputStream input = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(input);
		HSSFSheet sheet = workbook.getSheet("Sheet1");

		HSSFRow row = sheet.getRow(0);
		int maxcell = row.getLastCellNum();
		HSSFCell cell = row.createCell(maxcell);
		cell.setCellValue("Dhule");
		
		int maxRow = sheet.getLastRowNum();
		HSSFRow row1 = sheet.createRow(maxRow+1);
		int maxCell1 = row1.getLastCellNum();
		HSSFCell cell1 = row.createCell(maxcell);
		cell1.setCellValue("Ooty");
		
		FileOutputStream output =  new FileOutputStream(file);
		workbook.write(output);
		output.close();
		
	}

}
