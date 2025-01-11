package Models;
public class users {
    private int  user_id;
    private String username;
    private String  email;
    private  String password;
    private String role;


    public users(){

    }
    public  users(int id,String name,String email,String mot_passe,String role){
        this.user_id=id;
        this.username=name;
        this.email=email;
        this.password=mot_passe;
        this.role=role;

    }

    public void setUser_id(int id){
        this.user_id=id;
    }
    public void setUsername(String name){
        this.username=name;
    }
    public  void setEmail(String mail){
        this.email=mail;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setRole(String role){
        this.role=role;
    }
    public int getUser_id(){
        return  this.user_id;
    }


     public String getUsername() {
        return username;
    }

     public String getEmail() {
        return email;
    }

     public String getPassword() {
        return password;
    }

     public String getRole() {
        return role;
    }


}
