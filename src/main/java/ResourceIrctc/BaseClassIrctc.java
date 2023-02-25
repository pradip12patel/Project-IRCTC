package ResourceIrctc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClassIrctc {
	
	  protected WebDriver driver;
	 Properties read;
	
	public void DriverInitilize() throws IOException   {
		
		FileInputStream src=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\project2\\data.properties");
		
		 read=new Properties();
		read.load(src);
		
		String key=read.getProperty("browser");
		
		if(key.equalsIgnoreCase("chrome"))  {
			
			ChromeOptions opt=new ChromeOptions();
			
			opt.addArguments("disable-notifications");
			
			 driver=new ChromeDriver(opt);
		}
	
		else if(key.equalsIgnoreCase("firefox"))  {
			
			driver=new FirefoxDriver();
		}
		else  {
			
			System.out.println("check the browser name");
		}
	}	
		
	@BeforeMethod
		public void lauchurl() throws IOException  {
			
			DriverInitilize();
			
			String key2=read.getProperty("url");
			
			driver.get(key2);
		}
		
	@AfterMethod
		public void closeurl()  {
			
			System.out.println("hello");
		}
	}


