package Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestA extends TestBase{
    
    @BeforeClass
    public void setUp() {
    	launchBrowser();
        System.out.println("TestA setUp");
    }
    
    @Test
    public void method1() {
        System.out.println("TestA method1");
        
    }
    
    @Test
    public void method2() {
    	Assert.assertEquals(false, true);
        System.out.println("TestA method2");
    }
    

    @Test(dependsOnMethods="method1")
    public void method3() {
        System.out.println("TestA method3");
    }
    @AfterClass
    private void quit() {
    	tearDown();
    	System.out.println("TestA quit");

	}
}
