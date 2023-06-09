/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import model.Domba;
import model.Kambing;
import model.Pemilik;
import model.Sapi;

/**
 *
 * @author Lenovo
 */
public class DashboardPanel extends javax.swing.JPanel {
    
    Pemilik pemilik = new Pemilik();
    /**
     * Creates new form DashboardPanel
     */
    public DashboardPanel() {
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

        basePanel = new javax.swing.JPanel();
        judulKapasitas = new javax.swing.JLabel();
        panelJumlahSapi = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtJumlahSapi = new javax.swing.JTextField();
        panelJumlahKambing = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtJumlahKambing = new javax.swing.JTextField();
        panelJumlahDomba = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtJumlahDomba = new javax.swing.JTextField();
        judulDashboard = new javax.swing.JLabel();
        judulSaldoMasuk = new javax.swing.JLabel();
        txtJumlahSapi1 = new javax.swing.JTextField();
        panelKapasitas = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTotalHewan = new javax.swing.JTextField();
        txtKapasitas = new javax.swing.JTextField();
        txtJumlahSapi4 = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        judulKapasitas1 = new javax.swing.JLabel();
        panelKapasitas1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtTotalHewan1 = new javax.swing.JTextField();
        txtKapasitas1 = new javax.swing.JTextField();
        txtJumlahSapi5 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(600, 605));

        basePanel.setBackground(new java.awt.Color(204, 255, 255));
        basePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        basePanel.setPreferredSize(new java.awt.Dimension(750, 600));

        judulKapasitas.setBackground(new java.awt.Color(255, 255, 255));
        judulKapasitas.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        judulKapasitas.setForeground(new java.awt.Color(0, 153, 153));
        judulKapasitas.setText("Kapasitas");

        panelJumlahSapi.setBackground(new java.awt.Color(255, 255, 255));
        panelJumlahSapi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Sapi");

        txtJumlahSapi.setEditable(false);
        txtJumlahSapi.setBackground(new java.awt.Color(255, 255, 255));
        txtJumlahSapi.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        txtJumlahSapi.setForeground(new java.awt.Color(51, 51, 51));
        txtJumlahSapi.setText("10");
        txtJumlahSapi.setBorder(null);
        txtJumlahSapi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahSapiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelJumlahSapiLayout = new javax.swing.GroupLayout(panelJumlahSapi);
        panelJumlahSapi.setLayout(panelJumlahSapiLayout);
        panelJumlahSapiLayout.setHorizontalGroup(
            panelJumlahSapiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJumlahSapiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJumlahSapiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtJumlahSapi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelJumlahSapiLayout.setVerticalGroup(
            panelJumlahSapiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJumlahSapiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJumlahSapi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelJumlahKambing.setBackground(new java.awt.Color(255, 255, 255));
        panelJumlahKambing.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Kambing");

        txtJumlahKambing.setEditable(false);
        txtJumlahKambing.setBackground(new java.awt.Color(255, 255, 255));
        txtJumlahKambing.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        txtJumlahKambing.setForeground(new java.awt.Color(51, 51, 51));
        txtJumlahKambing.setText("10");
        txtJumlahKambing.setBorder(null);
        txtJumlahKambing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahKambingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelJumlahKambingLayout = new javax.swing.GroupLayout(panelJumlahKambing);
        panelJumlahKambing.setLayout(panelJumlahKambingLayout);
        panelJumlahKambingLayout.setHorizontalGroup(
            panelJumlahKambingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJumlahKambingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(panelJumlahKambingLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(txtJumlahKambing)
                .addContainerGap())
        );
        panelJumlahKambingLayout.setVerticalGroup(
            panelJumlahKambingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJumlahKambingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJumlahKambing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        panelJumlahDomba.setBackground(new java.awt.Color(255, 255, 255));
        panelJumlahDomba.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Domba");

        txtJumlahDomba.setEditable(false);
        txtJumlahDomba.setBackground(new java.awt.Color(255, 255, 255));
        txtJumlahDomba.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        txtJumlahDomba.setForeground(new java.awt.Color(51, 51, 51));
        txtJumlahDomba.setText("10");
        txtJumlahDomba.setBorder(null);
        txtJumlahDomba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahDombaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelJumlahDombaLayout = new javax.swing.GroupLayout(panelJumlahDomba);
        panelJumlahDomba.setLayout(panelJumlahDombaLayout);
        panelJumlahDombaLayout.setHorizontalGroup(
            panelJumlahDombaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJumlahDombaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(panelJumlahDombaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtJumlahDomba)
                .addContainerGap())
        );
        panelJumlahDombaLayout.setVerticalGroup(
            panelJumlahDombaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJumlahDombaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtJumlahDomba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        judulDashboard.setBackground(new java.awt.Color(255, 255, 255));
        judulDashboard.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        judulDashboard.setForeground(new java.awt.Color(0, 153, 153));
        judulDashboard.setText("Dashboard");

        judulSaldoMasuk.setBackground(new java.awt.Color(255, 255, 255));
        judulSaldoMasuk.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        judulSaldoMasuk.setForeground(new java.awt.Color(0, 153, 153));
        judulSaldoMasuk.setText("Saldo Masuk");

        txtJumlahSapi1.setEditable(false);
        txtJumlahSapi1.setBackground(new java.awt.Color(255, 255, 255));
        txtJumlahSapi1.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        txtJumlahSapi1.setForeground(new java.awt.Color(51, 51, 51));
        txtJumlahSapi1.setText("10");
        txtJumlahSapi1.setBorder(null);
        txtJumlahSapi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahSapi1ActionPerformed(evt);
            }
        });

