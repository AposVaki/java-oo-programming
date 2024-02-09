package gr.aueb.cf.ch18.service.exceptions;

import gr.aueb.cf.ch18.model.User;

public class UserSsnNotFoundException extends Exception{
    private static final long serialVersionUID =12236445L;

    public UserSsnNotFoundException(String ssn) {
        super("The user with the ssn: " + ssn + " not exists");
    }

}
