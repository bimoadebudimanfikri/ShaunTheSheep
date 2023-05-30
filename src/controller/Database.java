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
import model.AnimalFactory;
import model.Domba;
import model.Kambing;
import static model.Pemilik.getRandomGender;
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
    
    public String getIdTerbaruSapi() {
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

    public String getIdTerbaruKambing() {
        String idTerbaru = "";

        try {
            // Mendapatkan ID terakhir dari sapi yang baru ditambahkan
            try (
                Connection connection = getConnection()) {
                String getLastIDQuery = "SELECT id FROM tabel_kambing ORDER BY id DESC LIMIT 1";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(getLastIDQuery);

                int lastID;
                if (resultSet.next()) {
                    lastID = resultSet.getInt("id");
                    lastID++; // Menambahkan 1 ke ID terakhir
                } else {
                    lastID = 1; // Jika tidak ada record, mulai dari 1
                }

                String getIdQuery = "SELECT id FROM tabel_kambing";
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
        
    public String getIdTerbaruDomba() {
        String idTerbaru = "";

        try {
            // Mendapatkan ID terakhir dari sapi yang baru ditambahkan
            try (
                Connection connection = getConnection()) {
                String getLastIDQuery = "SELECT id FROM tabel_domba ORDER BY id DESC LIMIT 1";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(getLastIDQuery);

                int lastID;
                if (resultSet.next()) {
                    lastID = resultSet.getInt("id");
                    lastID++; // Menambahkan 1 ke ID terakhir
                } else {
                    lastID = 1; // Jika tidak ada record, mulai dari 1
                }

                String getIdQuery = "SELECT id FROM tabel_domba";
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
            String sql="INSERT INTO tabel_sapi VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            pstmt.setLong(14, sapi.getHarga());

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
            String sql="INSERT INTO tabel_kambing VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            pstmt.setLong(14, kambing.getHarga());

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
            String sql="INSERT INTO tabel_domba VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            pstmt.setLong(14, domba.getHarga());

           pstmt.executeUpdate();
        
        } catch(SQLException ex){
            throw ex;
        
        } finally{
            if(conn!=null){
                conn.close();
            }
        }    
    }
    
//    public Sapi breedSapi(Sapi jantan, Sapi betina){
//        if(jantan.getJenis_kelamin() == "jantan" && betina.getJenis_kelamin() == "betina" && jantan.getUsia() == 18 && betina.getUsia() == 18){
//            String jk = getRandomGender();
//            Sapi anakSapi = (Sapi) AnimalFactory.addFromBreeding("sapi", jk, 18, 1);
//            return anakSapi;
//        }
//        return null;
//    }

// RISTA START
public List<Sapi> getListSapiLapar() throws SQLException {
        List<Sapi> sapiList = new ArrayList<>();
        Connection conn = getConnection();
        
        try {
            String sql = "SELECT * FROM tabel_sapi WHERE statusMakan = '0'";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                Sapi sapi = new Sapi();
                sapi.setKode(rs.getString("id"));
                sapi.setNoKamar(rs.getString("noKamar"));
                sapi.setBerat(rs.getInt("berat"));
                sapi.setUsia(rs.getInt("usia"));
                sapi.setStatusMakan(rs.getBoolean("statusMakan"));
                
                sapiList.add(sapi);
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return sapiList;
    }
    
    public List<Kambing> getListKambingLapar() throws SQLException {
        List<Kambing> kambingList = new ArrayList<>();
        Connection conn = getConnection();
        
        try {
            String sql = "SELECT * FROM tabel_kambing";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                Kambing kambing = new Kambing();
                kambing.setKode(rs.getString("id"));
                kambing.setNoKamar(rs.getString("noKamar"));
                kambing.setBerat(rs.getInt("berat"));
                kambing.setUsia(rs.getInt("usia"));
                kambing.setStatusMakan(rs.getBoolean("statusMakan"));
                
                kambingList.add(kambing);
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return kambingList;
    }
    
    public List<Domba> getListDombaLapar() throws SQLException {
        List<Domba> dombaList = new ArrayList<>();
        Connection conn = getConnection();
        
        try {
            String sql = "SELECT * FROM tabel_domba";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                Domba domba = new Domba();
                domba.setKode(rs.getString("id"));
                domba.setNoKamar(rs.getString("noKamar"));
                domba.setBerat(rs.getInt("berat"));
                domba.setUsia(rs.getInt("usia"));
                domba.setStatusMakan(rs.getBoolean("statusMakan"));
                
                dombaList.add(domba);
            }
        } catch (SQLException ex) {
            throw ex;
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return dombaList;
    }
    // RISTA END
    //Afnan Awal
    public List<Sapi> getListSapi() throws SQLException{
        List<Sapi> sapiList = new ArrayList<>();
        Connection conn = getConnection();
        try{
            String sql = "SELECT * FROM tabel_sapi";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Sapi sapi = new Sapi();
                sapi.setKode(rs.getString("id"));
                sapi.setNoKandang(rs.getString("noKandang"));
                sapi.setNoKamar(rs.getString("noKamar"));
                sapi.setJenis_kelamin(rs.getString("jenis_kelamin"));
                sapi.setBerat(rs.getInt("berat"));
                sapi.setUsia(rs.getInt("usia"));
                sapi.setTanggalDaftar(rs.getTimestamp("tanggalDaftar").toLocalDateTime());
                sapi.setAsal(rs.getString("asal"));
                sapi.setStatusTerjual(rs.getBoolean("status_terjual"));
                sapi.setStatusKesehatan(rs.getBoolean("status_vaksin"));
                sapi.setStatusVaksin(rs.getBoolean("status_vaksin"));
                sapi.setStatusMakan(rs.getBoolean("status_makan"));
                sapi.setHarga(rs.getLong("harga"));

                sapiList.add(sapi);
            }
        }catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null){
                conn.close();
        }
 }
 
 return sapiList;
 }
    //Afnan Akhir
//KRISTHYNE START
    public List<Sapi> getListSapiSakit() throws SQLException{
        List<Sapi> sapiList = new ArrayList<>();
        Connection conn = getConnection();
        try
        {
            String sql = "SELECT * FROM tabel_sapi WHERE statusVaksin = '0' ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Sapi sapi = new Sapi();
                sapi.setKode(rs.getString("id"));
                sapi.setStatusVaksin(rs.getBoolean("statusvaksin"));
                
                sapiList.add(sapi);
            }
        }
        catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null) {
                conn.close();
            }
        }
        return sapiList;
    }
    
    public List<Sapi> getListSapiSehat() throws SQLException{
        List<Sapi> sapiList = new ArrayList<>();
        Connection conn = getConnection();
        try
        {
            String sql = "SELECT * FROM tabel_sapi WHERE statusVaksin = '1' ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Sapi sapi = new Sapi();
                sapi.setKode(rs.getString("id"));
                sapi.setStatusVaksin(rs.getBoolean("statusvaksin"));
                
                sapiList.add(sapi);
            }
        }
        catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null) {
                conn.close();
            }
        }
        return sapiList;
    }
    
    public List<Kambing> getListKambingSakit() throws SQLException{
        List<Kambing> kambingList = new ArrayList<>();
        Connection conn = getConnection();
        try
        {
            String sql = "SELECT * FROM tabel_kambing WHERE statusVaksin = '0' ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Kambing kambing = new Kambing();
                kambing.setKode(rs.getString("id"));
                kambing.setStatusVaksin(rs.getBoolean("statusvaksin"));
                
                kambingList.add(kambing);
            }
        }
        catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null) {
                conn.close();
            }
        }
        return kambingList;
    }
    
    public List<Kambing> getListKambingSehat() throws SQLException{
        List<Kambing> kambingList = new ArrayList<>();
        Connection conn = getConnection();
        try
        {
            String sql = "SELECT * FROM tabel_kambing WHERE statusVaksin = '1' ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Kambing kambing = new Kambing();
                kambing.setKode(rs.getString("id"));
                kambing.setStatusVaksin(rs.getBoolean("statusvaksin"));
                
                kambingList.add(kambing);
            }
        }
        catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null) {
                conn.close();
            }
        }
        return kambingList;
    }
    
        public List<Domba> getListDombaSakit() throws SQLException{
        List<Domba> dombaList = new ArrayList<>();
        Connection conn = getConnection();
        try
        {
            String sql = "SELECT * FROM tabel_domba WHERE statusVaksin = '0' ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Domba domba = new Domba();
                domba.setKode(rs.getString("id"));
                domba.setStatusVaksin(rs.getBoolean("statusvaksin"));
                
                dombaList.add(domba);
            }
        }
        catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null) {
                conn.close();
            }
        }
        return dombaList;
    }
    
        public List<Domba> getListDombaSehat() throws SQLException{
        List<Domba> dombaList = new ArrayList<>();
        Connection conn = getConnection();
        try
        {
            String sql = "SELECT * FROM tabel_domba WHERE statusVaksin = '1' ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Domba domba = new Domba();
                domba.setKode(rs.getString("id"));
                domba.setStatusVaksin(rs.getBoolean("statusvaksin"));
                
                dombaList.add(domba);
            }
        }
        catch(SQLException ex){
            throw ex;
        } finally{
            if (conn!=null) {
                conn.close();
            }
        }
        return dombaList;
    }
    //KRISTHYNE END
    
}
