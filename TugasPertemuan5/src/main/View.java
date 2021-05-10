package main;
import main.ruang.Balok;

import javax.swing.*;
import java.awt.event.*;

public class View extends JFrame implements ActionListener{
    JLabel ljudul, lpanjang, llebar, ltinggi, lhasil;
    JLabel lLpersegi, lKpersegi, lVbalok, lLPbalok;
    JLabel hLpersegi, hKpersegi, hVbalok, hLPbalok;
    JTextField tpanjang, tlebar, ttinggi;
    JButton bhitung, breset;
    
    public View(){    
        ljudul = new JLabel("KALKULATOR BALOK");
        lpanjang = new JLabel("Panjang");
        llebar = new JLabel("Lebar");
        ltinggi = new JLabel("Tinggi");
        lhasil = new JLabel("Hasil");
        tpanjang = new JTextField(10);
        tlebar = new JTextField(10);
        ttinggi = new JTextField(10);       
        bhitung = new JButton("Hitung");
        breset = new JButton("Reset");
        
        lLpersegi = new JLabel("Luas Persegi");
        lKpersegi = new JLabel("Keliling Persegi");
        lVbalok = new JLabel("Volume Balok");
        lLPbalok = new JLabel("Luas Permukaan Balok");
        
        setSize(350,500);
        setLayout(null);
        add(ljudul);
        add(lpanjang);
        add(llebar);
        add(ltinggi);setSize(350,500);
        setLayout(null);
        add(ljudul);
        add(lpanjang);
        add(llebar);

        add(lhasil);
        add(tpanjang);
        add(tlebar);
        add(ttinggi);
        add(bhitung);
        add(breset);
        
        ljudul.setBounds(100, 20, 150, 20);
        lpanjang.setBounds(50, 75, 50, 15);
        tpanjang.setBounds(125, 75, 150, 20);
        llebar.setBounds(50, 125, 50, 15);
        tlebar.setBounds(125, 125, 150, 20);
        ltinggi.setBounds(50, 175, 50, 15);
        ttinggi.setBounds(125, 175, 150, 20);
        
        lhasil.setBounds(100, 225, 50, 15);
        
        bhitung.setBounds(95, 400, 75, 20);
        breset.setBounds(180, 400, 75, 20);
        
        bhitung.addActionListener(this);
        breset.addActionListener(this);
        
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bhitung){  
            try{
                int p, l, t;    
                p = Integer.parseInt(tpanjang.getText());
                l = Integer.parseInt(tlebar.getText());
                t = Integer.parseInt(ttinggi.getText());
                hitung(p,l,t);
            }
            catch(NumberFormatException error){
                JOptionPane.showMessageDialog(this, error.getMessage());
            } 
        }
        
        if(e.getSource()==breset){
            tpanjang.setText("");
            tlebar.setText("");
            ttinggi.setText("");
            
            lLpersegi.setVisible(false);
            lKpersegi.setVisible(false);
            lVbalok.setVisible(false);
            lLPbalok.setVisible(false);
            
            hLpersegi.setVisible(false);
            hKpersegi.setVisible(false);
            hVbalok.setVisible(false);
            hLPbalok.setVisible(false);
        }
    }
    
    void hitung(int p, int l, int t){
        Balok balok = new Balok(p,l,t);
        
        //untuk menyimpan hasil hitung
        hLpersegi = new JLabel(": " + balok.hitungLuas());
        hKpersegi = new JLabel(": " + balok.hitungKeliling());
        hVbalok = new JLabel(": " + balok.hitungVolume());
        hLPbalok = new JLabel(": " + balok.hitungLuasPermukaan());
        
        add(lLpersegi);
        add(lKpersegi);
        add(lVbalok);
        add(lLPbalok);
        add(hLpersegi);
        add(hKpersegi);
        add(hVbalok);
        add(hLPbalok);
                
        lLpersegi.setBounds(50, 275, 150, 15);
        hLpersegi.setBounds(220, 275, 50, 15);
        lKpersegi.setBounds(50, 300, 150, 15);
        hKpersegi.setBounds(220, 300, 50, 15);
        lVbalok.setBounds(50, 325, 150, 15);
        hVbalok.setBounds(220, 325, 50, 15);
        lLPbalok.setBounds(50, 350, 150, 15);
        hLPbalok.setBounds(220, 350, 50, 15);
        
        lLpersegi.setVisible(true);
        lKpersegi.setVisible(true);
        lVbalok.setVisible(true);
        lLPbalok.setVisible(true);
        
        hLpersegi.setVisible(true);
        hKpersegi.setVisible(true);
        hVbalok.setVisible(true);
        hLPbalok.setVisible(true);
    }
}
