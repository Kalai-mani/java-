package Project;


	import java.text.DecimalFormat;
	import java.util.Scanner;

	public class Account   {
		
		  private int customerNumber;
		  private int pinNumber;
		  private double checkingBalance=0;
		  private double savingbalance=5000;
		  
		  Scanner input =new Scanner(System.in);
		  DecimalFormat moneyFormat=new DecimalFormat("'$'####,##00.00");
			 
		  public int setCustomerNumber(int customerNumber){
			  this.customerNumber=customerNumber;
			  return customerNumber; 
		  }
		  public int getCustomerNumber() {
			  return customerNumber;
		  }
			
		  public int setPinNumber(int pinNumber) {
			  this.pinNumber = pinNumber;
			  return pinNumber;
		  }
		  public int getPinNumber() {
			  return pinNumber;
		  }

		  public double getCheckingBalance() {
			  return checkingBalance;
		  }
		  
		  public double getSavingbalance() {
				return savingbalance;
			}
		  
			public double calcCheckingWithdraw(double amount){
				checkingBalance=(checkingBalance-amount);
				return checkingBalance;	
			}
			
			public double calcSavingWithdraw(double amount){
				savingbalance=(savingbalance-amount);
				return savingbalance;	
			}
			
			public double calcCheckingDeposit(double amount){
				checkingBalance=(checkingBalance+amount);
				return amount;	
			}
			
			public double calcSavingDeposit(double amount){
				savingbalance=(savingbalance+amount);
				return amount;
			}
			
			public void getCheckingWithdrawInput(){
				System.out.println("Checking Account Balance:"+moneyFormat.format(checkingBalance));
				System.out.println("Amount you want to Withdraw from Checking Account:");
				double amount=input.nextDouble();
				
				if((checkingBalance-amount)>=0){
					calcCheckingWithdraw(amount);
					System.out.println("New checking account balance:"+moneyFormat.format(checkingBalance));
				} else {
					System.out.println("Balance cannot be Nagative.");
					
				}
			}

			public void getsavingWithdrawInput(){
				System.out.println("Saving Account Balance:"+moneyFormat.format(savingbalance));
				System.out.println("Amount you want to Withdraw from Saving Account:");
				double amount=input.nextDouble();
				if((savingbalance-amount)>=0){
					calcSavingWithdraw(amount);
					System.out.println("New saving account balance:"+moneyFormat.format(savingbalance));
				} else {
					System.out.println("Balance cannot be Nagative.");
				}
		 
			}
			
			public void getCheckingDepositInput(){
					System.out.println("cheaking Account Balance:"+moneyFormat.format(checkingBalance));
					System.out.println("Amount you want to Deposit from Checking Account:");
					double amount=input.nextDouble();
					if((checkingBalance+amount)>=0){
						calcCheckingDeposit(amount);
						System.out.println("New Checking account balance:"+moneyFormat.format(checkingBalance));
					} else {
						System.out.println("Balance cannot be Nagative.");
					}
			}
			
			public void getsavingDepositInput(){
						System.out.println("Saving Account Balance:"+moneyFormat.format(savingbalance));
						System.out.println("Amount you want to Deposit from Saving Account:");
						double amount=input.nextDouble();
						if((savingbalance+amount)>=0){
							calcSavingDeposit(amount);
							System.out.println("New saving account balance:"+moneyFormat.format(savingbalance));
						} else {
							System.out.println("Balance cannot be Nagative.");
					
						}
			}


		
	}





