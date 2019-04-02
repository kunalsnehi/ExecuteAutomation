package stepDefinations;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;

import pages.LoginPage;
import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginEAStepDefinition extends BaseUtil {
	
	private BaseUtil base;
	
	public LoginEAStepDefinition(BaseUtil base){
		
		this.base = base;
		
		
	}
	@Given("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Throwable {
		System.out.println("Navigate to Login Page");
		base.driver.navigate().to("http://executeautomation.com/demosite/Login.html");
	}

	@Given("^I enter the following for Login$")
	public void i_enter_the_following_for_Login(DataTable table) throws Throwable {
	    
		List<User> users = new ArrayList<User>();
		users=table.asList(User.class);
		
		LoginPage page = new LoginPage(base.driver);
		for (User user: users){
		
		page.Login(user.username,user.password);
			
			 
		}
	   
	}
	
	public class User{
		 public String username;
		 public String password;
		 
		 public User(String userName,String passWord)
		 {
			 
			username= userName;
			password= passWord;
		 }
		
	}

	@Given("^I click Login button$")
	public void i_click_Login_button() throws Throwable {
		LoginPage page = new LoginPage(base.driver);
		page.ClickLogin();
	}

	@Then("^I should see the Login Page$")
	public void i_should_see_the_Login_Page() throws Throwable {
	
		Assert.assertEquals("Its not displayed",base.driver.findElement(By.id("Initial")).isDisplayed(),true);
		
		
	    
	}



}
