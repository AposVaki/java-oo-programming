package gr.aueb.cf.ch18.model;

public class Account extends IdentifiableEntity{
    private String iban;
    private User holder;
    private double balance;

    public Account() {
    }

    public Account(String iban, User holder, double balance) {
        this.iban = iban;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(Account account){
        iban = account.getIban();
        holder = account.getHolder();
        balance = account.getBalance();
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public User getHolder() {
        return holder;
    }

    public void setHolder(User holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", holder=" + holder +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (Double.compare(balance, account.balance) != 0) return false;
        if (!iban.equals(account.iban)) return false;
        return holder.equals(account.holder);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = iban.hashCode();
        result = 31 * result + holder.hashCode();
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
