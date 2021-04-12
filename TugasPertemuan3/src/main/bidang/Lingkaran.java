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
public class Lingkaran implements MenghitungBidang{
    public int jariJari;
    
    public Lingkaran(int jariJari){
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungKeliling() {
        return 2*Math.PI*jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI*jariJari*jariJari;
    }
    
}
