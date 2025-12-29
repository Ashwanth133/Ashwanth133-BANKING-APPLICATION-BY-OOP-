package model;
public class Account {
    private int id;
    private String name;
    private String pass;
    private double balance;


    public Account(int id, String name, String pass, int balance) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.balance=0.0;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }


}
