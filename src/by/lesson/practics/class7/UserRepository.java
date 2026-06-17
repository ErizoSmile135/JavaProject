package by.lesson.practics.class7;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        users.add(new User("login1", "pass1", "FName1", "Name1"));
        users.add(new User("login2", "pass2", "FName2", "Name2"));
        users.add(new User("login3", "pass3", "FName3", "Name3"));
        users.add(new User("login4", "pass4", "FName4", "Name4"));
        users.add(new User("login5", "pass5", "FName5", "Name5"));
    }

    public UserRepository() {

    }

    public static List<User> getUserList(){
        return users;
    }
}
