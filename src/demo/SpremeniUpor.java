/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kalamari
 */
public class SpremeniUpor extends javax.swing.JFrame {

    /**
     * Creates new form SpremeniUpor
     */
    public SpremeniUpor() {
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

        btnIzberi = new javax.swing.JButton();
        usrName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnRegistracija = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        priimekTxt = new javax.swing.JTextField();
        btnShrani = new javax.swing.JButton();
        usrGeslo = new javax.swing.JPasswordField();
        btnBrisanje = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIzberi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnIzberi.setText("izberi");
        btnIzberi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzberiActionPerformed(evt);
            }
        });
        getContentPane().add(btnIzberi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 132, 40));

        usrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrNameActionPerformed(evt);
            }
        });
        getContentPane().add(usrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 146, 168, 32));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vnesi uporabniško ime");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 106, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("geslo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 196, -1, -1));

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogin.setText("login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 516, 112, 39));

        btnRegistracija.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegistracija.setText("registracija");
        btnRegistracija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistracijaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistracija, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 515, 158, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sprememba gesla");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ime");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 284, -1, -1));
        getContentPane().add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 317, 160, 33));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("priimek");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 361, -1, -1));
        getContentPane().add(priimekTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 401, 168, 33));

        btnShrani.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnShrani.setText("shrani");
        btnShrani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShraniActionPerformed(evt);
            }
        });
        getContentPane().add(btnShrani, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 138, 40));
        getContentPane().add(usrGeslo, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 236, 166, 32));

        btnBrisanje.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBrisanje.setText("izbriši");
        btnBrisanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrisanjeActionPerformed(evt);
            }
        });
        getContentPane().add(btnBrisanje, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 120, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/bg_spremeni.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-680, -20, -1, -1));

        setSize(new java.awt.Dimension(522, 624));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usrNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrNameActionPerformed

    private void btnIzberiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzberiActionPerformed

        BufferedReader br = null;
        String strVrstica = "";
        String[] tabVrstica = null;

        try {

            br = new BufferedReader(new FileReader("src/datoteke/uporabniki.txt"));

            while (br.ready()) {
                strVrstica = br.readLine();
                tabVrstica = strVrstica.split(" ");

                if (tabVrstica[0].equals(usrName.getText())) {
                    usrName.setText(tabVrstica[0]);
                    usrGeslo.setText("");
                    nameTxt.setText(tabVrstica[2]);
                    priimekTxt.setText(tabVrstica[3]);
                    break;
                } 
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "ne dela");
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btnIzberiActionPerformed

    private void btnShraniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShraniActionPerformed
        PrintWriter pw = null;
        String strVrstica = "";
        String strVrstica2 = "";
        String[] tabVrstica = null;
        char[] tabelaGeslo;
        String strGeslo = "";
        BufferedReader br = null;
        boolean vpisan = false;
        String username = usrName.getText();

        tabelaGeslo = usrGeslo.getPassword();
        //tabelo znakov spremenimo v Strung
        for (int i = 0; i < tabelaGeslo.length; i++) {
            strGeslo = strGeslo + tabelaGeslo[i];
        }
        strGeslo = StaticVars.getMd5(strGeslo);

        try {
            pw = new PrintWriter(new FileWriter("src/datoteke/uporabniki2.txt", true));
            br = new BufferedReader(new FileReader("src/datoteke/uporabniki.txt"));

            while (br.ready()) {
                strVrstica2 = br.readLine();
                tabVrstica = strVrstica2.split(" ");
                if (tabVrstica[0].equals(usrName.getText())) {
                    strVrstica = usrName.getText() + " ";
                    strVrstica = strVrstica + strGeslo + " ";
                    strVrstica = strVrstica + nameTxt.getText() + " ";
                    strVrstica = strVrstica + priimekTxt.getText()+ " ";
                    strVrstica = strVrstica + tabVrstica[4];
                    

                } else {
                    strVrstica = strVrstica2;
                }
                pw.println(strVrstica);
            }
            br.close();
            pw.close();

            File file = new File("src/datoteke/uporabniki.txt");
            if (file.delete()) {
                System.out.println(file.getName() + "is deleted");
            } else {
                System.out.println("ni zbrislo");
            }
            File file2 = new File("src/datoteke/uporabniki2.txt");
            file2.renameTo(new File("src/datoteke/uporabniki.txt"));

        } catch (IOException ioe) {
            Logger.getLogger(Registracija.class.getName()).log(Level.SEVERE, null, ioe);
        } finally {
            try {

                if (pw != null) {
                    pw.close();
                }
                if (br != null) {
                    br.close();
                }
                pocistiPolja();
            } catch (Exception e) {
                Logger.getLogger(Registracija.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnShraniActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegistracijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistracijaActionPerformed
         new Registracija().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegistracijaActionPerformed

    private void btnBrisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeActionPerformed
       PrintWriter pw = null;
        BufferedReader br = null;
        String[] strTab = null;
        String strVrstica="";

        try {
            pw = new PrintWriter(new FileWriter("src/datoteke/uporabniki2.txt"));
            br = new BufferedReader(new FileReader("src/datoteke/uporabniki.txt"));

            while (br.ready()) {
                strVrstica = br.readLine();
                strTab = strVrstica.split(" ");

                if (strTab[0].equals(usrName.getText())) {
                } else {
                    pw.println(strVrstica);
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Failed writing to file!", "Stave", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (pw != null) {
                pw.close();
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Failed closing input stream!", "Stave", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        File file = new File("src/datoteke/uporabniki.txt");
        if (file.delete()) {
            System.out.println(file.getName() + "is deleted");
        } else {
            System.out.println("ni zbrislo");
            }
        File file2 = new File("src/datoteke/uporabniki2.txt");
        file2.renameTo(new File("src/datoteke/uporabniki.txt"));
    }//GEN-LAST:event_btnBrisanjeActionPerformed

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
            java.util.logging.Logger.getLogger(SpremeniUpor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SpremeniUpor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SpremeniUpor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SpremeniUpor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SpremeniUpor().setVisible(true);
            }
        });
    }

    private void pocistiPolja() {

        usrName.setText("");
        usrGeslo.setText("");
        nameTxt.setText("");
        priimekTxt.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrisanje;
    private javax.swing.JButton btnIzberi;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistracija;
    private javax.swing.JButton btnShrani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField priimekTxt;
    private javax.swing.JPasswordField usrGeslo;
    private javax.swing.JTextField usrName;
    // End of variables declaration//GEN-END:variables
}