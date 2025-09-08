package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager.LookAndFeelInfo;

public class HomePageAdmin extends JFrame {
   private JButton jButton1;
   private JButton jButton2;
   private JButton jButton4;
   private JButton jButton5;
   private JPanel jPanel1;
   private JScrollBar jScrollBar1;

   public HomePageAdmin() {
      this.initComponents();
   }

   private void initComponents() {
      this.jScrollBar1 = new JScrollBar();
      this.jPanel1 = new JPanel();
      this.jButton1 = new JButton();
      this.jButton2 = new JButton();
      this.jButton4 = new JButton();
      this.jButton5 = new JButton();
      this.setDefaultCloseOperation(3);
      this.jPanel1.setBackground(new Color(255, 255, 255));
      this.jButton1.setBackground(new Color(0, 0, 0));
      this.jButton1.setForeground(new Color(255, 255, 255));
      this.jButton1.setText("Customers");
      this.jButton1.setToolTipText("");
      this.jButton1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            HomePageAdmin.this.jButton1ActionPerformed(evt);
         }
      });
      this.jButton2.setBackground(new Color(0, 0, 0));
      this.jButton2.setForeground(new Color(255, 255, 255));
      this.jButton2.setText("Inventory");
      this.jButton2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            HomePageAdmin.this.jButton2ActionPerformed(evt);
         }
      });
      this.jButton4.setBackground(new Color(0, 0, 0));
      this.jButton4.setForeground(new Color(255, 255, 255));
      this.jButton4.setText("Billing");
      this.jButton4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            HomePageAdmin.this.jButton4ActionPerformed(evt);
         }
      });
      this.jButton5.setText("Log Out");
      this.jButton5.setBorder(BorderFactory.createEtchedBorder());
      this.jButton5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            HomePageAdmin.this.jButton5ActionPerformed(evt);
         }
      });
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(150, 32767).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jButton2, -2, 138, -2).addComponent(this.jButton1, -2, 138, -2).addComponent(this.jButton4, -2, 138, -2)).addContainerGap(154, 32767)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton5, -2, 67, -2).addContainerGap(-1, 32767)));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton5, -2, 21, -2).addGap(52, 52, 52).addComponent(this.jButton2).addGap(18, 18, 18).addComponent(this.jButton1, -2, 31, -2).addGap(18, 18, 18).addComponent(this.jButton4).addContainerGap(83, 32767)));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 0, 32767)));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
      this.pack();
   }

   private void jButton1ActionPerformed(ActionEvent evt) {
      this.hide();
      customerMenu cMenu = new customerMenu();
      cMenu.setVisible(true);
   }

   private void jButton2ActionPerformed(ActionEvent evt) {
      productRegistration preg = new productRegistration();
      preg.showTable();
      preg.show();
   }

   private void jButton4ActionPerformed(ActionEvent evt) {
      this.hide();
      Billing billing = new Billing();
      billing.show();
   }

   private void jButton5ActionPerformed(ActionEvent evt) {
      this.hide();
      MainPage home = new MainPage();
      home.show();
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
         Logger.getLogger(HomePageAdmin.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(HomePageAdmin.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(HomePageAdmin.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(HomePageAdmin.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new HomePageAdmin()).setVisible(true);
         }
      });
   }
}
