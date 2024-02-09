package gr.aueb.cf.ch18.dao;

import gr.aueb.cf.ch18.model.Account;

import java.util.List;

public interface IAccountDAO {

    Account insert(Account account);
    Account update(Account oldAccount, Account newAccount);
    void delete(String iban);
    Account getByIban(String iban);
    boolean accountIbanExists(String iban);
    List<Account> getAll();
}
