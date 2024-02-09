package gr.aueb.cf.ch18.service;

import gr.aueb.cf.ch18.dao.IUserDAO;
import gr.aueb.cf.ch18.dto.UserDTO;
import gr.aueb.cf.ch18.model.User;
import gr.aueb.cf.ch18.service.exceptions.UserSsnAlreadyExists;
import gr.aueb.cf.ch18.service.exceptions.UserSsnNotFoundException;

import java.util.List;

public class UserServiceImpl implements IUserService{
    private final IUserDAO dao;

    public UserServiceImpl(IUserDAO dao) {
        this.dao = dao;
    }

    @Override
    public User insertUser(UserDTO userDTO) throws UserSsnAlreadyExists {
        User user;
        try {
            user = mapFromDTO(userDTO);
            if (dao.ssnExists(user.getSsn())){
                throw new UserSsnAlreadyExists(user.getSsn());
            }
            return dao.insert(user);


        } catch (UserSsnAlreadyExists e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public User updateUser(UserDTO oldDTO, UserDTO newDTO) throws UserSsnAlreadyExists, UserSsnNotFoundException {
        User oldUser;
        User newUser;

        try {
            oldUser = mapFromDTO(oldDTO);
            newUser = mapFromDTO(newDTO);
            if (!dao.ssnExists(oldDTO.getSsn())){
                throw new UserSsnNotFoundException(oldUser.getSsn());
            }
            if (dao.ssnExists(newDTO.getSsn())) {
                throw new UserSsnAlreadyExists(newUser.getSsn());
            }
            return dao.update(oldUser, newUser);
        } catch (UserSsnAlreadyExists | UserSsnNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void deleteUser(String ssn) throws UserSsnNotFoundException {
        try {
            if (!dao.ssnExists(ssn)){
                throw new UserSsnNotFoundException(ssn);
            }
            dao.delete(ssn);
        } catch (UserSsnNotFoundException e) {
            e.printStackTrace();
            throw e;
        }

    }

    @Override
    public User getUserBySsn(String ssn) throws UserSsnNotFoundException {
        User user;
        try {
            user = dao.getBySsn(ssn);
            if (user == null) {
                throw new UserSsnNotFoundException(ssn);
            }
            return user;
        } catch (UserSsnNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<User> getAllUsers() {
        return dao.getAll();
    }


    private User mapFromDTO(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getFirstname(), userDTO.getLastname(), userDTO.getSsn());
    }
}
