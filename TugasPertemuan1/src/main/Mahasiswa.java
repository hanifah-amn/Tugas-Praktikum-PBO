/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Owner
 */
public class Mahasiswa {
    String nama;
    String nim;
    int usia;
    int uts, uas;
    
    public Mahasiswa(String nama, String nim, int usia, int uts, int uas){
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.uts = uts;
        this.uas = uas;
    }
    
    float hitungNilaiAkhir(){
        return (uts+uas)/2;
    }
    
    void tampilData(){
        System.out.print("Perkenalkan nama saya " + nama);
        System.out.println(", NIM " + nim + ",");
        System.out.println("Usia : " + usia);
        System.out.println("Nilai akhir : " + hitungNilaiAkhir());
    }
}
