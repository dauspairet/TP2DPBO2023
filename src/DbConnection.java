// Saya Muhamad Firdaus [2101995] mengerjakan
// soal TP 2 dalam mata kuliah DPBO
// untuk keberkahanNya maka saya tidak melakukan kecurangan 
// seperti yang telah dispesifikasikan. Aamiin.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Firdaus
 */
public class DbConnection {
    // Attribute
    private static Connection mysqlconfig;
    
    // Connect
    public static Connection configDB(){
        try{
            String conn = "jdbc:mysql://localhost/tp2dpbo";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(conn, user, pass);
        }
        catch(SQLException e) {
           System.err.println("koneksi gagal " +e.getMessage());
        }
        return mysqlconfig;
    }
    
    // Delete
    public int deleteCard(String id_criminal) {
        try {
            String sql = "DELETE FROM `images` WHERE `id_criminal`=?";
            PreparedStatement statement = configDB().prepareStatement(sql);
            statement.setString(1, id_criminal);
            return statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("koneksi gagal " +e.getMessage());
        }
        return 0;
    }
    
    // Update
    public int updateCard(String id_criminal, String name, String reward, byte[] image) {
        try {
            String sql;
            PreparedStatement statement;
            
            
            if (image == null) {
                if (reward.isEmpty()) { // Update name only
                    sql = "UPDATE `images` SET `name`=? WHERE `id_criminal`=?";
                    statement = configDB().prepareStatement(sql);
                    statement.setString(1, name);
                    statement.setString(2, id_criminal);
                } else { // Update name and reward
                    sql = "UPDATE `images` SET `name`=?, `reward`=? WHERE `id_criminal`=?";
                    statement = configDB().prepareStatement(sql);
                    statement.setString(1, name);
                    statement.setString(2, reward);
                    statement.setString(3, id_criminal);
                }
            } else if(reward.isEmpty()) { // Update name and image
                sql = "UPDATE `images` SET `name`=?, `image`=? WHERE `id_criminal`=?";
                    statement = configDB().prepareStatement(sql);
                    statement.setString(1, name);
                    statement.setBytes(2, image);
                    statement.setString(3, id_criminal);
            }else { // Update name, reward, and image                
                sql = "UPDATE `images` SET `name`=?, `reward`=?, `image`=? WHERE `id_criminal`=?";
                statement = configDB().prepareStatement(sql);
                statement.setString(1, name);
                statement.setString(2, reward);
                statement.setBytes(3, image);
                statement.setString(4, id_criminal);
            }

            return statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Failed " +e.getMessage());
        }
        return 0;
    }
}
