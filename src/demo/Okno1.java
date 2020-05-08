/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author luka
 */
public class Okno1 extends javax.swing.JFrame {

    public static int dolzinaOkna;
    public static int visinaOkna;
    public static int score = 0;
    public static int hp = 3;
    public static boolean pause = false;

    public Okno1() {
        initComponents();

        dolzinaOkna = 800;
        visinaOkna = 800;
        score = 0;
        hp = 3;
        pause = false; 
        jLabel9.setText(StaticVars.g_strUser + ": " + score);

        //  tl.start();
        // t2.start();
        t3.start();

    }
    long cas = 0;

    int x;
    int y;

    int ovira1X = 0;
    int ovira1Y = 0;

    int ovira2X = 0;
    int ovira2Y = 0;

    int ovira3X = 0;
    int ovira3Y = 0;

    int ovira4X = 0;
    int ovira4Y = 0;

    int ovira5X = 0;
    int ovira5Y = 0;

    int ovira6X = 0;
    int ovira6Y = 0;

    int scorX = 0;
    int scorY = 0;

    int objectX = 0;
    int objectY = 0;

    int objectspeed;

    int playerSpeed = 6;
    int objectspeed1 = 0;
    int objectspeed2 = 0;
    int objectspeed3 = 0;
    int objectspeed4 = 0;
    int objectspeed5 = 0;
    int objectspeed6 = 0;
    int scorspeed = 4;

    boolean right;
    boolean left;
    boolean up;
    boolean down;
    

    boolean hit;

    int t = 2;
    int z = 2;
    int i = 3;
    int p = 0;

    //zapisovanje v tabelo
    Runnable rl = new timer();
    Thread tl = new Thread(rl);

    Runnable r2 = new timer2();
    Thread t2 = new Thread(r2);

    Runnable r3 = new timer3();
    Thread t3 = new Thread(r3);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        player = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(null);

