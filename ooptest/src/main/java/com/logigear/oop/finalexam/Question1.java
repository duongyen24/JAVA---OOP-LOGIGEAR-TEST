package com.logigear.oop.finalexam;

public class Question1 {
	
	public static void oddNumber (int[] inputNumber) {

		for ( int i = 0; i < inputNumber.length; i++) {
					
			if(inputNumber[i] %2 != 0  ) {				
				System.out.print(inputNumber[i]+ " ");				
			}					
		}	
	}

}
