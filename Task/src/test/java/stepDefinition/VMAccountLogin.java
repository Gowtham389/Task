package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VMAccountLogin {
	
	WebDriver driver;
	@Given("User launches the browser and navigate to VMAccount WebPage")
	public void user_launches_the_browser_and_navigate_to_vm_account_web_page() {
	    
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://accounts.vmmaps.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Given("the user enter the email address {string}")
	public void the_user_enter_the_email_address(String email) {
	   
	WebElement EmailTextBox = driver.findElement(By.id("login-email"));
	EmailTextBox.click();
	EmailTextBox.sendKeys(email);
	
	}

	@When("the user enter the password {string}")
	public void the_user_enter_the_password(String passwrd) {
	WebElement PasswordTextBox = driver.findElement(By.id("login-password"));
	PasswordTextBox.click();
	PasswordTextBox.sendKeys(passwrd);
	
	}

	@When("the user click the login button")
	public void the_user_click_the_login_button() {
	WebElement LoginButton = driver.findElement(By.id("login-submit-text"));    
	LoginButton.click();
	}


	@Given("the user verify to successfully login")
	public void the_user_verify_to_successfully_login() {
	
		String title = driver.getTitle();
	if(title.equals("Dashboard"))
	{
		
		System.out.println("Successfully login into the webpage");	
		}
	else	 
	{
	System.out.println("Not Successfully login into the webpage");	
		
	}
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.close();
	
	
	
	}

@Given("the user enter the invaild email address {string}")
public void the_user_enter_the_invaild_email_address(String invaildEmailId) {

	WebElement EmailTextBox = driver.findElement(By.id("login-email"));
	EmailTextBox.click();
	EmailTextBox.sendKeys(invaildEmailId);
}


@Given("the user enter the uppper and lower case sensitive letter in the email address {string}")
public void the_user_enter_the_uppper_and_lower_case_sensitive_letter_in_the_email_address(String CaseSensitiveEmailId) {
	WebElement EmailTextBox = driver.findElement(By.id("login-email"));
	EmailTextBox.click();
	EmailTextBox.sendKeys(CaseSensitiveEmailId);
}



@When("the user enter the invaild password {string}")
public void the_user_enter_the_invaild_password(String invaildpasswrd) {
   
	WebElement PasswordTextBox = driver.findElement(By.id("login-password"));
	PasswordTextBox.click();
	PasswordTextBox.sendKeys(invaildpasswrd);
}

}



	
	

