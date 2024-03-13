package PomObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtils.WebDriverUtil;

public class HomePage extends WebDriverUtil{

	// Identify Organization 
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement org;
	
	//Identify contact 
	@FindBy(xpath="//a[text()='Contacts]'")
	private WebElement contact;
	
	
	public WebElement getOrg() {
		return org;
	}


	public WebElement getContact() {
		return contact;
	}


	public WebElement getImg() {
		return img;
	}


	public WebElement getSignoutbtn() {
		return signoutbtn;
	}


	// Identify the image 
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement img;
	
	
	// click on signout 
	@FindBy(xpath="//a[text()='Sign Out']")
	private  WebElement signoutbtn;
	
	
	//create a paratemerized constructor 
	public HomePage(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	// create a method 
	public void Home(WebDriver d) {
		
		
		//click on organization
		org.click();
		
	}
	
		public void Homes(WebDriver d) {
		// mouse hovr on img
		mousehover(d, img);
		
		// click on signout 
		signoutbtn.click();
		
	}
}
