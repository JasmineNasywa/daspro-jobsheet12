public class tugas2 {
   
        public static int jumlahRekursif(int n) {
            if (n == 1) {
                return 1;
            }
            return n + jumlahRekursif(n - 1);
        }
    
        public static void main(String[] args) {
            int f = 8;
            int hasil = jumlahRekursif(f);
            System.out.println("Hasil penjumlahan dari 1 hingga " + f + " adalah: " + hasil);
        }
    
}
