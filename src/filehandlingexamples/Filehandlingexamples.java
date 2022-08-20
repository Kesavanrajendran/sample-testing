package filehandlingexamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandlingexamples {

	public static void main(String[] args) throws IOException {
	File f=	new File("D:\\automation.txt");
	if(!f.exists())
	{
		f.createNewFile();
	}
	FileWriter mn= new FileWriter(f);
	BufferedWriter ns= new BufferedWriter(mn);
	ns.write("Dark");
	ns.newLine();
	ns.write("Technologies");
	ns.close();
	FileReader mp= new FileReader(f);
	BufferedReader ml= new BufferedReader(mp);
	String Z="";
	
	while ((Z=ml.readLine())!=null)
			{
		System.out.println(Z);
			}
	ml.close();
			
	

	}

}
