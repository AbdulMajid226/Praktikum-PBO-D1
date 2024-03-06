public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);
        System.out.println("Saldo saat ini: $" + account.getBalance()+"\n");
        account.deposit(200.0);
        System.out.println("Saldo saat ini: $" + account.getBalance()+ "\n");

        try {
            account.withdraw(200.0);
            account.withdraw(600.0);
        } catch (InsufficientFundsException a) {
            System.out.println("Saldo saat ini: $" + account.getBalance());
            System.out.println(a.getMessage());
            
        }
       
    

    }
}
