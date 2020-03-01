package feb14;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Basicxl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file  = new File("C:\\Users\\VedRaj\\Desktop\\radical\\Data1.xls");
        FileInputStream input = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(input);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		
		HSSFRow row =  sheet.getRow(0);
		HSSFCell cell = row.getCell(0);
		String temp = cell.getStringCellValue();
		System.out.println(temp);
     //HSSFSheet sheet = workbook.getSheet("Sheet1");
		
		HSSFRow row1 =  sheet.getRow(1);
		HSSFCell cell1 = row.getCell(1);
		
		System.out.println(cell1.getStringCellValue());
		
		HSSFRow row2 =  sheet.getRow(1);
		HSSFCell cell3 = row2.getCell(3);
		
		System.out.println(cell3.getStringCellValue());
		
		System.out.println(sheet.getLastRowNum());
		
		
		
		


	}

}
