package propertyfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Ex11 {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();

		InputStream input =new FileInputStream("C:\\Users\\DELL\\Desktop\\New work place\\28december\\fol\\file.properties");

		prop.load(input);

		String test = prop.getProperty("test");
		System.out.println(test);
		System.out.println(prop.getProperty("test1"));
		System.out.println(prop.getProperty("test2"));
		System.out.println(prop.getProperty("test3"));
		System.out.println(prop.getProperty("test4"));

		OutputStream output =new FileOutputStream("C:\\Users\\DELL\\Desktop\\New work place\\28december\\fol\\file.properties");

		prop.setProperty("test1", "pass");
		prop.setProperty("test2", "Python");
		prop.setProperty("test3", "C++");

		prop.setProperty("test4", "C");
		prop.store(output, "ok");



	}

}
