package com.example;
import java.util.Scanner;

public class MainBangunDatar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bangun datar yang ingin dihitung:");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan pilihan (1-3): ");
        
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
              
                System.out.print("Masukkan panjang sisi persegi: ");
                int sisiPersegi = scanner.nextInt();
                Persegi persegi = new Persegi(sisiPersegi);
                System.out.println("Luas persegi: " + persegi.luas());
                System.out.println("Keliling persegi: " + persegi.keliling());
                break;

            case 2:
              
                System.out.print("Masukkan alas segitiga: ");
                int alasSegitiga = scanner.nextInt();
                System.out.print("Masukkan tinggi segitiga: ");
                int tinggiSegitiga = scanner.nextInt();
                Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);
                System.out.println("Luas segitiga: " + segitiga.luas());
                break;

            case 3:
               
                System.out.print("Masukkan jari-jari lingkaran: ");
                int jariJari = scanner.nextInt();
                Lingkaran lingkaran = new Lingkaran(jariJari);
                System.out.println("Luas lingkaran: " + lingkaran.luas());
                System.out.println("Keliling lingkaran: " + lingkaran.keliling());
                break;

            default:
                System.out.println("pilihannya tidak tersedia");
                break;
        }

        scanner.close();
    }
}


