package gui;
import control.koneksi;
import control.control_transaksi;
import control.menuut;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;

public class Kasir extends javax.swing.JFrame {
    control_transaksi ct;
    koneksi db;
    menuut ut;
    
    public String kode_barang;
    public String nama_barang;
    public static int jumlah;
    public static int harga;
    public static int stok;
    public int total;

    /**
     * Creates new form Kasir
     */
    public Kasir() {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        
        db = new koneksi();
        ct = new control_transaksi();
        ut = new menuut();
        tabel.setModel(ct.model);
        ct.tampilPengeluaran("", "", 0, 0, 0);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        atas = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        txtgrandtotal2 = new javax.swing.JTextField();
        bawah = new javax.swing.JPanel();
        subtotal = new javax.swing.JLabel();
        txtsubtotal = new javax.swing.JTextField();
        grandtotal = new javax.swing.JLabel();
        txtgrandtotal1 = new javax.swing.JTextField();
        bayar = new javax.swing.JLabel();
        txtbayar = new javax.swing.JTextField();
        kembali = new javax.swing.JLabel();
        txtkembali = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        simpan = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();
        reset = new javax.swing.JLabel();
        btnkembali = new javax.swing.JButton();
        kembalii = new javax.swing.JLabel();
        tengah = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        search = new javax.swing.JLabel();
        neww = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        kodebarang = new javax.swing.JLabel();
        txtkodebarang = new javax.swing.JTextField();
        namabarang = new javax.swing.JLabel();
        txtnamabarang = new javax.swing.JTextField();
        jumlahbarang = new javax.swing.JLabel();
        txtjumlahbarang = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        atas.setBackground(new java.awt.Color(0, 0, 102));
        atas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        judul.setFont(new java.awt.Font("GeoSlab703 MdCn BT", 1, 60)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 255, 255));
        judul.setText("Toko Bu Kasan");
        atas.add(judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        txtgrandtotal2.setEditable(false);
        txtgrandtotal2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txtgrandtotal2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtgrandtotal2.setText("115000");
        txtgrandtotal2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        atas.add(txtgrandtotal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 310, 60));

