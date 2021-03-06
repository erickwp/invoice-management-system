/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package invoicemanagementsystem;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erickwp
 */
public class InvoiceFrame extends javax.swing.JFrame {

    private DefaultTableModel DftTblModel_invoice;
    private String SQL; 

    /**
     * Creates new form InvoiceFrame
     * @throws java.lang.ClassNotFoundException
     */
    public InvoiceFrame() throws ClassNotFoundException {
        initComponents();
        
        dataTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        tambahBtn = new javax.swing.JButton();
        hapusBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenuBar = new javax.swing.JMenu();
        exitMenuBar = new javax.swing.JMenuItem();
        helpMenuBar = new javax.swing.JMenu();
        aboutMenuBar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "Tanggal", "No. Invoice", "Customer", "Total Harga", "Aksi"
            }
        ));
        jScrollPane1.setViewportView(invoiceTable);

        tambahBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        tambahBtn.setText("Tambah Baru");
        tambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBtnActionPerformed(evt);
            }
        });

        hapusBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        hapusBtn.setText("Hapus");

        fileMenuBar.setText("File");

        exitMenuBar.setText("Exit");
        exitMenuBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuBarActionPerformed(evt);
            }
        });
        fileMenuBar.add(exitMenuBar);

        jMenuBar1.add(fileMenuBar);

        helpMenuBar.setText("Help");

        aboutMenuBar.setText("About");
        aboutMenuBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuBarActionPerformed(evt);
            }
        });
        helpMenuBar.add(aboutMenuBar);

        jMenuBar1.add(helpMenuBar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tambahBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tambahBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(hapusBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuBarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuBarActionPerformed

    private void aboutMenuBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuBarActionPerformed
        AboutFrame aboutFrame = new AboutFrame();
        aboutFrame.setVisible(true);
    }//GEN-LAST:event_aboutMenuBarActionPerformed

    private void tambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahBtnActionPerformed

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
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new InvoiceFrame().setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InvoiceFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    
    public void dataTable() throws ClassNotFoundException {
        
        DftTblModel_invoice = new DefaultTableModel();
        DftTblModel_invoice.addColumn("No.");
        DftTblModel_invoice.addColumn("Tanggal");
        DftTblModel_invoice.addColumn("No. Invoice");
        DftTblModel_invoice.addColumn("Customer");
        DftTblModel_invoice.addColumn("Total Harga");
        DftTblModel_invoice.addColumn("Aksi");
        
        invoiceTable.setModel(DftTblModel_invoice);
        
        try {
            Connection conn = DBConn.getConnection();
            java.sql.Statement stmt = conn.createStatement();
            SQL = "select * from invoice";
            java.sql.ResultSet res = stmt.executeQuery(SQL);
            
            while (res.next()) {
                DftTblModel_invoice.addRow(new Object[]{
                    res.getString("id"),
                    res.getString("invoice_date"),
                    res.getString("invoice_number"),
                    res.getString("customer_name"),
                    res.getString("total"),
                    res.getString("id")
                });
            }
            
            System.out.println("Sukses");
        } catch (java.sql.SQLException e) {
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuBar;
    private javax.swing.JMenuItem exitMenuBar;
    private javax.swing.JMenu fileMenuBar;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JMenu helpMenuBar;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tambahBtn;
    // End of variables declaration//GEN-END:variables
}
