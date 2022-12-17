package Correctpin;

import java.util.Scanner;

public class Pin {


	public static void main(String[] args) {
		
	    int pin=00000;
		int Password;
		int count=0;
		
		Scanner Pin =new Scanner(System.in);
		
		for(int i=1; i<=3;i++)
		{
			System.out.println("Enter the pin:");
			Password=Pin.nextInt();
			
			if(Password==pin) {
				System.out.println("Correct, Welcome back:");
				break;
			}
			else {
				count++;
				if(count>=3) {
					System.out.println("Sorry but you have been locked out:");
					break;
				}
				
				System.out.println("Incorrect, try again:");
			}
		}
		
	}

}