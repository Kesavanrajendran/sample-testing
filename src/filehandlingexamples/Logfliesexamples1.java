package filehandlingexamples;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;

public class Logfliesexamples1 {
	//import slf4j
	public static Logger log= (Logger) LoggerFactory.getLogger(logfliesexamples1.class);

	public static void main(String[] args) {
		//import log4j
		PropertyConfigurator.configure("D:\\jarfiles\\Log4j.properties");
		log.info("START THE PROGRAMS");
		int a=5;
		int b=10;
		int c=a+b;
		System.out.println(c);
		log.info("END THE PROGRAM");
		
		

	}

}
