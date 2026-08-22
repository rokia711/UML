package BankAccountSystem;

public class Loan {
    public int id;
    public String type;
    public int accountId;
    public int customerId;

    public Loan(int id, String type, int accountId, int customerId) {
        this.id = id;
        this.type = type;
        this.accountId = accountId;
        this.customerId = customerId;
    }
}
