package gr.aueb.cf.ch19.dao;

import gr.aueb.cf.ch19.dao.IUserDAO;
import gr.aueb.cf.ch19.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserDAOImpl implements IUserDAO {
    private static final List<User> users = new ArrayList<>();

    @Override
    public User insert(User user) {
        users.add(user);
        return user;
    }

    @Override
    public User update(User oldUser, User newUser) {
        users.set(users.indexOf(oldUser), newUser);
        return newUser;
    }

    @Override
    public void delete(String ssn) {
        users.removeIf(u -> u.getSsn().equals(ssn));

    }

    @Override
    public User getBySsn(String ssn) {
        Optional<User> user = users.stream().filter(u -> u.getSsn().equals(ssn)).findFirst();
        return user.orElse(null);
    }

    @Override
    public List<User> getAll() {
        return new ArrayList<>(users);
    }

    @Override
    public boolean ssnExists(String ssn) {
        return users.stream().anyMatch( u -> u.getSsn().equals(ssn));
    }
}
