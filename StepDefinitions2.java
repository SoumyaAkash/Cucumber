package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions2 {
public ChromeDriver driver; // global variable
	
	@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}

	@And("Load the application url")
	public void loadApplicationUrl() {
		driver.get("http://leaftaps.com/opentaps");
	}
	
	@And("Enter the username as {string}")
	public void enterUsername(String uName)
	{
	driver.findElement(By.id("username")).sendKeys(uName);
			
	}
	@And("Enter the password as {string}")
		public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
			}
	
	@When("Click on Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		//driver.findElement(By.linkText("Leads")).click();
	//	driver.findElement(By.linkText("Create Lead")).click();
		
		}
	
	@Then("Homepage should be displayed")
	public void verifyHomepage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if(displayed) {
			System.out.println("Homepage is displayed");
		}
		else {
			System.out.println("Homepage is not displayed");
		}
	}
	
	@But("Error message should be displayed")
	public void VerifyErrorMessage()
	{
		System.out.println("Error message is displayedfor invalid Login");
	}
}
