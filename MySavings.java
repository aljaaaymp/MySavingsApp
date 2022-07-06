
public class MySavings {

	private double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw() {
		this.balance -= balance;
	}

}
