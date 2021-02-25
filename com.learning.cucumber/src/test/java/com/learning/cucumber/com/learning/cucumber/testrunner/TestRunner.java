package com.learning.cucumber.com.learning.cucumber.testrunner;

import org.testng.annotations.DataProvider;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)junit
@CucumberOptions(features = "features", glue = {"stepdefinitions" }, 
dryRun = true, strict = false, monochrome = true, plugin = { "pretty",
				"html:target/cucumber-html-report", "json:target/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/rerun.txt" }, 
				tags = { "@test1" })
public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	/*
	 * private TestNGCucumberRunner testNGCucumberRunner;
	 * 
	 * @BeforeClass(alwaysRun = true) public void setUpClass() {
	 * testNGCucumberRunner = new TestNGCucumberRunner(this.getClass()); }
	 * 
	 * @DataProvider(parallel = true) public Object[][] scenarios() { return
	 * testNGCucumberRunner.provideScenarios(); }
	 * 
	 * @Test(description = "Cucumber Scenarios", dataProvider = "scenarios") public
	 * void feature(PickleEventWrapper pickleEvent, CucumberFeatureWrapper
	 * cucumberFeature) throws Throwable {
	 * testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent()); }
	 * 
	 * @AfterClass(alwaysRun = true) public void tearDownClass() {
	 * testNGCucumberRunner.finish(); }
	 */
}
