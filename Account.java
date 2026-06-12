abstract class Account
{
    private String accountHolderName;
    private String  accountNo;
    private double balance;

    public Account(String n, String a, double b)
    {
        this.accountHolderName = n;
        this.accountNo = a;
        this.balance = b;
    }
    public void setBalance(double b)
    {
        this.balance = b;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        balance += amount;
    }
    public void withdraw(double amount)
    {
        if(amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient Amount!");
        }
    }
    public void showAccountInfo()
    {
        System.out.println("Account Holder Name = " + accountHolderName);
        System.out.println("Account No = " + accountNo);
        System.out.println("Balance = " + balance);
    }
    abstract public void calculateInterest();
}
