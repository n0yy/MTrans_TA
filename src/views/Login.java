package views;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.UIManager;
import utils.DatabaseConnection;

import java.sql.*;

/**
 *
 * @author Ichasada
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        
        // PLACEHOLDER
        usernameField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Username");
        usernameField.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        
        passwordField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Password");
        passwordField.putClientProperty(FlatClientProperties.STYLE,  "showRevealButton: true");
        
    }

    // AUTHENTICATION
    private boolean login(String username, String password) {
        boolean isLogin = false;
        try (Connection conn = DatabaseConnection.getConnection()) {
            String query = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                isLogin = true;
            }
            
        } catch (SQLException e) {
            e.getMessage();
        }
        
        return isLogin;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JFormattedTextField();
        passwordField = new javax.swing.JPasswordField();
        toFrameHome = new javax.swing.JButton();
        toRegisterPage = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_login.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mtrans_icon.png"))); // NOI18N

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        toFrameHome.setBackground(new java.awt.Color(128, 230, 253));
        toFrameHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        toFrameHome.setForeground(new java.awt.Color(0, 94, 155));
        toFrameHome.setText("LOGIN!");
        toFrameHome.setBorderPainted(false);
        toFrameHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toFrameHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toFrameHomeMouseClicked(evt);
            }
        });
        toFrameHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toFrameHomeActionPerformed(evt);
            }
        });

        toRegisterPage.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        toRegisterPage.setForeground(new java.awt.Color(204, 204, 204));
        toRegisterPage.setText("Belum punya akun?");
        toRegisterPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        toRegisterPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                toRegisterPageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                toRegisterPageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                toRegisterPageMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(toFrameHome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(72, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(toRegisterPage)
                                .addGap(161, 161, 161))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(status)
                                .addGap(184, 184, 184))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(toFrameHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toRegisterPage)
                        .addGap(18, 18, 18)
                        .addComponent(status)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void toFrameHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toFrameHomeActionPerformed
        // TODO add your handling code here:
        Home1 home = new Home1();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toFrameHomeActionPerformed

    private void toRegisterPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toRegisterPageMouseClicked
        Register register = new Register();
        register.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_toRegisterPageMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void toRegisterPageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toRegisterPageMouseEntered
        toRegisterPage.setForeground(new java.awt.Color(0, 94, 155));
    }//GEN-LAST:event_toRegisterPageMouseEntered

    private void toRegisterPageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toRegisterPageMouseExited
        toRegisterPage.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_toRegisterPageMouseExited

    private void toFrameHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toFrameHomeMouseClicked
        // TODO add your handling code here:
        if (login(usernameField.getText(), passwordField.getText())) {
            status.setText("login berhasil");
        } else {
            status.setText("salah username atau password");
        }
    }//GEN-LAST:event_toFrameHomeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        // Set Theme
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            UIManager.put( "TextComponent.arc", 10 );
            UIManager.put("Button.arc", 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel status;
    private javax.swing.JButton toFrameHome;
    private javax.swing.JLabel toRegisterPage;
    private javax.swing.JFormattedTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
