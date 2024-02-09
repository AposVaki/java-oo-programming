package gr.aueb.cf.ch19.dao;

import gr.aueb.cf.ch19.model.Account;

import java.util.*;
import java.util.stream.Collectors;

public class AccountDAOImpl implements IAccountDAO {
    private static final Map<Long, Account> accounts = new HashMap<>();

    @Override
    public Account insert(Long id, Account account) {
        accounts.put(id, account);
        return account;
    }


    @Override
    public Account update(Long id, Account newAccount) {

        return accounts.replace(id, newAccount);
    }

    @Override
    public void delete(Long id, Account account) {
        accounts.remove(id, account);
    }

    @Override
    public Account getByIban(String ibanToSearch) {
        Optional<Account> account = accounts.values().stream().filter(a -> a.getIban().equals(ibanToSearch)).findFirst();
        return account.orElse(null);
    }

    @Override
    public boolean accountIbanExists(String ibanToSearch) {
        return accounts.values().stream().anyMatch(a -> a.getIban().equals(ibanToSearch));
    }

    @Override
    public List<Account> getAll() {

        return new ArrayList<>(accounts.values());
    }
}
