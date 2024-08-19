import entity.User;
import serviceImpl.UserServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        UserServiceImpl userServiceimpl=new UserServiceImpl();
        System.out.println(userServiceimpl.getUserById(2));
        User user=new User(5,"Anar",24,"Kisi","Aze");
        userServiceimpl.addUser(user);
      
        userServiceimpl.delete(4);
        System.out.println(userServiceimpl.getAllUser());
    }
}