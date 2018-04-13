/* * * * * * * * * * * * * * * * * * * * * * * *
 * Instituto Tecnológico de Costa Rica         *
 * Data structures                             *
 * 1st Project: Domino´s game                  *
 * by: Fabián Zamora R. and Randald Villegas B.*
 * * * * * * * * * * * * * * * * * * * * * * * */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabián
 */
public class WindowLogin extends javax.swing.JFrame {
    
    /**
     * Creates new form WindowLogin
     */
    public WindowLogin() {
        super("Domino's game Login");
        initComponents(); 
        loadPlayers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        laberUser = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        buttonOff = new javax.swing.JButton();
        labelSingIn = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        buttonSingIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(860, 548));
        setResizable(false);
        getContentPane().setLayout(null);

        laberUser.setBackground(new java.awt.Color(255, 255, 255));
        laberUser.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        laberUser.setForeground(new java.awt.Color(255, 255, 255));
        laberUser.setText("User :");
        getContentPane().add(laberUser);
        laberUser.setBounds(120, 100, 80, 50);

        labelPassword.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Password :");
        getContentPane().add(labelPassword);
        labelPassword.setBounds(70, 140, 130, 50);

        userTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(userTextField);
        userTextField.setBounds(200, 120, 110, 20);

        passwordTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordTextField);
        passwordTextField.setBounds(200, 160, 110, 20);

        buttonOff.setBackground(new java.awt.Color(0, 0, 0));
        buttonOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/off.png"))); // NOI18N
        buttonOff.setToolTipText("");
        buttonOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOffActionPerformed(evt);
            }
        });
        getContentPane().add(buttonOff);
        buttonOff.setBounds(770, 10, 82, 60);

        labelSingIn.setFont(new java.awt.Font("Script MT Bold", 1, 24)); // NOI18N
        labelSingIn.setForeground(new java.awt.Color(255, 255, 255));
        labelSingIn.setText("Doesn't have account yet?");
        getContentPane().add(labelSingIn);
        labelSingIn.setBounds(40, 370, 300, 30);

        buttonLogin.setBackground(new java.awt.Color(153, 153, 153));
        buttonLogin.setText("Sing In");
        buttonLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(buttonLogin);
        buttonLogin.setBounds(130, 410, 110, 30);

        buttonSingIn.setBackground(new java.awt.Color(153, 153, 153));
        buttonSingIn.setText("Log In");
        buttonSingIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonSingIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSingInActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSingIn);
        buttonSingIn.setBounds(200, 200, 110, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progra1/images/DominoWallpaperrrr.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-30, 0, 890, 550);

        jPasswordField1.setText("jPasswordField1");
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(220, 150, 109, 19);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void buttonSingInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSingInActionPerformed
        // TODO add your handling code here:
        if(userTextField.getText().isEmpty() | passwordTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Field empty.");
        }
        else if(userTextField.getText().equals("adminfabian") & passwordTextField.getText().equals("12345")){
            WindowAdmin wAdmin = new WindowAdmin();
            wAdmin.setVisible(true);
            
        }         
        else{
            Player xplayer = ListPlayersRegistered.getInstance().searchPlayer(userTextField.getText());
            
            if(xplayer == null)
                JOptionPane.showMessageDialog(rootPane, "User not found.");
            else{
                if(xplayer.getPassword().equals(passwordTextField.getText())){
                    WindowSelectionGame windowSelectionGame = new WindowSelectionGame();
                    windowSelectionGame.setVisible(true);
                    // Add info to the global variable
                    Player datos;                                                             // local variable
                    datos = ListPlayersRegistered.getInstance().searchPlayer(userTextField.getText());  //search the objet
                    ListPlayersGaming.getInstance().setActualUser(datos);                     //Set the actual user to the global variable
                    this.setVisible(false);                                                           //destroy this window
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Wrong password");
                }
            }  
        }
    }//GEN-LAST:event_buttonSingInActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // TODO add your handling code here:
        WindowRegister wRegister = new WindowRegister();
        this.setVisible(true);
        wRegister.setVisible(true);
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOffActionPerformed
        //Go to destroy this Windows
        this.dispose();
    
    }//GEN-LAST:event_buttonOffActionPerformed

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
            java.util.logging.Logger.getLogger(WindowLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLogin;
    private javax.swing.JButton buttonOff;
    private javax.swing.JButton buttonSingIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelSingIn;
    private javax.swing.JLabel laberUser;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables

     public void loadPlayers(){
        try {
            FileReader reader = new FileReader("Players.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                Player loadPlayer = new Player();
                loadPlayer = JsonUtil.convertJsontoJava(line, Player.class);
                String n = loadPlayer.name;
                String p = loadPlayer.password;
                int w = loadPlayer.wins;
                ListPlayersRegistered.getInstance().insertFinal(n, p, w);
                System.out.println(loadPlayer.name);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al cargar datos");
        }
    }
}
