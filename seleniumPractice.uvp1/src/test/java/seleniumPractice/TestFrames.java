package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestFrames {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");//Main page
		driver.findElement(By.id("name")).sendKeys("Vara prasad");
		Thread.sleep(3000);
		
		driver.switchTo().frame("frm1");//Frame1
		Select courseNameDropdown = new Select (driver.findElement(By.id("course")));//Finding the element by using the select class
		courseNameDropdown.selectByVisibleText("Javascript");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();//back to main page
		
		driver.switchTo().frame("frm2");//Frame2
		driver.findElement(By.id("firstName")).sendKeys("Hyr tutorials");//Finding the element in frame2
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();//Main page
		
		driver.switchTo().frame("frm1");//Again entering into frame1
		Select courseNameDropdown2 = new Select (driver.findElement(By.id("course")));//Finding the element by using the select class
		courseNameDropdown2.selectByVisibleText("Java");//Selecting the java by using the select class
		
		driver.switchTo().defaultContent();// back to main page
		
		driver.findElement(By.id("name")).clear();//finding the element and deleting the first entered text
		Thread.sleep(3000);
		
		driver.findElement(By.id("name")).sendKeys("Hello");//Again writing the text into the field.	
		
	}

}
