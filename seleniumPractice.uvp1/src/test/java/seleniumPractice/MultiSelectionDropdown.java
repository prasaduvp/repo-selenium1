package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class MultiSelectionDropdown {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement ideNameDropdown = driver.findElement(By.id("ide"));
		Select ideName = new Select(ideNameDropdown);
		List<WebElement> ide = ideName.getOptions();
		for(WebElement names : ide) {
			System.out.println(names.getText());
		}
		ideName.selectByIndex(1);
		Thread.sleep(2000);
		ideName.selectByValue("vs");
		Thread.sleep(2000);
		ideName.selectByVisibleText("NetBeans");
		Thread.sleep(2000);
		ideName.selectByIndex(0);
		Thread.sleep(2000);
		
		ideName.deselectByVisibleText("IntelliJ IDEA");
		
		List<WebElement> list = ideName.getAllSelectedOptions();
		for(WebElement options:list) {
			System.out.println(options.getText());
		}
		driver.quit();
	}

}
