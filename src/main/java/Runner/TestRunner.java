package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/kunal/workspace/FreeCRMBDDFramework/src/main/java/Features/login.feature"
		,glue={"stepDefinations"}
		//,format={"pretty","html:test-output"}
		
		)
public class TestRunner {

}
