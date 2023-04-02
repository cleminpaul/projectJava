package login;

import java.util.Scanner;

public class PrimeNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean check = false;
System.out.println("Enter input number");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
for(int i= 2;i<=num/2;i++) {
	if (num%i==0) {
		check = true;
		break;
	}
}
if(!check) {
	System.out.println(num+ "is a prime number");
}
else {
	System.out.println(num + "is not a prime number");
}
}
	}


