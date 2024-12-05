import java.util.Scanner;
public class percobaan3 {
    static double hitunglaba(double saldoAwal, int tahun) {
        if (tahun == 0) {
            return (saldoAwal);
        } else {
            return (1.11 * hitunglaba(saldoAwal, tahun-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double saldoAwal;
        int tahun;

        System.out.print("Jumlah saldo awal :");
        saldoAwal = sc.nextInt();
        System.out.print("Lamanya investasi (tahun) :");
        tahun = sc.nextInt();

        System.out.print("Jumlah saldo setelah " + tahun + " tahun : ");
        System.out.println(hitunglaba(saldoAwal, tahun));
    }
}
