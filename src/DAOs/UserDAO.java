package DAOs;
import Models.users;
import java.sql.*;

import Services.SubscriptionService;
import Utils.DBconnection;

public class UserDAO {

    public users Add_User(users user) throws  SQLIntegrityConstraintViolationException {

        String Qeury = "INSERT INTO Users (username, email, password_hash,role) VALUES (?, ?, ?,?)";
        Connection conn = DBconnection.getConnection();
        ResultSet generatedKeys=null;
        PreparedStatement stmt=null;
         try {
             stmt= conn.prepareStatement(Qeury,Statement.RETURN_GENERATED_KEYS);
             stmt.setString(1,user.getUsername());
             stmt.setString(2,user.getEmail());
             stmt.setString(3,user.getPassword());
             stmt.setString(4,user.getRole());
             int affectedRows = stmt.executeUpdate();

             if(affectedRows>0){
                  generatedKeys = stmt.getGeneratedKeys();
                 if (generatedKeys.next()) {
                     int id = generatedKeys.getInt(1);
                     user.setUser_id(id);
                     return user;
                 }

             }

        }catch (SQLIntegrityConstraintViolationException e){
            System.err.println("Error during registring client: "+e.getMessage());
            throw new SQLIntegrityConstraintViolationException("Error during registring client",e);

        } catch (SQLException e) {
            System.err.println("General SQL error: " + e.getMessage());
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


    public users getUserbyId(int id) {
        String query = "SELECT * FROM users WHERE user_id=?";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;

        try {
            conn = DBconnection.getConnection();
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            res = stmt.executeQuery();

            if (res.next()) {
                return new users(
                        id,
                        res.getString("username"),
                        res.getString("email"),
                        res.getString("password_hash"),
                        res.getString("role")
                );
            }
        } catch (SQLException e) {
            System.err.println("General SQL error: " + e.getMessage());
        } finally {
             try {
                if (res != null) res.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }

        return null;
    }

    public users getUserbyemail(String email) throws SQLException{
        String query = "SELECT * FROM users WHERE email=?";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;

        try {
            conn = DBconnection.getConnection();
            stmt = conn.prepareStatement(query);
            stmt.setString(1, email);
            res = stmt.executeQuery();

            if (res.next()) {
                return new users(
                        res.getInt("user_id"),
                        res.getString("username"),
                        email,
                        res.getString("password_hash"),
                        res.getString("role")
                );
            }
        } catch (SQLException e) {
            System.err.println("General SQL error: " + e.getMessage());
            throw new SQLException("error in  login in dao",e);
        } finally {
            try {
                if (res != null) res.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }

        return null;
    }

//still   some   function   to    do
}





