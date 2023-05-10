/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.login;

import com.raven.login.*;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import koneksi.config;

/**
 *
 * @author Legion
 */
public class ResetTab extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public ResetTab() {
        initComponents();
        setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_user = new textfield.TextField();
        passwordField1 = new textfield.PasswordField();
        reset = new javax.swing.JLabel();
        btn_daftar = new com.k33ptoo.components.KButton();
        jawaban = new textfield.TextField();
        checkmark = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_pertanyaan = new textfield.TextField();

        txt_user.setBackground(new java.awt.Color(58, 71, 90));
        txt_user.setForeground(new java.awt.Color(255, 255, 255));
        txt_user.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_user.setLabelText("Username");
        txt_user.setLineColor(new java.awt.Color(107, 141, 160));
        txt_user.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txt_user.setSelectionColor(new java.awt.Color(0, 120, 215));
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });

        passwordField1.setBackground(new java.awt.Color(56, 67, 87));
        passwordField1.setForeground(new java.awt.Color(255, 255, 255));
        passwordField1.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField1.setDisabledTextColor(new java.awt.Color(110, 144, 164));
        passwordField1.setLabelText("Password Baru");
        passwordField1.setLineColor(new java.awt.Color(107, 141, 160));
        passwordField1.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        passwordField1.setSelectionColor(new java.awt.Color(0, 120, 215));
        passwordField1.setShowAndHide(true);
        passwordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordField1ActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Lupa Password");
        reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetMouseClicked(evt);
            }
        });

        btn_daftar.setText("Reset Password");
        btn_daftar.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        btn_daftar.setkBorderRadius(40);
        btn_daftar.setkEndColor(new java.awt.Color(82, 207, 243));
        btn_daftar.setkHoverEndColor(new java.awt.Color(82, 207, 243));
        btn_daftar.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btn_daftar.setkHoverStartColor(new java.awt.Color(139, 223, 247));
        btn_daftar.setkPressedColor(new java.awt.Color(92, 148, 164));
        btn_daftar.setkStartColor(new java.awt.Color(40, 195, 239));

        jawaban.setBackground(new java.awt.Color(54, 63, 83));
        jawaban.setForeground(new java.awt.Color(255, 255, 255));
        jawaban.setCaretColor(new java.awt.Color(255, 255, 255));
        jawaban.setLabelText("Jawaban");
        jawaban.setLineColor(new java.awt.Color(107, 141, 160));
        jawaban.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jawaban.setSelectionColor(new java.awt.Color(0, 120, 215));
        jawaban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jawabanActionPerformed(evt);
            }
        });

        checkmark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/checkmark.png"))); // NOI18N
        checkmark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkmarkMouseClicked(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(36, 40, 44));
        jLayeredPane1.setForeground(new java.awt.Color(36, 40, 44));
        jLayeredPane1.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Helvetica", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(90, 91, 95));
        jLabel1.setText("Tidak Jadi.");

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(208, 209, 210));
        jLabel2.setText("Login");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        txt_pertanyaan.setBackground(new java.awt.Color(52, 60, 79));
        txt_pertanyaan.setForeground(new java.awt.Color(255, 255, 255));
        txt_pertanyaan.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_pertanyaan.setLabelText("Pertanyaan");
        txt_pertanyaan.setLineColor(new java.awt.Color(107, 141, 160));
        txt_pertanyaan.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txt_pertanyaan.setSelectionColor(new java.awt.Color(0, 120, 215));
        txt_pertanyaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pertanyaanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_daftar, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jawaban, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_pertanyaan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(reset))
                            .addComponent(txt_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(checkmark)
                        .addGap(35, 35, 35))))
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(reset)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkmark))
                .addGap(29, 29, 29)
                .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jawaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txt_pertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_daftar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void passwordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordField1ActionPerformed

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetMouseClicked
        
    }//GEN-LAST:event_resetMouseClicked

    private void jawabanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jawabanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jawabanActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Form_Login.panel.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void checkmarkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkmarkMouseClicked
        String id=txt_user.getText();
        
        try {
            String sql = ("select pertanyaan from register where id='"+id+"'");
            Connection conn=(Connection)config.connectDB();
            PreparedStatement p = conn.prepareStatement(sql);
            ResultSet rs = p.executeQuery(sql);
            if(rs.next()){
              txt_pertanyaan.setText(rs.getString(1));            
                }else{
                JOptionPane.showMessageDialog(this,"Username salah");
                config.closeDB();
            rs.close();
            p.close();
                }            
        } catch (Exception e) {
                e.printStackTrace();
        }
    }//GEN-LAST:event_checkmarkMouseClicked

    private void txt_pertanyaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pertanyaanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pertanyaanActionPerformed
    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#3E4D61"), 0, getHeight(), Color.decode("#2D3144"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btn_daftar;
    private javax.swing.JLabel checkmark;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private textfield.TextField jawaban;
    private textfield.PasswordField passwordField1;
    private javax.swing.JLabel reset;
    private textfield.TextField txt_pertanyaan;
    private textfield.TextField txt_user;
    // End of variables declaration//GEN-END:variables
}
