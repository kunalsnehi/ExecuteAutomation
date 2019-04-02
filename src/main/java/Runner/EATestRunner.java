package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/kunal/git/ExecuteAutomation/src/main/java/Features/LoginEA.feature"
		,glue={"stepDefinations"}
		//,format={"pretty","html:test-output"}
		
		)

public class EATestRunner {

}
