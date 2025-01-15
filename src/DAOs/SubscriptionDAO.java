package DAOs;
import Models.Subscriptions;
import java.sql.*;
import Utils.DBconnection;
public class SubscriptionDAO {
    public Subscriptions Add_subscription(Subscriptions subscription)throws SQLIntegrityConstraintViolationException{
        String Qeury = "INSERT INTO subscriptions (user_id, plan_id, start_date,end_date,subscription_status) VALUES (?, ?, ?, ?, ?)";
        Connection conn = DBconnection.getConnection();
        PreparedStatement stmt = null;
        ResultSet generatedKeys = null;
        try{
            stmt= conn.prepareStatement(Qeury,Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1,subscription.getUser_id());
            stmt.setInt(2,subscription.getPlan_id());
            stmt.setString(3,subscription.getStart_date());
            stmt.setString(4,subscription.getEnd_date());
            stmt.setString(5,subscription.getSub_status());

            int affectedRows = stmt.executeUpdate();

            if(affectedRows>0){
                generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int id = generatedKeys.getInt(1);
                    subscription.setSubscription_id(id);
                    return subscription;
                }

            }
        }catch (SQLIntegrityConstraintViolationException e){
            System.err.println("Error during saving subscription: "+e.getMessage());
            throw new SQLIntegrityConstraintViolationException("Error during saving subscription",e);

        } catch (SQLException e) {
            System.err.println("General SQL error in Dao : " + e.getMessage());
        }finally {
            try {
                if (generatedKeys != null) generatedKeys.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
        return  null;
    }
}
