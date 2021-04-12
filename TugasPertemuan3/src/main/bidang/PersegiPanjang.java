/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.bidang;

/**
 *
 * @author Owner
 */
public class PersegiPanjang implements MenghitungBidang{
    int panjang, lebar;
    
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungKeliling() {
        return 2*(panjang+lebar);
    }

    @Override
    public double hitungLuas() {
        return panjang*lebar;
    }
    
}
