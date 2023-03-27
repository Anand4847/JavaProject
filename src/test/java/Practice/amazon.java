package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazon {

	
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+"\\src\\test\\java\\ShopPackage\\com.chromedriver\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 5000)");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Australia']")));
		
		
		WebElement scope = driver.findElement(By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterPadItemLine']//ul"));
		
		
		for (int i=1 ; i<=scope.findElements(By.tagName("a")).size(); i++)

		{
			
			String click = Keys.chord(Keys.CONTROL, Keys.ENTER);
			
			
			scope.findElements(By.tagName("a")).get(i).sendKeys(click);
			
			
			
		}
		
		
		
	}
}
