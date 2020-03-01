package feb016;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Readany {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file  = new File("C:\\Users\\VedRaj\\Desktop\\radical\\Data1.xls");
        FileInputStream input = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(input);
		HSSFSheet sheet = workbook.getSheet("Sheet2");
		
		HSSFRow row =  sheet.getRow(1);
		HSSFCell cell = row.getCell(0);
		
		if (cell == null) {
			System.out.println("cell is null");
			
		}
		else if (cell.getCellType()== HSSFCell.CELL_TYPE_BLANK) {
			System.out.println("cell is blank");
			
		}
		else if (cell.getCellType()== HSSFCell.CELL_TYPE_BOOLEAN) {
			System.out.println(cell.getBooleanCellValue());
			}
			
			else if (cell.getCellType()== HSSFCell.CELL_TYPE_NUMERIC) {
				System.out.println(cell.getNumericCellValue());
			}
				else if (cell.getCellType()== HSSFCell.CELL_TYPE_STRING) {
					System.out.println(cell.getStringCellValue());
	}

	}}
