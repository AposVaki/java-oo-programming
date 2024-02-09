package gr.aueb.cf.ch18.service;

import gr.aueb.cf.ch18.dao.IAccountDAO;
import gr.aueb.cf.ch18.dto.AccountDTO;
import gr.aueb.cf.ch18.dto.UserDTO;
import gr.aueb.cf.ch18.model.Account;
import gr.aueb.cf.ch18.model.User;
import gr.aueb.cf.ch18.service.exceptions.AccountAlreadyExistsException;
import gr.aueb.cf.ch18.service.exceptions.AccountNotFoundException;

import java.util.List;

public class AccountServiceImpl implements IAccountService{
    private final IAccountDAO dao;

    public AccountServiceImpl(IAccountDAO dao) {
        this.dao = dao;
    }

    @Override
    public Account insertAccount(AccountDTO accountDTO) throws AccountAlreadyExistsException {
        Account account;
        try {
            account = mapFromAccountDTO(accountDTO);
            if (dao.accountIbanExists(account.getIban())){
                throw new AccountAlreadyExistsException(account);
            }
            return dao.insert(account);
        } catch (AccountAlreadyExistsException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Account updateAccount(AccountDTO oldDTO, AccountDTO newDTO) throws AccountNotFoundException {
        Account oldAccount;
        Account newAccount;
        try {
            oldAccount = mapFromAccountDTO(oldDTO);
            newAccount = mapFromAccountDTO(newDTO);
            if (!dao.accountIbanExists(oldAccount.getIban())){
                throw new AccountNotFoundException(oldAccount.getIban());
            }
            return dao.update(oldAccount, newAccount);
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteAccount(String iban) throws AccountNotFoundException {
        try {
            if (!dao.accountIbanExists(iban)){
                throw new AccountNotFoundException(iban);
            }
            dao.delete(iban);

        } catch (AccountNotFoundException e){
            e.printStackTrace();
            throw e;
        }

    }

    @Override
    public Account getAccountByIban(String iban) throws AccountNotFoundException {
        Account account;
        try {
            account = dao.getByIban(iban);
            if (account == null) {
                throw new AccountNotFoundException(iban);
            }
            return account;
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Account> getAllAccounts() {
        return dao.getAll();
    }

    private User mapFromUserDTO(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getFirstname(), userDTO.getLastname(), userDTO.getSsn());
    }

    private Account mapFromAccountDTO(AccountDTO accountDTO) {
        User user = mapFromUserDTO(accountDTO.getUserInsertDTO());
        return new Account(accountDTO.getIban(), user, accountDTO.getBalance());
    }
}
