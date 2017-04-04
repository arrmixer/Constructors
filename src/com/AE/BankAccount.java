package com.AE;

/**
 * Created by Angel on 10/30/16.
 */
public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("56789",2.50,"Default address", "default email", "phoneNumber");
        System.out.println("empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber){
        //System.out.println("new constructor was called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.55, customerName, email, phoneNumber);

    }

    public void depositBalance(double amount){
        this.balance = this.balance + amount;
        System.out.println("your new balance is " + this.balance + ".");

    }

    public void withDrawelBalance(double withDrawel){
        if (this.balance - withDrawel < 0){
            System.out.println("Withdrawel is more than available!");

        }else{
            this.balance = this.balance - withDrawel;
            System.out.println("your new balance is " + this.balance + ".");
        }


    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }





    public double getBalance(){
      return this.balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }



}
