/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Isi;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author 118140021
 */
public class Dashboard extends javax.swing.JFrame {
Connection con;
 Statement stat;
 ResultSet rs;
 String sql;
 String ids;
 String namax;
    /**
     * Creates new form Dashboard
     */
    public Dashboard(String name,String id) {
        initComponents();
        namax = name;
        setTitle("DASHBOARD");
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm; 
        jTable1();
        try{
            sql = "select * from user where nama = '"+name+"'";
            rs = stat.executeQuery(sql);
            while(rs.next()){
                ids = rs.getString("id_user");
            }
        }catch(Exception e){
        }
        username.setText(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cari2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cari1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cari Game ");

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Cari Genre");

        jButton2.setText("Cari");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID GAME", "NAMA", "GENRE 1", "GENRE 2", "GENRE 3", "STOK"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Cara Pesan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Selamat Datang, ");

        jButton5.setText("Log Out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setText("Ke Menu Order");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Refresh");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cari1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cari2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jButton4)
                .addGap(122, 122, 122)
                .addComponent(jButton5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(cari1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(this, "Petunjuk Pemesanan : \n"
                + "1. Cari Game Yang akan dipesan, pencarian bisa dengan judul maupun dengan genre game \n"
                + "2. Pilih game yang sudah dicari dengan mengklik langsung pada table \n"
                + "3. klik tombol pesan lalu klik ya untuk konfirmasi \n"
                + "4. Lakukan pembayaran dengan mengirimkan transfer ke rekening yang sudah disediakan \n"
                + "5. Tunggu hingga di konfirmasikan oleh admin lalu cek email anda untuk game yang anda pesan");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int i = jTable1.getSelectedRow();
     if(i==-1){
         return;
     }
     String var1 = (String)jTable1.getValueAt(i,0);
     String var2 = (String)jTable1.getValueAt(i,1);
     int opsi = JOptionPane.showConfirmDialog(null, "Benarkah anda ingin memesan game ini ?", "Konfirmasi Pemesanan", JOptionPane.YES_NO_OPTION);
        if(opsi == JOptionPane.YES_OPTION){
            Calendar currentDay= Calendar.getInstance();
            int currDate= currentDay.get(Calendar.DATE);
            String a3 = Integer.toString(currDate);
            int currYear= currentDay.get(Calendar.YEAR);
            String a1 = Integer.toString(currYear);
            int currMonth= currentDay.get(Calendar.MONTH);
            String a2 = Integer.toString(currMonth);
            String date = a1 + " - " + a2 + " - " + a3;
            String Combine = a1 + a2 + a3 + ids.substring(3) + var1.substring(2);
            
            try{
            sql = "INSERT INTO order_game values ("
                + "'" + Combine + "',"
                + "'" + ids +     "',"
                + "'" + date +    "',"
                + "'" + var1 +    "',"
                + "'" + var2 +    "',"
                + "'Belum Lunas')";
            stat.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Game terpesan silahkan pindah ke menu order untuk melakukan proses pembayaran");
            jTable1();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "1 Pesanan pergame hanya bisa dalam 1 hari");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Silahkan lihat lihat produk kami yang lain :D");
            jTable1();
    }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    this.setVisible(false);
    new Orderuser(namax,ids).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    JOptionPane.showMessageDialog(null, "Log Out Sukses");
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{
        DefaultTableModel t = new DefaultTableModel();
        t.addColumn("ID GAME");
        t.addColumn("NAMA GAME");
        t.addColumn("GENRE 1");
        t.addColumn("GENRE 2");
        t.addColumn("GENRE 3");
        t.addColumn("STOK");
        jTable1.setModel(t);
        String ar = cari1.getText();
        sql = "SELECT * FROM game where nama like '%" + ar +"%'";
        rs = stat.executeQuery(sql);
        while(rs.next()){
                t.addRow(new Object[]{rs.getString("id_game"),
                                      rs.getString("nama"),
                                      rs.getString("Genre1"),
                                      rs.getString("Genre2"),
                                      rs.getString("Genre3"),
                                      rs.getString("Stok")
                });
            }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan !");
    }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        DefaultTableModel t = new DefaultTableModel();
        t.addColumn("ID GAME");
        t.addColumn("NAMA GAME");
        t.addColumn("GENRE 1");
        t.addColumn("GENRE 2");
        t.addColumn("GENRE 3");
        t.addColumn("STOK");
        jTable1.setModel(t);
        String a = cari2.getText();
        sql = "SELECT * FROM game where genre1 like '" + a +"' or genre2 like '" + a +"' or genre3 like '" + a +"'";
        rs =  stat.executeQuery(sql);
        while(rs.next()){
                t.addRow(new Object[]{rs.getString("id_game"),
                                      rs.getString("nama"),
                                      rs.getString("Genre1"),
                                      rs.getString("Genre2"),
                                      rs.getString("Genre3"),
                                      rs.getString("Stok")
                });
            }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan !");
    }
          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    jTable1();
        JOptionPane.showMessageDialog(null,"Table Terefresh !");
        cari1.setText("");
        cari2.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    private void jTable1(){
        DefaultTableModel t = new DefaultTableModel();
        t.addColumn("ID GAME");
        t.addColumn("NAMA GAME");
        t.addColumn("GENRE 1");
        t.addColumn("GENRE 2");
        t.addColumn("GENRE 3");
        t.addColumn("STOK");
        jTable1.setModel(t);
        try {
            sql = "SELECT * FROM game";
            rs = stat.executeQuery(sql);
            while(rs.next()){
                t.addRow(new Object[]{rs.getString("id_game"),
                                      rs.getString("nama"),
                                      rs.getString("Genre1"),
                                      rs.getString("Genre2"),
                                      rs.getString("Genre3"),
                                      rs.getString("Stok")
                });
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String aaa ="";
                new Dashboard(aaa,aaa).setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari1;
    private javax.swing.JTextField cari2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
