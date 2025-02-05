import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class latihan7 {
    public static void main(String[] args) throws IOException{
        String nama;
        int noHp;
        // memanggil object inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        // memanggil object bufferadredear
        BufferedReader br = new BufferedReader(isr);
        // mengisi variabel nama dengan bufferedreader
        System.out.print("sia namo kwan");
        nama = br.readLine();
        // tampilkan output isi variabel nama
        System.out.println("salam kenal" + " " + nama);
        // mengisi variabel no hp dengan bufferede  
        System.out.print("a no hp ko kwan?"); 
        noHp = br.read();
        noHp = Integer.parseInt(br.readLine());
        System.out.print("makasi no hp nyo" + "(" + " " +noHp + " " + ")");

    } 

}
