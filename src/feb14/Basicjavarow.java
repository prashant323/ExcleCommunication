package feb14;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Basicjavarow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\VedRaj\\Desktop\\radical\\Data1.xls");
		FileInputStream input = new FileInputStream(file);
		
		HSSFWorkbook workbook = new HSSFWorkbook(input);
		HSSFSheet sheet = workbook.getSheet("Sheet1");
		System.out.println(sheet.getLastRowNum());
		HashMap<Integer, ArrayList<String>> map = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		HSSFRow row = sheet.getRow(0);
		for(int i=0; i<= sheet.getLastRowNum();i++) {
			
			HSSFcell cell  = row.getRow(i);
			list.add(cell.getStringCellValue());
			
		}
		
		
		
		
		System.out.println(list);
	}
	

}
