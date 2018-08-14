/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet8;

/**
 *
 * @author Farrel
 */
public class PerulanganForeach {
    public static void main(String[] args) {
        // Membuat array
        int angka[]= {3,1,42,24,12};
        
        // Menggunakan perulangan For each untuk menampilkan angka
        for( int x : angka ){
            System.out.print(x+ " ");
        }
    }
}