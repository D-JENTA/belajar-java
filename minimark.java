import java.util.Scanner;

public class minimark {
    public static void main(String[] args) {
     Scanner Scanner = new Scanner(System.in);
     int pilihan;
     int tindakan;
     int uang;
     int sisa;
     int kuantitas;
     int total;
     

         System.out.println("======= MINI MARKET======" + " ");
         System.out.println("catatan:fitur tambahan belum bisa digunakan ,masih dalam pengerjaan (otak saya da sakit )");
         System.out.println("1.GULA");
         System.out.println("2.KOPI");
         System.out.println("3.TEH");
         System.out.println("4.MIE");
         System.out.println("5.GARAM");
         System.out.println("=========================" + " ");
         System.out.println("anda beli apa ?(1-4)"); 
         pilihan = Scanner.nextInt();
          
        
    if (pilihan == 1) {
      System.out.println("harga : 5000");
      System.out.println("kuantitas :");
       kuantitas = Scanner.nextInt();
       total = kuantitas * 5000;
      System.out.println("total : " + total );
      System.out.println("1.bayar");
      System.out.println("2.tambah belanjaan");
      System.out.println("3.tidak jadi");
      tindakan = Scanner.nextInt(); 
   
      if ( tindakan == 1) {
         System.out.println("masukan uang anda");
         uang = Scanner.nextInt();
         sisa = uang - total  ;
         System.out.println("kembalian : " + sisa);
         System.out.println("terimaksih telah berbelanja di sini😁😁");

        
         }
         if (tindakan == 2) {
            System.out.println("======= MINI MARKET======" + " ");

            System.out.println("1.GULA");
            System.out.println("2.KOPI");
            System.out.println("3.TEH");
            System.out.println("4.MIE");
            System.out.println("5.GARAM");
            System.out.println("=========================" + " ");
            System.out.println("anda beli apa ?(1-4)"); 
            pilihan = Scanner.nextInt();
         }
         if (tindakan == 3) {
            System.out.println("======= MINI MARKET======" + " ");

            System.out.println("1.GULA");
            System.out.println("2.KOPI");
            System.out.println("3.TEH");
            System.out.println("4.MIE");
            System.out.println("5.GARAM");
            System.out.println("=========================" + " ");
            System.out.println("anda beli apa ?(1-4)"); 
            pilihan = Scanner.nextInt();
         }
    } if (pilihan == 2) {
      System.out.println("harga : 2000");
      System.out.println("kuantitas :");
       kuantitas = Scanner.nextInt();
       total = kuantitas * 2000;
      System.out.println("total : " + total );
      System.out.println("1.bayar");
      System.out.println("2.tambah belanjaan");
      System.out.println("3.tidak jadi");
      tindakan = Scanner.nextInt(); 
      if ( tindakan == 1) {
        System.out.println("masukan uang anda");
        uang = Scanner.nextInt();
        sisa = uang - total ;
        System.out.println("kembalian : " + sisa);
        System.out.println("terimaksih telah berbelanja di sini😁😁");

       
        }
        if (tindakan == 2) {
           System.out.println("======= MINI MARKET======" + " ");

           System.out.println("1.GULA");
           System.out.println("2.KOPI");
           System.out.println("3.TEH");
           System.out.println("4.MIE");
           System.out.println("5.GARAM");
           System.out.println("=========================" + " ");
           System.out.println("anda beli apa ?(1-4)"); 
           pilihan = Scanner.nextInt();
        }
        if (tindakan == 3) {
           System.out.println("======= MINI MARKET======" + " ");

           System.out.println("1.GULA");
           System.out.println("2.KOPI");
           System.out.println("3.TEH");
           System.out.println("4.MIE");
           System.out.println("5.GARAM");
           System.out.println("=========================" + " ");
           System.out.println("anda beli apa ?(1-4)"); 
           pilihan = Scanner.nextInt();
        }
    } if (pilihan == 3) {
        System.out.println("harga : 1000");
      System.out.println("kuantitas :");
       kuantitas = Scanner.nextInt();
       total = kuantitas * 1000;
      System.out.println("total : " + total);
      System.out.println("1.bayar");
      System.out.println("2.tambah belanjaan");
      System.out.println("3.tidak jadi");
      tindakan = Scanner.nextInt(); 
      if ( tindakan == 1) {
        System.out.println("masukan uang anda");
        uang = Scanner.nextInt();
        sisa = uang - total  ;
        System.out.println("kembalian : " + sisa);
        System.out.println("terimaksih telah berbelanja di sini😁😁");

       
        }
        if (tindakan == 2) {
           System.out.println("======= MINI MARKET======" + " ");

           System.out.println("1.GULA");
           System.out.println("2.KOPI");
           System.out.println("3.TEH");
           System.out.println("4.MIE");
           System.out.println("5.GARAM");
           System.out.println("=========================" + " ");
           System.out.println("anda beli apa ?(1-4)"); 
           pilihan = Scanner.nextInt();
        }
        if (tindakan == 3) {
           System.out.println("======= MINI MARKET======" + " ");

           System.out.println("1.GULA");
           System.out.println("2.KOPI");
           System.out.println("3.TEH");
           System.out.println("4.MIE");
           System.out.println("5.GARAM");
           System.out.println("=========================" + " ");
           System.out.println("anda beli apa ?(1-4)"); 
           pilihan = Scanner.nextInt();
        }
    } if (pilihan == 4) {
        System.out.println("harga : 4000");
        System.out.println("kuantitas :");
         kuantitas = Scanner.nextInt();
         total = kuantitas * 000;
        System.out.println("total : " + total );
        System.out.println("1.bayar");
        System.out.println("2.tambah belanjaan");
        System.out.println("3.tidak jadi");
        tindakan = Scanner.nextInt(); 
        if ( tindakan == 1) {
          System.out.println("masukan uang anda");
          uang = Scanner.nextInt();
          sisa = uang - total  ;
          System.out.println("kembalian : " + sisa);
          System.out.println("terimaksih telah berbelanja di sini😁😁");
  
         
          }
          if (tindakan == 2) {
             System.out.println("======= MINI MARKET======" + " ");
  
             System.out.println("1.GULA");
             System.out.println("2.KOPI");
             System.out.println("3.TEH");
             System.out.println("4.MIE");
             System.out.println("5.GARAM");
             System.out.println("=========================" + " ");
             System.out.println("anda beli apa ?(1-4)"); 
             pilihan = Scanner.nextInt();
          }
          if (tindakan == 3) {
             System.out.println("======= MINI MARKET======" + " ");
  
             System.out.println("1.GULA");
             System.out.println("2.KOPI");
             System.out.println("3.TEH");
             System.out.println("4.MIE");
             System.out.println("5.GARAM");
             System.out.println("=========================" + " ");
             System.out.println("anda beli apa ?(1-4)"); 
             pilihan = Scanner.nextInt();
          }
    } if (pilihan == 4) {
        System.out.println("harga : 2000");
        System.out.println("kuantitas :");
         kuantitas = Scanner.nextInt();
         total = kuantitas * 2000;
        System.out.println("total : " + total );
        System.out.println("1.bayar");
        System.out.println("2.tambah belanjaan");
        System.out.println(".tidak jadi");
        tindakan = Scanner.nextInt(); 
        if ( tindakan == 1) {
          System.out.println("masukan uang anda");
          uang = Scanner.nextInt();
          sisa = uang - total  ;
          System.out.println("kembalian : " + sisa);
          System.out.println("terimaksih telah berbelanja di sini😁😁");
  
         
          }
          if (tindakan == 2) {
             System.out.println("======= MINI MARKET======" + " ");
  
             System.out.println("1.GULA");
             System.out.println("2.KOPI");
             System.out.println("3.TEH");
             System.out.println("4.MIE");
             System.out.println("5.GARAM");
             System.out.println("=========================" + " ");
             System.out.println("anda beli apa ?(1-4)"); 
             pilihan = Scanner.nextInt();
          }
          if (tindakan == 3) {
             System.out.println("======= MINI MARKET======" + " ");
  
             System.out.println("1.GULA");
             System.out.println("2.KOPI");
             System.out.println("3.TEH");
             System.out.println("4.MIE");
             System.out.println("5.GARAM");
             System.out.println("=========================" + " ");
             System.out.println("anda beli apa ?(1-4)"); 
             pilihan = Scanner.nextInt();
          }
    } if (pilihan == 5) {
        System.out.println("harga : 3000");
        System.out.println("kuantitas :");
         kuantitas= Scanner.nextInt();
         total = kuantitas * 3000;
        System.out.println("total : " + total );
        System.out.println("1.bayar");
        System.out.println("2.tambah belanjaan");
        System.out.println("3.tidak jadi");
        tindakan = Scanner.nextInt(); 
        if ( tindakan == 1) {
          System.out.println("masukan uang anda");
          uang = Scanner.nextInt();
          sisa = uang - total  ;
          System.out.println("kembalian : " + sisa);
          System.out.println("terimaksih telah berbelanja di sini😁😁");
  
         
          }
          if (tindakan == 2) {
             System.out.println("======= MINI MARKET======" + " ");
  
             System.out.println("1.GULA");
             System.out.println("2.KOPI");
             System.out.println("3.TEH");
             System.out.println("4.MIE");
             System.out.println("5.GARAM");
             System.out.println("=========================" + " ");
             System.out.println("anda beli apa ?(1-4)"); 
             pilihan = Scanner.nextInt();
          }
          if (tindakan == 3) {
             System.out.println("======= MINI MARKET======" + " ");
  
             System.out.println("1.GULA");
             System.out.println("2.KOPI");
             System.out.println("3.TEH");
             System.out.println("4.MIE");
             System.out.println("5.GARAM");
             System.out.println("=========================" + " ");
             System.out.println("anda beli apa ?(1-4)"); 
             pilihan = Scanner.nextInt();
          }
    }
    




    Scanner.close();
}






}
