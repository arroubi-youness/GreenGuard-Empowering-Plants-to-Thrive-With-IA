package Controllers;
import Services.UserSevice;
import Models.users;
public class UserController {


    private UserSevice user_service= new UserSevice();



    public void register(String username,String email,String password,String role){
        try {
            users user_registered=user_service.registerUser(username,email,password,role);

        }catch (Exception  e){
            e.printStackTrace();
        }
    }

    public  void login(String email,String password){
        try{
            users user_logged_in = user_service.login(email,password);
            System.out.println("Login successful for user: " + user_logged_in.getUsername());

        }catch (Exception e){
            System.err.println("login failed controller "+e.getMessage());

        }
    }


}
