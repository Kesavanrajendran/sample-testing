package filehandlingexamples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class notepadhandling1 {

	public static void main(String[] args) throws IOException {
		File f= new File("D:\\AUTOMATION TESTING\\kesa.txt");
		if(!f.exists());
		{
			f.createNewFile();
		}
		FileWriter fm= new FileWriter(f);
		BufferedWriter kl=new BufferedWriter(fm);
		kl.write("welcome home siva glad to meet you");
		kl.newLine();
		kl.write("welcome home kesavan glad to meet you also");
		kl.newLine();
		kl.write("Im very  lucky to meet you my son");
		kl.newLine();
		kl.write("I love briyani(thalapakatti)");
		kl.close();
		
		FileReader sm=new FileReader(f);
		BufferedReader mn= new BufferedReader(sm);
		
		String x=("");
		while((x=mn.readLine())!=null)
		{
			System.out.println(x);
		}
		mn.close();

	}

}
