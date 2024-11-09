package mywebapp.dao;

import mywebapp.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void deleteUserById(User user);

    User findUserById(long id);

    void updateUser(User user, User userToUpdate);

    List<User> getAllUsers();
}
