package gr.aueb.cf.ch18.dao;

import gr.aueb.cf.ch18.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO {
    private static final List<Account> accounts = new ArrayList<>();

    @Override
    public Account insert(Account account) {
        accounts.add(account);
        return account;
    }


    @Override
    public Account update(Account oldAccount, Account newAccount) {
        return accounts.set(accounts.indexOf(oldAccount), newAccount);
    }

    @Override
    public void delete(String iban) {
        accounts.removeIf(account -> account.getIban().equals(iban));
    }

    @Override
    public Account getByIban(String iban) {
        Optional<Account> account = accounts.stream().filter(a -> a.getIban().equals(iban)).findFirst();
        return account.orElse(null);
    }

    @Override
    public boolean accountIbanExists(String iban) {
        return accounts.stream().anyMatch(a -> a.getIban().equals(iban));
    }

    @Override
    public List<Account> getAll() {
        return new ArrayList<>(accounts);
    }
}
