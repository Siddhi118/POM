package PomObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import CommonUtils.WebDriverUtil;

public class OrganizationInfoPage {

	
	//identify organization name 
	@FindBy(name="accountname")
	private WebElement organzationanmetextfeild;

	public WebElement getOrganzationanmetextfeild() {
		return organzationanmetextfeild;
	}
	
	//identify radio btn
	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	WebElement Radiobtn;

	public WebElement getRadiobtn() {
		return Radiobtn;
	}
	
	// idetntify the dropdown for group radio bn 
	@FindBy(name="assigned_group_id")
	private WebElement dropdown;

	public WebElement getDropdown() {
		return dropdown;
	}
	
	
	// identify save buttn 
	@FindBy(xpath="(//input[@name='button'])[3]")
	private WebElement savebtn;

	public WebElement getSavebtn() {
		return savebtn;
	}
	
	// create a parateterized constructor 
	public OrganizationInfoPage(WebDriver d) {
		PageFactory.initElements(d, this);
		
	}
	
	//create a method 
	public void OrganizatinInfo(String orgnamedata , String groupdata) {
		
		WebDriverUtil wutil = new WebDriverUtil();
		
		// enter organization name 
		organzationanmetextfeild.sendKeys(orgnamedata);
		
		//click on radio btn
		Radiobtn.click();
		
		// handel dropdown 
		wutil.handeldropdown(dropdown, groupdata);
		
//		click on save btn 
		savebtn.click();
		
	
	}

	

	
	
}
