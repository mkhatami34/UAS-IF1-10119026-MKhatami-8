/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if1.pkg10119026.mkhatami.pkg8;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : IF-1
 * NIM      : 10119026
 * Deslripsi : program ini menampilkan hasil hitung bangun datar
 */
public class UASIF110119026MKhatami8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar persegi, persegiPanjang;
        persegi = new persegi(6);
        System.out.println("Luas Persegi");
        persegi.tampil();
        
        persegiPanjang = new persegiPanjang(6);
        System.out.println("Luas Persegi Panjang");
        persegiPanjang.tampil();
    }
    
}
