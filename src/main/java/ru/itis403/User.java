package ru.itis403;
import ru.itis403.Role;

public class User {
    String login;
    String password;
    Role role;

    public User(String login, String password, Role role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }
}