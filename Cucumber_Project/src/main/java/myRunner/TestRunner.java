package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "D:\\AllPrograms\\New_WorkSpace\\CucumberProject\\src\\main\\java\\features\\city_movies_showtimings.feature",
	glue= {"stepDefinitation"},
	format= {"pretty","html:test-output"})

public class TestRunner 
{
}
