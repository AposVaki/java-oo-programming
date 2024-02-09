package gr.aueb.cf.ch19.dao;

import gr.aueb.cf.ch19.model.Account;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IAccountDAO {

    Account insert(Long id, Account account);
    Account update(Long id, Account newAccount);
    void delete(Long id, Account account);
    Account getByIban(String ibanToSearch);
    boolean accountIbanExists(String ibanToSearch);

    List<Account> getAll();

}
