package filehandlingexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandlingexamples1 {

	public static void main(String[] args) throws IOException {
		File f= new File("D:\\AUTOMATION TESTING\\books1.xlsx");
		FileInputStream ms= new FileInputStream(f);
		
		XSSFWorkbook workbook= new XSSFWorkbook(ms);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int row=sheet.getLastRowNum()+1;
		int col=sheet.getRow(0).getLastCellNum();
		
		System.out.println(row);
		System.out.println(col);
		
		for(int i=0;i<0;i++)
		{
			for(int j=0;j<0;j++)
			{
				if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_STRING)
				{
				String data= sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data+"");
				}
				
				else if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_NUMERIC)
				{
				int num=(int) sheet.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(num+"");
				}
			
			}
				System.out.println();
		}
				ms.close();
	}
}
				
		
		
		
		

	


