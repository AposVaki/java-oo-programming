package gr.aueb.cf.ch19.dto;

import gr.aueb.cf.ch19.dto.BaseDTO;
import gr.aueb.cf.ch19.dto.UserDTO;

public class AccountDTO extends BaseDTO {
    private String iban;
    private UserDTO userDTO;
    private double balance;

    public AccountDTO() {
    }

    public AccountDTO(String iban, UserDTO userDTO, double balance) {
        this.iban = iban;
        this.userDTO = userDTO;
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public UserDTO getUserInsertDTO() {
        return userDTO;
    }

    public void setUserInsertDTO(UserDTO userDTO) {
        this.userDTO = userDTO;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