        panelKapasitas.setBackground(new java.awt.Color(255, 255, 255));
        panelKapasitas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Terisi");

        txtTotalHewan.setEditable(false);
        txtTotalHewan.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalHewan.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        txtTotalHewan.setForeground(new java.awt.Color(51, 51, 51));
        txtTotalHewan.setText("100");
        txtTotalHewan.setBorder(null);
        txtTotalHewan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHewanActionPerformed(evt);
            }
        });

        txtKapasitas.setEditable(false);
        txtKapasitas.setBackground(new java.awt.Color(255, 255, 255));
        txtKapasitas.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtKapasitas.setForeground(new java.awt.Color(51, 51, 51));
        txtKapasitas.setText("10");
        txtKapasitas.setBorder(null);
        txtKapasitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKapasitasActionPerformed(evt);
            }
        });

        txtJumlahSapi4.setEditable(false);
        txtJumlahSapi4.setBackground(new java.awt.Color(255, 255, 255));
        txtJumlahSapi4.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtJumlahSapi4.setForeground(new java.awt.Color(51, 51, 51));
        txtJumlahSapi4.setText("/");
        txtJumlahSapi4.setBorder(null);
        txtJumlahSapi4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahSapi4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKapasitasLayout = new javax.swing.GroupLayout(panelKapasitas);
        panelKapasitas.setLayout(panelKapasitasLayout);
        panelKapasitasLayout.setHorizontalGroup(
            panelKapasitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKapasitasLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(panelKapasitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKapasitasLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKapasitasLayout.createSequentialGroup()
                        .addComponent(txtTotalHewan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJumlahSapi4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKapasitas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelKapasitasLayout.setVerticalGroup(
            panelKapasitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKapasitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(panelKapasitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalHewan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKapasitas, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumlahSapi4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnRefresh.setBackground(new java.awt.Color(0, 153, 153));
        btnRefresh.setFont(new java.awt.Font("Segoe UI Semilight", 1, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("R E F R E S H");
        btnRefresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        judulKapasitas1.setBackground(new java.awt.Color(255, 255, 255));
        judulKapasitas1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        judulKapasitas1.setForeground(new java.awt.Color(0, 153, 153));
        judulKapasitas1.setText("Kandang");

        panelKapasitas1.setBackground(new java.awt.Color(255, 255, 255));
        panelKapasitas1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Terisi");

        txtTotalHewan1.setEditable(false);
        txtTotalHewan1.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalHewan1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        txtTotalHewan1.setForeground(new java.awt.Color(51, 51, 51));
        txtTotalHewan1.setText("100");
        txtTotalHewan1.setBorder(null);
        txtTotalHewan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHewan1ActionPerformed(evt);
            }
        });

        txtKapasitas1.setEditable(false);
        txtKapasitas1.setBackground(new java.awt.Color(255, 255, 255));
        txtKapasitas1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtKapasitas1.setForeground(new java.awt.Color(51, 51, 51));
        txtKapasitas1.setText("10");
        txtKapasitas1.setBorder(null);
        txtKapasitas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKapasitas1ActionPerformed(evt);
            }
        });

        txtJumlahSapi5.setEditable(false);
        txtJumlahSapi5.setBackground(new java.awt.Color(255, 255, 255));
        txtJumlahSapi5.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txtJumlahSapi5.setForeground(new java.awt.Color(51, 51, 51));
        txtJumlahSapi5.setText("/");
        txtJumlahSapi5.setBorder(null);
        txtJumlahSapi5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahSapi5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKapasitas1Layout = new javax.swing.GroupLayout(panelKapasitas1);
        panelKapasitas1.setLayout(panelKapasitas1Layout);
        panelKapasitas1Layout.setHorizontalGroup(
            panelKapasitas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKapasitas1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(panelKapasitas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKapasitas1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelKapasitas1Layout.createSequentialGroup()
                        .addComponent(txtTotalHewan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJumlahSapi5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKapasitas1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelKapasitas1Layout.setVerticalGroup(
            panelKapasitas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKapasitas1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(panelKapasitas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalHewan1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKapasitas1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJumlahSapi5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(judulSaldoMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 933, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtJumlahSapi1)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(basePanelLayout.createSequentialGroup()
                            .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(judulKapasitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelKapasitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(judulKapasitas1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelKapasitas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(62, 62, 62))
                        .addGroup(basePanelLayout.createSequentialGroup()
                            .addComponent(panelJumlahSapi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(panelJumlahKambing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(panelJumlahDomba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(judulDashboard))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(judulDashboard)
                .addGap(37, 37, 37)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelJumlahSapi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelJumlahKambing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelJumlahDomba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulKapasitas)
                    .addComponent(judulKapasitas1))
                .addGap(18, 18, 18)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelKapasitas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelKapasitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(judulSaldoMasuk)
                .addGap(18, 18, 18)
                .addComponent(txtJumlahSapi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtJumlahSapiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahSapiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahSapiActionPerformed

    private void txtJumlahKambingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahKambingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahKambingActionPerformed

    private void txtJumlahDombaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahDombaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahDombaActionPerformed

    private void txtJumlahSapi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahSapi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahSapi1ActionPerformed

    private void txtKapasitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKapasitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKapasitasActionPerformed

    private void txtTotalHewanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHewanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHewanActionPerformed

    private void txtJumlahSapi4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahSapi4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahSapi4ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        int jmlhSapi = Sapi.getCounter();
        String s1 = Integer.toString(jmlhSapi);
        txtJumlahSapi.setText(s1);  
        
        int jmlhKambing = Kambing.getCounter();
        String s2 = Integer.toString(jmlhKambing);
        txtJumlahKambing.setText(s2); 
        
        int jmlhDomba = Domba.getCounter();
        String s3 = Integer.toString(jmlhDomba);
        txtJumlahDomba.setText(s3);
        
        int kapasitas = pemilik.totalKandang();
        int totalHewan = pemilik.totalHewan();
        String s4 = Integer.toString(kapasitas);
        String s5 = Integer.toString(totalHewan);
        txtKapasitas.setText(s4);
        txtTotalHewan.setText(s5);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtTotalHewan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHewan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHewan1ActionPerformed

    private void txtKapasitas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKapasitas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKapasitas1ActionPerformed

    private void txtJumlahSapi5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahSapi5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahSapi5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel judulDashboard;
    private javax.swing.JLabel judulKapasitas;
    private javax.swing.JLabel judulKapasitas1;
    private javax.swing.JLabel judulSaldoMasuk;
    private javax.swing.JPanel panelJumlahDomba;
    private javax.swing.JPanel panelJumlahKambing;
    private javax.swing.JPanel panelJumlahSapi;
    private javax.swing.JPanel panelKapasitas;
    private javax.swing.JPanel panelKapasitas1;
    private javax.swing.JTextField txtJumlahDomba;
    private javax.swing.JTextField txtJumlahKambing;
    private javax.swing.JTextField txtJumlahSapi;
    private javax.swing.JTextField txtJumlahSapi1;
    private javax.swing.JTextField txtJumlahSapi4;
    private javax.swing.JTextField txtJumlahSapi5;
    private javax.swing.JTextField txtKapasitas;
    private javax.swing.JTextField txtKapasitas1;
    private javax.swing.JTextField txtTotalHewan;
    private javax.swing.JTextField txtTotalHewan1;
    // End of variables declaration//GEN-END:variables
}
