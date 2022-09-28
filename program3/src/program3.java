// Application: Program 1
// Name: Divine Igihozo
// GitHub User: Ndigihozo
// Date: Sep 28, 2022
// Version: 1.0
// Description: Using while loop to test user input

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Activating Input
		
		Scanner input = new Scanner (System.in);
		
		
		// Collecting input from the user
		
		System.out.println("What is your name ? ");
		String name=input.next();

		
		System.out.println("Enter a number between 0 and 100 ");
		int num=input.nextInt();
		
		// Testing the input if it's between 0 and 100
		
		while (!(num>0 && num<100)) {

				System.out.println("Re-enter a number between 0 and 100");
				num=input.nextInt();
					
		}
		
		System.out.println("Thank you for your input, " + name);

		
		// Counting down from user input 
		
		for(int counter=num; counter>=0;counter--) {
			
			System.out.println(" Did great ^_^ ");
			
			
		}			
		}
		
	

	}


