package gr.aueb.cf.ch19.service;

import gr.aueb.cf.ch19.dto.AccountDTO;
import gr.aueb.cf.ch19.model.Account;
import gr.aueb.cf.ch19.service.exceptions.AccountAlreadyExistsException;
import gr.aueb.cf.ch19.service.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch19.service.exceptions.UserSsnAlreadyExists;

import java.util.HashMap;
import java.util.List;

public interface IAccountService {
    Account insertAccount(AccountDTO accountDTO) throws AccountAlreadyExistsException;
    Account updateAccount(AccountDTO oldDTO, AccountDTO newDTO) throws AccountNotFoundException, UserSsnAlreadyExists;
    void deleteAccount(String iban) throws AccountNotFoundException;
    Account getAccountByIban(String iban) throws AccountNotFoundException;
    List<Account> getAllAccounts();
}
