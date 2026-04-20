package com.app;

public class AccountAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BanKAccount account1 = new BanKAccount("123456789", "John Doe", 1000.0);
		BanKAccount account2 = new BanKAccount("987654321", "Jane Smith", 500.0);
		BanKAccount account3 = new BanKAccount("555555555", "Alice Johnson", 2000.0);

		account1.deposit(500.0);
		System.out.println("Account 1 Balance: " + account1.checkBalance());
		account1.withdraw(200.0);
		System.out.println("Account 1 Balance: " + account1.checkBalance());
		
		

	}

}
