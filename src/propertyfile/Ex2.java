package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		
		FileInputStream it = new FileInputStream("C:\\Users\\DELL\\Desktop\\New work place\\28december\\fol\\manohar.properties");
	
		p.load(it);
		
		String s = p.getProperty("Name");
		
		System.out.println(s);
	}

}
