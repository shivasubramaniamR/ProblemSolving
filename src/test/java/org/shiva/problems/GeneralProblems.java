package org.shiva.problems;

import org.testng.annotations.Test;

public class GeneralProblems {
	
	@Test
	public void runner() {
		fibbonnaci(6);
		fibbonaciRecursion(6);
	}
	
	public void fibbonnaci(int num) {
		
		int f1=0,f2=1,f3=0;
		
		
		for(int i=0;i<num;i++) {
		 
		 System.out.print(f1+" ");
		 f3 = f1+f2;
		 f1=f2;
		 f2=f3;
		}
	}
	
	//using recursion
	int f1=0,f2=1,f3=0;
public void fibbonaciRecursion(int num) {
		
		
		
		 if(num>0) {
			 System.out.print(f1+" ");
			 f3 = f1+f2;
			 f1=f2;
			 f2=f3; 
		 
		 
		 
		 fibbonaciRecursion(num-1);
		 }
	}

}
