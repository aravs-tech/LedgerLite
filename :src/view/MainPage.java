package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.Border;

public class MainPage extends JFrame {
   private int wrong = 0;
   private JTextField emailtxt;
   private JButton jButton1;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JButton loginButton;
   private JPasswordField passwordField;

   public MainPage() {
      this.initComponents();
   }

   private void initComponents() {
      this.jLabel3 = new JLabel();
      this.jPanel1 = new JPanel();
      this.jPanel2 = new JPanel();
      this.jLabel1 = new JLabel();
      this.jLabel2 = new JLabel();
      this.emailtxt = new JTextField();
      this.loginButton = new JButton();
      this.passwordField = new JPasswordField();
      this.jButton1 = new JButton();
      this.jLabel3.setText("jLabel3");
      this.setDefaultCloseOperation(3);
      this.jPanel2.setBackground(new Color(255, 255, 255));
      this.jLabel1.setFont(new Font("Helvetica Neue", 1, 24));
      this.jLabel1.setText("Welcome!");
      this.jLabel2.setFont(new Font("Helvetica Neue", 0, 18));
      this.jLabel2.setText("Log in to your account to continue");
      this.emailtxt.setText("Email");
      this.emailtxt.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            MainPage.this.emailtxtActionPerformed(evt);
         }
      });
      this.loginButton.setBackground(new Color(0, 0, 0));
      this.loginButton.setForeground(new Color(255, 255, 255));
      this.loginButton.setText("Login");
      this.loginButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            MainPage.this.loginButtonActionPerformed(evt);
         }
      });
      this.passwordField.setText("jPasswordField1");
      this.jButton1.setFont(new Font("Helvetica Neue", 0, 10));
      this.jButton1.setForeground(new Color(0, 51, 153));
      this.jButton1.setText("Reset Password");
      this.jButton1.setBorder((Border)null);
      this.jButton1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            MainPage.this.jButton1ActionPerformed(evt);
         }
      });
      GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
      this.jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.jLabel2).addGap(89, 89, 89)).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.jLabel1).addGap(177, 177, 177)).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.loginButton, -2, 110, -2).addGap(178, 178, 178)))).addGroup(jPanel2Layout.createSequentialGroup().addGap(49, 49, 49).addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jButton1, -2, 110, -2).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.emailtxt).addComponent(this.passwordField, -2, 363, -2))).addGap(0, 64, 32767)));
      jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jLabel2).addGap(33, 33, 33).addComponent(this.emailtxt, -2, -1, -2).addGap(18, 18, 18).addComponent(this.passwordField, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 23, -2).addGap(9, 9, 9).addComponent(this.loginButton).addContainerGap(82, 32767)));
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, Alignment.TRAILING, -1, -1, 32767));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, Alignment.TRAILING, -1, -1, 32767));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
      this.pack();
   }

   private void emailtxtActionPerformed(ActionEvent evt) {
   }

   private void loginButtonActionPerformed(ActionEvent evt) {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory_management", "root", "Positiv9");

         try {
            String email = this.emailtxt.getText();
            String password = this.passwordField.getText();
            String sql3 = "SELECT * FROM user WHERE email = ?";
            PreparedStatement stmt = connection.prepareStatement(sql3);

            try {
               stmt.setString(1, email);
               ResultSet rs3 = stmt.executeQuery();
               if (!rs3.next()) {
                  JOptionPane.showMessageDialog(this, "Email or password wrong");
               } else if (rs3.getInt("suspended") == 1) {
                  JOptionPane.showMessageDialog(this, "Account suspended. Check email for instructions.");
               } else {
                  String sql = "SELECT * FROM user WHERE email = ? AND password = ?";
                  PreparedStatement stmt2 = connection.prepareStatement(sql);

                  try {
                     stmt2.setString(1, email);
                     stmt2.setString(2, password);
                     ResultSet rs = stmt2.executeQuery();
                     if (rs.next()) {
                        String userRole = rs.getString("type");
                        this.dispose();
                        if ("Cashier".equals(userRole)) {
                           this.hide();
                           (new Billing()).show();
                        } else {
                           this.hide();
                           (new Billing()).show();
                        }
                     } else {
                        JOptionPane.showMessageDialog(this, "Email or password wrong");
                        ++this.wrong;
                        if (this.wrong > 3) {
                           int randomnum = 10000 + (new Random()).nextInt(90000);
                           String randomgen = String.valueOf(randomnum);
                           String sqlSuspend = "UPDATE user SET suspended = 1, temppassword = ? WHERE email = ?";
                           PreparedStatement stmt3 = connection.prepareStatement(sqlSuspend);

                           try {
                              stmt3.setString(1, randomgen);
                              stmt3.setString(2, email);
                              stmt3.executeUpdate();
                           } catch (Throwable var21) {
                              if (stmt3 != null) {
                                 try {
                                    stmt3.close();
                                 } catch (Throwable var20) {
                                    var21.addSuppressed(var20);
                                 }
                              }

                              throw var21;
                           }

                           if (stmt3 != null) {
                              stmt3.close();
                           }
                        }
                     }
                  } catch (Throwable var22) {
                     if (stmt2 != null) {
                        try {
                           stmt2.close();
                        } catch (Throwable var19) {
                           var22.addSuppressed(var19);
                        }
                     }

                     throw var22;
                  }

                  if (stmt2 != null) {
                     stmt2.close();
                  }
               }
            } catch (Throwable var23) {
               if (stmt != null) {
                  try {
                     stmt.close();
                  } catch (Throwable var18) {
                     var23.addSuppressed(var18);
                  }
               }

               throw var23;
            }

            if (stmt != null) {
               stmt.close();
            }
         } catch (Throwable var24) {
            if (connection != null) {
               try {
                  connection.close();
               } catch (Throwable var17) {
                  var24.addSuppressed(var17);
               }
            }

            throw var24;
         }

         if (connection != null) {
            connection.close();
         }
      } catch (SQLException | ClassNotFoundException var25) {
         var25.printStackTrace();
      }

   }

   private void jButton1ActionPerformed(ActionEvent evt) {
      this.hide();
      resetPassword resetPass = new resetPassword();
      resetPass.show();
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
         Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new MainPage()).setVisible(true);
         }
      });
   }
}
