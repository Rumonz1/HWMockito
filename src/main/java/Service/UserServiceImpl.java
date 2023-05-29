package Service;

import DAO.UserDAO;
import model.User;

public class UserServiceImpl implements UserService{
    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public boolean checkUserExist(User user) {
        return userDAO.getUserByName(user.getName()) != null;
    }
}
