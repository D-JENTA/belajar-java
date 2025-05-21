public class array2D_2 {
    public static void main(String[] args) {
        String [] [] negara =new String [3] [2];
        negara [0] [0] = "indonesia";
        negara [0] [1] = "jepang";
        negara [1] [1] = "tokyo";
        negara [2] [0] = "china";
        negara [2] [1] = "ntahlah";        
        String namaNegara;
        for ( int baris = 0 ; baris < negara.length ; baris++) {
            namaNegara = negara[baris] [0];
            if (namaNegara.charAt(0)=='i') 
            System.out.println(negara[baris][0]+ "-" + negara[baris][1]);
        }
    }
}
