package variables;

public class Bank {
	public static int currentBalance = 1000;
	public int  deposit;
	public int withdrawal;
	public int getCurrentBalance;
	public static void greeting(){
		System.out.println("welcome to HDFC Bank🫶🏦💰");
	}
	public void deposit(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Amount deposited successfully");
		
	}
	public static void withdrawal(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Amount is withdrawan successfully");
		
		
	}
	public int getCurrentBalance() {
		return currentBalance;
		
	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		greeting();
		System.out.println("balance is:" +bank.getCurrentBalance());
		bank.deposit(500);
		System.out.println("balance is:" +bank.getCurrentBalance());
		withdrawal(200);
		System.out.println("balance is:" +bank.getCurrentBalance());
		
		
	}
	

}
