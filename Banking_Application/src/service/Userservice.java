package service;

import Datastore.DataStore;
import model.Account;
import model.User;

import java.util.List;

public class Userservice {
    DataStore dataStore ;
    public boolean createAccount(int id, String name, String pass){
        List<Account> accounts= DataStore.getAccounts();
        for(Account a:accounts){
            if(a.getId()==id){
                return false;
            }
        }
        accounts.add(new Account(id,name,pass, (int) 0.0));
        return  true;
    }

}
