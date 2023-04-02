package assignMent;

import java.util.Scanner;

public class SquareMain {

	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		System.out.println("enter value ");
		int  num = sr.nextInt();
		System.out.println("Select operation");
		char operation = sr.next().charAt(0);
		SquareClass sc =new SquareClass();
		//uareClass.num = sc.nextString(); 
		//String operation = "square";
		switch(operation) { 
		case 's':
			System.out.print("square of  a number" +(num*num));
			break;
		case 'c':
			System.out.print("square of  a number" +(num*num*num));
			break;
			default:
				System.out.println("Invalid Excution");
	}
		
		}
	}

