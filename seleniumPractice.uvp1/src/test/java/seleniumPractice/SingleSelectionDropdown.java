package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SingleSelectionDropdown {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		WebElement courseNameDropdown = driver.findElement(By.id("course"));
		Select courseName = new Select(courseNameDropdown);
		List<WebElement> options = courseName.getOptions();
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
		courseName.selectByIndex(1);
		Thread.sleep(3000);
		courseName.selectByValue("js");
		Thread.sleep(3000);
		courseName.selectByVisibleText("Dot Net");
		Thread.sleep(3000);
		
		String value = courseName.getFirstSelectedOption().getText();
		System.out.println(value);
		driver.quit();
	}

}
