import java.util.Scanner;
public class luasLingkaran {
    static int jari_jari;
    static Scanner Scenner = new Scanner(System.in);
    public static void main(String[] args) 
    {                              
      System.out.println("LUAS LINGKARAN");
      System.out.print("masukan nilai jari jari : ");
      jari_jari = Scenner.nextInt();
      System.out.print("hasilnya adalah " );
      luasLingkaran.rumus();
      
    }
    static void rumus () 
    {
    System.out.println(jari_jari * jari_jari * Math.PI); 
    }
}
