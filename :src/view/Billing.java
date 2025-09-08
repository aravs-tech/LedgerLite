package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.table.DefaultTableModel;

public class Billing extends JFrame {
   private JButton addButton;
   private JButton jButton1;
   private JLabel jLabel1;
   private JLabel jLabel2;
   private JLabel jLabel4;
   private JLabel jLabel6;
   private JLabel jLabel7;
   private JLabel jLabel8;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JPanel jPanel4;
   private JPanel jPanel5;
   private JScrollPane jScrollPane1;
   private JScrollPane jScrollPane2;
   private JScrollPane jScrollPane3;
   private JTable jTable1;
   private JTable jTable2;
   private JTextArea jTextArea1;
   private JTextField jTextField1;
   private JTextField jTextField3;
   private JTextField jTextField4;
   private JTextField nameField;
   private JButton printButton;
   private JSpinner spinner;

   public Billing() {
      this.initComponents();
   }

   private void initComponents() {
      this.jPanel4 = new JPanel();
      this.jScrollPane1 = new JScrollPane();
      this.jTable1 = new JTable();
      this.jPanel1 = new JPanel();
      this.jLabel1 = new JLabel();
      this.jPanel5 = new JPanel();
      this.jTextField3 = new JTextField();
      this.jTextField4 = new JTextField();
      this.jTextField1 = new JTextField();
      this.printButton = new JButton();
      this.jLabel6 = new JLabel();
      this.jLabel7 = new JLabel();
      this.jLabel8 = new JLabel();
      this.jPanel2 = new JPanel();
      this.jScrollPane2 = new JScrollPane();
      this.jTable2 = new JTable();
      this.nameField = new JTextField();
      this.spinner = new JSpinner();
      this.jLabel2 = new JLabel();
      this.jLabel4 = new JLabel();
      this.addButton = new JButton();
      this.jScrollPane3 = new JScrollPane();
      this.jTextArea1 = new JTextArea();
      this.jButton1 = new JButton();
      GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
      this.jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGap(0, 100, 32767));
      jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(Alignment.LEADING).addGap(0, 100, 32767));
      this.jTable1.setModel(new DefaultTableModel(new Object[][]{{null, null, null, null}, {null, null, null, null}, {null, null, null, null}, {null, null, null, null}}, new String[]{"Title 1", "Title 2", "Title 3", "Title 4"}));
      this.jScrollPane1.setViewportView(this.jTable1);
      this.setDefaultCloseOperation(3);
      this.jPanel1.setBackground(new Color(255, 255, 255));
      this.jLabel1.setFont(new Font("Helvetica Neue", 1, 18));
      this.jLabel1.setText("                                     Billing System");
      this.jPanel5.setBackground(new Color(255, 255, 255));
      this.jPanel5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
      this.jTextField3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Billing.this.jTextField3ActionPerformed(evt);
         }
      });
      this.jTextField4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Billing.this.jTextField4ActionPerformed(evt);
         }
      });
      this.jTextField1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Billing.this.jTextField1ActionPerformed(evt);
         }
      });
      this.printButton.setBackground(new Color(0, 0, 0));
      this.printButton.setForeground(new Color(255, 255, 255));
      this.printButton.setText("Print");
      this.printButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Billing.this.printButtonActionPerformed(evt);
         }
      });
      this.jLabel6.setFont(new Font("Helvetica Neue", 1, 13));
      this.jLabel6.setText("Total");
      this.jLabel7.setFont(new Font("Helvetica Neue", 1, 13));
      this.jLabel7.setText("Pay");
      this.jLabel8.setFont(new Font("Helvetica Neue", 1, 13));
      this.jLabel8.setText("Balance");
      GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
      this.jPanel5.setLayout(jPanel5Layout);
      jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING, false).addGroup(jPanel5Layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.jTextField3, -2, 99, -2).addGap(79, 79, 79).addComponent(this.jTextField4, -2, 99, -2)).addGroup(jPanel5Layout.createSequentialGroup().addGap(46, 46, 46).addComponent(this.jLabel6).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel7).addGap(39, 39, 39))).addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addGap(112, 112, 112).addComponent(this.jLabel8).addPreferredGap(ComponentPlacement.RELATED, -1, 32767)).addGroup(Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addComponent(this.jTextField1, -2, 99, -2).addGap(62, 62, 62))).addComponent(this.printButton).addContainerGap()));
      jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createSequentialGroup().addContainerGap().addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel6).addComponent(this.jLabel7).addComponent(this.jLabel8)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel5Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel5Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextField3, -2, -1, -2).addComponent(this.jTextField4, -2, -1, -2)).addComponent(this.jTextField1, -2, -1, -2)).addContainerGap(-1, 32767)).addGroup(Alignment.TRAILING, jPanel5Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.printButton).addGap(14, 14, 14)));
      this.jPanel2.setBackground(new Color(255, 255, 255));
      this.jPanel2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
      this.jTable2.setModel(new DefaultTableModel(new Object[0][], new String[]{"ID", "Name", "Qty", "Price", "Total"}));
      this.jScrollPane2.setViewportView(this.jTable2);
      if (this.jTable2.getColumnModel().getColumnCount() > 0) {
         this.jTable2.getColumnModel().getColumn(0).setResizable(false);
         this.jTable2.getColumnModel().getColumn(3).setResizable(false);
      }

      this.nameField.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Billing.this.nameFieldActionPerformed(evt);
         }
      });
      this.jLabel2.setText("Qty");
      this.jLabel4.setText("Product Name");
      this.addButton.setBackground(new Color(0, 0, 0));
      this.addButton.setForeground(new Color(255, 255, 255));
      this.addButton.setText("Add");
      this.addButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Billing.this.addButtonActionPerformed(evt);
         }
      });
      GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
      this.jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jScrollPane2, -1, 396, 32767).addGroup(jPanel2Layout.createSequentialGroup().addGap(89, 89, 89).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGap(13, 13, 13).addComponent(this.jLabel4).addGap(79, 79, 79).addComponent(this.jLabel2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.nameField, -2, 120, -2).addGap(26, 26, 26).addComponent(this.spinner, -2, -1, -2))).addContainerGap(-1, 32767)).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.addButton, -2, 61, -2).addGap(148, 148, 148)));
      jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup().addComponent(this.jScrollPane2, -2, 164, -2).addGap(18, 18, 18).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jLabel4)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.spinner, -2, -1, -2).addComponent(this.nameField, -2, -1, -2)).addGap(18, 18, 18).addComponent(this.addButton).addGap(13, 13, 13)));
      this.jTextArea1.setColumns(20);
      this.jTextArea1.setRows(5);
      this.jTextArea1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
      this.jScrollPane3.setViewportView(this.jTextArea1);
      this.jButton1.setBackground(new Color(0, 0, 0));
      this.jButton1.setForeground(new Color(255, 255, 255));
      this.jButton1.setText("Back");
      this.jButton1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Billing.this.jButton1ActionPerformed(evt);
         }
      });
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false).addComponent(this.jPanel5, Alignment.LEADING, -1, -1, 32767).addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup().addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jScrollPane3, -2, -1, -2))).addContainerGap(13, 32767)).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jButton1).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel1, -2, 381, -2).addGap(176, 176, 176)))));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jButton1).addComponent(this.jLabel1, -2, 29, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel2, -1, -1, 32767).addComponent(this.jScrollPane3)).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jPanel5, -2, -1, -2).addContainerGap()));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, -1, -2).addGap(0, 6, 32767)));
      this.pack();
   }

   private void printButtonActionPerformed(ActionEvent evt) {
   }

   private void jTextField1ActionPerformed(ActionEvent evt) {
   }

   private void addButtonActionPerformed(ActionEvent evt) {
   }

   private void jTextField3ActionPerformed(ActionEvent evt) {
   }

   private void jTextField4ActionPerformed(ActionEvent evt) {
   }

   private void nameFieldActionPerformed(ActionEvent evt) {
   }

   private void jButton1ActionPerformed(ActionEvent evt) {
      this.hide();
      HomePageAdmin home = new HomePageAdmin();
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
         Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new Billing()).setVisible(true);
         }
      });
   }
}
