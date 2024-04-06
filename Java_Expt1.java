package Java_Expts;

import java.util.Scanner;

class BankAccount{
    private final String acc_no;
    private final String acc_name;
    private double bankBalance;
    public BankAccount(String acc_no,String acc_name,double bankBalance){
        this.acc_no=acc_no;
        this.acc_name=acc_name;
        this.bankBalance=bankBalance;
    }
    
    public void display(){
        System.out.println("Account Number: "+acc_no);
        System.out.println("Account Holder's Name: "+acc_name);
        System.out.println("Balance: "+bankBalance);
        
    }
    
    public void deposit(double depositAmount){
        bankBalance+=depositAmount;
        System.out.print(depositAmount+" Deposited Successfully");
        System.out.println();
    }
    
    public void withdraw(double withdrawAmount){
        if(withdrawAmount>bankBalance){
            System.out.println("Insufficient Balance");
        }
        else{
            bankBalance-=withdrawAmount;
            System.out.println("Amount withdrawn Successfully");
            System.out.println("Balance: "+bankBalance);
        }
     
    }
}

public class Java_Expt1 {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accountNumber=s.nextLine();
        System.out.print("Enter Account Holder's Name: ");
        String accountName=s.nextLine();
        System.out.print("Enter Balance: ");
        double accountBalance=s.nextDouble();
        
        BankAccount acc=new BankAccount(accountNumber,accountName,accountBalance);
        
        System.out.print("Enter Amount to be Deposited: ");
        double depositAmount=s.nextDouble();
        acc.deposit(depositAmount);
        acc.display();
        
        System.out.print("Enter Amount to be Withdrawn: ");
        double withdrawAmount=s.nextDouble();
        acc.withdraw(withdrawAmount);
        acc.display();

        s.close();
    }
    
}