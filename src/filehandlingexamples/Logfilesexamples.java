package filehandlingexamples;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logfilesexamples {
	//import slf4j
	public static Logger log=LoggerFactory.getLogger(Logfilesexamples.class);
	

	public static void main(String[] args) {
		//import log4j
		PropertyConfigurator.configure("D:\\jarfiles\\Log4j\\log4j.properties");
		log.info("start the program");
		int i=1;
		int j=2;
		int k=i+j;
		System.out.println(k);
		log.info("end of the program");
		

	}

}
