/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import javax.swing.*;
import java.awt.event.*;

public class ViewKaryawan extends JFrame implements ActionListener {
    JLabel lnama, lusia, lgaji, llembur;
    JLabel dnama, dusia, dgaji;
    JTextField tlembur;
    JButton btotal, bedit, bhapus, bkembali;
    
    public ViewKaryawan(String nama, String usia, String gaji){    
        lnama = new JLabel("Nama");
        lusia = new JLabel("Usia");
        lgaji = new JLabel("Gaji");
        llembur = new JLabel("Lembur (jam)");
        dnama = new JLabel(nama);
        dusia = new JLabel(usia);
        dgaji = new JLabel(gaji);
        tlembur = new JTextField(10);
              
        btotal = new JButton("Total Gaji");
        bedit = new JButton("Edit");
        bhapus = new JButton("Hapus");
        bkembali = new JButton("Kembali");
        
        setSize(350,300);
        setLayout(null);
        add(lnama);
        add(lusia);
        add(lgaji);
        add(llembur);
        add(dnama);
        add(dusia);
        add(dgaji);
        add(tlembur);
        add(btotal);
        add(bedit);
        add(bhapus);
        add(bkembali);
        
        lnama.setBounds(50, 20, 150, 20);
        dnama.setBounds(150, 20, 150, 20);
        lusia.setBounds(50, 50, 50, 15);
        dusia.setBounds(150, 50, 150, 20);
        lgaji.setBounds(50, 80, 50, 15);
        dgaji.setBounds(150, 80, 150, 20);
        llembur.setBounds(50, 110, 100, 15);
        tlembur.setBounds(150, 110, 130, 20);
        
        btotal.setBounds(120, 140, 150, 20);
        bedit.setBounds(120, 180, 75, 20);
        bhapus.setBounds(200, 180, 75, 20);
        bkembali.setBounds(50, 220, 230, 20);
        
        btotal.addActionListener(this);
        bedit.addActionListener(this);
        bhapus.addActionListener(this);
        bkembali.addActionListener(this);
        
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btotal){ 
            hitung();
        }
        else if(e.getSource()==bedit){  
            
        }
        else if(e.getSource()==bhapus){
            
        }
        else if(e.getSource()==bkembali){
        
        }
        
    }
    
    void hitung(){
        int total, gaji, lembur;
            gaji = Integer.parseInt(dgaji.getText());
            lembur = Integer.parseInt(tlembur.getText());
            
            //menghitung total gaji
            total = gaji + lembur*25000;
            
            JLabel ltogaji = new JLabel("Total gaji");
            JLabel dtogaji = new JLabel(Integer.toString(total));
            
            llembur.setVisible(false);
            tlembur.setVisible(false);
            btotal.setVisible(false);
            bedit.setVisible(false);
            bhapus.setVisible(false);
            
            add(ltogaji);
            add(dtogaji);
            ltogaji.setBounds(50, 110, 100, 15);
            dtogaji.setBounds(150, 110, 130, 20);
            
            ltogaji.setVisible(true);
            dtogaji.setVisible(true);
    }
}
