package views;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIManager;

import java.sql.*;

import utils.DatabaseConnection;

public class Register extends javax.swing.JFrame {


    public Register() {
        initComponents();
        // PLACEHOLDER FOR EACH FIELDS
        fullnameField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Fullname");
        fullnameField.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        whatsappNumber.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "WhatsApp Number");
        whatsappNumber.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        username.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Username");
        username.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        password.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Password");
        password.putClientProperty(FlatClientProperties.STYLE,  "showRevealButton: true");
    }
    
     // REGISTER TO DATABSE
    private boolean registerUser(String fullName, String wa, String userName, String password) {
        boolean isRegistered = false;
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "INSERT INTO users (fullname, whatsapp, username, password) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, fullName);
            preparedStatement.setString(2, wa);
            preparedStatement.setString(3, userName);
            preparedStatement.setString(4, password);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                isRegistered = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isRegistered;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jMenu1 = new javax.swing.JMenu();
        jDialog2 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fullnameField = new javax.swing.JFormattedTextField();
        whatsappNumber = new javax.swing.JFormattedTextField();
        username = new javax.swing.JFormattedTextField();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        toLoginPage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mtrans_icon.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_register.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        fullnameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fullnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameFieldActionPerformed(evt);
            }
        });
        jPanel1.add(fullnameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 280, 35));

        whatsappNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        whatsappNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whatsappNumberActionPerformed(evt);
            }
        });
        jPanel1.add(whatsappNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 280, 35));

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 280, 35));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 280, 35));

        jButton1.setBackground(new java.awt.Color(128, 230, 253));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 94, 155));
        jButton1.setText("REGISTER!");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 280, 35));

        toLoginPage.setBackground(new java.awt.Color(204, 204, 204));
        toLoginPage.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        toLoginPage.setForeground(new java.awt.Color(204, 204, 204));
        toLoginPage.setText("Sudah ada akun?");
        toLoginPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toLoginPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toLoginPageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toLoginPageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toLoginPageMouseExited(evt);
            }
        });
        jPanel1.add(toLoginPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, -1, -1));

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void fullnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameFieldActionPerformed

    private void whatsappNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whatsappNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_whatsappNumberActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void toLoginPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLoginPageMouseClicked
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toLoginPageMouseClicked

    private void toLoginPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLoginPageMouseEntered
        toLoginPage.setForeground(new java.awt.Color(0, 94, 155));
    }//GEN-LAST:event_toLoginPageMouseEntered

    private void toLoginPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toLoginPageMouseExited
        toLoginPage.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_toLoginPageMouseExited

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

//        boolean status = registerUser(fullnameField.getText(), whatsappNumber.getText(),username.getText(), password.getText());
        
        if (registerUser(fullnameField.getText(), whatsappNumber.getText(),username.getText(), password.getText())) {
            status.setText("Pendaftaran Berhasil!");
        } else {
            status.setText("Sudah terdaftar / ada yang salah saat mengisi form!");
        }
    }//GEN-LAST:event_jButton1MouseClicked
              
    
    
    
    public static void main(String args[]) {
        // Set Nimbus Theme
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            UIManager.put( "TextComponent.arc", 10 );
            UIManager.put("Button.arc", 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField fullnameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel status;
    private javax.swing.JLabel toLoginPage;
    private javax.swing.JFormattedTextField username;
    private javax.swing.JFormattedTextField whatsappNumber;
    // End of variables declaration//GEN-END:variables
}
