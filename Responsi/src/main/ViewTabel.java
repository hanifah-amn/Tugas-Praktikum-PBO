/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

public class ViewTabel extends JFrame{
    JButton bkembali;
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID","Nama","Usia","Gaji"};
    public String id, nama, usia, gaji;
    int jmlData;
    String data[][] = new String[100][4];
    
    Connector c = new Connector();    

    public ViewTabel(){
        setLayout(null);
        setSize(550,400);
        bkembali = new JButton("Kembali");
        add(bkembali);
        bkembali.setBounds(150, 300, 230, 20);
        //bkembali.addActionListener(this);
        
        setVisible(true);
        setLocationRelativeTo(null);

        try{
            int jmlData = 0;
            String query = "Select * from `karyawan`";
            c.statement = c.koneksi.createStatement();
            ResultSet resultSet = c.statement.executeQuery(query);
            while(resultSet.next()){
                data[jmlData][0] = resultSet.getString("id"); 
                data[jmlData][1] = resultSet.getString("nama"); 
                data[jmlData][2] = resultSet.getString("usia");
                data[jmlData][3] = resultSet.getString("gaji");
                jmlData++; 
            }
            c.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
        
        tabel = new JTable(data,namaKolom); 
        scrollPane = new JScrollPane(tabel);
        add(scrollPane);
        
        scrollPane.setBounds(20, 35, 500, 250);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        
        ListSelectionModel model = tabel.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!model.isSelectionEmpty()){
                    int row = model.getMinSelectionIndex();
                    String nama, usia, gaji;
                    nama = data[row][1];
                    usia = data[row][2];
                    gaji = data[row][3];
                    new ViewKaryawan(nama,usia,gaji);
                }
            }
            
        });
    }
}
