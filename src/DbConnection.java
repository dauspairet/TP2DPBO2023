// Saya Muhamad Firdaus [2101995] mengerjakan
// soal TP 2 dalam mata kuliah DPBO
// untuk keberkahanNya maka saya tidak melakukan kecurangan 
// seperti yang telah dispesifikasikan. Aamiin.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Firdaus
 */
public class DbConnection {
    private static Connection mysqlconfig;
    private java.sql.Statement stmt = null;
    
    public static Connection configDB() throws SQLException{
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
    
    public ResultSet selectQuery(String sql){
        try {
            stmt.executeQuery(sql);
            return stmt.getResultSet();
        } catch (SQLException e) {
             System.err.println("koneksi gagal " +e.getMessage());
        }
        return null;
    }
    
    public int updateQuery(String sql){
        try {
            return stmt.executeUpdate(sql);
        } catch (SQLException e) {
             System.err.println("koneksi gagal " +e.getMessage());
        }
        return 0;
    }

    public Statement getStmt() {
        return stmt;
    }
}
