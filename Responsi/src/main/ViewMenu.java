/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import javax.swing.*;
import java.awt.event.*;

public class ViewMenu extends JFrame implements ActionListener {
    JLabel ljudul;
    JButton btambah, blihat;
    
    public ViewMenu(){
        ljudul = new JLabel("Main Menu");
        btambah = new JButton("Tambah Karyawan");
        blihat = new JButton("Lihat Karyawan");
        
        setSize(200,150);
        setLayout(null);
        add(ljudul);
        add(btambah);
        add(blihat);
        
        ljudul.setBounds(60, 15, 150, 20);
        btambah.setBounds(20, 50, 150, 20);
        blihat.setBounds(20, 80, 150, 20);
        
        btambah.addActionListener(this);
        blihat.addActionListener(this);
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btambah){ 
            ViewForm form = new ViewForm("Input Karyawan"); 
            
        }
        else if(e.getSource()==blihat){  
            ViewTabel tabel = new ViewTabel(); 
        }
        
    }
}
