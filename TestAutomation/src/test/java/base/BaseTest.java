package base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static Properties p = new Properties();
	public static FileReader fileReader;
	public static FileReader TestData;
	public static WebDriverWait wait;

	@BeforeTest
	public void setUp() throws IOException {
		if (driver == null) {
			FileReader fileReader = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resource\\configfiles\\Config.properties");
			p.load(fileReader);
		}

		if (p.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(p.getProperty("testurl"));
		} 
		else if (p.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(p.getProperty("testurl"));
		}
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	
	public void getdata() throws IOException {
		FileReader dataReader = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resource\\testdata\\LoginCreds");
		p.load(dataReader);
	}
	
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Browser closed successfully");
	}
}
