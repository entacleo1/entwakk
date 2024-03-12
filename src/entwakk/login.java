
package entwakk;
import admin.*;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;



public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }
    String acc = "Admin";
    String user = "entac";
    String pass = "1234";
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        cmdlogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 0, 11)); // NOI18N
        jLabel4.setText("SMART SCAN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 70, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 388, 190));
        getContentPane().add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 170, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 11)); // NOI18N
        jLabel1.setText("Admin Log In");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 90, 40));

        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
        });
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 170, 30));

        cmdlogin.setText("login");
        cmdlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdloginMouseClicked(evt);
            }
        });
        getContentPane().add(cmdlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 180, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Historic", 0, 11)); // NOI18N
        jLabel3.setText("SMART SCAN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 90, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 11)); // NOI18N
        jLabel2.setText("admin login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 80, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/user_1.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/pass.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 30, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdloginMouseClicked
       switch(acc){
           case "Admin":
                 if(user.equals(txtuser.getText()) && pass.equals(txtpass.getText())){
           dash op = new dash();
           JOptionPane.showMessageDialog(null,"Login Success");
           op.setVisible(true);
           this.dispose();
            }else{
                    JOptionPane.showMessageDialog(null,"Invalid"); 
                 }
       
                 break;
           case "user":
                 if(user.equals(txtuser.getText()) && pass.equals(txtpass.getText())){
           user lol = new user();
           JOptionPane.showMessageDialog(null,"Login Success");
           lol.setVisible(true);
           this.dispose();
            }else{
                     JOptionPane.showMessageDialog(null,"Invalid");
                 }
                 break;
       }
        
        
    }//GEN-LAST:event_cmdloginMouseClicked

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            switch(acc){
           case "Admin":
                 if(user.equals(txtuser.getText()) && pass.equals(txtpass.getText())){
           dash op = new dash();
           JOptionPane.showMessageDialog(null,"Login Success");
           op.setVisible(true);
           this.dispose();
            }else{
                    JOptionPane.showMessageDialog(null,"Invalid"); 
                 }
       
                 break;
           case "user":
                 if(user.equals(txtuser.getText()) && pass.equals(txtpass.getText())){
           user lol = new user();
           JOptionPane.showMessageDialog(null,"Login Success");
           lol.setVisible(true);
           this.dispose();
            }else{
                     JOptionPane.showMessageDialog(null,"Invalid");
                 }
                 break;
       }
       }
    }//GEN-LAST:event_txtpassKeyPressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
