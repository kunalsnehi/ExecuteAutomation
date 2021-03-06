package stepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;
import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil {
	
	private BaseUtil base;
	
	public Hook(BaseUtil base){
		
		this.base = base;
	}

	
	@Before
	public void InitializeTest(){
		
		System.out.println("Opening the browser: Chrome");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kunal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		base.driver = new ChromeDriver();
	}
	
	@After
	public void TearDownTest(Scenario scenario){
		
		if(scenario.isFailed()){
			
			System.out.println(scenario.getName());
		}
		
		System.out.println("Closing the browser : Chrome");
	}
}
