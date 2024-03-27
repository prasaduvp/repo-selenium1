package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navigations {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E211IN714G0&p=google+homepage");
		Thread.sleep(2000);
		
		driver.findElement(By.id("yschsp")).sendKeys("Hyr tutorials");
		driver.findElement(By.id("yschsp")).submit();
		
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
