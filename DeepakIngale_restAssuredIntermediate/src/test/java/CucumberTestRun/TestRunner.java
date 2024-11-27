package CucumberTestRun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)
@CucumberOptions
(features="C:/Users/dipak.ingale/eclipse-workspace/DeepakIngale_restAssuredIntermediate/src/test/java/Feature"
,glue="stepdefination"
,plugin="json:target/jsonReports/cucumber-reports.json"
,monochrome = true)
public class TestRunner {

}
