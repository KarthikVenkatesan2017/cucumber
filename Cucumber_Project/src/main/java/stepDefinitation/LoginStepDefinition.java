package stepDefinitation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition
{
	WebDriver driver;

	@Given("^user is already on login page$")
	public void user_is_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\AllPrograms\\Jaars\\2017\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@When("^title is Facebook$")
	public void title_is_Facebook()
	{
		String str = driver.getTitle();
		System.out.println(str);
	Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
	}
	
	@Then("^user enters credentials$")
	public void user_enters_credentials()
	{
	WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
	email.sendKeys("ctkarthi@gmail.com");
	WebElement password = driver.findElement(By.xpath("//*[@id=\'pass\']"));
	password.sendKeys("Karthik123");	
	}
	
	@Then("^clicks on login button$")
	public void clicks_on_login_button() throws InterruptedException
	{
		WebElement login = driver.findElement(By.xpath("//*[@id=\'u_0_2\']"));
		login.click();	
		Thread.sleep(2000);
	}
	
	@Then("^user has to be on home page$")
	public void user_has_to_be_on_home_page()
	{
		String str2 = driver.getTitle();
		System.out.println("Tittle is "+str2);
		Assert.assertEquals("Facebook", str2);
		driver.close();
	}
}
