package person;

public class Account {
    String name = "naaz";
    private int balance = 2000000;

    public int getBalance() {
        return balance;
    }

    public int setBalance(int balance) {
        boolean isAdmin = false;
        if (isAdmin) {
            this.balance = balance;
            return balance;
        } else {
            System.out.println("You dont have access to change you balance");
            return 0;
        }
    }

}
