package DAO;

import model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOimplTest {
    private final UserDAOimpl out = new UserDAOimpl();

    @Test
    void shouldReturnUserByName() {
        User user = out.getUserByName("Андрей");
        Assertions.assertEquals(user.getName(),"Андрей" );
    }

    @Test
    void shouldReturnFalseIfUserNameNotFound() {
        Assertions.assertNull(out.getUserByName("Жора"));
    }
}