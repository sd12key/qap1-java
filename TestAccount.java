public class TestAccount {
    public static void main(String[] args) {

        int transfer_amount = 1000;

        // create two accounts
        System.out.print("\nCreating accounts: ");
        Account acc1 = new Account("ACCT-001", "Jeffrey Lebowski", 5000);
        System.out.print(acc1.getID() + ", ");
        Account acc2 = new Account("ACCT-002", "Walter Sobchak", 4000);
        System.out.print(acc2.getID() + "\n");

        // display initial balances
        System.out.println("\nInitial balances:");
        System.out.println("--> " + acc1.getID()+ ": $" + acc1.getBalance() + " (" + acc1.getName() + ")");
        System.out.println("--> " + acc2.getID()+ ": $" + acc2.getBalance() + " (" + acc2.getName() + ")");
        
        // transfer $1000 from acc1 to acc2
        System.out.println("\nTransferring: $" + transfer_amount);
        System.out.println("\tfrom: " + acc1.getID());
        System.out.println("\t  to: " + acc2.getID());
        acc1.transferTo(acc2, transfer_amount);

        // Display balances after transfer
        System.out.println("\nBalances after the transaction:");
        System.out.println("--> " + acc1.getID() +": $" + acc1.getBalance());
        System.out.println("--> " + acc2.getID() +": $" + acc2.getBalance());
        
        System.out.println("\nDone!\n");
    }
}
