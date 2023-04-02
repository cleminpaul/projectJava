package assignMent;

import java.util.Scanner;

public class ChocolateClass {
	float chocolate;
	float chocoBox =63;
	//float counter=1;
	
	
	Scanner sr = new Scanner(System.in);
	
void chocolateBox() {
	for (float counter=1 ;counter<=chocoBox; counter++) {
		System.out.println("Enter Number of chocolate set you needed" );
		chocolate = sr.nextFloat();
		if(chocolate==7 ) {			
					System.out.println("CHOCOLATE BOX REACHED IT'S MAXIMUM CAPACITY  of 63 chocolate ");			
					break;
					}
	
	
					else if(chocolate<=7.2)
						{
						System.out.println(5*chocolate+27+" chocolates in the box  ");					
						}
		else {
			if(chocolate>7.2) {
			System.out.println("***YOU CAN NOT ADD MORE CHOCOLATE***");
			break;
			}
		}
	}
	}
}
