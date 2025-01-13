package Services;
import org.junit.platform.commons.function.Try;
import org.mindrot.jbcrypt.BCrypt;
import DAOs.UserDAO;
import Models.users;
import java.sql.*;

public class UserSevice {
    private UserDAO userDao = new UserDAO();

    public users registerUser(String username, String email, String password, String role) throws SQLIntegrityConstraintViolationException {
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
//        System.out.println("Hashed Password: " + hashedPassword);
//        String a= String.valueOf(BCrypt.checkpw(password,hashedPassword));
//        System.out.println("????? " + a);
        users user = new users(-1, username, email, hashedPassword, role);

        try {
            users user_registered;
            user_registered = userDao.Add_User(user);
            return user_registered;
        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Error during registring" + e);
            throw e;
        } catch (Exception e) {
            System.err.println("Unexpected error during registration: " + e.getMessage());

        }
        return null;
    }



    public users login(String email,String password) throws SQLException  {

        try{

            users user_loged_in =new users();
            user_loged_in=userDao.getUserbyemail(email);
            if (user_loged_in != null && BCrypt.checkpw(password, user_loged_in.getPassword())) {
                return user_loged_in;
            }
            else {
                System.err.println("Invalid email or password.");

            }


        }catch (SQLException e){
             System.err.println("error  during login service "+e.getMessage());
            throw e;
        }

        return null;
    }
}