package Loops;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// Loops are used to do something or run a line of code, repeat it until a condition is met
		
		// Types of Loops-
		// For Loops - good to use when you know the number of times that you need to iterate (repeat the code)
		// How to declare a FOR loop
		// 3 parts of for loop - For (variable, condition - a boolean expression, increase increment)
		//Code in between curly braces is the code that is going to be run
	//	for (int i = 0; i < 10; i++ ) {
//			System.out.println(i);
//		}
	//	for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
	//	}
//		for (int i = 0; i < 100; i++) {
//			if (i % 2 == 0) {
//			System.out.println(i);
//			}
//		}
//
//		WHILE loop - good when you do something over and over until a condition is met, but you don't know how many times it will need to be repeated

int x = 0;		
//while (x < 10) {	
//	System.out.println(x);
//	x++;
//	}

do {
	System.out.println(x);
		x++;
	} while (x<10);
}
}
