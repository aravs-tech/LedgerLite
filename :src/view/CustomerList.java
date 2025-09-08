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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.table.DefaultTableModel;

public class CustomerList extends JFrame {
   private JButton jButton1;
   private JButton jButton2;
   private JButton jButton3;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JPanel jPanel1;
   private JScrollPane jScrollPane1;
   private JTable jTable1;

   public CustomerList() {
      this.initComponents();
   }

   private void initComponents() {
      this.jLabel2 = new JLabel();
      this.jPanel1 = new JPanel();
      this.jButton1 = new JButton();
      this.jButton2 = new JButton();
      this.jScrollPane1 = new JScrollPane();
      this.jTable1 = new JTable();
      this.jButton3 = new JButton();
      this.jLabel1 = new JLabel();
      this.jLabel2.setText("Product ID");
      this.setDefaultCloseOperation(3);
      this.jPanel1.setBackground(new Color(255, 255, 255));
      this.jButton1.setBackground(new Color(0, 0, 0));
      this.jButton1.setForeground(new Color(255, 255, 255));
      this.jButton1.setText("Save");
      this.jButton1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CustomerList.this.jButton1ActionPerformed(evt);
         }
      });
      this.jButton2.setBackground(new Color(0, 0, 0));
      this.jButton2.setForeground(new Color(255, 255, 255));
      this.jButton2.setText("Delete");
      this.jButton2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CustomerList.this.jButton2ActionPerformed(evt);
         }
      });
      this.jTable1.setModel(new DefaultTableModel(new Object[0][], new String[]{"id", "first ", "last ", "email", "lastBuy", "number"}));
      this.jScrollPane1.setViewportView(this.jTable1);
      this.jButton3.setBackground(new Color(0, 0, 0));
      this.jButton3.setForeground(new Color(255, 255, 255));
      this.jButton3.setText("Back");
      this.jButton3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            CustomerList.this.jButton3ActionPerformed(evt);
         }
      });
      this.jLabel1.setFont(new Font("Helvetica Neue", 1, 18));
      this.jLabel1.setText("Customer List");
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jScrollPane1, -1, 554, 32767).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(176, 176, 176).addComponent(this.jButton1, -2, 82, -2).addGap(62, 62, 62).addComponent(this.jButton2, -2, 82, -2)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton3, -2, 62, -2).addGap(155, 155, 155).addComponent(this.jLabel1))).addContainerGap(-1, 32767)));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jButton3).addPreferredGap(ComponentPlacement.RELATED, 33, 32767)).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1).addGap(18, 18, 18))).addComponent(this.jScrollPane1, -2, 207, -2).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING).addComponent(this.jButton2).addComponent(this.jButton1, -2, 23, -2)).addContainerGap()));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jPanel1, -2, -1, -2)));
      this.pack();
   }

   private void jButton3ActionPerformed(ActionEvent evt) {
      this.hide();
      customerMenu cmenu = new customerMenu();
      cmenu.show();
   }

   private void jButton2ActionPerformed(ActionEvent evt) {
      int selectedRow = this.jTable1.getSelectedRow();
      if (selectedRow == -1) {
         JOptionPane.showMessageDialog(this, "Please select a row to delete.");
      } else {
         String id = this.jTable1.getValueAt(selectedRow, 0).toString();
         int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this record?", "Delete Record", 0);
         if (confirmation == 0) {
            Connection connection = null;

            try {
               Class.forName("com.mysql.cj.jdbc.Driver");
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement", "root", "Positiv9");
               String sql = "DELETE FROM customer WHERE id = ?";
               PreparedStatement pst = connection.prepareStatement(sql);
               pst.setString(1, id);
               int result = pst.executeUpdate();
               if (result > 0) {
                  JOptionPane.showMessageDialog(this, "Record deleted successfully");
                  DefaultTableModel model = (DefaultTableModel)this.jTable1.getModel();
                  model.removeRow(selectedRow);
               } else {
                  JOptionPane.showMessageDialog(this, "Error deleting record.");
               }
            } catch (Exception var18) {
               var18.printStackTrace();
               JOptionPane.showMessageDialog(this, "Error: " + var18.getMessage());
            } finally {
               try {
                  if (connection != null) {
                     connection.close();
                  }
               } catch (SQLException var17) {
                  var17.printStackTrace();
               }

            }
         }

      }
   }

   private void jButton1ActionPerformed(ActionEvent evt) {
      int selectedRow = this.jTable1.getSelectedRow();
      if (selectedRow == -1) {
         JOptionPane.showMessageDialog(this, "Please select a row to edit.");
      } else {
         String id = (String)this.jTable1.getValueAt(selectedRow, 0);
         String firstName = (String)this.jTable1.getValueAt(selectedRow, 1);
         String lastName = (String)this.jTable1.getValueAt(selectedRow, 2);
         String email = (String)this.jTable1.getValueAt(selectedRow, 3);
         String address = (String)this.jTable1.getValueAt(selectedRow, 4);
         String contactNumber = (String)this.jTable1.getValueAt(selectedRow, 5);

         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement", "root", "Positiv9");
            String sql = "UPDATE customer SET firstName=?, lastName=?, email=?, address=?, contactNumber=? WHERE id=?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, firstName);
            pst.setString(2, lastName);
            pst.setString(3, email);
            pst.setString(4, address);
            pst.setString(5, contactNumber);
            pst.setString(6, id);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
               JOptionPane.showMessageDialog(this, "Record updated successfully.");
            } else {
               JOptionPane.showMessageDialog(this, "Failed to update record.");
            }

            connection.close();
         } catch (SQLException | ClassNotFoundException var13) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var13);
         }

      }
   }

   private void refreshTable() {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement", "root", "Positiv9");
         Statement st = connection.createStatement();
         String sql = "SELECT * FROM customer";
         ResultSet rs = st.executeQuery(sql);
         DefaultTableModel tblModel = (DefaultTableModel)this.jTable1.getModel();
         tblModel.setRowCount(0);

         while(rs.next()) {
            String id = rs.getString("id");
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            String email = rs.getString("email");
            String address = rs.getString("address");
            String purchaseAmt = rs.getString("purchaseAmt");
            String joinDate = rs.getString("joinDate");
            String lastPurchase = rs.getString("lastPurchase");
            String contactNumber = rs.getString("contactNumber");
            String[] rowData = new String[]{id, firstName, lastName, email, address, purchaseAmt, joinDate, lastPurchase, contactNumber};
            tblModel.addRow(rowData);
         }

         connection.close();
      } catch (SQLException | ClassNotFoundException var16) {
         Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var16);
      }

   }

   public void showTable() {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement", "root", "Positiv9");
         Statement st = connection.createStatement();
         String sql = "select * from customer";
         ResultSet rs = st.executeQuery(sql);
         DefaultTableModel tblModel = (DefaultTableModel)this.jTable1.getModel();

         while(rs.next()) {
            String id = rs.getString("id");
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            String email = rs.getString("email");
            String address = rs.getString("address");
            String purchaseAmt = String.valueOf(rs.getFloat("purchaseAmt"));
            String joinDate = String.valueOf(rs.getDate("joinDate"));
            String lastPurchase = String.valueOf(rs.getDate("lastPurchase"));
            String contactNumber = rs.getString("contactNumber");
            String[] tbData = new String[]{id, firstName, lastName, email, address, purchaseAmt, lastPurchase, contactNumber};
            tblModel.addRow(tbData);
         }
      } catch (SQLException | ClassNotFoundException var16) {
         Logger.getLogger(productRegistration.class.getName()).log(Level.SEVERE, (String)null, var16);
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
         Logger.getLogger(CustomerList.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(CustomerList.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(CustomerList.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(CustomerList.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new CustomerList()).setVisible(true);
         }
      });
   }
}
