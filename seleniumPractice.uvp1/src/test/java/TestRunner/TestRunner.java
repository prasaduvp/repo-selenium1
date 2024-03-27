package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\vara prasad\\eclipse-workspace\\seleniumPractice\\src\\test\\resources\\Feature\\Login.feature",
glue= {"stepdefination"},
monochrome=true,
plugin= {"pretty","html:target/global.html"})



public class TestRunner {
	
	


	
	

}
