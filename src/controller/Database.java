/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Animal;
import model.Domba;
import model.Kambing;
import model.Sapi;

/**
 *
 * @author Lenovo
 */
public class Database 
{
    public static Database instance;
    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3308";       // bisa diganti tergantung port mySQL nya gess default nya 3306
    private final String DB_NAME = "shaunthesheep";
    private final String DB_USER = "root";
    private final String DB_PASS = "";
    
    public Database(){
    }
    
    public static synchronized Database getInstance()
    {
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }
    
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:"+DB_TYPE+"://"+DB_HOST+":"+DB_PORT+"/"+DB_NAME,DB_USER,DB_PASS);
    }
    
    public void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Connection closed");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public String getIdTerbaru() {
        String idTerbaru = "";

        try {
            // Mendapatkan ID terakhir dari sapi yang baru ditambahkan
            try (
                Connection connection = getConnection()) {
                String getLastIDQuery = "SELECT id FROM tabel_sapi ORDER BY id DESC LIMIT 1";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(getLastIDQuery);

                int lastID;
                if (resultSet.next()) {
                    lastID = resultSet.getInt("id");
                    lastID++; // Menambahkan 1 ke ID terakhir
                } else {
                    lastID = 1; // Jika tidak ada record, mulai dari 1
                }

                String getIdQuery = "SELECT id FROM tabel_sapi";
                ResultSet idResultSet = statement.executeQuery(getIdQuery);
                List<String> idList = new ArrayList<>();
                while (idResultSet.next()) {
                    String id = idResultSet.getString("id");
                    idList.add(id);
                }

                String missingIdResult = findMissingId(idList, lastID);
                if (missingIdResult.equals("No missing ID found")) {
                    idTerbaru = String.format("%03d", lastID);
                } else {
                    idTerbaru = missingIdResult;
                }

                // Menutup koneksi
                resultSet.close();
                statement.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return idTerbaru;
    }

    public static String findMissingId(List<String> idList, int lastID) {
        int expectedId = 1;
        for (String id : idList) {
            int currentId = Integer.parseInt(id.substring(1));
            if (currentId != expectedId) {
                return String.format("%03d", expectedId);
            }
            expectedId++;
        }
        if (lastID > expectedId) {
            return String.format("%03d", expectedId);
        }
        return "No missing ID found";
    }

    public void insertSapi(Sapi sapi) throws SQLException
    {
        Connection conn = getConnection();
        
        try {
            String sql="INSERT INTO tabel_sapi VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, sapi.getKode());
            pstmt.setString(2, sapi.getJenis());
            pstmt.setString(3, sapi.getJenis_kelamin());
            pstmt.setString(4, sapi.getTanggalDaftar().toString());
            pstmt.setString(5, sapi.getAsal());
            pstmt.setInt(6, sapi.getBerat());
            pstmt.setInt(7, sapi.getUsia());
            pstmt.setString(8, sapi.getNoKamar());
            pstmt.setString(9, sapi.getNoKandang());
            pstmt.setBoolean(10, sapi.isStatusTerjual());
            pstmt.setBoolean(11, sapi.isStatusKesehatan());
            pstmt.setBoolean(12, sapi.isStatusVaksin());
            pstmt.setBoolean(13, sapi.isStatusMakan());

           pstmt.executeUpdate();
        
        } catch(SQLException ex){
            throw ex;
        
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }
        
    public void insertKambing(Kambing kambing) throws SQLException {
        
        Connection conn = getConnection();
        
        try {
            String sql="INSERT INTO tabel_kambing VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, kambing.getKode());
            pstmt.setString(2, kambing.getJenis());
            pstmt.setString(3, kambing.getJenis_kelamin());
            pstmt.setString(4, kambing.getTanggalDaftar().toString());
            pstmt.setString(5, kambing.getAsal());
            pstmt.setInt(6, kambing.getBerat());
            pstmt.setInt(7, kambing.getUsia());
            pstmt.setString(8, kambing.getNoKamar());
            pstmt.setString(9, kambing.getNoKandang());
            pstmt.setBoolean(10, kambing.isStatusTerjual());
            pstmt.setBoolean(11, kambing.isStatusKesehatan());
            pstmt.setBoolean(12, kambing.isStatusVaksin());
            pstmt.setBoolean(13, kambing.isStatusMakan());

           pstmt.executeUpdate();
        
        } catch(SQLException ex){
            throw ex;
        
        } finally{
            if(conn!=null){
                conn.close();
            }
        }
    }

    public void insertDomba(Domba domba) throws SQLException {
        Connection conn = getConnection();
        
        try {
            String sql="INSERT INTO tabel_domba VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            pstmt.setString(1, domba.getKode());
            pstmt.setString(2, domba.getJenis());
            pstmt.setString(3, domba.getJenis_kelamin());
            pstmt.setString(4, domba.getTanggalDaftar().toString());
            pstmt.setString(5, domba.getAsal());
            pstmt.setInt(6, domba.getBerat());
            pstmt.setInt(7, domba.getUsia());
            pstmt.setString(8, domba.getNoKamar());
            pstmt.setString(9, domba.getNoKandang());
            pstmt.setBoolean(10, domba.isStatusTerjual());
            pstmt.setBoolean(11, domba.isStatusKesehatan());
            pstmt.setBoolean(12, domba.isStatusVaksin());
            pstmt.setBoolean(13, domba.isStatusMakan());

           pstmt.executeUpdate();
        
        } catch(SQLException ex){
            throw ex;
        
        } finally{
            if(conn!=null){
                conn.close();
            }
        }    
    }
}
