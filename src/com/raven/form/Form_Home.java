package com.raven.form;

import com.raven.model.Model_Card;
import com.raven.model.StatusType;
import com.raven.swing.ScrollBar;
import com.raven.swing.SearchText;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import koneksi.config;
import koneksi.SingletonConnection;

public class Form_Home extends javax.swing.JPanel {
private DefaultTableModel model;
private void load_table() {                               
        //menampilkan data database kedalam tabel
        
        try {
            model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            String sql = "SELECT * FROM anggota order by nim asc";
            ResultSet rs = config.read(sql);            
            while(rs.next()){                
                String nim = rs.getString(1);
                String nama = rs.getString(2);
                String jurusan = rs.getString(3);
                model.addRow(new Object[]{table.getRowCount() +1, nim, nama, jurusan});                                    
            }
            table.setModel(model);
            config.closeDB();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

private void load_card1(){
    try { //colleger         
        String sql = "SELECT COUNT(nim) AS jumlah_mahasiswa FROM anggota";
        ResultSet rs = config.read(sql);
        while(rs.next()){
            String jum = rs.getString("jumlah_mahasiswa");        
        card1.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/user.png")), "Total Mahasiswa", jum, "Meningkat sebanyak"));
        }        
                
    } catch (Exception e) {
        e.printStackTrace();
    }
}

private void load_card2(){
    try { //books         
        String sql = "SELECT SUM(total_buku) AS jumlah_buku FROM buku_masuk";
        ResultSet rs = config.read(sql);
        while(rs.next()){
            String jum = rs.getString("jumlah_buku");        
        card2.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/book2.png")), "Total Buku", jum, "Meningkat sebanyak"));
        }        
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}

private void load_card3(){
    try { //pengeluaran       
        String sql = "SELECT SUM(total_harga) AS total_pengeluaran FROM buku_masuk";
        ResultSet rs = config.read(sql);
        while(rs.next()){
            String jum = rs.getString("total_pengeluaran");        
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/profit.png")), "Total Buku", jum, "Meningkat sebanyak"));
        }        
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}


//persentase

    public Form_Home() {
        initComponents();                
        card3.setData(new Model_Card(new ImageIcon(getClass().getResource("/com/raven/icon/flag.png")), "Total Pengeluaran", "$300000", "Increased by 70%"));
        //  add row table
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        load_table();
        load_card1();
        load_card2();
        load_card3();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        card1 = new com.raven.component.Card();
        card2 = new com.raven.component.Card();
        card3 = new com.raven.component.Card();
        panelBorder1 = new com.raven.swing.PanelBorder();
        spTable = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();

        setBackground(new java.awt.Color(33, 35, 50));
        setForeground(new java.awt.Color(33, 35, 50));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        card1.setColor1(new java.awt.Color(84, 138, 237));
        card1.setColor2(new java.awt.Color(56, 92, 158));
        panel.add(card1);

        card2.setColor1(new java.awt.Color(55, 206, 86));
        card2.setColor2(new java.awt.Color(36, 137, 57));
        panel.add(card2);

        card3.setColor1(new java.awt.Color(241, 113, 65));
        card3.setColor2(new java.awt.Color(160, 75, 43));
        panel.add(card3);

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Jurusan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.Card card1;
    private com.raven.component.Card card2;
    private com.raven.component.Card card3;
    private javax.swing.JLayeredPane panel;
    private com.raven.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
