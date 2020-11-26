/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119912.latihan61.bangunruang;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 */ 
public class IF10K10119912Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Bola nBola = new Bola();
      nBola.setR(7);
      System.out.println("1. Volume Bola :");
      System.out.printf("   Hasil = %,12.1f%n", (double) nBola.hitungVolume());
      System.out.println("");
        
      Tabung nTabung = new Tabung();
      nTabung.setH(21);
      nTabung.setR(10);
      System.out.println("2. Volume Tabung : ");
      System.out.println("Hasil = " + (int) nTabung.hitungVolume());
      System.out.println("");
        
      Kerucut nKerucut = new Kerucut();
      nKerucut.setR(14);
      nKerucut.setT(9);
      System.out.println("3. Volume Kerucut : ");
     
 System.out.println("   Hasil = " + (int) nKerucut.hitungVolume());

    }
    
}
