package gr.aueb.cf.ch19.service.exceptions;

import gr.aueb.cf.ch19.model.User;

public class UserSsnAlreadyExists extends Exception{
    private static final long serialVersionUID = 5658843L;

    public UserSsnAlreadyExists(String ssn) {
        super("User with ssn: " + ssn + " already exists.");
    }
}
