import java.util.Scanner;
public class tugasno12 {
    public static void tampilkanIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Menampilkan bilangan dari " + n + " sampai 0 (iteratif):");
        tampilkanIteratif(n);
    }
}
