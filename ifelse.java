

import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = scanner.nextInt();
        if (angka > 0) {
            System.out.println(angka + " adalah angka positif.");
        } else if (angka < 0) {
            System.out.println(angka + " adalah angka negatif.");
        } else {
            System.out.println("Angka yang dimasukkan adalah 0.");
        }

        scanner.close();
}
}
