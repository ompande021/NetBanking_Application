package relationship;

import java.util.Scanner;

public class Bank {
	
	Account a;
	
	public void createAccount(Account a)
	{
		if(this.a==null)
		{
			this.a=a;
			System.out.println("You'r Account created successful..\n");
			System.out.println("And your Account no. is : "+a.getAccno());
		}
		else
		{
			System.out.println("Your account already created..\n");
		}
	}
	
	public void loginToAcc()
	{
			Scanner sp=new Scanner(System.in);
			System.out.println("Enter user name:");
			String n=sp.next();
			System.out.println("Enter account no.:");
			String accno=sp.next();
			System.out.println("Enter the Pin:");
			int pd=sp.nextInt();
			if(a.getAccno().equals(accno))
			{
				if(a.getPin()==pd)
				{
					System.out.println("You login successfully..\n");
			    }
				else
				{
					System.out.println("You Enter wronge pin, Try again..\n");
				}
			}
			else
			{
				System.out.println("You Enter wronge account no., Try again..\n");
			}
		
		
	}
	
	public void deleteAcc()
	{
		if(this.a==null)
		{
			System.out.println("You have to login first....\n");
		}
		else
		{
			Scanner pi=new Scanner(System.in);
			System.out.println("Enter the Pin:");
			int psd=pi.nextInt();
			if(a.getPin()==psd)
			{
				this.a=null;
				System.out.println("You'r account deleted successfully..\n");
			}
			else
			{
				System.out.println("You enter incorrect pin, plzz try again..\n");
			}
		}
		
	}
	
	public void displyDetial()
	{
		if(this.a==null)
		{
			System.out.println("You have to login first....\n");
		}
		else
		{
			Scanner pi = new Scanner(System.in);
			System.out.println("Enter the Pin:");
			int psd=pi.nextInt();
			if(a.getPin()==psd)
			{
				System.out.println("---_-Welcome to Bank of Nepal-_---");
				System.out.println("User Name:"+ a.getName());
				System.out.println("User DOB :"+ a.getDob());
				System.out.println("Account no.:"+ a.getAccno());
	            System.out.println("User contact no.:"+ a.getCno());
	            System.out.println("City:"+ a.getCity());
	            System.out.println("User account balance:"+ a.getBalance());
			}
			else
			{
				System.out.println("You enter incorrect pin, plzz try again..\n");
			}
		}
	}
	
	public void updateDetail()
	{
		if(this.a==null)
		{
			System.out.println("You have to login first....\n");
		}
		else
		{
			Scanner pi=new Scanner(System.in);
			System.out.println("Enter the Pin:");
			int psd=pi.nextInt();
			if(psd==a.getPin())
			{
				System.out.println("Enter your choice to update \n1. Update User name \n2. Update User City \n3. Update Contact no.");
				int ch=pi.nextInt();
				switch(ch)
				{
				case 1:
				{
					System.out.println("Enter new user name:");
					String nm=pi.next();
					a.setName(nm);
					System.out.println("Your name updated successfully..\n");
				}
				break;
				case 2:
				{
					System.out.println("Enter new city:");
					String ct=pi.next();
					a.setCity(ct);
					System.out.println("Your city updated successfully..\n");
				}
				break;
				case 3:
				{
					System.out.println("Enter new user contact no.:");
					long no=pi.nextInt();
					a.setCno(no);
					System.out.println("Your contact updated successfully..\n");
				}
				break;
				default :
				{
					System.out.println("You enter wronge choice.. try again.. \n");
				}
				}
			}
			else
			{
				System.out.println("You enter incorrect pin, plzz try again..\n");
			}
			
		}
	}
	
	public void withDraw()
	{
		if(this.a==null)
		{
			System.out.println("You have to login first....\n");
		}
		else
		{
			Scanner w = new Scanner(System.in);
			System.out.println("Enter the Pin:");
			int psd=w.nextInt();
			if(a.getPin()==psd)
			{
				System.out.println("Account current balance:"+ a.getBalance());
				System.out.println("How much you want to withdraw:");
				int wm=w.nextInt();
				if(a.getBalance()>=wm)
				{
					float bl= a.getBalance()-wm;
					a.setBalance(bl);
				
					System.out.println("Withdraw succssful..");
					System.out.println("Your account current balance:"+ a.getBalance());
				}
				else
				{
					System.out.println("You have insufficient balance...!");
				}
			}
			else
			{
				System.out.println("You enter incorrect pin, plzz try again..\n");
			}
			
		}
	}
	
	public void deposit()
	{
		if(this.a==null)
		{
			System.out.println("You have to login first....\n");
		}
		else
		{
			Scanner d = new Scanner(System.in);
			System.out.println("Enter the Pin:");
			int psd=d.nextInt();
			if(a.getPin()==psd)
			{
				System.out.println("Account current balance:"+ a.getBalance());
				System.out.println("How much money you want to diposit:");
				int dm=d.nextInt();
				float bl= a.getBalance()+dm;
				a.setBalance(bl);
				
				System.out.println("Diposti succssful..");
				System.out.println("Your account current balance:"+ a.getBalance());
			}
			else
			{
				System.out.println("You enter incorrect pin, plzz try again..\n");
			}
		}		
	}
	
	public void changePswd()
	{
		Scanner np=new Scanner(System.in);
		System.out.println("Enter old pin:");
		int pd=np.nextInt();
		if(a.getPin()==pd)
		{
			System.out.println("Enter New Pin:");
			int newp=np.nextInt();
			
			a.setPin(newp);
			System.out.println("Pin change successfully...");
		}
		else
		{
			System.out.println("Enter correct pin");
		}
	}
	
	public void balanceEnquiry()
	{
		if(this.a==null)
		{
			System.out.println("You have to login first....\n");
		}
		else
		{
			Scanner e = new Scanner(System.in);
			System.out.println("Enter the Pin:");
			int psd=e.nextInt();
			if(a.getPin()==psd)
			{
				System.out.println("Your account current balance:"+ a.getBalance());
			}
			else
			{
				System.out.println("Enter correct pin");
			}
		}
	}
}
