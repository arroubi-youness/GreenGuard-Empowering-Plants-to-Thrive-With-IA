package Test;

 import Models.users;
 import Services.UserSevice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class UserSeviceTest {

    @Test
    void registerUser() {
         String username = "testuser";
        String email = "testuser@examplwewewe.com";
        String password = "password123";
        String role = "USER";

         try {
            UserSevice a=new UserSevice();
            users v= a.registerUser(username,email,password,role);
            System.out.println(v);
         } catch (Exception e) {
            fail("An exception occurred: " + e.getMessage());
        }
    }
}