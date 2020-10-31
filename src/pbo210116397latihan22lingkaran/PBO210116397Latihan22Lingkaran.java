/*
@author 
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Lingkaran
 */
package pbo210116397latihan22lingkaran;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan22Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String d;
        double diameter;
        double r;
        double L;
        double K;

        Scanner lingkaran = new Scanner(System.in);

        System.out.println("==== Perhitungan Lingkaran ====");

        do {
            System.out.print("Masukkan Nilai Diameter Lingkaran\t : ");
            d = lingkaran.nextLine();

            System.out.println((!d.matches("[0-9]*"))
                    ? "Nilai Diameter Tidak Sesuai\n" : "");
        } 
        while (!d.matches("[0-9]*"));
        {

            System.out.println("==== Hasil Perhitungan Lingkaran ====");

            diameter = Double.parseDouble(d);

            r = diameter / 2;
            System.out.printf("Jari-jari Lingkaran = %.0f cm %n", r);
            L = Math.PI * r * r;
            System.out.printf("Luas Lingkaran = %.2f cm %n", L);
            K = 2 * Math.PI * r;
            System.out.printf("Keliling Lingkaran = %.2f cm %n", K);
        }
    }
    
}
