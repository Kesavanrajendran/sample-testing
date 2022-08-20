package filehandlingexamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepadhandlingwrite {

	public static void main(String[] args) throws IOException {
		File f= new File("D:\\AUTOMATION TESTING\\sivasankaran.txt");
		if(!f.exists());
		{
			f.createNewFile();
		}
		FileWriter mm= new FileWriter(f);
		BufferedWriter ms= new BufferedWriter(mm);
		ms.write("I lives in my own world");
		ms.newLine();
		ms.write("tackle every situation which you face");
		ms.newLine();
		ms.close();
		
		FileReader nn= new FileReader(f);
		BufferedReader ns= new BufferedReader(nn);
		
		
		String x="";
		while((x=ns.readLine())!=null)
				{
			System.out.println(x);
				}
		ns.close();
		
		

	}

}
