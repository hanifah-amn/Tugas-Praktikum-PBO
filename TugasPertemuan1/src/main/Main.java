/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
            String nama, nim;
            int usia, uts, uas;
            
            // input data mahasiswa
            System.out.println("Input Data =====");
            System.out.print("Nama : ");
            nama = input.nextLine();
            System.out.print("NIM  : ");
            nim = input.next();
            System.out.print("Usia : ");
            usia = input.nextInt();
            System.out.print("UTS  : ");
            uts = input.nextInt();
            System.out.print("UAS  : ");
            uas = input.nextInt();

            Mahasiswa mhs = new Mahasiswa(nama, nim, usia, uts, uas);
            
        boolean ulang=true;
        do{
            System.out.println("Opsi =====");
            System.out.println("1. Tampilkan data");
            System.out.println("2. Edit data");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");            
            int pilih = input.nextInt();

            switch(pilih){
                case 1 : 
                    mhs.tampilData();
                    break;
                case 2 : 
                    // edit data mahasiswa
                    Scanner edit = new Scanner(System.in);
                    System.out.println("Edit Data =====");
                    System.out.print("Nama : ");
                    mhs.nama = edit.nextLine();
                    System.out.print("NIM  : ");
                    mhs.nim = edit.next();
                    System.out.print("Usia : ");
                    mhs.usia = edit.nextInt();
                    System.out.print("UTS  : ");
                    mhs.uts = edit.nextInt();
                    System.out.print("UAS  : ");
                    mhs.uas = edit.nextInt();
                    break;
                case 3 : ulang=false; break;      
            }
        } while(ulang);
    }
    
}
