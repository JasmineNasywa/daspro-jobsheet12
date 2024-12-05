import java.util.Scanner;
public class percobaan2 {
    static int hitungpangkat (int x, int y) {
        if (y == 0) {
            return(1);
        } else {
            int hasil = x * hitungpangkat(x, y-1);
            System.out.print(x + " x ");
            return hasil;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.println("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.println("Pangkat : ");
        pangkat = sc.nextInt();

          

        System.out.println(hitungpangkat(bilangan, pangkat));
       
    }
}
