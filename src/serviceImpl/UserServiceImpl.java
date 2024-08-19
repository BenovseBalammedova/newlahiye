package serviceImpl;

import entity.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    static ArrayList<User>userArrayList=new ArrayList<>();
    static {
        userArrayList.add(new User(1,"Benovse",22,"qadin","Aze"));
        userArrayList.add(new User(2,"Azer",24,"kisi","Aze"));
        userArrayList.add(new User(3,"Leyla",25,"qadin","Aze"));
    }

    @Override
    public User getUserById(Integer id) {
        return userArrayList.get(id);
    }

    @Override
    public List<User> getAllUser() {
        return userArrayList;
    }

    @Override
    public void addUser(User user) {
        userArrayList.add(user);

    }

    @Override
    public void delete(Integer id) {
        userArrayList.remove(id);

    }
}
