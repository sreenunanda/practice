package Testcases;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testgoogle  {
	  	public static String TEST_RUN_ID                = "8";
	    public static String TESTRAIL_USERNAME          = "venkata.sivaram@girmiti.com";
	    public static String TESTRAIL_PASSWORD          = "Girmiti01";
	    public static String RAILS_ENGINE_URL           = "http://192.168.5.117/testrail/";
	    public static final int TEST_CASE_PASSED_STATUS = 1;
	    public static final int TEST_CASE_FAILED_STATUS = 5;
	    WebDriver driver;
	    
	    @Test(description = " automation demo")
	    public void verifyTitle() throws Exception {
	       /*WebDriverManager.chromedriver().setup();
	    	driver= new ChromeDriver();
	        driver.get("https://www.google.co.in");
	        String actualTilte = driver.getTitle();
	        if (actualTilte.contains("Google")) {
	            Assert.assertTrue(actualTilte.contains("Google"));
	            testgoogle.addResultForTestCase("120254", TEST_CASE_PASSED_STATUS, "");
	        }
	else{
			testgoogle.addResultForTestCase("120254", TEST_CASE_FAILED_STATUS, "");
		}

	        driver.quit();*/
	    	 testgoogle.addResultForTestCase("369", TEST_CASE_PASSED_STATUS, "Automation Example Testing");
	    	//Assert.assertEquals(true,false);
	    }


	    public static void addResultForTestCase(String testCaseId, int status,
	            String error) throws IOException, APIException {

	        String testRunId = TEST_RUN_ID;
	        APIClient client = new APIClient(RAILS_ENGINE_URL);
	        client.setUser(TESTRAIL_USERNAME);
	        client.setPassword(TESTRAIL_PASSWORD);
	        Map data = new HashMap();
	        data.put("status_id", status);
	        data.put("comment", "Test Executed - Status updated automatically from Selenium test automation.");
	      //  Object o= client.sendGet("add_result/:get_test/:"+testCaseId);
	        //System.out.println(o.toString());
	       Object o = client.sendPost("add_result_for_case/"+testRunId+"/"+testCaseId+"",data );
	     //  Object o = client.sendPost("add_result/"+testRunId+"/"+testCaseId+"",data );
	       System.out.println(o.toString());
	    }
}
