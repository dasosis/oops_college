/* WAP to create a class "Account" with two overloaded constructors.
First constructor is used to initialize the name of the account holder, account number, initial amount in account.
Second constructor is used to initialize the name of the account holder, account number, address, type of account, and current balance.

Account class having methods:
Display - to display the details of the account.
Deposit - to deposit
Withdraw - to withdraw
CheckBalance - to check balance

create object of Account class and use them.
*/

import java.util.Scanner;

class Account {
    String name;
    int account_number;
    int balance;
    String address;
    String account_type;

    Account(String input_name,int input_account_number, int initial_amount){
        name = input_name;
        account_number = input_account_number;
        balance = initial_amount;
    }

    Account(String input_name,int input_account_number, String input_address,String type,int account_balance){
        name = input_name;
        account_number = input_account_number;
        balance = account_balance;
        address = input_address;
        account_type = type;
    }

    public void Display(){
        System.out.println("-----------Account Details-----------");
        System.out.println("Name of Account holder : "+name);
        System.out.println("Account Number : "+account_number);
        System.out.println("Account Balance : "+balance);
        System.out.println("Account holder address : "+address);
        System.out.println("Account type : "+account_type);
        System.out.println("--------------------------------------");
    }
    public void Deposit(int amount){
        balance+=amount;
        System.out.println("Deposit Successful, Deposit Amount : "+amount);
    }
    public boolean Withdraw(int amount){
        if (amount<= balance){
            balance -= amount;
            return true;
        }
        else{
            return false;
        }
    }
    public int CheckBalance(){
        return balance;
    }
}

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the name of the account holder : ");
        String name = sc.nextLine();
        System.out.println("Enter the account number : ");
        int account_number = sc.nextInt();
        System.out.println("Enter the account balance : ");
        int balance = sc.nextInt();

        Account A1 = new Account(name, account_number, balance);

        sc.nextLine();

        System.out.println("Enter the name of the account holder : ");
        name = sc.nextLine();
        System.out.println("Enter the account number : ");
        account_number = sc.nextInt();
        System.out.println("Enter the account balance : ");
        balance = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the account holder address : ");
        String address = sc.nextLine();
        System.out.println("Enter the account type : ");
        String type = sc.nextLine();
        Account A2 = new Account(name, account_number,address, type, balance);


        A1.Display();
        A2.Display();

        System.out.println("Enter Withdraw amount :");
        int withdraw = sc.nextInt();
        System.out.println(A1.Withdraw(withdraw)?"Successful Withdrawl":"Withdrawl Failure");
        System.out.println("A1 Account Balance : "+A1.CheckBalance());

        System.out.println("Enter Withdraw amount :");
        withdraw = sc.nextInt();
        System.out.println(A2.Withdraw(withdraw)?"Successful Withdrawl":"Withdrawl Failure ");
        System.out.println("A2 Account Balance : "+A2.CheckBalance());
        
        
        System.out.println("Enter the Deposit amount :");
        int deposit = sc.nextInt();
        A1.Deposit(deposit);
        System.out.println("A1 Account Balance : "+A1.CheckBalance());

        System.out.println("Enter the Deposit amount :");
        deposit = sc.nextInt();
        A2.Deposit(deposit);
        System.out.println("A2 Account Balance : "+A2.CheckBalance());
    }
}
