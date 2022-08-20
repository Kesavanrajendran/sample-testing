package filehandlingexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Kesapropertiesexamples {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\kesa.properties");
		FileInputStream fo= new FileInputStream(f);
			Properties pro=new Properties();
			pro.load(fo);
			System.out.println(pro.getProperty("username"));
			System.out.println(pro.getProperty("password"));
 
	}

}
