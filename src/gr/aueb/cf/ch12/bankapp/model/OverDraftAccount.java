package gr.aueb.cf.ch12.bankapp.model;

import javax.naming.InsufficientResourcesException;

public class OverDraftAccount extends Account{
    public OverDraftAccount() {
    }

    public OverDraftAccount(String iban, User user, double balance) {
        super(iban, user, balance);
    }

    /**
     * Overriding the withdraw method of the Account in order for the user
     * to be able to withdraw any amount of money from the account.
     *
     * @param amount
     *                      the amount to be withdrawn.
     * @param ssn
     *                      the validation of the account.
     * @throws Exception
     *                      if the ssn is not valid.
     */
    @Override
    public void withdraw(double amount, String ssn) throws Exception {
        if (!isSsnValid(ssn)){
            throw new Exception("Bad ssn");
        }
        setBalance(getBalance() - amount);
    }
}
