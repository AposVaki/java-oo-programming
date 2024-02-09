package gr.aueb.cf.ch18.service.exceptions;

import gr.aueb.cf.ch18.model.User;

public class UserLastnameNotFoundException extends Exception{
    private static final long serialVersionUID = 21542153L;

    public UserLastnameNotFoundException(User user) {
        super("User with lastname: " + user.getLastname() + " not exists.");
    }
}
