package DAOs;
import java.util.ArrayList;
import java.util.List;
import Models.*;
import Utils.DBconnection;
 import java.sql.*;

public class PlantDAO {

    public plants AddPlant(plants plant) throws SQLIntegrityConstraintViolationException {

        String query = "INSERT INTO plants (user_id, plant_name, species_id, last_watered_date, last_feltrizing) VALUES (?, ?, ?, ?, ?)";
        Connection conn = DBconnection.getConnection();
        ResultSet generatedKeys = null;
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, plant.getUser_id());
            stmt.setString(2, plant.getPlant_name());
            stmt.setInt(3, plant.getSpecies_id());
            stmt.setString(4, plant.getLast_watered_date());
            stmt.setString(5, plant.getLast_fertilizing_date());


            int affectedRows = stmt.executeUpdate();

            if (affectedRows > 0) {
                generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int id = generatedKeys.getInt(1);
                    plant.setPlant_id(id);
                    return plant;
                }
            }

        } catch (SQLIntegrityConstraintViolationException e) {
            System.err.println("Error during registering plant species: " + e.getMessage());
            throw new SQLIntegrityConstraintViolationException("Error during registering plant species", e);

        } catch (SQLException e) {
            System.err.println("General SQL error: " + e.getMessage());

        } finally {
            try {
                if (generatedKeys != null) generatedKeys.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
        return null;
    }


    public List<plants> GetAllPlants() throws SQLException {
        String query = "SELECT * FROM plants";
        List<plants> plantList = new ArrayList<>();
        Connection conn = DBconnection.getConnection();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                plants plant = new plants();
                plant.setPlant_id(rs.getInt("plant_id"));
                plant.setUser_id(rs.getInt("user_id"));
                plant.setPlant_name(rs.getString("plant_name"));
                plant.setSpecies_id(rs.getInt("species_id"));
                plant.setLast_watered_date(rs.getString("last_watered_date"));
                plant.setLast_fertilizing_date(rs.getString("last_feltrizing"));
                plantList.add(plant);
            }

        } catch (SQLException e) {
            System.err.println("Error retrieving plants: " + e.getMessage());
            throw new SQLException("Error  during retrieve all plants",e);

        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
        return plantList;
    }


    public plants FindPlantByName(String plantName) {
        String query = "SELECT * FROM plants WHERE plant_name = ?";
        Connection conn = DBconnection.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = conn.prepareStatement(query);
            stmt.setString(1, plantName);
            rs = stmt.executeQuery();

            if (rs.next()) {
                plants plant = new plants();
                plant.setPlant_id(rs.getInt("plant_id"));
                plant.setUser_id(rs.getInt("user_id"));
                plant.setPlant_name(rs.getString("plant_name"));
                plant.setSpecies_id(rs.getInt("species_id"));
                plant.setLast_watered_date(rs.getString("last_watered_date"));
                plant.setLast_fertilizing_date(rs.getString("last_fertilizing_date"));
                return plant;
            }

        } catch (SQLException e) {
            System.err.println("Error finding plant: " + e.getMessage());

        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
        return null;
    }



    public boolean DeletePlantById(int plantId) {
        String query = "DELETE FROM plants WHERE plant_id = ?";
        Connection conn = DBconnection.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, plantId);

            int affectedRows = stmt.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            System.err.println("Error deleting plant: " + e.getMessage());

        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
        return false;
    }

    public boolean UpdatePlantById(plants plant) {
        String query = "UPDATE plants SET user_id = ?, plant_name = ?, species_id = ?, last_watered_date = ?, last_fertilizing_date = ? WHERE plant_id = ?";
        Connection conn = DBconnection.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, plant.getUser_id());
            stmt.setString(2, plant.getPlant_name());
            stmt.setInt(3, plant.getSpecies_id());
            stmt.setString(4, plant.getLast_watered_date());
            stmt.setString(5, plant.getLast_fertilizing_date());
            stmt.setInt(6, plant.getPlant_id());

            int affectedRows = stmt.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            System.err.println("Error updating plant: " + e.getMessage());

        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
        return false;
    }

}
