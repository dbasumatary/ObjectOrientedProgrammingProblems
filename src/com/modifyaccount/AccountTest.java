package com.modifyaccount;
import java.util.Scanner;
/*Program to show the money withdrawal system*/
public class AccountTest {
    public  static Account accounts = new Account();
    public static AccountTest accountTest = new AccountTest();
    public static Scanner scannerObject = new Scanner(System.in);
    public void moneyTransaction(){                              //Method to calculate the money transaction
        int debitMoney;
        int input;
        System.out.println("The total balance in your account is " + accounts.getTOTAL_BALANCE());
        System.out.print("Enter the amount to debit: ");
        debitMoney = scannerObject.nextInt();
        input = accounts.debit(debitMoney);
        if(input==0){
            System.out.println("Debit amount exceeded account balance");
        }else{
            System.out.println("Amount debited: "+ debitMoney);
            System.out.println("Amount remaining: " + input);
        }
    }
    public void accountAuthentication(){                              //Entering a pin to access the account
        System.out.println("Enter PIN to continue");
        int input = scannerObject.nextInt();
        if(input == accounts.getPIN()){
            accountTest.moneyTransaction();
        } else {
            System.out.println("Incorrect PIN");
            System.out.println("Try again next time");
        }
    }
    public static void main(String[] args) {
        accountTest.accountAuthentication();                        //Calling the method from Account class
    }
}

