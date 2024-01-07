package gr.aueb.cf.ch12.bankapp.model;

public class JointAccount extends IDEntity{
    private Account account;
    private User user2;

    public JointAccount() {
    }

    public JointAccount(Account account, User user2) {
        this.account = account;
        this.user2 = user2;
    }

    public Account getAccount() {
        return new Account(account);
    }
    public void setAccount(Account account) {
        this.account = new Account(account);
    }
    public User getUser2() {
        return new User(user2);
    }
    public void setUser2(User user2) {
        this.user2 = new User(user2);
    }

    /**
     * The Second User can withdraw an amount of money (no more than the balance has)
     * from the balance.
     *
     * @param amount
     *                      the amount the user needs to withdraw.
     * @param ssn
     *                      the ssn of the second User.
     * @throws Exception
     *                      if the ssn is not valid or the requested amount is > than the balance.
     */
    public void withdraw(double amount, String ssn) throws Exception {
        if (user2.getSsn().equals(ssn)) {
            account.setUser(user2);
        }

        account.withdraw(amount, ssn);

    }

    /**
     * The Second User can deposit the amount of money to the balance.
     *
     * @param amount
     *                      the amount the user needs to deposit.
     * @throws Exception
     *                      if the requested amount is < than zero.
     */
    public void deposit(double amount) throws Exception {
        account.deposit(amount);
    }

    public double getBalance() {
        return account.getAccountBalance();
    }
}
