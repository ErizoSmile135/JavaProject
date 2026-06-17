package by.lesson.practics.class7;

import java.util.Objects;

public class User {
    private String login;
    private String password;
    private String firstname;
    private String name;

    public User(String login, String password, String firstname, String name) {
        this.login = login;
        this.password = password;
        this.firstname = firstname;
        this.name = name;
    }

    public String getLogin(){
        return this.login;
    }

    public boolean checkPassword(String password){
        return this.password.equals(password);
    }
}
