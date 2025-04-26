public abstract class Account {

    private int number;
    private int agency;
    private double balance = 0.0; // inicializando saldo com 0
    private String holder;

    public Account() {
    }

    void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        } else {
            System.out.println("Valor do depósito precisa ser positivo.");
        }
    }

    void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    void transfer(double amount, Account destinationAccount) {
        if (getBalance() >= amount) {
            this.withdraw(amount);
            destinationAccount.deposit(amount);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Getters e Setters

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
}
