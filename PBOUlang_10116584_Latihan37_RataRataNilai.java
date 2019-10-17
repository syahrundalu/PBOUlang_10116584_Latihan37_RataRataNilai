/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116584_latihan37_rataratanilai;

import java.util.Scanner;

/**
 *
 * @author syhar
 */
public class PBOUlang_10116584_Latihan37_RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int banyakMahasiswa;
        Scanner scan = new Scanner (System.in);
        rataRata rataRata = new rataRata();
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        banyakMahasiswa = scan.nextInt();
        
        rataRata.hitungNilai(banyakMahasiswa);
        double jmlNilai;
        System.out.println("Rata Rata Nilainya adalah : "+rataRata.hitungRataRata(banyakMahasiswa, banyakMahasiswa));
        
    }
    
}
