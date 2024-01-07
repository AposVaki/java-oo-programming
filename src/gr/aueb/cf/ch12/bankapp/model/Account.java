package gr.aueb.cf.ch12.bankapp.model;

public class Account extends IDEntity{
    private String iban;
    private User user;
    private double balance;


    public Account(){

    }

    public Account(String iban, User user, double balance) {
        this.iban = iban;
        this.user = user;
        this.balance = balance;
    }

    public Account(Account account) {
        iban = account.getIban();
        user = account.getUser();
        balance = account.getBalance();
    }

    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * public API - Business Services
     */

    /**
     * Deposits a certain amount of money in the Account.
     *
     * @param amount
     *                      the amount to be deposited.
     * @throws Exception
     *                      if the amount of money is negative.
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Negative amount error");
            }

            balance += amount;
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraws a certain amount of money from the Account.
     *
     * @param amount
     *                      the amount to be withdrawn.
     * @param ssn
     *                      the validation of the account.
     * @throws Exception
     *                      if amount > balance or/and ssn does not match.
     */

    public void withdraw(double amount, String ssn) throws Exception {
        try {
            if (amount > balance) {
                throw new Exception("Insufficient balance error");
            }

            if (!isSsnValid(ssn )){
                throw new Exception("Bad ssn");
            }

            balance -= amount;
        } catch (Exception e) {
//            e.printStackTrace();
            throw e;
        }
    }


    protected boolean isSsnValid(String ssn){
        return user.getSsn().equals(ssn);
    }

    /**
     * Returns account's balance.
     *
     * @return
     *          current balance.
     */
    public double getAccountBalance() {
        return getBalance();
    }

    /**
     *
     * @return
     */
    public String accountToString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", user=" + user +
                ", balance=" + balance +
                '}';
    }
}
