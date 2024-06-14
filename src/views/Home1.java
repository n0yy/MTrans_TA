package views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.time.ZoneId;

public class Home1 extends javax.swing.JFrame {
    public Home1() {
        initComponents();
    }

//     private void checkScheduleAvailability(String keberangkatan, String tujuan, LocalDate tanggal) {
    
// }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxKeberangkatan = new javax.swing.JComboBox<>();
        jLabel_tanggal = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jComboBoxTujuan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButtonCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("JADIKAN M-TRANS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("JADI TEMAN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("PERJALANMU!");

        jComboBoxKeberangkatan.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jComboBoxKeberangkatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kota Keberangkatan", "JAKARTA", "BOGOR", "TANGGERANG" }));
        jComboBoxKeberangkatan.setToolTipText("");
        jComboBoxKeberangkatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxKeberangkatanActionPerformed(evt);
            }
        });

        jLabel_tanggal.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jLabel_tanggal.setText("Tanggal Keberangkatan");

        jComboBoxTujuan.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jComboBoxTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kota Tujuan", "MALANG" }));
        jComboBoxTujuan.setToolTipText("");
        jComboBoxTujuan.setPreferredSize(new java.awt.Dimension(94, 34));
        jComboBoxTujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTujuanActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background1.png"))); // NOI18N

        jButtonCari.setBackground(new java.awt.Color(128, 230, 253));
        jButtonCari.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCari.setForeground(new java.awt.Color(0, 94, 155));
        jButtonCari.setText("Cari Tiket");
        jButtonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_tanggal)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxKeberangkatan, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxKeberangkatan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_tanggal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxKeberangkatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxKeberangkatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxKeberangkatanActionPerformed

    private void jComboBoxTujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTujuanActionPerformed

    private void jButtonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCariActionPerformed
        // TODO add your handling code here:
        String keberangkatan = jComboBoxKeberangkatan.getSelectedItem().toString();
        String tujuan = jComboBoxTujuan.getSelectedItem().toString();
        LocalDate tanggal = jDateChooser.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    
        if (keberangkatan.equals("Jakarta") && tujuan.equals("Malang") && !tanggal.isBefore(LocalDate.now())) {
            RUTEJKT nextPage = new RUTEJKT();
            nextPage.setVisible(true);
            this.dispose();
        } else if (keberangkatan.equals("Malang") && tujuan.equals("Jakarta")) {
            RUTEMALANG nextPage = new RUTEMALANG();
            nextPage.setVisible(true);
            this.dispose();
        } else {
            // handle other cases or show error message
            JOptionPane.showMessageDialog(this, "Rute tidak tersedia atau tanggal tidak valid");
        }
    }
        // Tiket tiket = new Tiket();
        // tiket.setVisible(true);
        // this.dispose();
        //GEN-LAST:event_jButtonCariActionPerformed

    /**
     * @param args the command line arguments
     */
    /**public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home1().setVisible(true);
            }
        });
    }**/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCari;
    private javax.swing.JComboBox<String> jComboBoxKeberangkatan;
    private javax.swing.JComboBox<String> jComboBoxTujuan;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_tanggal;
    // End of variables declaration//GEN-END:variables
}
