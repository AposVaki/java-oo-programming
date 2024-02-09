package gr.aueb.cf.ch19.dao;

import gr.aueb.cf.ch19.model.User;

import java.util.List;

public interface IUserDAO {
    User insert(User user);
    User update(User oldUser, User newUser);
    void delete(String ssn);
    User getBySsn(String ssn);
    List<User> getAll();

    boolean ssnExists(String ssn);

}
