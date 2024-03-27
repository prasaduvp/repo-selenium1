package Pom_loginpage;

import java.io.File;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_loginclass {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		String url = "http://globalsquirrelsuserinterface-env.eba-mak34qea.ap-south-1.elasticbeanstalk.com/signup";

		WebElement txt_firstname,txt_Lastname,txt_gmail ;
		WebElement timezone ; 
		WebElement loginoption;
		
driver.get(url);

driver.manage().window().maximize();

driver.manage().deleteAllCookies();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));


Thread.sleep(2000);


txt_firstname=driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
txt_firstname.sendKeys("saikumar");
Thread.sleep(1000);

txt_Lastname=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
txt_Lastname.sendKeys("yerravandla");
Thread.sleep(1000);

txt_gmail=driver.findElement(By.xpath("//*[@id=\"workEmail\"]"));
txt_gmail.sendKeys("guru@fmail.com");
Thread.sleep(1000);

////timezone=driver.findElement(By.xpath("/html/body/app-root/div[2]/app-signup/div/div[2]/div/form[1]/div[5]/div[4]/mat-select/div/div[1]"));
////timezone.click();
////
////Thread.sleep(1000);
////
////driver.findElement(By.xpath("/html/body/div[8]/div[2]/div/div/div/mat-option[4]/span")).click();
////Thread.sleep(1000);
//
////loginoption=driver.findElement(By.tagName("a"));
////loginoption.click();
//
//
////if(loginoption.isEnabled()) {
////	
////	loginoption.click();}
////
//////	else {
////		
////		System.out.println("The login page is navigated "+loginoption.getScreenshotAs(OutputType.FILE));}
////
////	 {
//	
	

driver.close();
	}
}
