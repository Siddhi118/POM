package BasicPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import CommonUtils.ExcelUtil;
import CommonUtils.JavaUtil;
import CommonUtils.PropertyFileUtil;
import CommonUtils.WebDriverUtil;
import PomObjectRepository.HomePage;
import PomObjectRepository.LoginPage;
import PomObjectRepository.OrganizationInfoPage;
import PomObjectRepository.OrganizationPage;

public class BasePage {

	public static WebDriver d;
	public static void main(String[] args) throws IOException, InterruptedException {
		
//		public WebDriver d;
		
		// objet creation
		PropertyFileUtil util = new PropertyFileUtil();
		WebDriverUtil wutil = new WebDriverUtil();
		JavaUtil jutil = new JavaUtil();
		
		// to read data from property file
		String BROWSER = util.getDataFromPropertyFile("Browser");
		String URL = util.getDataFromPropertyFile("Url");
		String USERNAME = util.getDataFromPropertyFile("Username");
		String PASSWORD = util.getDataFromPropertyFile("Password");
		
		//to read data from excel file 
		ExcelUtil eutil = new ExcelUtil();
		String ORGNAME = eutil.getDataFromExcel("Organizations", 0, 1);
		String GROUP = eutil.getDataFromExcel("Organizations", 1, 1);
		
		// to launch the Browser 
		if(BROWSER.equals("Chrome")) {
			d= new ChromeDriver();
		}else if(BROWSER.equals("Edge")) {
			d= new EdgeDriver();
		}else {
			d= new FirefoxDriver();
		}
		
		
		// to launch url
		d.get(URL);
		
		// create object of login page
		LoginPage lp= new LoginPage(d);
		
		//login to application
		lp.Login(USERNAME, PASSWORD);
		
		// cretae object of home page 
		HomePage hp = new HomePage(d);
		
		//click on organization
		hp.Home(d);

		
		// create object for organization page
		OrganizationPage op= new OrganizationPage(d);
		
		//click on create orgazation(+)
		op.Organization();
		
		// enter organization info page 
		OrganizationInfoPage oip = new OrganizationInfoPage(d);
		oip.OrganizatinInfo(ORGNAME+jutil.getRandomNumber(), GROUP);
		
		
		 Thread.sleep(2000);		 
		// mousehover on image 
		 hp.Homes(d);

		
			}

}
