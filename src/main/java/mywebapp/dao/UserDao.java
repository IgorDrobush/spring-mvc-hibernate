package mywebapp.dao;

import mywebapp.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void deleteUserById(long id);

    User findUserById(long id);

    void updateUser(User user);

    List<User> getAllUsers();
}
