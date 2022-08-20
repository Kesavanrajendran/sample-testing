package filehandlingexamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelexamples2 {

	public static void main(String[] args) throws IOException {
		File f= new File("D:\\AUTOMATION TESTING\\KESAEXCELWRITEEXAMPLES.xlsx");
		if(!f.exists());
		{
			f.createNewFile();
		}
		
		FileOutputStream fm= new FileOutputStream(f);
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("dhanam");
		XSSFRow row=sheet.createRow(4);
		XSSFCell col=row.createCell(3);
		col.setCellValue("velacherylandmark");
		workbook.write(fm);
		fm.close();

	}

}
