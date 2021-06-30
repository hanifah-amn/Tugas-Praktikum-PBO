/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import javax.swing.*;
import java.awt.event.*;

public class ViewForm extends JFrame implements ActionListener {
    JLabel ljudul, lnama, lusia, lgaji;
    JTextField tnama, tusia, tgaji;
    JButton bsubmit, breset, bkembali;
    
    public ViewForm(String s){    
        ljudul = new JLabel(s);
        lnama = new JLabel("Nama");
        lusia = new JLabel("Usia");
        lgaji = new JLabel("Gaji");
        tnama = new JTextField(10);
        tusia = new JTextField(10);
        tgaji = new JTextField(10);       
        bsubmit = new JButton("Submit");
        breset = new JButton("Reset");
        bkembali = new JButton("Kembali");
        
        setSize(350,300);
        setLayout(null);
        add(ljudul);
        add(lnama);
        add(lusia);
        add(lgaji);
        add(tnama);
        add(tusia);
        add(tgaji);
        add(bsubmit);
        add(breset);
        add(bkembali);
        
        ljudul.setBounds(100, 20, 150, 20);
        lnama.setBounds(50, 60, 50, 15);
        tnama.setBounds(125, 60, 150, 20);
        lusia.setBounds(50, 100, 50, 15);
        tusia.setBounds(125, 100, 150, 20);
        lgaji.setBounds(50, 140, 50, 15);
        tgaji.setBounds(125, 140, 150, 20);
        
        bsubmit.setBounds(120, 180, 75, 20);
        breset.setBounds(200, 180, 75, 20);
        bkembali.setBounds(50, 220, 230, 20);
        
        bsubmit.addActionListener(this);
        breset.addActionListener(this);
        bkembali.addActionListener(this);
        
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bsubmit){ 
            try{
                String nama;
                int usia, gaji;    
                nama = tnama.getText();
                usia = Integer.parseInt(tusia.getText());
                gaji = Integer.parseInt(tgaji.getText());
                
                Model m = new Model();
                m.submitForm(nama,usia,gaji);
            }
            catch(NumberFormatException error){
                JOptionPane.showMessageDialog(this, error.getMessage());
            } 
        }
        else if(e.getSource()==breset){  
            tnama.setText("");
            tusia.setText("");
            tgaji.setText("");
        }
        else if(e.getSource()==bkembali){
        
        }
        
    }
}
