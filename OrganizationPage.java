package PomObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	// identify create organization 
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement createorganization;

	
	//call getter setter method
	public WebElement getCreateorganization() {
		return createorganization;
	}
	
	// create a parateterized constructor 
		public OrganizationPage(WebDriver d) {
			PageFactory.initElements(d, this);
			
		}
		
		//create method 
		public void Organization() {
			//click on create orgazation(+)
			createorganization.click();
		}

}
