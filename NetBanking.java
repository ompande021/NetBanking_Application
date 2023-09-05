package relationship;

import java.util.Scanner;

public class NetBanking {
	
	public static void main(String []args)
	{
		Scanner s1 = new Scanner(System.in);
		Bank b= new Bank();
		
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter your option");
			System.out.println("1. Create Account \n2. Login into Account \n3. Delete Account \n4. Display User Details \n5. Update Details \n6. Withdraw money \n7. Diposit money \n8. Change pin no. \n9. Balance Enquiry \n10. Logout");
			System.out.print("\nEnter your option:");
			int ch = s1.nextInt();
			
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter your first name:");
				String name=s1.next();
				System.out.println("Enter your contact no.:");
				long cno=s1.nextLong();
				System.out.println("Enter your DOB (ddmmyy):");
				long dob=s1.nextLong();
				System.out.println("Enter your city:");
				String ct=s1.next();
				System.out.println("Deposit money:");
				float dm=s1.nextFloat();
				System.out.println("Set you account pin no.:");
				int pn=s1.nextInt();
				String accno = name+dob;
				b.createAccount(new Account(name, cno, ct, dob, dm, pn, accno));
				
			}
			break;
			case 2 :
			{
				b.loginToAcc();	
			}
			break;
			case 3 :
			{
				b.deleteAcc();
			}
			break;
			case 4 :
			{
				b.displyDetial();;
			}
			break;
			case 5 :
			{
				b.updateDetail();
			}
			break;
			case 6 :
			{
				b.withDraw();
			}
			break;
			case 7 :
			{
				b.deposit();
			}
			break;
			case 8 :
			{
				b.changePswd();
			}
			break;
			case 9 :
			{
				b.balanceEnquiry();
			}
			break;
			case 10 :
			{
				exit=false;
				System.out.println("Logout...");
			}
			break;
			default :
			{
				System.out.println("You enter invalid option, try again...");
			}
			}
			
		
		}
		
	}

}
