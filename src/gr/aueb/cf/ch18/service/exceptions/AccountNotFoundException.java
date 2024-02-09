package gr.aueb.cf.ch18.service.exceptions;

public class AccountNotFoundException extends Exception{
    private static final long serialVersionUID = 3221251L;

    public AccountNotFoundException(String iban){
        super("Account with iban: " + iban + " not exists");
    }
}
