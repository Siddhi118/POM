package PomObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public WebElement getUsernametxt() {
		return Usernametxt;
	}

	public WebElement getPasswordtxt() {
		return Passwordtxt;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	//Identify username txtfeild 
	@FindBy(name="user_name")
	private WebElement Usernametxt;
	
	// identify pssword txt feild 
	@FindBy(name="user_password")
	private WebElement Passwordtxt;
	
	// identify the login button 
	@FindBy(id="submitButton")
	private  WebElement loginbtn;
	
	// create a partemerized constructor 
	public LoginPage(WebDriver d ) {
		PageFactory.initElements(d, this);
	}
	
	
	// create a method 
	public void Login(String usernamedata , String passworddata) {
		Usernametxt.sendKeys(usernamedata);
		Passwordtxt.sendKeys(passworddata);
		loginbtn.click();
	}
	
	
	}
