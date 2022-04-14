

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kobinath
 */
public class pres extends javax.swing.JFrame {

    /**
     * Creates new form pres
     */
    String pnoo;
    String npno;
    
    public pres() {
        initComponents();
    }

      public pres(String pno) {
        initComponents();
        Connect ();
   
   this.pnoo = pno;
   npno=pnoo;
   lblpid.setText(npno);
    
    
    
    }
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
    
    public void Connect()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Vithospital","root","");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(pres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    

   

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblpid = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtqty = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtbal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txttotal1 = new javax.swing.JLabel();
        txttotal2 = new javax.swing.JLabel();
        txttotal3 = new javax.swing.JLabel();
        txtcost = new javax.swing.JTextField();
        txtpay = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jLabel5.setText("jLabel5");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(51, 0, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Prescription ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Drug Code");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Drug name");

        lblpid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblpid.setForeground(new java.awt.Color(255, 255, 0));
        lblpid.setText("jLabel6");

        txtcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodeActionPerformed(evt);
            }
        });
        txtcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcodeKeyPressed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Qty");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prescription ID", "Drug Code", "Drug name", "Qty", "Price", "Total Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Selectupdate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txttotal1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttotal1.setForeground(new java.awt.Color(255, 255, 0));
        txttotal1.setText("Pay");

        txttotal2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttotal2.setForeground(new java.awt.Color(255, 255, 0));
        txttotal2.setText("Balance");

        txttotal3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttotal3.setForeground(new java.awt.Color(255, 255, 0));
        txttotal3.setText("Total Cost");

        txtcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcostActionPerformed(evt);
            }
        });

        txtpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblpid)
                                .addGap(193, 193, 193)
                                .addComponent(txttotal3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttotal2)
                                    .addComponent(txttotal1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbal)
                            .addComponent(txtcost)
                            .addComponent(txtpay, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                        .addContainerGap(73, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblpid)
                    .addComponent(txttotal3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txttotal1)
                    .addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotal2)
                    .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel8.setText("Sales Inventroy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel8)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     private void sales()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        String date = dtf.format(now);
        
       
        String subtot = txtcost.getText();
        String pay = txtpay.getText();
        
        String balance = txtbal.getText();
        
        int lastinsetid = 0;
        
        try {
           
            
             String query = "insert into sales(date,subtotal,pay,balance)values(?,?,?,?)";          
             pst = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);        
            pst.setString(1, date);
            pst.setString(2, subtot);
            pst.setString(3, pay);
            pst.setString(4, balance);
          
            pst.executeUpdate();
            ResultSet genteratedKeyResult = pst.getGeneratedKeys();
            
            
            if(rs.next())
            {
                lastinsetid =rs.getInt(1);

            }
            
            int rows = jTable1.getColumnCount();   
            String query1 = "insert into sales_product(sales_id,prod_id,sellprice,qty,total)values(?,?,?,?,?)";
            pst = con.prepareStatement(query1);            
           
            String pres_id;
            String item_id;
            String item_name;
            int price;
            String qty;
            int total=0;
            
            for(int i = 0; i<jTable1.getRowCount(); i++)
            {               
                pres_id = (String)jTable1.getValueAt(i, 0);
                item_id = (String)jTable1.getValueAt(i, 1);                           
               qty = jTable1.getValueAt(i, 3).toString();
                int qty1=Integer.parseInt(qty);
                price = (int)jTable1.getValueAt(i, 4);               
                total = (int)jTable1.getValueAt(i, 5);
                
                pst.setInt(1, lastinsetid);
                
                pst.setString(2, item_id);
                 pst.setInt(3,price);
                pst.setInt(4, qty1);
                
                 pst.setInt(5, total);
               
                pst.executeUpdate();  
            }
            
            
             String query3 = "update drug set qty= qty-? where id=?";
            pst = con.prepareStatement(query3);
            
            
             for(int i = 0; i<jTable1.getRowCount(); i++)
            {
                
                item_id = (String)jTable1.getValueAt(i, 1);             
                qty = jTable1.getValueAt(i, 3).toString();
                int qty1=Integer.parseInt(qty);
               
                
                pst.setInt(1, qty1);
                pst.setString(2, item_id);
                pst.execute();
                          
            }
   
            pst.addBatch();
            JOptionPane.showMessageDialog(this, "Recorded Saved");
            
            
            
            
          
            
            
            
            
            

        
        } catch (SQLException ex) {
            Logger.getLogger(pres.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void txtcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int pay = Integer.parseInt(txtpay.getText());
        int totcost = Integer.parseInt(txtcost.getText());
        
        
        int bal = pay - totcost;
        
        txtbal.setText(String.valueOf(bal));
        
           sales();
            
            
            
            
            
       
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodeKeyPressed
        // TODO add your handling code here:
        
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            
            String decode = txtcode.getText();
            
            try {
                    
                    pst = con.prepareStatement("select * from item where itemid=?");
                    pst.setString(1, decode);
                    rs = pst.executeQuery();
                    
                    if(rs.next()==false)
                    {
                        JOptionPane.showMessageDialog(this,"Drug not Found");
                    }
                    else
                    {
                        String dname = rs.getString("itemname");          
                        txtname.setText(dname.trim());
                        txtqty.requestFocus();
                    }
                    
                    
                    
                    
                    
            } catch (SQLException ex) {
                Logger.getLogger(pres.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
        
        
    }//GEN-LAST:event_txtcodeKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
             String pcode = txtcode.getText();
            
           
             pst = con.prepareStatement("select * from drug where itemid=?");
             pst.setString(1, pcode);
             rs = pst.executeQuery();
             
             while(rs.next())
             {
                  int currentqty;
                  int sellprice;
                  int qty;
                  
                  currentqty = rs.getInt("qty");
                  sellprice = rs.getInt("sellprice");
                
                 qty = Integer.parseInt(txtqty.getValue().toString());
                 
                 int tot = sellprice * qty;
                 
                 if(qty >= currentqty)
                 {
                     JOptionPane.showMessageDialog(this, "Available Product" + " = " +currentqty);
                     JOptionPane.showMessageDialog(this, "Qty is not Enough");
                     
                 }
                 else
                 {
                     
                    DefaultTableModel DF = (DefaultTableModel)jTable1.getModel();
                     DF.addRow(new Object[]
                     {
                         lblpid.getText(),
                         txtcode.getText(),
                         txtname.getText(),
                         txtqty.getValue().toString(),
                         sellprice,
                         
                 
                         tot,
                         
                     });    
                     
                     
                     int sum=0;
                     
                     for(int i=0; i<jTable1.getRowCount(); i++)
                     {
                         
                         sum = sum + Integer.parseInt(jTable1.getValueAt(i, 5).toString());
                         
                         
                     }
                     
                     
                        txtcost.setText(Integer.toString(sum));
                        txtcode.setText("");
                        txtname.setText("");  
                        txtqty.setValue(0);
                        txtcode.requestFocus();
                     
                     
                     
                 }
        
             }
            
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(pres.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpayActionPerformed

    private void txtcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcostActionPerformed

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
            java.util.logging.Logger.getLogger(pres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblpid;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtcost;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpay;
    private javax.swing.JSpinner txtqty;
    private javax.swing.JLabel txttotal1;
    private javax.swing.JLabel txttotal2;
    private javax.swing.JLabel txttotal3;
    // End of variables declaration//GEN-END:variables

    private void log(Level SEVERE, Object object, SQLException ex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}