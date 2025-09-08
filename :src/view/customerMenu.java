package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;

public class customerMenu extends JFrame {
   private JButton jButton2;
   private JPanel jPanel1;
   private JButton manageCustomer;
   private JButton registerCustomer;

   public customerMenu() {
      this.initComponents();
   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.manageCustomer = new JButton();
      this.registerCustomer = new JButton();
      this.jButton2 = new JButton();
      this.setDefaultCloseOperation(3);
      this.jPanel1.setBackground(new Color(255, 255, 255));
      this.manageCustomer.setBackground(new Color(0, 0, 0));
      this.manageCustomer.setForeground(new Color(255, 255, 255));
      this.manageCustomer.setText("Register Customers");
      this.manageCustomer.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            customerMenu.this.manageCustomerActionPerformed(evt);
         }
      });
      this.registerCustomer.setBackground(new Color(0, 0, 0));
      this.registerCustomer.setForeground(new Color(255, 255, 255));
      this.registerCustomer.setText("Manage Customers");
      this.registerCustomer.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            customerMenu.this.registerCustomerActionPerformed(evt);
         }
      });
      this.jButton2.setBackground(new Color(0, 0, 0));
      this.jButton2.setForeground(new Color(255, 255, 255));
      this.jButton2.setText("Back");
      this.jButton2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            customerMenu.this.jButton2ActionPerformed(evt);
         }
      });
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(151, 32767).addComponent(this.manageCustomer, -2, 183, -2).addGap(122, 122, 122)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton2, -2, 63, -2).addContainerGap(-1, 32767)).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(151, 32767).addComponent(this.registerCustomer, -2, 183, -2).addGap(122, 122, 122))));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton2).addPreferredGap(ComponentPlacement.RELATED, 116, 32767).addComponent(this.manageCustomer).addGap(132, 132, 132)).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(113, 113, 113).addComponent(this.registerCustomer).addContainerGap(164, 32767))));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, Alignment.TRAILING, -1, -1, 32767));
      this.pack();
   }

   private void manageCustomerActionPerformed(ActionEvent evt) {
      customerRegistration cReg = new customerRegistration();
      cReg.show();
   }

   private void registerCustomerActionPerformed(ActionEvent evt) {
      CustomerList cList = new CustomerList();
      cList.showTable();
      cList.show();
   }

   private void jButton2ActionPerformed(ActionEvent evt) {
      this.hide();
      HomePageAdmin mPage = new HomePageAdmin();
      mPage.show();
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
         Logger.getLogger(customerMenu.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(customerMenu.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(customerMenu.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(customerMenu.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new customerMenu()).setVisible(true);
         }
      });
   }
}
