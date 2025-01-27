public class Account {
    
    // instance variables
    private String id;
    private String name;
    private int balance = 0;

    // constructors
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // getters
    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    // transactional methods
    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            errorMessage("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            this.debit(amount);
            another.credit(amount);
        } else {
            errorMessage("Amount exceeded balance");
        }
        return this.balance;
    }

    // toString() method
    public String toString() {
        return "Account [id=" + this.id + ", name=" + this.name + ", balance=" + this.balance + "]";
    }

    // private error message method
    private void errorMessage(String errMessage) {
        System.out.println(errMessage);
    }

}
