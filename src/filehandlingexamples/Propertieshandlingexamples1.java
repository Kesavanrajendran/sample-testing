package filehandlingexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertieshandlingexamples1 {

	public static void main(String[] args) throws IOException {
	File f= new File("D:\\AUTOMATION TESTING\\KESAVAN.properties");
	if(!f.exists());
	{
		f.createNewFile();
	}
	
	FileInputStream mn= new FileInputStream(f);
	Properties nn= new Properties();
	nn.load(mn);
	System.out.println(nn.getProperty("NAME"));
	System.out.println(nn.getProperty("LOCATION"));
	System.out.println(nn.getProperty("COMPANYNAME"));
			
			
	
	

	}

}
