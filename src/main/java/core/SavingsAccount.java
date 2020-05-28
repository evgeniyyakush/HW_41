package core;

public class SavingsAccount {
	  
	  int balance;
	  
	  public SavingsAccount(int initialBalance){
	    balance = initialBalance;
	  }

	  public void checkBalance(){
	    System.out.println("Hello!");
	    System.out.println("Your balance is "+balance);
	  }

	  public void deposit(int amountToDeposit){
	    int afterDeposit = balance + amountToDeposit;
	    balance = afterDeposit;
	    System.out.println("You just deposited "+ amountToDeposit);
	  
	  }
	  //   public void withdraw(int amountToWithdraw){
	  //   int afterWithdraw = balance - amountToWithdraw;
	  //   balance = afterWithdraw;
	  //   System.out.println("You just withdrew "+ amountToWithdraw);
	  // }

	    public int withdraw(int amountToWithdraw){
	    int afterWithdraw = balance - amountToWithdraw;
	    balance = afterWithdraw;
	    //System.out.println("You just withdrew "+ amountToWithdraw);
	    return amountToWithdraw;
	  }

	  public static void main(String[] args){
	    SavingsAccount savings = new SavingsAccount(2000);
	    savings.checkBalance();
	    savings.deposit(222);
	    savings.checkBalance();
	    System.out.println();
	    
	    savings.withdraw(22);
	    
	  }       
	}



