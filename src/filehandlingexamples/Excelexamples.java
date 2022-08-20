package filehandlingexamples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelexamples {

	public static void main(String[] args) throws IOException {
		File f= new File("D:\\AUTOMATION TESTING\\kesavan.xlsx");
		if(!f.exists());
		{
			f.createNewFile();
		}
		FileOutputStream fos= new FileOutputStream(f);
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("sivam");
		XSSFRow row=sheet.createRow(3);
		XSSFCell col=row.createCell(3);
		col.setCellValue("sivamtransport");
		workbook.write(fos);
		fos.close();

	}

}
