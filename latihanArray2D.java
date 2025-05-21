public class latihanArray2D {
    public static void main(String[] args) {
    
        String[] mataPelajaran = {"Matematika", "Bahasa Indonesia", "IPA", "IPS"};
        
       
        int[][] nilaiSiswa = {
            {80, 75, 90, 85},  
            {70, 65, 88, 80},  
            {85, 78, 92, 89}   
        };
       
        for (int i = 0; i < nilaiSiswa.length; i++) {
            System.out.println("Nilai Siswa " + (i + 1) + ":");
            for (int j = 0; j < mataPelajaran.length; j++) {
                System.out.println(mataPelajaran[j] + ": " + nilaiSiswa[i][j]);
            }
            System.out.println();
        }
    }
}

