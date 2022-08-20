package filehandlingexamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.helpers.XSSFRowShifter;

public class Excelwrite {

	public static void main(String[] args) throws IOException {
	 File f= new File("D:\\AUTOMATION TESTING\\sivakanna.xlsx");
	 if(!f.exists())
	 {
		 f.createNewFile();
	 }
	 FileOutputStream ms= new FileOutputStream(f);
	 XSSFWorkbook workbook= new XSSFWorkbook();
	 XSSFSheet sheet= workbook.createSheet("TIGER");
	 XSSFRow row= sheet.createRow(2);
	 XSSFCell col=sheet.createRow(2).createCell(3);
	 col.setCellValue("BARBEQUE NATION");
	 workbook.write(ms);
	 ms.close();
	 
	}

}
