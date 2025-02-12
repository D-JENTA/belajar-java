import java.util.Scanner;

public class market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        boolean lanjut = true;
        int jumlah_barang;
        double total = 0;
        int tindakan;
        int uang;
        double kembalian;

        int harga1 = 5000; 
        int harga2 = 2000; 
        int harga3 = 1000; 
        int harga4 = 4000; 
        int harga5 = 3000; 

        System.out.println("======= MINI MARKET =======");
        
        while (lanjut) {
            System.out.println("1. GULA : 5.000");
            System.out.println("2. KOPI : 2.000");
            System.out.println("3. TEH : 1.000");
            System.out.println("4. MIE : 4.000");
            System.out.println("5. GARAM : 3.000");
            System.out.println("===========================");
            System.out.println("Anda beli apa? (1-5) atau ketik 0 untuk bayar");
            pilihan = scanner.nextInt();

            if (pilihan == 0) {
                
                if (total > 0) {
                    System.out.println("Total belanja Anda: " + total);
                    System.out.print("Masukkan uang: ");
                    uang = scanner.nextInt();
                    if (uang >= total) {
                        kembalian = uang - total;
                        System.out.println("Pembayaran berhasil. Kembalian: " + kembalian);
                    } else {
                        System.out.println("Uang tidak cukup. Silakan coba lagi.");
                    }
                } else {
                    System.out.println("Anda belum membeli barang apapun.");
                }
                lanjut = false; 
            } else {
                switch (pilihan) {
                    case 1:
                        System.out.println("MASUKAN JUMLAH BARANG");
                        jumlah_barang = scanner.nextInt();
                        total += jumlah_barang * harga1;
                        System.out.println("Total harga: " + total);
                        break;
                    case 2:
                        System.out.println("MASUKAN JUMLAH BARANG");
                        jumlah_barang = scanner.nextInt();
                        total += jumlah_barang * harga2;
                        System.out.println("Total harga: " + total);
                        break;
                    case 3:
                        System.out.println("MASUKAN JUMLAH BARANG");
                        jumlah_barang = scanner.nextInt();
                        total += jumlah_barang * harga3;
                        System.out.println("Total harga: " + total);
                        break;
                    case 4:
                        System.out.println("MASUKAN JUMLAH BARANG");
                        jumlah_barang = scanner.nextInt();
                        total += jumlah_barang * harga4;
                        System.out.println("Total harga: " + total);
                        break;
                    case 5:
                        System.out.println("MASUKAN JUMLAH BARANG");
                        jumlah_barang = scanner.nextInt();
                        total += jumlah_barang * harga5;
                        System.out.println("Total harga: " + total);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            }
        }

        scanner.close();
    }
}