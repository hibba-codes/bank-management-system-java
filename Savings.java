class Savings_Account extends Account
{
    double interestRate;
    public Savings_Account(String n, String a, double b, double rate)
    {
        super(n, a, b);
        this.interestRate = rate;
    }
    public void calculateInterest()
    {
        double interest = getBalance() * interestRate / 100;
        setBalance(getBalance() + interest);
        System.out.println("Interest Added = " + interest);
        System.out.println("Updated Balance = " + getBalance());
    }
}
