package assignMent;

import java.util.Scanner;

	public class TankCapacityClass {
		int capacityOfTank=100;
		int bucket  ;
		int total;
		int CurrentCapacity;
		
		Scanner sr = new Scanner(System.in);
		Scanner cr = new Scanner(System.in);
	void capacity() {
		for (int counter=1 ;counter<=10; counter++) {
			
			System.out.println("Enter Number of bucket you needed" );
			bucket = sr.nextInt();
			if(bucket==10) {
				
					bucket*=10;
					System.out.println("TANK REACHED IT'S MAXIMUM CAPACITY "+bucket+ " Litre ");
				
					break;
					}
					else if(bucket<=10)
						{
						
						bucket*=10;
						System.out.println("bucket added to the tank " +bucket+ " Litre");
						}
			else {
				if(bucket>10) {
					System.out.println("***YOU CAN NOT ADD MORE WATER***");
					break;
					}
				
				 }
			
				}
			
			}
	
	}
