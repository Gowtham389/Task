package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VMAccountRegsiterOption {

	WebDriver driver;
	@Given("the User Launch VMAccount page")
	public void user_launches_the_browser_and_navigate_to_vm_account_web_page() {
	    
		//WebDriverManager.chromedriver().setup();
		//driver = new ChromeDriver();
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://accounts.vmmaps.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Then("the user click Register here option")
	public void the_user_click_register_here_option() {
		WebElement Registeroption = driver.findElement(By.id("registerHere"));
		Registeroption.click();
	}
	@And ("the user give details Name {string} Email {string} password {string} and confirm password {string}")
	public void the_user_give_detials_name_email_password_and_confirm_password(String name,String email,String password,String confirmpassword)
	{
		WebElement nameTextbox = driver.findElement(By.id("signup-username"));
		nameTextbox.sendKeys(name);
		WebElement emailTextbox = driver.findElement(By.id("signup-email"));
		emailTextbox.sendKeys(email);
		WebElement passwordTextbox = driver.findElement(By.id("signup-password"));
		passwordTextbox.sendKeys(password);
		WebElement confirmPasswordTextbox = driver.findElement(By.id("signup-confirmPassword"));
		confirmPasswordTextbox.sendKeys(confirmpassword);
	}
	@And("the user click the checkbox to privacy policy and term and condition option and the user click the register button")
public void the_user_click_the_checkbox_to_privacy_policy_and_term_and_condition_option_and_the_user_click_the_register_button() {
		
WebElement termsAndConditionCheckBox = driver.findElement(By.id("terms-vms-policy"));
termsAndConditionCheckBox.click();
	WebElement registerButton = driver.findElement(By.id("signup-submit-text"));	
	registerButton.click();
	
	}


}
	
	