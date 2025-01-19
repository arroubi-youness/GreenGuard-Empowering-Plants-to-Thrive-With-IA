package Controllers;

 import Services.SubscriptionService;

 import java.sql.SQLException;

public class SubscriptionController {
    private SubscriptionService subscriptionService=new SubscriptionService();
    public void Save_subsception(int idUser,int idPlan, String dateStart, String endStart, String Status ){

        try{
               subscriptionService.Save_New_Subscription(idUser,idPlan,dateStart,endStart,Status);

        }catch (SQLException e){

            e.printStackTrace();

        }
    }
    
}
