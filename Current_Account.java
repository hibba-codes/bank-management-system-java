class Current_Account extends Account
{
    public Current_Account(String n, String a,double b )
    {
        super(n, a, b);
    }

    @Override
    public void calculateInterest() {
        System.out.println("No Interest for Current Account");
    }
}

