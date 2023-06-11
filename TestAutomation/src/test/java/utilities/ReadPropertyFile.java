package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
public static void main(String[] args) throws IOException {
	FileReader fileReader=new FileReader("C:\\Users\\Dell\\new work space\\TestAutomation\\src\\test\\resource\\configfiles\\Config.properties");
	Properties p=new Properties();
	p.load(fileReader);
	System.out.println(p.getProperty("browser"));
}
}
