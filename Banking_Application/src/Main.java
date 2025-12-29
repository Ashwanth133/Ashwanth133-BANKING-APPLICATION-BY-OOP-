import model.Account;
import service.Accountservice;
import service.Userservice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Userservice userservice=new Userservice();
        Accountservice accountservice=new Accountservice();
        System.out.println("**** Banking Application 🏦 ****\n");
        while(true){
            System.out.println("******************");
            System.out.println("      MENU");
            System.out.println("******************");
            System.out.println("1.Create Account");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            System.out.println("***************\n");
            System.out.print("Enter the choice 💡: ");
            int inp=scanner.nextInt();
            if(inp==1){
                System.out.print("Enter ID :");
                int id=scanner.nextInt();
                System.out.print("Enter your name :");
                String name=scanner.next();
                System.out.print("Enter  password :");
                String pass=scanner.next();
                boolean create = userservice.createAccount(id,name,pass);
                if(create){
                    System.out.println("\nAccount Created ✅...\n");
                }
                else{
                    System.out.println("Error Try Again ❌...\n");
                }

            }

            if(inp==2){
                System.out.println("********  Login Page ⛳ ********\n");
                System.out.print("Enter your ID : ");
                int id=scanner.nextInt();
                System.out.print("Enter your password : ");
                String pass= scanner.next();
                Account login=accountservice.Login(id,pass);
                if(login!=null) {
                    System.out.println("Login Success ✅...\n");
                    System.out.println("**** WELCOME " + login.getName() + "🙏 ****");

                    while (true) {
                        System.out.println("\n***************\n");
                        System.out.println("1.Deposit");
                        System.out.println("2.Withdraw");
                        System.out.println("3.Balance Check");
                        System.out.println("4.Exit");
                        System.out.println("\n***************\n");
                        System.out.print("Enter the choice 💡: \n");
                        int choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                System.out.print("Enter Amount to Deposit 💲 : ");
                                int deposit = scanner.nextInt();
                                accountservice.deposit(deposit);
                                System.out.println("Amount Deposited ✅ ...\n");
                                System.out.println("\n***************\n");
                                break;

                            case 2:
                                System.out.print("Enter Amount to Withdraw 💲 ");
                                int withdraw = scanner.nextInt();
                                if(accountservice.withdraw(withdraw)){
                                    System.out.println("Withdrawal Success ✅...\n");
                                }
                                else {
                                    System.out.println("Balance is Too Low ❌...\n");
                                }
                                System.out.println("\n***************\n");
                                break;
                            case 3:
                                System.out.println("Your Account Balance 💲" + accountservice.getBalance() + "\n");
                                System.out.println("\n***************\n");
                                break;

                            case 4:
                                System.out.println("Thank you 😊 " + login.getName());
                                System.out.println("Exiting 😺...");

                                return ;

                            default:
                                System.out.println("Invalid choice ❌ ...");
                                System.out.println("Choose Again 🫠...");
                                System.out.println("\n***************\n");
                                break;
                        }

                    }
                }
                else{
                    System.out.println("Login Failed ❌ ...\nPlease Try Again 😊...!");
                }
            }
        }
    }
}