package BankAccountSystem;
public class Customer {
    public int id;
    public String name;
    public String address;
    public int phoneNumber;
    public int acctNumber;

    public Customer(int id, String address, String name, int phoneNumber, int acctNumber) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.acctNumber = acctNumber;
    }
    public void generalInquiry() {
        System.out.println("Customer " + name + " made a general inquiry.");
    }

    public void depositMoney() {
        System.out.println("Customer " + name + " deposited money.");
    }

    public void withdrawMoney() {
        System.out.println("Customer " + name + " withdrew money.");
    }

    public void openAccount() {
        System.out.println("Customer " + name + " requested to open an account.");
    }

    public void closeAccount() {
        System.out.println("Customer " + name + " requested to close an account.");
    }

    public void applyForLoan() {
        System.out.println("Customer " + name + " applied for a loan.");
    }

    public void requestCard() {
        System.out.println("Customer " + name + " requested a card.");
    }
}
