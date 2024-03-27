package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		TakesScreenshot takescreenshot = (TakesScreenshot)driver;
		 File srcFile = takescreenshot.getScreenshotAs(OutputType.FILE);
		 File dstFile = new File ("./Photo/img1.jpg");
		 FileUtils.copyFile(srcFile, dstFile);
		 System.out.println("Screenshot saved succesfully");
		 driver.quit();
	}

}
