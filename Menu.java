package Project;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class Menu extends Account{
	Scanner sc=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##00.00");

	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();

public void getlogin() throws IOException{
	int x=1;
	do{
	 	 try{
	 		 data.put(978618, 1212);
	 		 data.put(960155, 8899);
	 		 
			 System.out.println("Welcome to the ATM");
			 System.out.println("Enter your customer number");
			 setCustomerNumber(sc.nextInt());
			 
			 System.out.println("Enter your PIN number: ");
			 setPinNumber(sc.nextInt());
		 }catch (Exception e){
			 System.out.println("Invalid char(s).only number");
			 x=2;
		 }
	 	 int cn = getCustomerNumber();
	 	 int pn = getPinNumber();
	 	 //particluar key mapped on hashmap or not i can use this key
	 	 if(data.containsKey(cn) && data.get(cn) == pn){
	 		 getAccountType();
	 	 }else
	 		 System.out.println("Wrong Customer Number or Pin Number");
		 }while(x==1);
}
	 
public void getAccountType(){
	System.out.println("Select the Account you Want to Access:");
	System.out.println("Type1-checking Account");
	System.out.println("Type2-Saving Account");
	System.out.println("Type3-Exit");
			 
	int selection=sc.nextInt();
			 
	switch(selection){
		case 1:
				 getChecking();
				 break;
		case 2:
				 getSaving();
				 break;
		case 3:
				 System.out.println("Thank You for using ATM,bye:");
				 break;
		default:
				 System.out.println("Invalid choice");
				 getAccountType();			
			 }
		 }

private void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Fouds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice: ");
		
		int selection = sc.nextInt();
		
		switch(selection){
		case 1:
			System.out.println("Saving Account Balance: " +moneyFormat.format(getSavingbalance()));
			getAccountType();
			break;
		case 2:
			getsavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getsavingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using this ATM, bye.");
			break;
		default:
			System.out.println("Invalid Choice");
			getChecking();
		}
			
		}

private void getChecking() {
			System.out.println("Checking Account: ");
			System.out.println("Type 1 - View Balance");
			System.out.println("Type 2 - Withdraw Funds");
			System.out.println("Type 3 - Deposit Fouds");
			System.out.println("Type 4 - Exit");
			System.out.println("Choice: ");
			
			int selection = sc.nextInt();
			
			switch(selection){
			case 1:
				System.out.println("Checking Account Balance: " +moneyFormat.format(getCheckingBalance()));
				getAccountType();
				break;
			case 2:
				getCheckingWithdrawInput();
				getAccountType();
				break;
			case 3:
				getCheckingDepositInput();
				getAccountType();
				break;
			case 4:
				System.out.println("Thank you for using this ATM, bye.");
				break;
			default:
				System.out.println("Invalid Choice");
				getChecking();
			}
			
		}

}








