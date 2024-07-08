import java.util.Scanner;

public class Account {
    String name, accnumber, type;
    double balance = 0;

    Account(String n, String num, String type, double amount)
    {
        this.name = n;
        this.accnumber = num;
        this.type = type;
        this.balance = amount;
    }
    void depAmount(double amount)
    {
        if(amount >= 500)
        {
            this.balance += amount;
        }
        else
        {
            System.out.println("You can't deposit below $500 ");
        }
    }
    void withdraw(double amount)
    {
        if(this.balance > amount)
        {
            this.balance = this.balance - amount;
        }
        else{
            System.out.println("Your current balnce is" + this.balance+ "You can withdraw less than your current balance");
        }
    }
    void computeInterest()
    {
        this.balance = this.balance + ((5 * this.balance) / 100);
    }

    void showBalance()
    {
        System.out.println("Name:"+this.name);
        System.out.println("Account Type:"+this.type);
        System.out.println("Current Balance:" + this.balance);
    }
    public static void main(String[] args)
    {
        int choice;
        double amount;
        Scanner input = new Scanner(System.in);
        System.out.println("Pick up your choice 1.Current Account 2.Savings Account");
        choice = input.nextInt();
        if(choice==2)
        {
            SavingsAccount acc =new SavingsAccount("Rahim","ACC","Savings",1000);
            acc.showBalance();
            System.out.println("Pick up your choice 1.Deposite 2.Withdraw 3.Show Balance after interest");
            choice = input.nextInt();
            if(choice==1)
            {
                System.out.println("Deposite amount :");
                amount=input.nextDouble();
                acc.depAmount(amount);
                acc.showBalance();
            }
            else if(choice==2)
            {
                System.out.println("Withdraw amount :");
                amount=input.nextDouble();
                acc.withdraw(amount);
                acc.showBalance();
            }
            else
            {
                acc.computeInterest();
                acc.showBalance();
            }
        }
        else
        {
            CurrentAccount acc =new CurrentAccount("Rahim","ACC","Savings",1000);
            acc.showBalance();
            System.out.println("Pick up your choice 1.Deposite 2.Withdraw");
            choice = input.nextInt();
            if(choice==1)
            {
                System.out.println("Deposite amount :");
                amount=input.nextDouble();
                acc.depAmount(amount);
                acc.showBalance();
            }
            else
            {
                System.out.println("Withdraw amount :");
                amount=input.nextDouble();
                acc.withdraw(amount);
                acc.showBalance();
            }
        }
    }
}

class SavingsAccount extends Account
{
    SavingsAccount(String n, String num, String type, double amount)
    {
        super(n,num,type,amount);
    }
}

class CurrentAccount extends Account
{
    CurrentAccount(String n, String num, String type, double amount)
    {
        super(n,num,type,amount);
    }
}