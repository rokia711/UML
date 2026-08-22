package BankAccountSystem;

public class Teller {
    public int id;
    public String name;

    public Teller(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void collectMoney() {
        System.out.println("Money collected by teller: " + name);
    }

    public void openAccount() {
        System.out.println("Account opened by teller: " + name);
    }

    public void closeAccount() {
        System.out.println("Account closed by teller: " + name);
    }

    public void loanRequest() {
        System.out.println("Loan request processed by teller: " + name);
    }

    public void provideInfo() {
        System.out.println("Information provided by teller: " + name);
    }

    public void issueCard() {
        System.out.println("Card issued by teller: " + name);
    }
}


