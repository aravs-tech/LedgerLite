package view;

import Dto.ProductDto;
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
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class productRegistration extends JFrame {
   private JButton deleteButton;
   private JTextField desctxt;
   private JButton jButton1;
   private JButton jButton2;
   private JButton jButton3;
   private JComboBox<String> jComboBox2;
   private JComboBox<String> jComboBox3;
   private JLabel jLabel2;
   private JLabel jLabel3;
   private JLabel jLabel4;
   private JLabel jLabel5;
   private JLabel jLabel6;
   private JLabel jLabel7;
   private JLabel jLabel8;
   private JPanel jPanel1;
   private JPanel jPanel2;
   private JScrollPane jScrollPane1;
   private JTable jTable1;
   private JTextField pricetxt;
   private JTextField productTxt;
   private JButton saveButton;
   private JTextField stocktxt;
   private JComboBox<String> typetxt;

   public productRegistration() {
      this.initComponents();
   }

   private void initComponents() {
      this.jPanel1 = new JPanel();
      this.jPanel2 = new JPanel();
      this.jLabel3 = new JLabel();
      this.jLabel4 = new JLabel();
      this.jLabel5 = new JLabel();
      this.jLabel6 = new JLabel();
      this.pricetxt = new JTextField();
      this.stocktxt = new JTextField();
      this.desctxt = new JTextField();
      this.typetxt = new JComboBox();
      this.jScrollPane1 = new JScrollPane();
      this.jTable1 = new JTable();
      this.deleteButton = new JButton();
      this.saveButton = new JButton();
      this.productTxt = new JTextField();
      this.jButton1 = new JButton();
      this.jLabel2 = new JLabel();
      this.jButton2 = new JButton();
      this.jButton3 = new JButton();
      this.jComboBox2 = new JComboBox();
      this.jLabel7 = new JLabel();
      this.jLabel8 = new JLabel();
      this.jComboBox3 = new JComboBox();
      this.setDefaultCloseOperation(3);
      this.jPanel1.setBackground(new Color(255, 255, 255));
      this.jPanel2.setBackground(new Color(255, 255, 255));
      this.jPanel2.setBorder(BorderFactory.createEtchedBorder());
      this.jLabel3.setFont(new Font("Helvetica", 0, 12));
      this.jLabel3.setText("Price");
      this.jLabel4.setFont(new Font("Helvetica", 0, 12));
      this.jLabel4.setText("Stock");
      this.jLabel5.setFont(new Font("Helvetica", 0, 12));
      this.jLabel5.setText("Type");
      this.jLabel6.setFont(new Font("Helvetica", 0, 12));
      this.jLabel6.setText("Description");
      this.typetxt.setModel(new DefaultComboBoxModel(new String[]{"Dairy", "Spices", "Beverages", "Snacks", "Miscellaneous"}));
      this.typetxt.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            productRegistration.this.typetxtActionPerformed(evt);
         }
      });
      GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
      this.jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel5).addComponent(this.jLabel6)).addPreferredGap(ComponentPlacement.RELATED, 12, 32767).addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.desctxt, Alignment.TRAILING, -2, 107, -2).addComponent(this.typetxt, Alignment.TRAILING, -2, 107, -2))).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel4).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.stocktxt, -2, 107, -2)).addGroup(jPanel2Layout.createSequentialGroup().addComponent(this.jLabel3).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.pricetxt, -2, 107, -2))).addContainerGap()));
      jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel3, -2, 15, -2).addComponent(this.pricetxt, -2, -1, -2)).addGap(35, 35, 35).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel4).addComponent(this.stocktxt, -2, -1, -2)).addGap(31, 31, 31).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel6, -2, 13, -2).addComponent(this.desctxt, -2, -1, -2)).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.typetxt, -2, -1, -2).addComponent(this.jLabel5)).addContainerGap()));
      this.jTable1.setModel(new DefaultTableModel(new Object[0][], new String[]{"ID", "Price", "Stock", "Desc.", "Type"}) {
         Class[] types = new Class[]{String.class, String.class, String.class, String.class, String.class};

         public Class getColumnClass(int columnIndex) {
            return this.types[columnIndex];
         }
      });
      this.jScrollPane1.setViewportView(this.jTable1);
      this.deleteButton.setBackground(new Color(0, 0, 0));
      this.deleteButton.setForeground(new Color(255, 255, 255));
      this.deleteButton.setText("Delete");
      this.deleteButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            productRegistration.this.deleteButtonActionPerformed(evt);
         }
      });
      this.saveButton.setBackground(new Color(0, 0, 0));
      this.saveButton.setForeground(new Color(255, 255, 255));
      this.saveButton.setText("Save");
      this.saveButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            productRegistration.this.saveButtonActionPerformed(evt);
         }
      });
      this.productTxt.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            productRegistration.this.productTxtActionPerformed(evt);
         }
      });
      this.jButton1.setBackground(new Color(0, 0, 0));
      this.jButton1.setForeground(new Color(255, 255, 255));
      this.jButton1.setText("Search");
      this.jButton1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            productRegistration.this.jButton1ActionPerformed(evt);
         }
      });
      this.jLabel2.setText("Product ID");
      this.jButton2.setBackground(new Color(0, 0, 0));
      this.jButton2.setForeground(new Color(255, 255, 255));
      this.jButton2.setText("Refresh");
      this.jButton2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            productRegistration.this.jButton2ActionPerformed(evt);
         }
      });
      this.jButton3.setBackground(new Color(0, 0, 0));
      this.jButton3.setForeground(new Color(255, 255, 255));
      this.jButton3.setText("Back");
      this.jButton3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            productRegistration.this.jButton3ActionPerformed(evt);
         }
      });
      this.jComboBox2.setFont(new Font("Helvetica Neue", 0, 10));
      this.jComboBox2.setModel(new DefaultComboBoxModel(new String[]{"A-Z", "Z-A", "Price (High to Low)", "Price (Low to High)"}));
      this.jComboBox2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            productRegistration.this.jComboBox2ActionPerformed(evt);
         }
      });
      this.jLabel7.setText("Sort By:");
      this.jLabel8.setText("Filter By:");
      this.jComboBox3.setFont(new Font("Helvetica Neue", 0, 10));
      this.jComboBox3.setModel(new DefaultComboBoxModel(new String[]{"All", "Dairy", "Spices", "Miscellaneous", "Beverages", "Snacks"}));
      this.jComboBox3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            productRegistration.this.jComboBox3ActionPerformed(evt);
         }
      });
      GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
      this.jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel7).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jComboBox2, -2, -1, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false).addGroup(jPanel1Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(this.jPanel2, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jScrollPane1, -2, 344, -2)).addGroup(jPanel1Layout.createSequentialGroup().addGap(57, 57, 57).addComponent(this.jButton2, -2, 109, -2).addGap(73, 73, 73).addComponent(this.saveButton, -2, 102, -2).addGap(74, 74, 74).addComponent(this.deleteButton, -2, 105, -2)).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(this.jButton3).addGap(18, 18, 18)).addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(this.jLabel2).addPreferredGap(ComponentPlacement.RELATED))).addComponent(this.productTxt, -2, 104, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jButton1).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jLabel8).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jComboBox3, -2, 71, -2).addGap(154, 154, 154))).addGap(0, 22, 32767))).addContainerGap()));
      jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(9, 9, 9).addComponent(this.jButton3).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.productTxt, -2, -1, -2).addComponent(this.jButton1).addComponent(this.jLabel8).addComponent(this.jComboBox3, -2, 30, -2).addComponent(this.jLabel7).addComponent(this.jComboBox2, -2, 31, -2)).addGap(18, 18, 18).addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jPanel2, -1, -1, 32767).addComponent(this.jScrollPane1, -2, 209, -2)).addGap(32, 32, 32).addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton2).addComponent(this.saveButton).addComponent(this.deleteButton)).addContainerGap()));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767));
      this.pack();
   }

   public void showTable() {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement", "root", "Positiv9");
         Statement st = connection.createStatement();
         String sql = "select * from product";
         ResultSet rs = st.executeQuery(sql);
         DefaultTableModel tblModel = (DefaultTableModel)this.jTable1.getModel();

         while(rs.next()) {
            String id = rs.getString("id");
            String price = String.valueOf(rs.getFloat("Price"));
            String stock = String.valueOf(rs.getInt("Stock"));
            String type = rs.getString("type");
            String description = rs.getString("Description");
            String[] tbData = new String[]{id, price, stock, description, type};
            tblModel.addRow(tbData);
         }
      } catch (SQLException | ClassNotFoundException var12) {
         Logger.getLogger(productRegistration.class.getName()).log(Level.SEVERE, (String)null, var12);
      }

   }

   private void saveButtonActionPerformed(ActionEvent evt) {
      Random rand = new Random();
      String type = (String)this.typetxt.getSelectedItem();
      String ptype = (String)this.typetxt.getSelectedItem();
      String stock = this.stocktxt.getText();
      int prodStock = Integer.parseInt(stock);
      String price = this.pricetxt.getText();
      float prodPrice = Float.parseFloat(price);
      String idnum = Integer.toString(rand.nextInt(999) + 1);
      String prodId = "P-" + idnum;
      ProductDto product = new ProductDto(this.desctxt.getText(), prodStock, prodPrice, prodId, type);

      Connection connection;
      Statement stm;
      try {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
         } catch (ClassNotFoundException var24) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var24);
         }

         connection = null;

         try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement", "root", "Positiv9");
         } catch (SQLException var23) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var23);
         }

         stm = null;
         stm = connection.createStatement();
         PreparedStatement pst = connection.prepareStatement("insert into product(Description, Stock, Price, id, type)values(?,?,?,?,?)");
         pst.setString(1, product.getDescription());
         pst.setInt(2, product.getStock());
         pst.setFloat(3, product.getPrice());
         pst.setString(4, product.getProductId());
         pst.setString(5, type);
         int save = pst.executeUpdate();
         if (save != 0) {
            JOptionPane.showMessageDialog(this, "Record Added");
         } else {
            JOptionPane.showMessageDialog(this, "Record Deleted");
         }

         connection.close();
      } catch (SQLException var25) {
         Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var25);
      }

      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement", "root", "Positiv9");
         stm = connection.createStatement();
         String sql = "select * from product";
         ResultSet rs = stm.executeQuery(sql);
         DefaultTableModel tblModel = (DefaultTableModel)this.jTable1.getModel();
         tblModel.setRowCount(0);

         while(rs.next()) {
            String id = rs.getString("id");
            String price2 = String.valueOf(rs.getFloat("Price"));
            String stock2 = String.valueOf(rs.getInt("Stock"));
            String type2 = rs.getString("type");
            String description2 = rs.getString("Description");
            String[] tbData = new String[]{id, price2, stock2, description2, type2};
            tblModel.addRow(tbData);
         }
      } catch (SQLException | ClassNotFoundException var26) {
         Logger.getLogger(productRegistration.class.getName()).log(Level.SEVERE, (String)null, var26);
      }

   }

   private void productTxtActionPerformed(ActionEvent evt) {
   }

   private void jButton2ActionPerformed(ActionEvent evt) {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement", "root", "Positiv9");
         Statement st = connection.createStatement();
         String sql = "select * from product";
         ResultSet rs = st.executeQuery(sql);
         DefaultTableModel tblModel = (DefaultTableModel)this.jTable1.getModel();
         tblModel.setRowCount(0);

         while(rs.next()) {
            String id = rs.getString("id");
            String price = String.valueOf(rs.getFloat("Price"));
            String stock = String.valueOf(rs.getInt("Stock"));
            String type = rs.getString("type");
            String description = rs.getString("Description");
            String[] tbData = new String[]{id, price, stock, description, type};
            tblModel.addRow(tbData);
         }
      } catch (SQLException | ClassNotFoundException var13) {
         Logger.getLogger(productRegistration.class.getName()).log(Level.SEVERE, (String)null, var13);
      }

   }

   private void jButton1ActionPerformed(ActionEvent evt) {
      try {
         String userId = this.productTxt.getText();
         String sql = "SELECT * FROM product WHERE id = ?";
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement", "root", "Positiv9");

         try {
            PreparedStatement stmt = connection.prepareStatement(sql);

            try {
               stmt.setString(1, userId);

               try {
                  ResultSet rs = stmt.executeQuery();

                  try {
                     while(rs.next()) {
                        String productName = rs.getString("Description");
                        String stock = rs.getString("Stock");
                        String price = rs.getString("Price");
                        String type = rs.getString("type");
                        this.pricetxt.setText(price);
                        this.desctxt.setText(productName);
                        this.stocktxt.setText(stock);
                        String item = this.typetxt.getEditor().getItem().toString();
                        this.typetxt.getEditor().setItem("Text Has Changed");
                     }
                  } catch (Throwable var14) {
                     if (rs != null) {
                        try {
                           rs.close();
                        } catch (Throwable var13) {
                           var14.addSuppressed(var13);
                        }
                     }

                     throw var14;
                  }

                  if (rs != null) {
                     rs.close();
                  }
               } catch (SQLException var15) {
                  var15.printStackTrace();
               }
            } catch (Throwable var16) {
               if (stmt != null) {
                  try {
                     stmt.close();
                  } catch (Throwable var12) {
                     var16.addSuppressed(var12);
                  }
               }

               throw var16;
            }

            if (stmt != null) {
               stmt.close();
            }
         } catch (SQLException var17) {
            var17.printStackTrace();
         }
      } catch (ClassNotFoundException var18) {
         Logger.getLogger(productRegistration.class.getName()).log(Level.SEVERE, (String)null, var18);
      } catch (SQLException var19) {
         Logger.getLogger(productRegistration.class.getName()).log(Level.SEVERE, (String)null, var19);
      }

   }

   private void deleteButtonActionPerformed(ActionEvent evt) {
      DefaultTableModel tableModel = (DefaultTableModel)this.jTable1.getModel();
      int numRows = this.jTable1.getSelectedRows().length;

      for(int i = 0; i < numRows; ++i) {
         try {
            String userId = this.productTxt.getText();
            String sql = "DELETE FROM product WHERE id = ?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventorymanagement", "root", "Positiv9");

            try {
               PreparedStatement stmt = connection.prepareStatement(sql);

               try {
                  stmt.setString(1, (String)tableModel.getValueAt(i, 0));
                  stmt.executeUpdate();
               } catch (Throwable var12) {
                  if (stmt != null) {
                     try {
                        stmt.close();
                     } catch (Throwable var11) {
                        var12.addSuppressed(var11);
                     }
                  }

                  throw var12;
               }

               if (stmt != null) {
                  stmt.close();
               }
            } catch (SQLException var13) {
               var13.printStackTrace();
            }
         } catch (ClassNotFoundException var14) {
            Logger.getLogger(productRegistration.class.getName()).log(Level.SEVERE, (String)null, var14);
         } catch (SQLException var15) {
            Logger.getLogger(productRegistration.class.getName()).log(Level.SEVERE, (String)null, var15);
         }

         tableModel.removeRow(this.jTable1.getSelectedRow());
      }

   }

   private void jButton3ActionPerformed(ActionEvent evt) {
      this.hide();
      HomePageAdmin back = new HomePageAdmin();
      back.setVisible(true);
   }

   private void jComboBox2ActionPerformed(ActionEvent evt) {
      int rowCount;
      int i;
      int min;
      int j;
      int columnCount;
      if (this.jComboBox2.getSelectedItem().equals("Price (Low to High)")) {
         rowCount = this.jTable1.getRowCount();

         for(i = 0; i < rowCount; ++i) {
            min = i;

            for(j = i + 1; j < rowCount; ++j) {
               if (Float.parseFloat((String)this.jTable1.getValueAt(min, 1)) > Float.parseFloat((String)this.jTable1.getValueAt(j, 1))) {
                  for(columnCount = 0; columnCount < this.jTable1.getColumnCount(); ++columnCount) {
                     Object temp = this.jTable1.getValueAt(min, columnCount);
                     this.jTable1.setValueAt(this.jTable1.getValueAt(j, columnCount), min, columnCount);
                     this.jTable1.setValueAt(temp, j, columnCount);
                  }
               }
            }
         }
      } else {
         Object temp;
         int col;
         if (this.jComboBox2.getSelectedItem().equals("Price (High to Low)")) {
            rowCount = this.jTable1.getRowCount();

            for(i = 0; i < rowCount; ++i) {
               min = i;

               for(j = i + 1; j < rowCount; ++j) {
                  if (Float.parseFloat((String)this.jTable1.getValueAt(min, 1)) < Float.parseFloat((String)this.jTable1.getValueAt(j, 1))) {
                     columnCount = this.jTable1.getColumnCount();

                     for(col = 0; col < columnCount; ++col) {
                        temp = this.jTable1.getValueAt(min, col);
                        this.jTable1.setValueAt(this.jTable1.getValueAt(j, col), min, col);
                        this.jTable1.setValueAt(temp, j, col);
                     }
                  }
               }
            }
         } else if (this.jComboBox2.getSelectedItem().equals("A-Z")) {
            rowCount = this.jTable1.getRowCount();

            for(i = 0; i < rowCount; ++i) {
               min = i;

               for(j = i + 1; j < rowCount; ++j) {
                  if (((String)this.jTable1.getValueAt(min, 3)).compareTo((String)this.jTable1.getValueAt(j, 3)) > 0) {
                     columnCount = this.jTable1.getColumnCount();

                     for(col = 0; col < columnCount; ++col) {
                        temp = this.jTable1.getValueAt(min, col);
                        this.jTable1.setValueAt(this.jTable1.getValueAt(j, col), min, col);
                        this.jTable1.setValueAt(temp, j, col);
                     }
                  }
               }
            }
         } else if (this.jComboBox2.getSelectedItem().equals("Z-A")) {
            rowCount = this.jTable1.getRowCount();

            for(i = 0; i < rowCount; ++i) {
               min = i;

               for(j = i + 1; j < rowCount; ++j) {
                  if (((String)this.jTable1.getValueAt(min, 3)).compareTo((String)this.jTable1.getValueAt(j, 3)) < 0) {
                     columnCount = this.jTable1.getColumnCount();

                     for(col = 0; col < columnCount; ++col) {
                        temp = this.jTable1.getValueAt(min, col);
                        this.jTable1.setValueAt(this.jTable1.getValueAt(j, col), min, col);
                        this.jTable1.setValueAt(temp, j, col);
                     }
                  }
               }
            }
         }
      }

   }

   private void jComboBox3ActionPerformed(ActionEvent evt) {
      String selectedType = (String)this.jComboBox3.getSelectedItem();
      this.filterTableByType(selectedType);
   }

   private void filterTableByType(String type) {
      TableModel tableModel = this.jTable1.getModel();
      TableRowSorter<TableModel> sorter = new TableRowSorter(tableModel);
      this.jTable1.setRowSorter(sorter);
      if (!type.equals("All")) {
         sorter.setRowFilter(RowFilter.regexFilter(type, new int[]{4}));
      } else {
         sorter.setRowFilter((RowFilter)null);
      }

   }

   private void typetxtActionPerformed(ActionEvent evt) {
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
         Logger.getLogger(productRegistration.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(productRegistration.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(productRegistration.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(productRegistration.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            productRegistration preg = new productRegistration();
            preg.setVisible(true);
            preg.showTable();
         }
      });
   }
}
