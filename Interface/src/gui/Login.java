package gui;
import control.koneksi;
import com.mysql.jdbc.Statement;
import control.control_login;
import control.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JFrame;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
        
public class Login extends javax.swing.JFrame {
    control_login cl;

    public Login() {
        initComponents();
        
        cl = new control_login();
        this.hide2.setVisible(false);
        setLocationRelativeTo(this);
        setResizable(false);
    }

    public void login(){
        try{
            String user = txuser.getText();
            String pass = txpass.getText();
            
            ResultSet rs = cl.login(user, pass);
            if(rs.next()){
                if(user.equalsIgnoreCase(rs.getString("username"))&&pass.equalsIgnoreCase(rs.getString("password"))){
                    MenuUtama mn = new MenuUtama();
                    MenuUtama.nama.setText(rs.getString("nama"));
                    
                    switch(rs.getInt("id_muser")){
                        case 1:
                            MenuUtama.level.setText("Owner");
                        break;
                        case 2:
                            MenuUtama.level.setText("Admin");
                        break;  
                        case 3:
                            MenuUtama.level.setText("Kasir");
                        break;
                    }
                    
                    dispose();
                    mn.setVisible(true);
                    JOptionPane.showMessageDialog(rootPane, "Selamat datang "+rs.getString("nama"));
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Username atau Password Salah, Silahkan coba kembalii");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "GAGAL LOGIN");
            }
        }catch (SQLException ex){
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "GAGAL KONEK KE DATABASE KARENA "+ex);
        }
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
        logo1 = new javax.swing.JLabel();
        deskripsi = new javax.swing.JLabel();
        judul = new javax.swing.JLabel();
        twitter_link = new javax.swing.JLabel();
        instagram_link = new javax.swing.JLabel();
        youtube_link = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        garis1 = new javax.swing.JSeparator();
        garis2 = new javax.swing.JSeparator();
        txuser = new javax.swing.JTextField();
        txpass = new javax.swing.JPasswordField();
        hide1 = new javax.swing.JLabel();
        hide2 = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        logousername = new javax.swing.JLabel();
        logopassword = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        btnlogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_management_120px_3.png"))); // NOI18N
        jPanel1.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 120, 120));

        deskripsi.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        deskripsi.setForeground(new java.awt.Color(255, 255, 255));
        deskripsi.setText("Inventory And Management");
        jPanel1.add(deskripsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 210, 50));

        judul.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 255, 255));
        judul.setText("I  M  A  N");
        jPanel1.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 150, 50));

        twitter_link.setForeground(new java.awt.Color(255, 255, 255));
        twitter_link.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_twitter_30px.png"))); // NOI18N
        twitter_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twitter_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitter_linkMouseClicked(evt);
            }
        });
        jPanel1.add(twitter_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, 30));

        instagram_link.setForeground(new java.awt.Color(255, 255, 255));
        instagram_link.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Instagram_30px_1.png"))); // NOI18N
        instagram_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        instagram_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instagram_linkMouseClicked(evt);
            }
        });
        jPanel1.add(instagram_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, 30));

        youtube_link.setForeground(new java.awt.Color(255, 255, 255));
        youtube_link.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_YouTube_30px.png"))); // NOI18N
        youtube_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        youtube_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                youtube_linkMouseClicked(evt);
            }
        });
        jPanel1.add(youtube_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(garis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 230, 30));
        jPanel2.add(garis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 230, 30));

        txuser.setBackground(new java.awt.Color(0, 0, 102));
        txuser.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txuser.setForeground(new java.awt.Color(255, 255, 255));
        txuser.setToolTipText("");
        txuser.setBorder(null);
        txuser.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 230, 30));
        txuser.getAccessibleContext().setAccessibleName("");

        txpass.setBackground(new java.awt.Color(0, 0, 102));
        txpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txpass.setForeground(new java.awt.Color(255, 255, 255));
        txpass.setBorder(null);
        txpass.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 210, 30));

        hide1.setForeground(new java.awt.Color(255, 255, 255));
        hide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_eye_20px.png"))); // NOI18N
        hide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide1MousePressed(evt);
            }
        });
        jPanel2.add(hide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, 30));

        hide2.setForeground(new java.awt.Color(255, 255, 255));
        hide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_hide_20px.png"))); // NOI18N
        hide2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide2MousePressed(evt);
            }
        });
        jPanel2.add(hide2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, 30));

        logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_account_120px.png"))); // NOI18N
        jPanel2.add(logo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 120, 140));

        logousername.setForeground(new java.awt.Color(255, 255, 255));
        logousername.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_25px.png"))); // NOI18N
        jPanel2.add(logousername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        logopassword.setForeground(new java.awt.Color(255, 255, 255));
        logopassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_lock_25px.png"))); // NOI18N
        jPanel2.add(logopassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 30));

        username.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username");
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 70, 20));

        password.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 70, 20));

        btnlogin.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_enter_50px.png"))); // NOI18N
        btnlogin.setText("  Login");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
        });
        jPanel2.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked
        login();
    }//GEN-LAST:event_btnloginMouseClicked

    private void instagram_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagram_linkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_instagram_linkMouseClicked

    private void youtube_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_youtube_linkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_youtube_linkMouseClicked

    private void twitter_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitter_linkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_twitter_linkMouseClicked

    private void hide1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1MousePressed
        hide2.setVisible(true);
        hide1.setVisible(false);
        txpass.setEchoChar((char)0);
    }//GEN-LAST:event_hide1MousePressed

    private void hide2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide2MousePressed
        hide1.setVisible(true);
        hide2.setVisible(false);
        txpass.setEchoChar('*');
    }//GEN-LAST:event_hide2MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnlogin;
    private javax.swing.JLabel deskripsi;
    private javax.swing.JSeparator garis1;
    private javax.swing.JSeparator garis2;
    private javax.swing.JLabel hide1;
    private javax.swing.JLabel hide2;
    private javax.swing.JLabel instagram_link;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel logopassword;
    private javax.swing.JLabel logousername;
    private javax.swing.JLabel password;
    private javax.swing.JLabel twitter_link;
    private javax.swing.JPasswordField txpass;
    private javax.swing.JTextField txuser;
    private javax.swing.JLabel username;
    private javax.swing.JLabel youtube_link;
    // End of variables declaration//GEN-END:variables
}
