package service;

import Datastore.DataStore;
import model.Account;

import java.util.List;

public class Accountservice {


    private int accountId;
    private double balance;

    public Account Login(int id, String pass){
        List<Account> accounts= DataStore.getAccounts();
        for(Account u:accounts){
            if(id==u.getId() && pass.equals(u.getPass())){
                return u;
            }
        }

        return null;
    }


    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance +=amount;
    }
    public boolean withdraw(double amount){
        if(balance >amount){
            balance -=amount;
            return true;
        }
        return false;
    }
}
