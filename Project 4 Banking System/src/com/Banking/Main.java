package com.Banking;



public class Main {

    public static void main(String[] args) {

        Account SathvikAccount = new Account("121212",0,"Sathvik","sathvik@xyz.com","1212121");

        SathvikAccount.DepositMoney(50);
        SathvikAccount.DepositMoney(150);

        SathvikAccount.WithDrawMoney(100);
    
    }
}