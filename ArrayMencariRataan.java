public class ArrayMencariRataan {

    public static void main(String[] args) {
        // Langkah 1: deklarasi, penciptaan, inisialisasi variabel array
        double nilai_ujian[] = {20,30,20,30,20};
        double hasil = 0;
        for (int i=0; i<5; i++)
            hasil = hasil + nilai_ujian [i];
        
        System.out.println("Rataan adalah " + hasil/5);
    }
    
}