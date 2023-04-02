package login;
import java.util.Scanner;
public class AccountLogin {
	String userId= "pivotAdim";
	String actualCode = "Admin";
	String EnterUserId;
	int EnteredCode;
	int counter=3;
	
	//Scanner sc = new Scanner(System.in);
	Scanner cr = new Scanner(System.in);
	
	void EnterPinCode() {
		for(int counter = 1;counter<=3;counter++)
		{
			System.out.println("ENTER THE USER ID::");
			//EnterUserId = sc.nextSting();
			System.out.println("ENTER THE CODE::");
			EnteredCode = cr.nextInt();
			if(userId==EnterUserId) {
				System.out.println("user id is correct");
				
				//break;
			}
				else if(actualCode == EnteredCode ) {
					System.out.println("you are entered a right passwrod");
				}
			}
			    if(counter ==3 ) { 
			System.out.println("card blocked ");
			}
			else
			{
			
				System.out.println("entered user id and password wrong");
			}
		}
		
		
	
//}

//}
}
	
//}
		
			



