package Controllers;
import Services.UserSevice;
import Models.users;
import Views.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Utils.static_plan_var;
public class UserController {

     private UserSevice user_service= new UserSevice();
      private  SubscriptionController subscriptionController=new SubscriptionController();
      public static int  userId;

    public void register(String username,String email,String password,String confirm_passwod,JCheckBox termes_checked,String role){
        try {
            if (password.equals(confirm_passwod) && !password.isEmpty()){
                users user_registered=user_service.registerUser(username,email,password,role);

                 subscriptionController.Save_subsception(user_registered.getUser_id(),static_plan_var.var,"","","Pending");
                JOptionPane.showMessageDialog(null, "Register Successful and your subscription is process!");

            }else if(username.isEmpty() || email.isEmpty() || password.isEmpty() || confirm_passwod.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill all.", "Error", JOptionPane.ERROR_MESSAGE);

            }else if (!termes_checked.isSelected()){
                JOptionPane.showMessageDialog(null, "Please accept terms to continue.", "Error", JOptionPane.ERROR_MESSAGE);

            }else{
                JOptionPane.showMessageDialog(null, "Please confirm the password.", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }catch (Exception  e){
            e.printStackTrace();
        }
    }

    public  void login(String email,String password){
        try{
            
            if (email.isEmpty() || password.isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill all.", "Error", JOptionPane.ERROR_MESSAGE);

            }
            users user_logged_in = user_service.login(email,password);
           if (user_logged_in == null) {
               JOptionPane.showMessageDialog(null, "No user found or password incorrect.", "Error", JOptionPane.ERROR_MESSAGE);


           } else if (!user_logged_in.getEmail().isEmpty()) {
               userId=user_logged_in.getUser_id();
               System.out.println("Login successful for user: " + user_logged_in.getUsername());
               JOptionPane.showMessageDialog(null, "Login Successful!");

               MainController.Logged_in_home();

           }





        }catch (Exception e){
            System.err.println("login failed controller "+e.getMessage());
            JOptionPane.showMessageDialog(null, "Invalid email or password.", "Error", JOptionPane.ERROR_MESSAGE);

        }
    }

    public void LoginController(Login loginView) {

        loginView.signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login(loginView.getEmail(),loginView.getPassword());
            }
        });
    }


    public void SignUpController(SignUP SignUPView) {

        SignUPView.signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register(SignUPView.getUsernameInput(),SignUPView.getEmailInput(),SignUPView.getPasswordfield(),SignUPView.getPasswordfieldConfirm(),SignUPView.termsCheckbox,"User");
            }
        });






    }






}