        player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/player_idle.png"))); // NOI18N
        getContentPane().add(player);
        player.setBounds(330, 270, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/object1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(310, 160, 20, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/object2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 160, 20, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/object3.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 170, 50, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/object4.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 190, 80, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/object5.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(490, 120, 40, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/object6.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(540, 160, 200, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/scor.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(710, 210, 20, 40);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("score");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(650, 30, 160, 30);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("HP");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 30, 120, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("timer");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(250, 370, 320, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/background.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 850, 860);

        jMenu1.setText("vizitka");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("navodila");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("izhod");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(820, 863));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            left = true;
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            right = true;
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            up = true;
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            down = true;
        }
        if (evt.getKeyCode() == KeyEvent.VK_P) {
            System.out.println(pause);
            if (pause == true) {
                pause = false;
            } else {
                pause = true;
            }
        }


    }//GEN-LAST:event_formKeyPressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            left = false;
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            right = false;
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            up = false;
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            down = false;
        }

    }//GEN-LAST:event_formKeyReleased

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        new Vizitka().setVisible(true);
        dispose();

    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        new Navodila().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

    }//GEN-LAST:event_formKeyTyped

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
            java.util.logging.Logger.getLogger(Okno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Okno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Okno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Okno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Okno1().setVisible(true);
            }
        });
    }

    public class timer implements Runnable {

        public void run() {

            x = 400;
            y = 400;

            ovira1X = (int) (Math.random() * visinaOkna);
            ovira1Y = 0;
            jLabel1.setLocation(ovira1X, ovira1Y);

            ovira2X = (int) (Math.random() * visinaOkna);
            ovira2Y = 0;
            jLabel2.setLocation(ovira2X, ovira2Y);

            ovira3X = (int) (Math.random() * visinaOkna);
            ovira3Y = 0;
            jLabel3.setLocation(ovira3X, ovira3Y);

            ovira4X = (int) (Math.random() * visinaOkna);
            ovira4Y = 0;
            jLabel5.setLocation(ovira4X, ovira4Y);

            ovira5X = (int) (Math.random() * visinaOkna);
            ovira5Y = 0;
            jLabel6.setLocation(ovira5X, ovira5Y);

            ovira6X = (int) (Math.random() * visinaOkna);
            ovira6Y = 0;
            jLabel7.setLocation(ovira6X, ovira6Y);

            scorX = (int) (Math.random() * visinaOkna);
            scorY = 0;
            jLabel8.setLocation(scorX, scorY);

            hit = false;

            while (true) {
                if (pause == true) {
                    tl.interrupt();
                    jLabel11.setVisible(true);
                    jLabel11.setText("pause");
                } else {
                    jLabel11.setVisible(false);
                    try {

                        hit = false;
                        if (right == true) {
                            if (player.getX() + player.getWidth() <= dolzinaOkna) {
                                player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/player_right0.png")));
                                x = x + playerSpeed;
                            }
                        }

                        if (left == true) {
                            if (player.getX() >= 3) {
                                player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/player_left0.png")));
                                x = x - playerSpeed;

                            }
                        }

                        if (up == true) {
                            if (player.getY() >= 3) {
                                player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/player_gor.png")));
                                y = y - playerSpeed;
                            }
                        }

                        if (down == true) {
                            if (player.getY() + player.getHeight() <= visinaOkna) {
                                player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/player_down.png")));
                                y = y + playerSpeed;

                            }
                        }

                        if (ovira1Y < visinaOkna) {

                            if (ovira1Y == 0) {
                                objectspeed1 = randSpeed();
                            }

                            ovira1Y = ovira1Y + objectspeed1;
                            jLabel1.setLocation(ovira1X, ovira1Y);
                        }
                        if (ovira1Y >= visinaOkna) {
                            ovira1X = (int) (Math.random() * visinaOkna);
                            ovira1Y = 0;
                            jLabel1.setLocation(ovira1X, ovira1Y);
                        }

                        if (ovira2Y < visinaOkna) {
                            if (ovira2Y == 0) {
                                objectspeed2 = randSpeed();
                            }
                            ovira2Y = ovira2Y + objectspeed2;
                            jLabel2.setLocation(ovira2X, ovira2Y);
                        }
                        if (ovira2Y >= visinaOkna) {
                            ovira2X = (int) (Math.random() * visinaOkna);
                            ovira2Y = 0;
                            jLabel2.setLocation(ovira2X, ovira2Y);
                        }

                        if (ovira3Y < visinaOkna) {
                            if (ovira3Y == 0) {
                                objectspeed3 = randSpeed();
                            }
                            ovira3Y = ovira3Y + objectspeed3;
                            jLabel3.setLocation(ovira3X, ovira3Y);
                        }
                        if (ovira3Y >= visinaOkna) {
                            ovira3X = (int) (Math.random() * visinaOkna);
                            ovira3Y = 0;
                            jLabel3.setLocation(ovira3X, ovira3Y);
                        }

                        if (ovira4Y < visinaOkna) {
                            if (ovira4Y == 0) {
                                objectspeed4 = randSpeed();
                            }
                            ovira4Y = ovira4Y + objectspeed4;
                            jLabel5.setLocation(ovira4X, ovira4Y);
                        }
                        if (ovira4Y >= visinaOkna) {
                            ovira4X = (int) (Math.random() * visinaOkna);
                            ovira4Y = 0;
                            jLabel5.setLocation(ovira4X, ovira4Y);
                        }

                        if (ovira5Y < visinaOkna) {
                            if (ovira5Y == 0) {
                                objectspeed5 = randSpeed();
                            }
                            ovira5Y = ovira5Y + objectspeed5;
                            jLabel6.setLocation(ovira5X, ovira5Y);
                        }
                        if (ovira5Y >= visinaOkna) {
                            ovira5X = (int) (Math.random() * visinaOkna);
                            ovira5Y = 0;
                            jLabel6.setLocation(ovira5X, ovira5Y);
                        }

                        if (ovira6Y < visinaOkna) {
                            if (ovira6Y == 0) {
                                objectspeed6 = randSpeed();
                            }
                            ovira6Y = ovira6Y + objectspeed6;
                            jLabel7.setLocation(ovira6X, ovira6Y);
                        }
                        if (ovira6Y >= visinaOkna) {
                            ovira6X = (int) (Math.random() * visinaOkna);
                            ovira6Y = 0;
                            jLabel7.setLocation(ovira6X, ovira6Y);
                        }

                        if (scorY < visinaOkna) {
                            if (scorY == 0) {

                                scorspeed = (int) (Math.random() * t + z);
                                if (t < 8 && z < 6) {
                                    t = t + 1;
                                    z = z + 1;
                                }
                            }
                            scorY = scorY + scorspeed;
                            jLabel8.setLocation(scorX, scorY);

                        }
                        if (scorY >= visinaOkna) {
                            scorX = (int) (Math.random() * visinaOkna);
                            scorY = 0;
                            jLabel8.setLocation(scorX, scorY);
                            score = score - 100;
                        }
                        if (scorY + jLabel8.getHeight() > y && scorX >= x
                                && scorX < x + player.getWidth() && scorY < y + player.getHeight()) {
                            scorX = (int) (Math.random() * visinaOkna);
                            scorY = 0;
                            jLabel8.setLocation(scorX, scorY);
                            score = score + 100;
                        }

                        if (ovira1Y + jLabel1.getHeight() > y && ovira1X + jLabel1.getWidth() >= x && ovira1X < x + player.getWidth() && ovira1Y < y + player.getHeight()) {
                             hit = true;
                            
                            
                            
                        }

                        if (ovira2Y + jLabel2.getHeight() > y && ovira2X + jLabel2.getWidth() >= x && ovira2X < x + player.getWidth() && ovira2Y < y + player.getHeight()) {
                             hit = true;
                            
                            
                        }

                        if (ovira3Y + jLabel3.getHeight() > y && ovira3X + jLabel3.getWidth() >= x && ovira3X < x + player.getWidth() && ovira3Y < y + player.getHeight()) {
                             hit = true;
                           
                        }

                        if (ovira4Y + jLabel5.getHeight() > y && ovira4X + jLabel5.getWidth() >= x && ovira4X < x + player.getWidth() && ovira4Y < y + player.getHeight()) {
                             hit = true;
                           
                        }

                        if (ovira5Y + jLabel6.getHeight() > y && ovira5X + jLabel6.getWidth() >= x && ovira5X < x + player.getWidth() && ovira5Y < y + player.getHeight()) {
                             hit = true;
                            
                        }

                        if (ovira6Y + jLabel7.getHeight() > y && ovira6X + jLabel7.getWidth() >= x && ovira6X < x + player.getWidth() && ovira6Y < y + player.getHeight()) {
                            hit = true;
                            
                        }

                    
                        
                        //jLabel9.setText(Login.ime + ": " + score + "");
                        jLabel9.setText(StaticVars.g_strUser + ": " + score);
                        tl.sleep(20);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    player.setLocation(x, y);
                }
            }
        }
    }

    public static int playerHit(int hp) {
        hp = hp - 1;
        return hp;
    }

    public class timer2 implements Runnable {

        public void run() {

            while (true) {

                try {
                    if(hit == true){
                        hp = hp - 1;
                    }
                    if (hp == 0) {
                        zapisData(score);
                        new ZacetnaStran().setVisible(true);
                        dispose();
                        tl.stop();
                        t2.stop();

                    }
                    jLabel10.setText("življenja: " + hp);

                    t2.sleep(230);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public class timer3 implements Runnable {

        public void run() {
            while (true) {

                try {
                    jLabel1.setVisible(false);
                    jLabel2.setVisible(false);
                    jLabel3.setVisible(false);
                    player.setVisible(false);
                    jLabel5.setVisible(false);
                    jLabel6.setVisible(false);
                    jLabel7.setVisible(false);
                    jLabel8.setVisible(false);
                    if (i >= 0) {
                        jLabel11.setText(i + "");
                    }
                    if (i == 0) {

                        tl.start();
                        t2.start();
                    }
                    if (i <= 0) {
                        jLabel1.setVisible(true);
                        jLabel2.setVisible(true);
                        jLabel3.setVisible(true);
                        player.setVisible(true);
                        jLabel5.setVisible(true);
                        jLabel6.setVisible(true);
                        jLabel7.setVisible(true);
                        jLabel8.setVisible(true);
                        jLabel11.setVisible(false);
                    }
                    i = i - 1;

                    t3.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    public static int randSpeed() {
        return (int) (Math.random() * 6 + 5);
    }

    public static void zapisData(int score) {
        String strVrstica = "";
        String strVrstica2 = "";
        String[] strTab = null;
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            br = new BufferedReader(new FileReader("src/datoteke/uporabniki.txt"));
            pw = new PrintWriter(new FileWriter("src/datoteke/uporabniki2.txt", true));

            while (br.ready()) {
                strVrstica2 = br.readLine();
                strTab = strVrstica2.split(" ");
                if (StaticVars.g_strUser.equals(strTab[0]) && Integer.parseInt(strTab[4]) < score) {
                    strTab[4] = score + "";
                    strVrstica = strTab[0] + " ";
                    strVrstica = strVrstica + strTab[1] + " ";
                    strVrstica = strVrstica + strTab[2] + " ";
                    strVrstica = strVrstica + strTab[3] + " ";
                    strVrstica = strVrstica + strTab[4];
                    System.out.println(strVrstica);
                } else {
                    strVrstica = strVrstica2;
                    System.out.println(strVrstica);
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
            if (file2.renameTo(new File("src/datoteke/uporabniki.txt"))) {
                System.out.println(file.getName() + "preimenovana");
            } else {
                System.out.println("ni preimenovalo");
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Okno1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException e) {
            Logger.getLogger(Okno1.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {

                if (pw != null) {
                    pw.close();
                }
                if (br != null) {
                    br.close();
                }

            } catch (Exception e) {
                Logger.getLogger(Registracija.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel player;
    // End of variables declaration//GEN-END:variables
}
