package gr.aueb.cf.ch18;

import gr.aueb.cf.ch18.dao.AccountDAOImpl;
import gr.aueb.cf.ch18.dao.IAccountDAO;
import gr.aueb.cf.ch18.dao.IUserDAO;
import gr.aueb.cf.ch18.dao.UserDAOImpl;
import gr.aueb.cf.ch18.dto.AccountDTO;
import gr.aueb.cf.ch18.dto.UserDTO;
import gr.aueb.cf.ch18.model.Account;
import gr.aueb.cf.ch18.model.User;
import gr.aueb.cf.ch18.service.AccountServiceImpl;
import gr.aueb.cf.ch18.service.IAccountService;
import gr.aueb.cf.ch18.service.IUserService;
import gr.aueb.cf.ch18.service.UserServiceImpl;
import gr.aueb.cf.ch18.service.exceptions.AccountAlreadyExistsException;
import gr.aueb.cf.ch18.service.exceptions.AccountNotFoundException;
import gr.aueb.cf.ch18.service.exceptions.UserSsnAlreadyExists;
import gr.aueb.cf.ch18.service.exceptions.UserSsnNotFoundException;

import java.util.List;

public class Main {
    private final static IUserDAO userDao = new UserDAOImpl();
    private final static IUserService userService = new UserServiceImpl(userDao);
    private final static IAccountDAO accountDao = new AccountDAOImpl();
    private final static IAccountService accountService = new AccountServiceImpl(accountDao);

    public static void main(String[] args) {
        try {
            UserDTO userDTO = new UserDTO("Alice", "W.", "U1");
            AccountDTO alicesAccount = new AccountDTO("GR123456", userDTO, 10000);
            AccountDTO alicesUpdatedAccount = new AccountDTO("GR123456", userDTO, 25000);
            userService.insertUser(userDTO);
            accountService.insertAccount(alicesAccount);
            List<Account> accounts = accountService.getAllAccounts();
            for (Account account : accounts) {
                System.out.println(account);
            }
            System.out.println();
            System.out.println();

            accountService.updateAccount(alicesAccount, alicesUpdatedAccount);
            accounts = accountService.getAllAccounts();

            for (Account account : accounts) {
                System.out.println(account);
            }
            System.out.println();
            System.out.println();

            UserDTO userDTOBob = new UserDTO("Bob", "Mastoras", "U2");
            AccountDTO bobsAccount = new AccountDTO("GR1234567", userDTOBob, 1000);
            userService.insertUser(userDTOBob);
            accountService.insertAccount(bobsAccount);
            accounts = accountService.getAllAccounts();

            for (Account account : accounts) {
                System.out.println(account);
            }
            System.out.println();
            System.out.println();

            List<User> users = userService.getAllUsers();
            for (User user : users) {
                System.out.println(user);
            }

            userService.deleteUser("U1");

            System.out.println();
            System.out.println();

            users = userService.getAllUsers();
            for (User user : users) {
                System.out.println(user);
            }
        } catch (UserSsnAlreadyExists | AccountAlreadyExistsException | AccountNotFoundException | UserSsnNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
