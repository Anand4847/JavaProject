package Day4;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TS1 {

	
	public static void main(String[] args) throws Exception {
		
		
		TakesScreenshot driver=null;
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("C://test.png"));
		
	}
}
