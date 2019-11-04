/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan54.koordinat;

/**
 *
 * @author 
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi Program : Program ini untuk membuat Warna Sumbu.
 */
public class Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WarnaKoordinat wKoordinat = new WarnaKoordinat (10,4,"Jingga");
        System.out.println("Warna Koordinat : "+wKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+wKoordinat.getX()+", y : "+wKoordinat.getY());
    }
    
}
