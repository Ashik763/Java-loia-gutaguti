    import java.util.Scanner;

class CurrentAccount
{
    String name, acc_number, type;
    double balance = 0;

    CurrentAccount(String n, String num, String type, double amount)
    {
        this.name = n;
        this.acc_number = num;
        this.type = type;
        this.balance = amount;
    }

    void depAmount(double amount)
    {
        if(amount >= 500 && amount <= 50000) {
            this.balance += amount;
        }
    }

    void withdraw(double amount)
    {
        if(this.balance > amount)
        {
            if((this.balance-amount)<500)
            {
                System.out.println("You cant withdraw "+amount+" as your balance will be less than 500$ after withdrawel");
            }
            else
            {
                this.balance = this.balance - amount;
            }
        }
        else
        {
            System.out.println("Your current balance is " + this.balance+ " You can withdraw less than your current balance");
        }
    }

    void showBalance()
    {
        if(this.balance<500)
        {
            System.out.println("Name: " + this.name);
            System.out.println("Current Balance: " + this.balance);
            System.out.println("Your balance is less than 500$ Service charged imposed");
        }
        else
        {
            System.out.println("Name: " + this.name);
            System.out.println("Current Balance: " + this.balance);
        }
    }
}

class SavingsAccount
{
    String name, acc_number, type;
    double balance = 0;

    SavingsAccount(String n, String num, String type, double amount)
    {
        this.name = n;
        this.acc_number = num;
        this.type = type;
        this.balance = amount;
    }

    void depAmount(double amount)
    {
        if(amount >= 500 && amount <= 50000) {
            this.balance += amount;
        }
    }

    void withdraw(double amount)
    {
        if(this.balance > amount)
        {
            this.balance = this.balance - amount;
        }
        else
        {
            System.out.println("Your current balance is " + this.balance+ " You can withdraw less than your current balance");
        }
    }

    void showBalance()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Current Balance: " + this.balance);
    }

    void computeInterest()
    {
        this.balance = this.balance + (this.balance/20);
    }
}

public class Account {
    void current()
    {
        int choice;
        double amount;
        Scanner input =new Scanner(System.in);
        CurrentAccount acc =new CurrentAccount("Rahim","ACC-123","Current",1000);
        System.out.println("Pick up your choice  1.Withdraw  2.Deposite");
        choice = input.nextInt();
        if(choice==1)
        {
            System.out.println("How Much Money Do you want to withdraw?");
            amount = input.nextDouble();
            acc.withdraw(amount);
            acc.showBalance();
        }
        else
        {
            System.out.println("How Much Money Do you want to deposite?");
            amount = input.nextDouble();
            acc.depAmount(amount);
            acc.showBalance();
        }
    }
    void savings()
    {
        int choice;
        double amount;
        Scanner input = new Scanner(System.in);
        SavingsAccount acc = new SavingsAccount("Rahim","ACC-123","Current",1000);
        System.out.println("Pick up your choice  1.Withdraw  2.Deposite  3.Balance after interest");
        choice = input.nextInt();
        if(choice==1)
        {
            System.out.println("How Much Money Do you want to withdraw?");
            amount = input.nextDouble();
            acc.withdraw(amount);
            acc.showBalance();
        }
        else if(choice==2)
        {
            System.out.println("How Much Money Do you want to deposite?");
            amount = input.nextDouble();
            acc.depAmount(amount);
            acc.showBalance();
        }
        else
        {
            acc.computeInterest();
            acc.showBalance();
        }
    }
    public static void main (String[] args)
    {
        int choice;
        Scanner input = new Scanner(System.in);
        Account acc = new Account();
        System.out.println("Pick up your choice  1.Current Account  2.Savings Account ");
        choice = input.nextInt();
        while (true)
        {
            if(choice==1)
                acc.current();
            else
                acc.savings();
        }

    }
}


