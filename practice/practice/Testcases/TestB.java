package Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestB extends TestBase{
    
    @BeforeClass
    public void setUp() {
    	launchBrowser();
        System.out.println("TestB setUp");
    }
    
    @Test(/*groups={"1"}, dependsOnGroups={"3", "2"}*/)
    public void method1() {
        System.out.println("TestB method1");
    }

    @Test(/*groups={"2"}, dependsOnGroups={"3"}*/)
    public void method2() {
        System.out.println("TestB method2");
    }

    @Test(dependsOnMethods= {"Testcases.TestA.method2"})
    public void method3() {
        System.out.println("TestB method3");
    }
    
    @Test(dependsOnMethods= {"method3"})
    public void method4() {
        System.out.println("TestB method4");
    }
    @AfterClass
    private void quit() {
    	tearDown();
    	System.out.println("TestB quit");

	}
}
