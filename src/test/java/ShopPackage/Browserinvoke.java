package ShopPackage;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserinvoke {

	public WebDriver driver;

	public WebDriverWait wait;

	public WebDriver initializeDriver() throws Exception

	{

Properties prop = new Properties();
FileInputStream fis = new FileInputStream(
System.getProperty("user.dir")+"\\src\\main\\java\\ShopPackage\\data.properties");
prop.load(fis);
String browserName = prop.getProperty("browser");
//String browserName = System.getProperty("browser");

		{

			if (browserName.equals("chrome"))

			{
				// execute chrome browser

				System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+"\\src\\main\\java\\ShopPackage\\com.chromedriver\\chromedriver.exe"));
				driver = new ChromeDriver();

				// rest script

				driver.manage().window().maximize();
				driver.get("https://www.usshoptools.com/Login");
				wait = new WebDriverWait(driver, 20);		
			
			}

			else if (browserName.equals("chromeheadless"))

			{

				
					// execute chrome browser headless

					System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+"\\src\\main\\java\\ShopPackage\\com.chromedriver\\chromedriver.exe"));
					ChromeOptions options = new ChromeOptions();

					options.addArguments("headless");
					options.addArguments("--window-size=1280, 768");

					driver = new ChromeDriver(options);

					// rest script

					driver.manage().window().maximize();
					driver.get("http://64.202.187.222:8285/login");
					wait = new WebDriverWait(driver, 20);
				

			}

			else if (browserName.equals("firefox"))

			{
				// execute firefox browser

				System.setProperty("webdriver.gecko.driver", (System.getProperty("user.dir")+ "\\src\\main\\java\\ShopPackage\\com.geckodriver\\geckodriver.exe"));
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("http://64.202.187.222:8285/login");
				wait = new WebDriverWait(driver, 20);

			}
			else if (browserName.equals("firefoxheadless"))

			{

				
					// execute firefox browser headless

				System.setProperty("webdriver.gecko.driver", (System.getProperty("user.dir")+ "\\src\\main\\java\\ShopPackage\\com.geckodriver\\geckodriver.exe"));
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("--headless");
				options.addArguments("--window-size=1280, 768");
				driver = new FirefoxDriver(options);
				driver.manage().window().maximize();
				driver.get("http://64.202.187.222:8285/login");
				wait = new WebDriverWait(driver, 20);
					
			}
			
			else if (browserName.equals("IE"))

			{
				// Execute ie driver

			}

			return driver;

		}

	}

	public String TakeScreenShot(String testcasename, WebDriver driver) throws IOException

	{

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String destinationfile = System.getProperty("user.dir") + "\\reports\\" + testcasename + ".png";
		FileUtils.copyFile(src, new File(destinationfile));
		return destinationfile;
	}

}