        getContentPane().add(atas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 100));

        bawah.setBackground(new java.awt.Color(153, 204, 255));
        bawah.setForeground(new java.awt.Color(153, 204, 255));
        bawah.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subtotal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        subtotal.setForeground(new java.awt.Color(0, 0, 102));
        subtotal.setText("Sub Total");
        bawah.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtsubtotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsubtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtsubtotal.setText("115000");
        txtsubtotal.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        bawah.add(txtsubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 30));

        grandtotal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        grandtotal.setForeground(new java.awt.Color(0, 0, 102));
        grandtotal.setText("Grand Total");
        bawah.add(grandtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtgrandtotal1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtgrandtotal1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtgrandtotal1.setText("115000");
        txtgrandtotal1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        bawah.add(txtgrandtotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 190, 30));

        bayar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        bayar.setForeground(new java.awt.Color(0, 0, 102));
        bayar.setText("Bayar");
        bawah.add(bayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        txtbayar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtbayar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtbayar.setText("120000");
        txtbayar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        txtbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbayarActionPerformed(evt);
            }
        });
        bawah.add(txtbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 130, 30));

        kembali.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        kembali.setForeground(new java.awt.Color(0, 0, 102));
        kembali.setText("Kembali");
        bawah.add(kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        txtkembali.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtkembali.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtkembali.setText("5000");
        txtkembali.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        bawah.add(txtkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 130, 30));

        btnsimpan.setBackground(new java.awt.Color(255, 255, 255));
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_save_as_60px.png"))); // NOI18N
        btnsimpan.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 102), null));
        btnsimpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsimpan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsimpanMouseClicked(evt);
            }
        });
        bawah.add(btnsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 90, 70));

        simpan.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        simpan.setForeground(new java.awt.Color(0, 0, 102));
        simpan.setText("Simpan");
        bawah.add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, -1, -1));

        btnreset.setBackground(new java.awt.Color(255, 255, 255));
        btnreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_restart_60px.png"))); // NOI18N
        btnreset.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 102), null));
        btnreset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnreset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnresetMouseClicked(evt);
            }
        });
        bawah.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 40, 90, 70));

        reset.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 0, 102));
        reset.setText("Reset");
        bawah.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 110, -1, -1));

        btnkembali.setBackground(new java.awt.Color(255, 255, 255));
        btnkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_back_60px.png"))); // NOI18N
        btnkembali.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 102), null));
        btnkembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnkembali.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnkembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkembaliMouseClicked(evt);
            }
        });
        bawah.add(btnkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 40, 90, 70));

        kembalii.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        kembalii.setForeground(new java.awt.Color(0, 0, 102));
        kembalii.setText("Kembali");
        bawah.add(kembalii, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 110, -1, -1));

        getContentPane().add(bawah, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 519, 1100, 158));

        tengah.setBackground(new java.awt.Color(255, 255, 255));
        tengah.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        tabel.setForeground(new java.awt.Color(0, 0, 102));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama barang", "Harga Barang", "Jumlah Barang", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel.setGridColor(new java.awt.Color(153, 204, 255));
        tabel.setRowHeight(25);
        jScrollPane1.setViewportView(tabel);

        tengah.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 330));

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setForeground(new java.awt.Color(51, 0, 102));
        search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_40px.png"))); // NOI18N
        search.setText("Cari");
        search.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        tengah.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 90, 50));

        neww.setBackground(new java.awt.Color(255, 255, 255));
        neww.setForeground(new java.awt.Color(51, 0, 102));
        neww.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        neww.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_new_copy_40px.png"))); // NOI18N
        neww.setText("Baru");
        neww.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        neww.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        neww.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newwMouseClicked(evt);
            }
        });
        tengah.add(neww, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 90, 50));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setForeground(new java.awt.Color(51, 0, 102));
        delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_waste_40px.png"))); // NOI18N
        delete.setText("Hapus");
        delete.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        tengah.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, 100, 50));

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setForeground(new java.awt.Color(51, 0, 102));
        cancel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_cancel_40px.png"))); // NOI18N
        cancel.setText("Batal");
        cancel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        tengah.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 350, 90, 50));

        kodebarang.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        kodebarang.setForeground(new java.awt.Color(0, 0, 102));
        kodebarang.setText("Kode Barang");
        tengah.add(kodebarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        txtkodebarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtkodebarang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtkodebarang.setText("ES021");
        txtkodebarang.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        tengah.add(txtkodebarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 190, 30));

        namabarang.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        namabarang.setForeground(new java.awt.Color(0, 0, 102));
        namabarang.setText("Nama Barang");
        tengah.add(namabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        txtnamabarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnamabarang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtnamabarang.setText("Milo");
        txtnamabarang.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        tengah.add(txtnamabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 190, 30));

        jumlahbarang.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jumlahbarang.setForeground(new java.awt.Color(0, 0, 102));
        jumlahbarang.setText("Jumlah Barang");
        tengah.add(jumlahbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        txtjumlahbarang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtjumlahbarang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtjumlahbarang.setText("12");
        txtjumlahbarang.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(0, 0, 102)));
        tengah.add(txtjumlahbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 130, 30));

        getContentPane().add(tengah, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 101, -1, 434));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchMouseClicked

    private void newwMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newwMouseClicked
        search.setEnabled(true);
        neww.setEnabled(false);
        cancel.setEnabled(true);
    }//GEN-LAST:event_newwMouseClicked

    private void btnsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsimpanMouseClicked
        kode_barang = txtkodebarang.getText();
        nama_barang = txtnamabarang.getText();
        jumlah = Integer.parseInt(txtjumlahbarang.getText());
        total = harga*jumlah;
        int total1 = 0;
        int subTotal = 0;
        int hargajual;
        int qty1;
        int total2 = 0;
        
        if(txtjumlahbarang.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "ISI JUMLAH TERLEBIH DAHULU");
        }else if(jumlah>=stok){
            JOptionPane.showMessageDialog(this, "STOK TIDAK MENCUKUPI");
        }else{
            ct.tampilPengeluaran(kode_barang, nama_barang, harga, jumlah, total);
            txtkodebarang.setText("");
            txtnamabarang.setText("");
            txtjumlahbarang.setText("");
            for(int n = 0; n<tabel.getRowCount();n++){
                hargajual = (int) tabel.getValueAt(n, 2);
                qty1 = (int) tabel.getValueAt(n, 3);
                total1 = hargajual*jumlah;
                total2 = (int) tabel.getValueAt(n, 4);
                
                subTotal += total2;
            }
            txtgrandtotal2.setText(Integer.toString(subTotal));
            txtsubtotal.setText(Integer.toString(subTotal));
        }
        
        neww.setEnabled(true);
        search.setEnabled(false);
        btnsimpan.setEnabled(false);
        cancel.setEnabled(false);
        txtbayar.setEditable(true);
        txtjumlahbarang.setEditable(false);
        txtjumlahbarang.setText("");
        txtbayar.requestFocus();
    }//GEN-LAST:event_btnsimpanMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        cancel.setEnabled(false);
        btnsimpan.setEnabled(false);
        neww.setEnabled(true);
        search.setEnabled(false);
        delete.setEnabled(false);
        txtjumlahbarang.setEditable(false);
        txtjumlahbarang.setText("");
        tabel.clearSelection();
    }//GEN-LAST:event_cancelMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        int row = tabel.getSelectedRow();
        ct.model.removeRow(row);
        delete.setEnabled(false);
        cancel.setEnabled(false);
        neww.setEnabled(false);
        search.setEnabled(false);
        
        int subTotal = 0;
        for(int n = 0;n<tabel.getRowCount();n++){
            int hargajual = (int) tabel.getValueAt(n, 2);
            int qtyl = (int) tabel.getValueAt(n, 3);
            int total1 = hargajual*stok;
            int total2 = (int) tabel.getValueAt(n, 4);
            
            subTotal += total2;
        }
        txtgrandtotal2.setText(Integer.toString(subTotal));
        txtsubtotal.setText(Integer.toString(subTotal));
    }//GEN-LAST:event_deleteMouseClicked

    private void btnresetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnresetMouseClicked
        ct.model.removeRow(0);
        txtgrandtotal2.setText("0");
        tabel.removeAll();
        txtsubtotal.setText("");
        grandtotal.setText("");
        txtbayar.setText("");
        txtkembali.setText("");
        txtbayar.setEditable(false);
        txtkembali.setEditable(false);
        ct.model.setRowCount(0);
        neww.setEnabled(true);
        btnreset.setEnabled(false);
        btnsimpan.setEnabled(false);
        
    }//GEN-LAST:event_btnresetMouseClicked

    private void btnkembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkembaliMouseClicked
        dispose();
    }//GEN-LAST:event_btnkembaliMouseClicked

    private void txtbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbayarActionPerformed
        if(txtbayar.getText().length()>0){
            int bayar = Integer.parseInt(txtbayar.getText());
            int total = bayar-Integer.parseInt(txtgrandtotal1.getText());
            txtkembali.setText(Integer.toString(total));
            
            btnsimpan.setEnabled(true);
            btnreset.setEnabled(true);
        }
    }//GEN-LAST:event_txtbayarActionPerformed

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
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel atas;
    private javax.swing.JPanel bawah;
    private javax.swing.JLabel bayar;
    private javax.swing.JButton btnkembali;
    private javax.swing.JButton btnreset;
    public static javax.swing.JButton btnsimpan;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel grandtotal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JLabel jumlahbarang;
    private javax.swing.JLabel kembali;
    private javax.swing.JLabel kembalii;
    private javax.swing.JLabel kodebarang;
    private javax.swing.JLabel namabarang;
    private javax.swing.JLabel neww;
    private javax.swing.JLabel reset;
    private javax.swing.JLabel search;
    private javax.swing.JLabel simpan;
    private javax.swing.JLabel subtotal;
    private javax.swing.JTable tabel;
    private javax.swing.JPanel tengah;
    public static javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtgrandtotal1;
    private javax.swing.JTextField txtgrandtotal2;
    public static javax.swing.JTextField txtjumlahbarang;
    private javax.swing.JTextField txtkembali;
    public static javax.swing.JTextField txtkodebarang;
    public static javax.swing.JTextField txtnamabarang;
    private javax.swing.JTextField txtsubtotal;
    // End of variables declaration//GEN-END:variables
}
