public class EncapsulationBankAccount {
    private double balance;
    private String accountNumber;
    private String ownerName;

    public EncapsulationBankAccount(String accountNumber , String ownerName)
    {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;

    }

    //controlled access with validation
    public void deposit(double amount)
    {
        if(amount>0)
        {
            balance = balance+ amount;
            System.out.println("Deposited: $"+ amount);

        }
        else{
            System.out.println("Invalid deposit amount");
        }
    }
    public boolean withdraw(double amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance -= amount;
            System.out.println("Withdrawn: $"+ amount);
            return true;

        }
        else {
            System.out.println("Invalid withdrawal amount");
            return false;
        }


    }
    public double getBalance()
    {
        return balance;
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    public String getOwnerName()
    {
        return ownerName;
    }

    public static void main(String[] args) {
        EncapsulationBankAccount eb = new EncapsulationBankAccount("12344","Karan");
        eb.deposit(323002);
        eb.deposit(70000);
        System.out.println(eb.getBalance());
        eb.withdraw(369930);
        System.out.println(eb.getBalance());


    }

}
