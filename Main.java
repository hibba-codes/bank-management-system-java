public class Main
{
    public static void main(String[] args) {

        Account[] accounts = new Account[3];
        accounts[0] = new Savings_Account("Muhammad Musa" , "HBL123", 30000, 500);
        accounts[1] = new Current_Account("Ahmed" , "HBL173" , 50000);
        accounts[2] = new Savings_Account("Ali" , "HBL103", 70000, 500);

        System.out.println("\n========Smart Banking Management System========\n");
        for(int i = 0; i < accounts.length; i++)
        {
            accounts[i].showAccountInfo();
            accounts[i].deposit(2000);
            accounts[i].withdraw(1000);
            accounts[i].calculateInterest();
            System.out.println("\n------------------------------------------");
        }
    }
} ye code ma ne likha tha iss ko github pr dalna ha
