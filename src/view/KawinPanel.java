/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import controller.Database;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Pemilik;
import model.Sapi;

/**
 *
 * @author Lenovo
 */
public class KawinPanel extends javax.swing.JPanel 
{    
    public ArrayList<Sapi> listSapiJantan = new ArrayList<>();
    public ArrayList<Sapi> listSapiBetina = new ArrayList<>();
    Pemilik pemilik = new Pemilik();
    Database database = new Database();

    /**
     * Creates new form KawinPanel
     */
    
    public KawinPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSapi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboJantan = new javax.swing.JComboBox<>();
        comboBetina = new javax.swing.JComboBox<>();
        btnKawinkan = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        btnSapi.setText("sapi");
        btnSapi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapiActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("jantan");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("betina");

        comboJantan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------" }));
        comboJantan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboJantanActionPerformed(evt);
            }
        });

        comboBetina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "------" }));

        btnKawinkan.setText("kawinkan");
        btnKawinkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKawinkanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKawinkan)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(comboJantan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnSapi)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(comboBetina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(302, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(btnSapi)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboJantan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboBetina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnKawinkan)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboJantanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboJantanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboJantanActionPerformed

    private void btnSapiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapiActionPerformed
        try {
            // TODO add your handling code here:
            Connection connection = Database.getInstance().getConnection();
            Statement statement = connection.createStatement();
            Statement statement2 = connection.createStatement();


            // jantan
            String sql1 = "SELECT * FROM tabel_sapi WHERE jenis_kelamin = 'jantan'";
            ResultSet rs = statement.executeQuery(sql1);
            
            // comboBox jantan
            while(rs.next()){
                comboJantan.addItem(rs.getString("id"));
                
                Sapi sapi = new Sapi();
                sapi.setKode(rs.getString("id"));
                sapi.setJenis(rs.getString("jenis_hewan"));
                sapi.setJenis_kelamin(rs.getString("jenis_kelamin"));
                sapi.setTanggalDaftar(rs.getTimestamp("tanggalDaftar").toLocalDateTime());
                sapi.setAsal(rs.getString("asal"));
                sapi.setBerat(rs.getInt("berat"));
                sapi.setUsia(rs.getInt("usia"));
                sapi.setNoKamar(rs.getString("noKamar"));
                sapi.setNoKandang(rs.getString("noKandang"));
                sapi.setStatusTerjual(rs.getBoolean("statusTerjual"));
                sapi.setStatusKesehatan(rs.getBoolean("statusKesehatan"));
                sapi.setStatusVaksin(rs.getBoolean("statusVaksin"));
                sapi.setStatusMakan(rs.getBoolean("statusMakan"));
                sapi.setHarga(rs.getLong("harga"));
                listSapiJantan.add(sapi);
            }

            // betina
            String sql2 = "SELECT * FROM tabel_sapi WHERE jenis_kelamin = 'betina'";
            ResultSet rs2 = statement2.executeQuery(sql2);

            // comboBox betina
            while(rs2.next()){
                comboBetina.addItem(rs2.getString("id"));
                
                Sapi sapi = new Sapi();
                sapi.setKode(rs2.getString("id"));
                sapi.setJenis(rs2.getString("jenis_hewan"));
                sapi.setJenis_kelamin(rs2.getString("jenis_kelamin"));
                sapi.setTanggalDaftar(rs2.getTimestamp("tanggalDaftar").toLocalDateTime());
                sapi.setAsal(rs2.getString("asal"));
                sapi.setBerat(rs2.getInt("berat"));
                sapi.setUsia(rs2.getInt("usia"));
                sapi.setNoKamar(rs2.getString("noKamar"));
                sapi.setNoKandang(rs2.getString("noKandang"));
                sapi.setStatusTerjual(rs2.getBoolean("statusTerjual"));
                sapi.setStatusKesehatan(rs2.getBoolean("statusKesehatan"));
                sapi.setStatusVaksin(rs2.getBoolean("statusVaksin"));
                sapi.setStatusMakan(rs2.getBoolean("statusMakan"));
                sapi.setHarga(rs2.getLong("harga"));
                listSapiBetina.add(sapi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KawinPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSapiActionPerformed

    private void btnKawinkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKawinkanActionPerformed
        // TODO add your handling code here:
        System.out.println(comboJantan.getSelectedItem().toString());
        System.out.println(comboBetina.getSelectedItem().toString());
        
        Sapi tempSapiJantan = null;
        for(Sapi sapi: listSapiJantan){
            if(sapi.getKode().equals(comboJantan.getSelectedItem().toString())){
                tempSapiJantan = sapi;
                System.out.println("kode sapi jantan: "+tempSapiJantan.getKode());
            }
        }
        
        Sapi tempSapiBetina = null;
        for(Sapi sapi: listSapiBetina){
            if(sapi.getKode().equals(comboBetina.getSelectedItem().toString())){
                tempSapiBetina = sapi;
                    System.out.println("kode sapi betina: "+tempSapiBetina.getKode());
            }
        }
        
        try {
            Sapi tempAnakSapi = pemilik.breedSapi(tempSapiJantan, tempSapiBetina);
            database.insertSapi(tempAnakSapi);
            JOptionPane.showMessageDialog(this, """
                                    Kawin Berhasil!

                                    telah lahir sapi tercinta :)
                                    kode: """ + tempAnakSapi.getKode() + 
                                    "\nberat: " + tempAnakSapi.getBerat() +
                                    "\nJenis kelamin: " + tempAnakSapi.getJenis_kelamin()
            );
        } catch (SQLException ex) {
            Logger.getLogger(KawinPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnKawinkanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKawinkan;
    private javax.swing.JButton btnSapi;
    private javax.swing.JComboBox<String> comboBetina;
    private javax.swing.JComboBox<String> comboJantan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}