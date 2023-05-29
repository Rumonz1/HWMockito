package DAO;

import model.User;

import java.util.Arrays;
import java.util.List;

public class UserDAOimpl implements UserDAO {
    private final List<User> users;

    public UserDAOimpl() {
        this.users = Arrays.asList(
                new User("Андрей"),
                new User("Пётр"),
                new User("Ольга"),
                new User("Сергей")
        );
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }
    @Override
    public List<User> findAllUsers() {
        return users;
    }
}
