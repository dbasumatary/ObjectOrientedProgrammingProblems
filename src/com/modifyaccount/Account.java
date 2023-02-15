package com.modifyaccount;

import java.util.Scanner;

public class Account {
    private final int  PIN = 1234;
    private int TOTAL_BALANCE = 100000;
    public int getTOTAL_BALANCE(){
        return TOTAL_BALANCE;
    }
    public int debit(int amount){
        if (amount < TOTAL_BALANCE){
            TOTAL_BALANCE -= amount;
            return TOTAL_BALANCE;
        }
        else if(amount > TOTAL_BALANCE){
            return 0;
        }
        return 0;
    }
    public int getPIN() {
        return PIN;
    }
}
