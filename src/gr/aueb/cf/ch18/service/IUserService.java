package gr.aueb.cf.ch18.service;

import gr.aueb.cf.ch18.dto.UserDTO;
import gr.aueb.cf.ch18.model.User;
import gr.aueb.cf.ch18.service.exceptions.UserSsnAlreadyExists;
import gr.aueb.cf.ch18.service.exceptions.UserSsnNotFoundException;

import java.util.List;

public interface IUserService {

    User insertUser(UserDTO userDTO) throws UserSsnAlreadyExists;
    User updateUser(UserDTO oldDTO, UserDTO newDTO) throws UserSsnAlreadyExists, UserSsnNotFoundException;
    void deleteUser(String ssn) throws UserSsnNotFoundException;
    User getUserBySsn(String ssn) throws UserSsnNotFoundException;
    List<User> getAllUsers();
}
