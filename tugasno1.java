import java.util.Scanner;
public class tugasno1{
    public static void tampilkanRekursif(int n) {
        if (n < 0) {
            return; 
        }
        System.out.println(n); 
        tampilkanRekursif(n - 1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        System.out.println("Menampilkan bilangan dari " + n + " sampai 0 (rekursif):");
        tampilkanRekursif(n);
    }
}
