package Services;
import DAOs.SubscriptionDAO;
import Models.Subscriptions;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SubscriptionService {

    private SubscriptionDAO subscriptionDao=new SubscriptionDAO();



    public Subscriptions Save_New_Subscription(int user_id,int plan_id,String start_date,String end_date,String subscriptions_status)throws SQLIntegrityConstraintViolationException{

        LocalDate currentDate = LocalDate.now();
        String  Start_date = currentDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String End_date=null;

        /// //id pllllan
        if(plan_id==1){
            LocalDate dateAfterSixMonths = currentDate.plusMonths(1);
              End_date = dateAfterSixMonths.format(DateTimeFormatter.ISO_LOCAL_DATE);
        } else if (plan_id==2) {
            LocalDate dateAfterSixMonths = currentDate.plusMonths(6);
              End_date = dateAfterSixMonths.format(DateTimeFormatter.ISO_LOCAL_DATE);
        }else{
            LocalDate dateAfterSixMonths = currentDate.plusMonths(12);
              End_date = dateAfterSixMonths.format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        Subscriptions subscription=new Subscriptions(-1,user_id,plan_id,Start_date,End_date,subscriptions_status);

        try {
                return subscriptionDao.Add_subscription(subscription);
            }catch (SQLIntegrityConstraintViolationException e){

                throw new SQLIntegrityConstraintViolationException("error during saving subscription"+e);

            }catch (Exception e) {
                System.err.println("Unexpected error during saving the sub in  service section: " + e.getMessage());

            }

            return  null;
        }
}
