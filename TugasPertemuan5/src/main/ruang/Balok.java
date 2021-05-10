/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.ruang;
import main.bidang.PersegiPanjang;

/**
 *
 * @author Owner
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    int tinggi;
    
    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return (2*hitungLuas())+(hitungKeliling()*tinggi);
    }

    @Override
    public double hitungVolume() {
        return hitungLuas()*tinggi;
    }
}
