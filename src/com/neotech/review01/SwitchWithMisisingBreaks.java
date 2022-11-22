package com.neotech.review01;

public class SwitchWithMisisingBreaks {
	public static void main(String[] args) {
		
	 int number = 4;
	 
	 switch (number) {
	 case 2:
		 System.out.println("2");
	 case 3:
		 System.out.println("3");
	 case 4:
		 System.out.println("4");
	 case 5:
		 System.out.println("5");
		 break;
	 case 6:
		 System.out.println("6");
		 
		 //limitations of switch:
		 // 1. CANNOT have duplicate cases 
		 // 2. you should be careful with breaks
		 // 3. CANNOT use logical operators like if-else
		 // 4. you CANNOT use double 
	 }
	}

}
