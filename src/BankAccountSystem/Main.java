package BankAccountSystem;
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(101, "National BankAccountSystem.Bank", "Cairo");
        Teller teller = new Teller(1, "John");
        Customer customer = new Customer(5001, "Cairo", "Rokia", 123456789, 9901);
        Checking checkingAcc = new Checking(1001,6578);
        Loan loan = new Loan(1, "Personal", checkingAcc.id, customer.id);

        System.out.println("BankAccountSystem.Bank Name: " + bank.name);
        teller.openAccount();
        customer.depositMoney();
        customer.applyForLoan();
    }
}