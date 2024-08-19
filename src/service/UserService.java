package service;

import entity.User;

import java.util.List;

public interface UserService {

    User getUserById(Integer id);
     List<User> getAllUser();
     void addUser(User user);
     void delete(Integer id);

}
