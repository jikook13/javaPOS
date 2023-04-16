
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jbtnItem1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jcboDiscount1 = new javax.swing.JCheckBox();
        jcboTax = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jtxtSubtotal1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jtxtSubTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtDiscount = new javax.swing.JTextField();
        jtxtTax = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtTotal = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtDisplay = new javax.swing.JTextField();
        jtxtChange = new javax.swing.JTextField();
        jcbPayment = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnPay = new javax.swing.JButton();
        jbtnRermove = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnReceipt = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jtxtTime = new javax.swing.JTextField();
        jtxtLog = new javax.swing.JTextField();
        jtxtDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(null);

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(400, 180, 120, 120);

        jbtnItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnItem1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnItem1);
        jbtnItem1.setBounds(10, 50, 120, 120);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(140, 50, 120, 120);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(270, 50, 120, 120);

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(400, 50, 120, 120);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(10, 180, 120, 120);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);
        jButton7.setBounds(140, 180, 120, 120);

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);
        jButton8.setBounds(270, 180, 120, 120);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);
        jButton9.setBounds(10, 310, 120, 120);

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(140, 310, 120, 120);

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(270, 310, 120, 120);

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);
        jButton12.setBounds(400, 310, 120, 120);

        jTextField8.setToolTipText("");
        jPanel1.add(jTextField8);
        jTextField8.setBounds(270, 10, 250, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("MENU");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 10, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(540, 10, 530, 440);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM", "QTY", "PRICE", "DISC%", "STOCK", "AMOUNT"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 500, 360));

        jcboDiscount1.setBackground(new java.awt.Color(204, 204, 204));
        jcboDiscount1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcboDiscount1.setText("% DISCOUNT");
        jcboDiscount1.setToolTipText("");
        jcboDiscount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboDiscount1ActionPerformed(evt);
            }
        });
        jPanel2.add(jcboDiscount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 110, -1));

        jcboTax.setBackground(new java.awt.Color(204, 204, 204));
        jcboTax.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jcboTax.setText("% TAX");
        jcboTax.setToolTipText("");
        jcboTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboTaxActionPerformed(evt);
            }
        });
        jPanel2.add(jcboTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 100, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("SUBTOTAL:");
        jLabel1.setToolTipText("");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 120, 40));

        jtxtSubtotal1.setToolTipText("");
        jPanel2.add(jtxtSubtotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 250, 40));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 10, 520, 440);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(null);
        jPanel4.add(jtxtSubTotal);
        jtxtSubTotal.setBounds(160, 10, 170, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("SUBTOTAL:");
        jLabel2.setToolTipText("");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(20, 10, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("DISCOUNT %:");
        jLabel3.setToolTipText("");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 50, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("TAX %:");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(20, 90, 120, 30);
        jPanel4.add(jtxtDiscount);
        jtxtDiscount.setBounds(160, 50, 170, 30);
        jPanel4.add(jtxtTax);
        jtxtTax.setBounds(160, 90, 170, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("TOTAL:");
        jLabel5.setToolTipText("");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(20, 130, 120, 30);

        jtxtTotal.setToolTipText("");
        jPanel4.add(jtxtTotal);
        jtxtTotal.setBounds(160, 130, 170, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 10, 340, 170);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("PAYMENT OF METHOD");
        jLabel6.setToolTipText("");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(10, 20, 150, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("CASH");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(10, 70, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("CHANGE");
        jLabel8.setToolTipText("");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(10, 110, 130, 40);
        jPanel5.add(jtxtDisplay);
        jtxtDisplay.setBounds(170, 60, 190, 40);

        jtxtChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtChangeActionPerformed(evt);
            }
        });
        jPanel5.add(jtxtChange);
        jtxtChange.setBounds(170, 110, 190, 40);

        jcbPayment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CASH", "GCASH" }));
        jPanel5.add(jcbPayment);
        jcbPayment.setBounds(170, 10, 190, 40);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(360, 10, 370, 170);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(null);

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnExit.setText("EXIT");
        jbtnExit.setToolTipText("");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnExit);
        jbtnExit.setBounds(10, 110, 290, 40);

        jbtnPay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnPay.setText("PAY");
        jbtnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPayActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnPay);
        jbtnPay.setBounds(12, 13, 140, 40);

        jbtnRermove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnRermove.setText("REMOVE");
        jbtnRermove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRermoveActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnRermove);
        jbtnRermove.setBounds(10, 60, 140, 40);

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnReset.setText("RESET");
        jbtnReset.setToolTipText("");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnReset);
        jbtnReset.setBounds(160, 10, 140, 40);

        jbtnReceipt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbtnReceipt.setText("RECEIPT");
        jbtnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReceiptActionPerformed(evt);
            }
        });
        jPanel6.add(jbtnReceipt);
        jbtnReceipt.setBounds(160, 60, 140, 40);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(740, 10, 310, 170);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(null);

        jtxtTime.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.add(jtxtTime);
        jtxtTime.setBounds(670, 10, 310, 30);

        jtxtLog.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.add(jtxtLog);
        jtxtLog.setBounds(20, 10, 310, 30);

        jtxtDate.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.add(jtxtDate);
        jtxtDate.setBounds(350, 10, 310, 30);

        jPanel3.add(jPanel7);
        jPanel7.setBounds(10, 190, 1040, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(10, 450, 1060, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void ItemCost()
    {
        double sum = 0;
        
        for (int i = 0; i< jTable1.getRowCount();i++)
        {
            sum = sum + Double.parseDouble(jTable1.getValueAt(i,2).toString());
        }
        jtxtSubTotal.setText(Double.toString(sum));
        double cTotal1 = Double.parseDouble(jtxtSubTotal.getText());
        
        double cDiscount = (cTotal1 - 7)/100;
        String iDiscountTotal = String.format("P %.2f", cDiscount);
        jtxtDiscount.setText(iDiscountTotal);
        
        double cTax = (cTotal1 *1.3)/100;
        String iTaxTotal = String.format("P %.2f", cTax);
        jtxtTax.setText(iTaxTotal);
        
        String iSubtotal1 = String.format("P %.2f", cTotal1);
        jtxtSubTotal.setText(iSubtotal1);
        
        String iSubTotal = String.format("P %.2f",cTotal1);
        jtxtTotal.setText(iSubTotal);
        
        String iTotal = String.format("P %.2f", cTotal1 - cDiscount + cTax);
        jtxtTotal.setText(iTotal);
    }
    
    public void Change()
    {
        double sum = 0;
        double tax = 1.3;
        double discount = 7;
        double cash = Double.parseDouble(jtxtDisplay.getText());
                
       for (int i = 0; i < jTable1.getRowCount();i++)
       {      
           sum = sum + Double.parseDouble(jTable1.getValueAt(i,2).toString());
       }
       
       double cTax = (sum * 1.3)/100;
       double cDiscount = (sum - 7)/100;
       double cChange = (cash - (sum = cDiscount + cTax));

       String ChangeGiven = String.format("P %.2f", cChange);
       jtxtChange.setText(ChangeGiven);
    }
    
    public void addTable (String Item, int qty, int Price, int Disc, int Amount){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Vector v = new Vector();
        
        v.add(Item);
        v.add(qty);
        v.add(Price);
        v.add(Disc);
        v.add(Amount);
        
        model.addRow(v);
    }
    
    private void jtxtChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtChangeActionPerformed
        
    }//GEN-LAST:event_jtxtChangeActionPerformed

    private void jcboDiscount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboDiscount1ActionPerformed
        
    }//GEN-LAST:event_jcboDiscount1ActionPerformed

    private void jcboTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboTaxActionPerformed
        
    }//GEN-LAST:event_jcboTaxActionPerformed

    private void jbtnItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnItem1ActionPerformed
        double PriceOfItem = 1;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"item1","1",PriceOfItem});
        ItemCost();
        
        
    }//GEN-LAST:event_jbtnItem1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        double PriceOfItem = 2;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"item2","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        double PriceOfItem = 3;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"item3","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        double PriceOfItem = 4;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"item4","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        double PriceOfItem = 5;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"item5","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        double PriceOfItem = 6;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"item6","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        double PriceOfItem = 7;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"item7","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double PriceOfItem = 8;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"item8","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        double PriceOfItem = 9;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"item9","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        double PriceOfItem = 10;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"item10","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        double PriceOfItem = 11;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"item11","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        double PriceOfItem = 12;
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"item12","1",PriceOfItem});
        ItemCost();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jbtnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPayActionPerformed
      if (jcbPayment.getSelectedItem().equals("Cash"))
      {
          Change();
      }
      else
      {
              jtxtChange.setText("");
              jtxtDisplay.setText("");
      }
    }//GEN-LAST:event_jbtnPayActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jtxtChange.setText("");
        jtxtTax.setText("");
        jtxtDiscount.setText("");
        jtxtSubtotal1.setText("");
        jtxtSubTotal.setText("");
        jtxtTotal.setText("");
        jtxtDisplay.setText("");
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnRermoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRermoveActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        int RemoveItem = jTable1.getSelectedRow();
        if (RemoveItem >= 0)
        {
            model.removeRow(RemoveItem);
        }
        ItemCost();
        
        if (jcbPayment.getSelectedItem().equals("Cash"))
      {
          Change();
      }
      else
      {
              jtxtChange.setText("");
              jtxtDisplay.setText("");
      }
    }//GEN-LAST:event_jbtnRermoveActionPerformed

    private void jbtnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReceiptActionPerformed
        MessageFormat header = new MessageFormat("Printing in Progress");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try
        {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        }
        
        catch(java.awt.print.PrinterException e)
        {
            System.err.format("No Printer Found", e.getMessage());
        }
    }//GEN-LAST:event_jbtnReceiptActionPerformed
    
    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Do You Want To Exit","Point Of Sales", JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnItem1;
    private javax.swing.JButton jbtnPay;
    private javax.swing.JButton jbtnReceipt;
    private javax.swing.JButton jbtnRermove;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JComboBox<String> jcbPayment;
    private javax.swing.JCheckBox jcboDiscount1;
    private javax.swing.JCheckBox jcboTax;
    private javax.swing.JTextField jtxtChange;
    private javax.swing.JTextField jtxtDate;
    private javax.swing.JTextField jtxtDiscount;
    private javax.swing.JTextField jtxtDisplay;
    private javax.swing.JTextField jtxtLog;
    private javax.swing.JTextField jtxtSubTotal;
    private javax.swing.JTextField jtxtSubtotal1;
    private javax.swing.JTextField jtxtTax;
    private javax.swing.JTextField jtxtTime;
    private javax.swing.JTextField jtxtTotal;
    // End of variables declaration//GEN-END:variables
}
