package entities;

public class BussinesAccountPlus extends BusinessAccount {
	
	
	public void loan(double amount) {
		balance -= amount + 2.0;
	}

}
