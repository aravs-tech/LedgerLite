package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;

public class resetPassword extends JFrame {
   private JButton backButton;
   private JButton jButton1;
   private JButton jButton2;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JLabel jLabel5;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JTextField jTextField1;
   private JTextField jTextField2;
   private JTextField jTextField3;

   public resetPassword() {
      this.initComponents();
   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.jPanel2 = new JPanel();
      this.jLabel1 = new JLabel();
      this.backButton = new JButton();
      this.jLabel5 = new JLabel();
      this.jButton2 = new JButton();
      this.jTextField1 = new JTextField();
      this.jLabel2 = new JLabel();
      this.jLabel3 = new JLabel();
      this.jTextField2 = new JTextField();
      this.jLabel4 = new JLabel();
      this.jTextField3 = new JTextField();
      this.jButton1 = new JButton();
      this.setDefaultCloseOperation(3);
      this.jPanel1.setBackground(new Color(255, 255, 255));
      this.jPanel2.setBackground(new Color(255, 255, 255));
      this.jLabel1.setFont(new Font("Helvetica Neue", 1, 18));
      this.jLabel1.setText("Reset Password");
      this.backButton.setBackground(new Color(0, 0, 0));
      this.backButton.setForeground(new Color(255, 255, 255));
      this.backButton.setText("Back");
      this.backButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            resetPassword.this.backButtonActionPerformed(evt);
         }
      });
      this.jLabel5.setText("Didn't receive an OTP?");
      this.jButton2.setBackground(new Color(0, 0, 0));
      this.jButton2.setForeground(new Color(255, 255, 255));
      this.jButton2.setText("Re-send OTP");
      this.jButton2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            resetPassword.this.jButton2ActionPerformed(evt);
         }
      });
      GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
      this.jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.backButton).addPreferredGap(ComponentPlacement.RELATED, 113, 32767).addComponent(this.jLabel1).addGap(57, 57, 57).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel5, Alignment.TRAILING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED, 16, -2).addComponent(this.jButton2).addGap(10, 10, 10))).addContainerGap()));
      jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.jLabel1)).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel5).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jButton2)).addComponent(this.backButton)))).addContainerGap(20, 32767)));
      this.jTextField1.setText("New Password");
      this.jLabel2.setText("One-Time Password (OTP)");
      this.jLabel3.setText(" Email");
      this.jTextField2.setText("Email");
      this.jTextField2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            resetPassword.this.jTextField2ActionPerformed(evt);
         }
      });
      this.jLabel4.setText("New Password");
      this.jTextField3.setText("OTP");
      this.jButton1.setBackground(new Color(0, 0, 0));
      this.jButton1.setForeground(new Color(255, 255, 255));
      this.jButton1.setText("Reset");
      this.jButton1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            resetPassword.this.jButton1ActionPerformed(evt);
         }
      });
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(0, 0, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addGap(72, 72, 72).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel4).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.jLabel3)).addGap(107, 107, 107).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jTextField3, -2, 103, -2).addComponent(this.jTextField2, -2, 103, -2).addComponent(this.jTextField1, -2, -1, -2))).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(151, 151, 151).addComponent(this.jButton1).addGap(141, 141, 141))).addContainerGap(-1, 32767)));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addGap(35, 35, 35).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextField2, -2, -1, -2).addComponent(this.jLabel3)).addGap(24, 24, 24).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jTextField3, -2, -1, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.jTextField1, -2, -1, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jButton1).addContainerGap(42, 32767)));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -2, 519, -2));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, Alignment.TRAILING, -1, -1, 32767));
      this.pack();
   }

   private void jButton1ActionPerformed(ActionEvent evt) {
      String email = this.jTextField2.getText();
      String otp = this.jTextField3.getText();
      String newpassword = this.jTextField1.getText();

      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
      } catch (ClassNotFoundException var30) {
         Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var30);
      }

      Connection connection = null;

      try {
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement", "root", "Positiv9");
      } catch (SQLException var29) {
         Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var29);
      }

      String sql = "UPDATE user SET suspended = 0 WHERE email = ? AND temppassword = ?";
      String sql2 = "UPDATE user SET password = ? WHERE email = ?";

      try {
         PreparedStatement pstmt = connection.prepareStatement(sql);

         try {
            pstmt.setString(1, email);
            pstmt.setString(2, otp);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
               PreparedStatement pstmt2 = connection.prepareStatement(sql2);

               try {
                  pstmt2.setString(1, newpassword);
                  pstmt2.setString(2, email);
                  int passwordReset = pstmt2.executeUpdate();
                  if (passwordReset > 0) {
                     JOptionPane.showMessageDialog(this, "Password Reset Successfully");
                  } else {
                     JOptionPane.showMessageDialog(this, "Error updating password. Please try again.");
                  }
               } catch (Throwable var31) {
                  if (pstmt2 != null) {
                     try {
                        pstmt2.close();
                     } catch (Throwable var28) {
                        var31.addSuppressed(var28);
                     }
                  }

                  throw var31;
               }

               if (pstmt2 != null) {
                  pstmt2.close();
               }
            } else {
               JOptionPane.showMessageDialog(this, "Incorrect email or OTP entered! Kindly re-check details and try again");
            }
         } catch (Throwable var32) {
            if (pstmt != null) {
               try {
                  pstmt.close();
               } catch (Throwable var27) {
                  var32.addSuppressed(var27);
               }
            }

            throw var32;
         }

         if (pstmt != null) {
            pstmt.close();
         }
      } catch (SQLException var33) {
         var33.printStackTrace();
      } finally {
         try {
            if (connection != null) {
               connection.close();
            }
         } catch (SQLException var26) {
            Logger.getLogger(resetPassword.class.getName()).log(Level.SEVERE, (String)null, var26);
         }

      }

   }

   private void jTextField2ActionPerformed(ActionEvent evt) {
   }

   private void backButtonActionPerformed(ActionEvent evt) {
      this.hide();
      MainPage hpagead = new MainPage();
      hpagead.show();
   }

   private void jButton2ActionPerformed(ActionEvent evt) {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
      } catch (ClassNotFoundException var13) {
         Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var13);
      }

      Connection connection = null;

      try {
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement", "root", "Positiv9");
      } catch (SQLException var12) {
         Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var12);
      }

      String email = this.jTextField2.getText();
      Random random = new Random();
      int randomnum = 10000 + random.nextInt(90000);
      String randomgen = String.valueOf(randomnum);
      String sql10 = "UPDATE user SET temppassword = '" + randomgen + "' WHERE email = '" + email + "'";

      try {
         Statement stmt = connection.createStatement();

         try {
            int rowsUpdated = stmt.executeUpdate(sql10);
            if (rowsUpdated > 0) {
               EmailSender.sendEmail(email, randomnum);
               JOptionPane.showMessageDialog(this, "OTP sent to email!");
            } else {
               JOptionPane.showMessageDialog(this, "No account with matching email address found.");
            }
         } catch (Throwable var14) {
            if (stmt != null) {
               try {
                  stmt.close();
               } catch (Throwable var11) {
                  var14.addSuppressed(var11);
               }
            }

            throw var14;
         }

         if (stmt != null) {
            stmt.close();
         }
      } catch (SQLException var15) {
         var15.printStackTrace();
      }

   }

   public static void main(String[] args) {
      try {
         LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            LookAndFeelInfo info = var1[var3];
            if ("Nimbus".equals(info.getName())) {
               UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException var5) {
         Logger.getLogger(resetPassword.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(resetPassword.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(resetPassword.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(resetPassword.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new resetPassword()).setVisible(true);
         }
      });
   }
}
