package com.raven.form;

import com.raven.cell.TableActionCellEditor;
import com.raven.cell.TableActionCellRenderer;
import com.raven.cell.TableActionEvent;
import com.raven.component.Header;
import com.raven.model.Model_Card;
import com.raven.model.StatusType;
import com.raven.swing.ScrollBar;
import com.raven.swing.SearchText;
import com.raven.swing.HideTextField;
import java.awt.Color;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import koneksi.config;
import com.raven.main.Main;
import com.raven.component.Header;
import java.sql.PreparedStatement;
import textfield.SearchOptinEvent;
import textfield.SearchOption;
import java.sql.Statement;
import koneksi.SingletonConnection;

public class Form_Pengembalian extends javax.swing.JPanel { //Definisi

    private DefaultTableModel model;

    private void kosong() {
        txt_nim.enable();
        txt_nim.setText(null);
        txt_jur.setSelectedItem(null);
        txt_nama.setText(null);
    }

    private void load_table(String where, Object... search) {
        //menampilkan data database kedalam tabel         
        SingletonConnection singleton = SingletonConnection.getInstance();
        Connection connection = singleton.openConnection();
        try {
            
            model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);
            PreparedStatement p = SingletonConnection.getInstance().openConnection().prepareStatement("select * from anggota " + where);
            for (int i = 0; i < search.length; i++) {
                p.setObject(i + 1, search[i]);
            }
            ResultSet r = p.executeQuery();
            
            
            while (r.next()) {
                String nim = r.getString("nim");
                String nama = r.getString("Nama");
                String jurusan = r.getString("jurusan");
                model.addRow(new Object[]{table.getRowCount() + 1, nim, nama, jurusan});
            }
            table.setModel(model);

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Form_Pengembalian() {
        initComponents();

        //  search textfield
        txt.addEventOptionSelected(new SearchOptinEvent() {
            @Override
            public void optionSelected(SearchOption option, int index) {
                txt.setHint("Cari berdasarkan " + option.getName() + "...");

            }
        });
        txt.addOption(new SearchOption("Nama", new ImageIcon(getClass().getResource("/com/raven/icon/nama.png"))));
        txt.addOption(new SearchOption("NIM", new ImageIcon(getClass().getResource("/com/raven/icon/nim.png"))));
        txt.addOption(new SearchOption("Jurusan", new ImageIcon(getClass().getResource("/com/raven/icon/building.png"))));
        

        //  add row table
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        load_table("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JLayeredPane();
        panelBorder1 = new com.raven.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();
        txt_jur = new combobox.Combobox();
        txt_nim = new textfield.TextField();
        txt_nama = new textfield.TextField();
        add = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        delete = new javax.swing.JLabel();
        clear = new javax.swing.JLabel();
        txt = new textfield.TextFieldSearchOption();

        setBackground(new java.awt.Color(33, 35, 50));

        panel.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));

        spTable.setBorder(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "NIM", "nama", "Jurusan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(25);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        spTable.setViewportView(table);

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 849, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txt_jur.setBackground(new java.awt.Color(33, 35, 50));
        txt_jur.setForeground(new java.awt.Color(238, 240, 242));
        txt_jur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Produksi Pertanian", "Peternakan", "Bahasa", "Manajemen Agribisnis", "Kesehatan", "Teknologi Informasi", "Teknologi Pertanian", "Teknik" }));
        txt_jur.setSelectedIndex(-1);
        txt_jur.setLabeText("Jurusan");
        txt_jur.setLineColor(new java.awt.Color(152, 126, 185));

        txt_nim.setBackground(new java.awt.Color(33, 35, 50));
        txt_nim.setForeground(new java.awt.Color(238, 240, 242));
        txt_nim.setCaretColor(new java.awt.Color(150, 150, 150));
        txt_nim.setLabelText("NIM");
        txt_nim.setMinimumSize(new java.awt.Dimension(65, 45));
        txt_nim.setPreferredSize(new java.awt.Dimension(65, 45));
        txt_nim.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txt_nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nimActionPerformed(evt);
            }
        });
        txt_nim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nimKeyReleased(evt);
            }
        });

        txt_nama.setBackground(new java.awt.Color(33, 35, 50));
        txt_nama.setForeground(new java.awt.Color(238, 240, 242));
        txt_nama.setLabelText("Nama");
        txt_nama.setMinimumSize(new java.awt.Dimension(65, 45));
        txt_nama.setPreferredSize(new java.awt.Dimension(65, 45));

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/button/Button_Default_Tambah.png"))); // NOI18N
        add.setText("Tambah");
        add.setPreferredSize(new java.awt.Dimension(35, 15));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                addMouseReleased(evt);
            }
        });

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/button/Button_Default_Edit.png"))); // NOI18N
        edit.setText("Tambah");
        edit.setPreferredSize(new java.awt.Dimension(35, 15));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                editMouseReleased(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/button/Button_Default_Delete.png"))); // NOI18N
        delete.setText("Tambah");
        delete.setPreferredSize(new java.awt.Dimension(35, 15));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                deleteMouseReleased(evt);
            }
        });

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/button/Button_Default_Clear.png"))); // NOI18N
        clear.setText("Tambah");
        clear.setPreferredSize(new java.awt.Dimension(35, 15));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clearMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                clearMouseReleased(evt);
            }
        });

        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_nim, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txt_jur, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(txt_nama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_jur, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nimActionPerformed

    private void txt_nimKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nimKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nimKeyReleased

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Hover_Tambah.png"));
        add.setIcon(II);

    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Default_Tambah.png"));
        add.setIcon(II);

    }//GEN-LAST:event_addMouseExited

    private void addMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Clicked_Tambah.png"));
        add.setIcon(II);

    }//GEN-LAST:event_addMousePressed

    private void addMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Default_Tambah.png"));
        add.setIcon(II);

    }//GEN-LAST:event_addMouseReleased

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Hover_Edit.png"));
        edit.setIcon(II);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Default_Edit.png"));
        edit.setIcon(II);
    }//GEN-LAST:event_editMouseExited

    private void editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Clicked_Edit.png"));
        edit.setIcon(II);
    }//GEN-LAST:event_editMousePressed

    private void editMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Default_Edit.png"));
        edit.setIcon(II);
    }//GEN-LAST:event_editMouseReleased

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Hover_Delete.png"));
        delete.setIcon(II);
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Default_Delete.png"));
        delete.setIcon(II);
    }//GEN-LAST:event_deleteMouseExited

    private void deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Clicked_Delete.png"));
        delete.setIcon(II);
    }//GEN-LAST:event_deleteMousePressed

    private void deleteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Default_Delete.png"));
        delete.setIcon(II);
    }//GEN-LAST:event_deleteMouseReleased

    private void clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Hover_Clear.png"));
        clear.setIcon(II);
    }//GEN-LAST:event_clearMouseEntered

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Default_Clear.png"));
        clear.setIcon(II);
    }//GEN-LAST:event_clearMouseExited

    private void clearMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Clicked_Clear.png"));
        clear.setIcon(II);
    }//GEN-LAST:event_clearMousePressed

    private void clearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/com/raven/button/Button_Default_Clear.png"));
        clear.setIcon(II);
    }//GEN-LAST:event_clearMouseReleased

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        try {
            model = new DefaultTableModel();
            String jurusan = (String) txt_jur.getSelectedItem();

            String sql = "INSERT INTO anggota VALUES ('" + txt_nim.getText() + "','" + txt_nama.getText() + "','" + jurusan + "')";
            Connection conn = (Connection) config.connectDB();
            Statement stmt = conn.createStatement();
            PreparedStatement p = conn.prepareStatement(sql);
            p.executeUpdate(sql);

            JOptionPane.showMessageDialog(this, "Penyimpanan Data Berhasil");
            config.closeDB();

        } catch (Exception e) {
            e.printStackTrace();
        }
        load_table("");
        kosong();
    }//GEN-LAST:event_addMouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        // Edit Data
        String nim = txt_nim.getText();
        String buku = txt_nama.getText();
        String jurusan = (String) txt_jur.getSelectedItem();
        
        try {
            String sql = "UPDATE `anggota` SET `nim`='" + nim + "',`nama`='" + buku + "',`jurusan`='"
                    + jurusan + "' WHERE nim = '" + nim + "'";
            Connection conn = (Connection) config.connectDB();
            Statement stmt = conn.createStatement();
            PreparedStatement p = conn.prepareStatement(sql);
            p.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Data berhasil di edit");
            config.closeDB();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Kesalahan");
        }
        load_table("");
        kosong();
    }//GEN-LAST:event_editMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        //menampilkan data kedalam form pengisian:

        int baris = table.rowAtPoint(evt.getPoint());

        String kd = table.getValueAt(baris, 1).toString();
        txt_nim.setText(kd);
        String ed = table.getValueAt(baris, 2).toString();
        txt_nama.setText(ed);
        String idpg = table.getValueAt(baris, 3).toString();
        txt_jur.setSelectedItem(idpg);
    }//GEN-LAST:event_tableMouseClicked

    private void txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyReleased
        if (txt.isSelected()) {
            int option = txt.getSelectedIndex();
            String text = "%" + txt.getText().trim() + "%";
            if (option == 0) {
                //  Search by nama
                load_table("where `Nama` like ? ", text);
            } else if (option == 1) {
                //  Search by nim
                load_table("where `nim` like ?", text);
            } else if (option == 2) {
                //  Search by jurusan
                load_table("where `jurusan` like ?", text);
            }
        }
    }//GEN-LAST:event_txtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel clear;
    private javax.swing.JLabel delete;
    private javax.swing.JLabel edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane panel;
    private com.raven.swing.PanelBorder panelBorder1;
    public static javax.swing.JScrollPane spTable;
    public static com.raven.swing.Table table;
    private textfield.TextFieldSearchOption txt;
    private combobox.Combobox txt_jur;
    private textfield.TextField txt_nama;
    private textfield.TextField txt_nim;
    // End of variables declaration//GEN-END:variables
}
