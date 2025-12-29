package Datastore;

import model.Account;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    private static final List<Account> accounts=new ArrayList<>();
    public static List<Account> getAccounts(){
        return accounts;
    }
}
