package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VMAccountForgotPassword {
	
	
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

	
	@When("The user enter the email address {string}")
	public void the_user_enter_the_email_address(String email) {

		WebElement EmailTextBox = driver.findElement(By.id("login-email"));
		EmailTextBox.click();
		EmailTextBox.sendKeys(email);
		
		
	}
	@When("the user click the forgot password option")
	public void the_user_click_the_forgot_password_option() {
		
		WebElement forgotpasswordbutton = driver.findElement(By.id("Resetpassword"));
	forgotpasswordbutton.click();
	
	}
	@When("the user enter the Otp manually")
	public void the_user_enter_the_otp_manually() {
	    
		try {
			Thread.sleep(150000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@When("the user enter new password {string}")
	public void the_user_enter_new_password(String newpasswrd) {
		
	    
		WebElement passwordtxtbox = driver.findElement(By.id("reset-login-otp-text"));
		passwordtxtbox.sendKeys(newpasswrd);
	}


}
