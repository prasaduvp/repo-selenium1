package seleniumPractice;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandlilng {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent window handle is "+ parentWindowHandle + driver.getTitle());
		driver.findElement(By.className("whButtons")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowHandle : windowHandles) {
			if(!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("Vara prasad");
				Thread.sleep(3000);
				driver.close();	
		}			
			
		}
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.id("name")).sendKeys("Hyr tutorials");
		Thread.sleep(3000);
		driver.quit();

	}

}
