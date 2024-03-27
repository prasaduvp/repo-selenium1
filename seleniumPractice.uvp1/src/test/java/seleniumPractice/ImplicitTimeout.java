package seleniumPractice;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitTimeout {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("http://globalsquirrelsuserinterface-env.eba-mak34qea.ap-south-1.elasticbeanstalk.com/signup");

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Gurusaikumar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Yerravandla");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/app-root/div[2]/app-signup/div/div[2]/div/form[1]/div[5]/div[3]/input"))
				.sendKeys("gurusaikumar624@gmail.com");
		Thread.sleep(2000);
		

	
		driver.close();

}

}
