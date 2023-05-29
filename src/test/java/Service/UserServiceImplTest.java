package Service;

import DAO.UserDAO;
import model.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @Mock
    private UserDAO userDAOMock;

    @InjectMocks
    private UserServiceImpl out;


    @Test
    void shouldReturnFalseWithDifferentParametersOfUserName() {
        when(userDAOMock.getUserByName("Олег")).thenReturn(null);
        boolean userExists = out.checkUserExist(new User("Олег"));
        assertFalse(userExists);
    }
    @Test
    void shouldReturnTrueWithDifferentParametersOfUserName() {
        when(userDAOMock.getUserByName("Олег")).thenReturn(new User("Олег"));
        boolean userExists = out.checkUserExist(new User("Олег"));
        assertTrue(userExists);
    }
}