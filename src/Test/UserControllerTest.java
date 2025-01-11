package Test;

import Models.users;
import Services.UserSevice;
import org.junit.jupiter.api.Test;
import Controllers.UserController;
import static org.junit.jupiter.api.Assertions.*;
class UserControllerTest {

    @Test
    void registerUser() {
        try {
            UserController a=new UserController();
            a.register("ahmed","email@ee.com","123","user");
         } catch (Exception e) {
            fail("An exception occurred: " + e.getMessage());
        }
    }

    @Test
    void login() {
        try {
            UserController a=new UserController();
            a.login("email@ee.com","123");
        } catch (Exception e) {
            fail("An exception occurred: " + e.getMessage());
        }
    }


}