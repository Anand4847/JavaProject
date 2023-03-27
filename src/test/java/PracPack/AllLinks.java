package PracPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinks {
	
	public static void main(String[] args) throws Exception {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Highline\\14-4-2021\\chromedriver_win32\\chromedriver.exe");		
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://amazon.com/");

//int links = driver.findElements(By.tagName("a")).size();

//System.out.println(links);


JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,10000)");
Thread.sleep(4000);
WebElement scope = driver.findElement(By.xpath("//div[@class='navFooterLine navFooterLinkLine navFooterDescLine']"));

// For printing the counts of links present in particular footer scope

int links = scope.findElements(By.tagName("a")).size();

System.out.println(links);


for (int i=1 ;i<=links; i++)
	
{

	String click = Keys.chord(Keys.CONTROL,Keys.ENTER);
	scope.findElements(By.tagName("a")).get(i).sendKeys(click);
		
}




		
	}

}
