/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */
public class Model {
    Connector c = new Connector();
    
    public void submitForm(String nama, int usia, int gaji){
        try {
            String query = "INSERT INTO `karyawan`(`id`, `nama`,`usia`,`gaji`) VALUES ('0','"+nama+"','"+usia+"','"+gaji+"')";
            
            c.statement = c.koneksi.createStatement();
            c.statement.executeUpdate(query);

            JOptionPane.showMessageDialog(null,"Input berhasil");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
