// latihan method static
public class Mobilana {
    // varibel static 
    static String warna = "hitam";
    static int tahunProduksi = 2020;
    // method static
    static void ubah ()
    {
        warna = "abu-abu";
    }
    static void tampil ()
    {
        System.out.println(warna);
        System.out.println(tahunProduksi);
    }
    public static void main(String[] args) {
        // pemanggilan method static
        Mobilana.ubah();
        Mobilana.tampil();
    }
}
