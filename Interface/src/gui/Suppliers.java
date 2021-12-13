/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author LENOVO
 */
public class Suppliers extends javax.swing.JFrame {

    /**
     * Creates new form Barang
     */
    public Suppliers() {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kiri = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        kode = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        nama = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        stok = new javax.swing.JLabel();
        txtstok = new javax.swing.JTextField();
        harga = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        neww1 = new javax.swing.JLabel();
        kanan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        databarang = new javax.swing.JTable();
        neww = new javax.swing.JLabel();
        neww2 = new javax.swing.JLabel();
        neww3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kiri.setBackground(new java.awt.Color(255, 255, 255));
        kiri.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul.setBackground(new java.awt.Color(0, 0, 102));
        judul.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 60)); // NOI18N
        judul.setForeground(new java.awt.Color(0, 0, 102));
        judul.setText("Data Suppliers");
        kiri.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        kode.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        kode.setForeground(new java.awt.Color(0, 0, 102));
        kode.setText("ID Supplier");
        kiri.add(kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        txtkode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtkode.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtkode.setText("0122");
        txtkode.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });
        kiri.add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 390, 30));

        nama.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        nama.setForeground(new java.awt.Color(0, 0, 102));
        nama.setText("Nama Supplier");
        kiri.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txtnama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnama.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtnama.setText("Bahari Samsudin");
        txtnama.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        kiri.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 390, 30));

        stok.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        stok.setForeground(new java.awt.Color(0, 0, 102));
        stok.setText("Alamat Supplier");
        kiri.add(stok, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        txtstok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtstok.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtstok.setText("Sidokare Gg.2 No.20, Sidokare, Sidoarjo");
        txtstok.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        kiri.add(txtstok, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 390, 30));

        harga.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        harga.setForeground(new java.awt.Color(0, 0, 102));
        harga.setText("Nomer Telpon Supplier");
        kiri.add(harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        txtharga.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtharga.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtharga.setText("081212136344");
        txtharga.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });
        kiri.add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 390, 30));

        neww1.setBackground(new java.awt.Color(255, 255, 255));
        neww1.setForeground(new java.awt.Color(0, 0, 102));
        neww1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        neww1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_new_copy_40px.png"))); // NOI18N
        neww1.setText("Baru");
        neww1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        neww1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        neww1.setOpaque(true);
        kiri.add(neww1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 110, 50));

        getContentPane().add(kiri, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 580));

        kanan.setBackground(new java.awt.Color(153, 204, 255));
        kanan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        databarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        databarang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        databarang.setForeground(new java.awt.Color(0, 0, 102));
        databarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Supplier", "Nama Supplier", "Alamat Supplier", "Nomer Telpon Supplier"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        databarang.setGridColor(new java.awt.Color(153, 204, 255));
        databarang.setRowHeight(19);
        databarang.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(databarang);

        kanan.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 900, 480));

        neww.setBackground(new java.awt.Color(255, 255, 255));
        neww.setForeground(new java.awt.Color(0, 0, 102));
        neww.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        neww.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_back_40px.png"))); // NOI18N
        neww.setText("Kembali");
        neww.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        neww.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        neww.setOpaque(true);
        kanan.add(neww, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 110, 50));

        neww2.setBackground(new java.awt.Color(255, 255, 255));
        neww2.setForeground(new java.awt.Color(0, 0, 102));
        neww2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        neww2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_save_40px.png"))); // NOI18N
        neww2.setText("Simpan");
        neww2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        neww2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        neww2.setOpaque(true);
        kanan.add(neww2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 110, 50));

        neww3.setBackground(new java.awt.Color(255, 255, 255));
        neww3.setForeground(new java.awt.Color(0, 0, 102));
        neww3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        neww3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_40px.png"))); // NOI18N
        neww3.setText("Hapus");
        neww3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        neww3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        neww3.setOpaque(true);
        kanan.add(neww3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 110, 50));

        getContentPane().add(kanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 920, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodeActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

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
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suppliers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suppliers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable databarang;
    private javax.swing.JLabel harga;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JPanel kanan;
    private javax.swing.JPanel kiri;
    private javax.swing.JLabel kode;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel neww;
    private javax.swing.JLabel neww1;
    private javax.swing.JLabel neww2;
    private javax.swing.JLabel neww3;
    private javax.swing.JLabel stok;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtstok;
    // End of variables declaration//GEN-END:variables
}
