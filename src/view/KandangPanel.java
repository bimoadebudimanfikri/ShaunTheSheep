/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

/**
 *
 * @author Lenovo
 */
public class KandangPanel extends javax.swing.JPanel {

    /**
     * Creates new form KandangPanel
     */
    public KandangPanel() {
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
        title1 = new javax.swing.JLabel();
        btnSapi = new javax.swing.JButton();
        btnSapi1 = new javax.swing.JButton();
        btnSapi2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnTambahKandang = new javax.swing.JButton();
        btnHapusKandang = new javax.swing.JButton();

        basePanel.setBackground(new java.awt.Color(204, 255, 255));
        basePanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        basePanel.setPreferredSize(new java.awt.Dimension(750, 600));

        title1.setBackground(new java.awt.Color(255, 255, 255));
        title1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 153, 153));
        title1.setText("Kandang");

        btnSapi.setBackground(new java.awt.Color(51, 255, 204));
        btnSapi.setForeground(new java.awt.Color(0, 0, 0));
        btnSapi.setText("SAPI");
        btnSapi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSapi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapiActionPerformed(evt);
            }
        });

        btnSapi1.setBackground(new java.awt.Color(51, 255, 204));
        btnSapi1.setForeground(new java.awt.Color(0, 0, 0));
        btnSapi1.setText("KAMBING");
        btnSapi1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSapi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapi1ActionPerformed(evt);
            }
        });

        btnSapi2.setBackground(new java.awt.Color(51, 255, 204));
        btnSapi2.setForeground(new java.awt.Color(0, 0, 0));
        btnSapi2.setText("DOMBA");
        btnSapi2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSapi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapi2ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jTable1.setForeground(new java.awt.Color(204, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kandang", "Terisi", "Kapasitas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnTambahKandang.setBackground(new java.awt.Color(0, 153, 153));
        btnTambahKandang.setForeground(new java.awt.Color(255, 255, 255));
        btnTambahKandang.setText("TAMBAH");
        btnTambahKandang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTambahKandang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahKandangActionPerformed(evt);
            }
        });

        btnHapusKandang.setBackground(new java.awt.Color(0, 153, 153));
        btnHapusKandang.setForeground(new java.awt.Color(255, 255, 255));
        btnHapusKandang.setText("HAPUS");
        btnHapusKandang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHapusKandang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusKandangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basePanelLayout.createSequentialGroup()
                        .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(507, 507, 507))
                    .addGroup(basePanelLayout.createSequentialGroup()
                        .addComponent(btnSapi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSapi1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSapi2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(basePanelLayout.createSequentialGroup()
                        .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(basePanelLayout.createSequentialGroup()
                                .addComponent(btnTambahKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHapusKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(title1)
                .addGap(27, 27, 27)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSapi, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSapi1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSapi2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapusKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSapiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSapiActionPerformed

    private void btnSapi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSapi1ActionPerformed

    private void btnSapi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapi2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSapi2ActionPerformed

    private void btnTambahKandangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahKandangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahKandangActionPerformed

    private void btnHapusKandangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusKandangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusKandangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel basePanel;
    private javax.swing.JButton btnHapusKandang;
    private javax.swing.JButton btnSapi;
    private javax.swing.JButton btnSapi1;
    private javax.swing.JButton btnSapi2;
    private javax.swing.JButton btnTambahKandang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}