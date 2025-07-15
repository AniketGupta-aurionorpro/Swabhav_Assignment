public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.deposit(500);
            account.withdraw(200);
            account.deposit(-50); 
        } catch (NegativeAmountException | InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            account.withdraw(2000); 
        } catch (NegativeAmountException | InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}