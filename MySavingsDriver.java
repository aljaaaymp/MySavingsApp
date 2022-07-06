import java.util.Scanner;

public class MySavingsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySavings PiggyBank = new MySavings();
		Scanner scan = new Scanner(System.in);
		int choice;
		do {

			menu();
			choice = scan.nextInt();
			if (choice > 6) {
				System.out.println("Invalid input range!");
			}
			if (choice == 2) {
				PiggyBank.deposit(0.01);
				
			}
			if (choice == 3) {
				PiggyBank.deposit(0.05);
			}
			if (choice == 4) {
				PiggyBank.deposit(.10);
			}
			if (choice == 5) {
				PiggyBank.deposit(.25);
			}
			if (choice == 1) {
				System.out.println("Total cents: " + PiggyBank.getBalance());

			}
			if (choice == 6) {
				System.out.println("Total withdraw: " + PiggyBank.getBalance());
				PiggyBank.withdraw();
			}
		} while (choice != 0);
		scan.close();
	}

	public static void menu() {
		System.out.println("[1] Show total in bank");
		System.out.println("[2] Add a penny");
		System.out.println("[3] Add a nickel");
		System.out.println("[4] Add a dime");
		System.out.println("[5] Add a quarter");
		System.out.println("[6] Take money out of bank");
		System.out.println("Enter 0 to quit");
		System.out.println("Enter your choice: ");
	}

}
