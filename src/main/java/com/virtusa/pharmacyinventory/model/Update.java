package com.virtusa.pharmacyinventory.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "medicinelists")
public class Update {
    
    private Connection connect() {
        // SQLite connection string
        String link = "jdbc:mysql://localhost:3306/pharmacyInventory";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(link);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public void update(String productid, String medicinename, String stock, String mrp, String offer) {
        String sql = "UPDATE medicinelists SET productid = ? , " + "medicinename = ? " + "stock = ?" 
        + "mrp = ?" + "WHERE offer = ?";

        try (Connection conn = this.connect();
                PreparedStatement param = conn.prepareStatement(sql)) {

            // set the corresponding param
            param.setString(1, productid);
            param.setString(2, medicinename);
            param.setString(3, stock);
            param.setString(4, mrp);
            param.setString(5, offer);
            // update 
            param.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        
        Update table = new Update();
        // update the medicinelist with id 3
        table.update("1001", "Advair Diskus", "150", "450", "1+1");
    }
}