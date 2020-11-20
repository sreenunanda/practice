package Testcases;

public class PrintNumbers {
	 static void printNos(int n) 
	    { 
	        if(n > 0) 
	        { 
	            printNos(n - 1); 
	            System.out.print(n + " "); 
	        } 
	        return; 
	    } 
	  
	    // Driver Code 
	    public static void main(String[] args)  
	    { 
	        printNos(10); 
	    } 
}
