package com.AE;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        BankAccount sfcu = new BankAccount();
//        sfcu.setAccountNumber("12345");
//        sfcu.setBalance(100);
//        sfcu.depositBalance(50);
//        System.out.println(sfcu.getBalance());
//        sfcu.withDrawelBalance(160);
//        System.out.println(sfcu.getBalance());
//        sfcu.withDrawelBalance(149);
//        System.out.println(sfcu.getBalance());
//        System.out.println("My account number is " + sfcu.getAccountNumber() + ".");

        BankAccount angelAccount = new BankAccount();
        angelAccount.setAccountNumber("12345");
        angelAccount.setBalance(0.00);
        angelAccount.setCustomerName("Angel Rodriguez");
        angelAccount.setEmail("myemail@angel.com");
        angelAccount.setPhoneNumber("(305)123-4567");


        angelAccount.withDrawelBalance(100);
        angelAccount.depositBalance(50);
        angelAccount.withDrawelBalance(100);
        angelAccount.depositBalance(51);
        angelAccount.withDrawelBalance(100);

        BankAccount frifiAccount = new BankAccount("123466", 0.00, "Frifi Adams", "Frifi@Elfrida.com", "(305)891-2345");
        frifiAccount.getBalance();
        BankAccount timAccount = new BankAccount("Tim", "Tim@email.com", "12345");
        System.out.println(timAccount.getCustomerName() + " " + timAccount.getPhoneNumber());

        VipCustomer arissa = new VipCustomer("Arissa", 1000, "arissa@rodriguez.com");
        VipCustomer angelo = new VipCustomer("Angelo", 1000);
        System.out.println("Vip customer " + arissa.getName() + "'s" + " limit is " + arissa.getCreditLimit() + " and email address is " + arissa.getEmailAddress() + ".");
        System.out.println("Vip customer " + angelo.getName() + "'s" + " limit is " + angelo.getCreditLimit() + " and email address is " + angelo.getEmailAddress() + ".");
        VipCustomer defaultCustomer = new VipCustomer();
        System.out.println(defaultCustomer.getName());

    }
}
