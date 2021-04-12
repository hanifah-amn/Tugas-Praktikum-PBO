/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import main.ruang.Balok;
import main.ruang.Kerucut;

/**
 *
 * @author Owner
 */
public class Main {
    public static void main(String[] args){
        do{
            Scanner input = new Scanner(System.in);
            int pilihan;

            System.out.println("=== INPUT ===");
            System.out.println("1. Balok");
            System.out.println("2. Kerucut");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilihan = input.nextInt();

            switch(pilihan){
                case 1 : 
                    // input atribut balok
                    int panjang, lebar, tinggiBalok;

                    System.out.print("Panjang\t= ");
                    panjang = input.nextInt();
                    System.out.print("Lebar\t= ");
                    lebar = input.nextInt();
                    System.out.print("Tinggi\t= ");
                    tinggiBalok = input.nextInt();

                    Balok balok = new Balok(panjang, lebar, tinggiBalok);

                    // output
                    System.out.println("\n=== OUTPUT ===");
                    System.out.println("Luas Persegi Panjang\t= " + balok.hitungLuas());
                    System.out.println("Keliling Persegi Panjang\t= " + balok.hitungKeliling());
                    System.out.println("Volume Balok\t\t= " + balok.hitungVolume());
                    System.out.println("Luas Pemukaan Balok\t= " + balok.hitungLuasPermukaan());
                    break;
                case 2 : 
                    // input atribut kerucut
                    int jariJari, tinggiKerucut;

                    System.out.print("Jari-jari\t= ");
                    jariJari = input.nextInt();
                    System.out.print("Tinggi\t= ");
                    tinggiKerucut = input.nextInt();

                    Kerucut kerucut = new Kerucut(jariJari, tinggiKerucut);

                    // output
                    System.out.println("\n=== OUTPUT ===");
                    System.out.println("Luas Lingkaran\t= " + kerucut.hitungLuas());
                    System.out.println("Keliling Lingkaran\t= " + kerucut.hitungKeliling());
                    System.out.println("Volume Kerucut\t\t= " + kerucut.hitungVolume());
                    System.out.println("Luas Pemukaan Kerucut\t= " + kerucut.hitungLuasPermukaan());
                    break;
                case 3 : System.exit(0); break;
                default: break;
            }
        } while(true);
    }
}
