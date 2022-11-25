package que3;


public class TestBanking {

    public static void main(String[] args) {
        Bank     bank = new Bank();
        Customer customer;

        // Create several customers and their accounts
        bank.addCustomer("nilesh", "darshu");
        customer = bank.getCustomer(0);
        customer.addAccount(new SavingsAccount(500.00, 0.05));
        customer.addAccount(new CheckingAccount(200.00, 400.00));

        bank.addCustomer("omkar", "radha");
        customer = bank.getCustomer(1);
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("prathmesh", "vaishnavi");
        customer = bank.getCustomer(2);
        customer.addAccount(new SavingsAccount(1500.00, 0.05));
        customer.addAccount(new CheckingAccount(200.00));

        bank.addCustomer("neha", "sakshi");
        customer = bank.getCustomer(3);
        // neha and prathmesh have a shared checking account
        customer.addAccount(bank.getCustomer(2).getAccount(1));
        customer.addAccount(new SavingsAccount(150.00, 0.05));

        // Generate a report
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");



        for ( int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++ ) {
            customer = bank.getCustomer(cust_idx);

            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());

            for ( int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++ ) {
                Account account = customer.getAccount(acct_idx);
                String  account_type = "";

                //HERE! HELP
                if (account instanceof CheckingAccount){
                    account_type = "Checking Account";
                    System.out.println(account_type + ": current balance is " + account.getBalance());
                } else {
                    account_type = "Savings Account";
                    System.out.println(account_type + ": current balance is " + account.getBalance());
                }
               
                
            }
        }
    }
}
