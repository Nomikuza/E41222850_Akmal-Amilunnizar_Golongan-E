/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.swing;

import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JTextField;

/**
 *
 * @author Legion
 */
public class HideTextField extends JApplet {
    public void init() {
    //set layour to jframe
    this.getContentPane().setLayout(new FlowLayout());
    
    //create textfield
    JTextField txt_nim=new JTextField("");
    JTextField txt_nama=new JTextField("");
    JTextField txt_jurusan=new JTextField("");
    //set visible
    txt_nim.setVisible(false);
    txt_nama.setVisible(false);
    txt_jurusan.setVisible(false);
    
    //add text to jframe
    add(txt_nim);
    add(txt_nama);
    add(txt_jurusan);
    
    super.init();//to change body of generated methods    
}
    
}
