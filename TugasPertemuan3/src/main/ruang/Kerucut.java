/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ruang;
import main.bidang.Lingkaran;

/**
 *
 * @author Owner
 */
public class Kerucut extends Lingkaran implements MenghitungRuang {
    int tinggi;
    
    public Kerucut(int jariJari, int tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }
    
    private double hitungKemiringan() {
        return Math.sqrt(Math.pow(tinggi, 2)+Math.pow(jariJari, 2));
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return (Math.PI*jariJari*hitungKemiringan())+hitungLuas();
    }

    @Override
    public double hitungVolume() {
        return hitungLuas()*tinggi/3;
    }
}
