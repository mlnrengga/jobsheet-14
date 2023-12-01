import java.util.Scanner;
public class CekPrimaRekursif15 {
    static boolean cekPrimaRekursif(int n, int m) {
        if (n <= 1) {
            return false;
        } else if (m == 1) {
            return true;
        } else if (n % m == 0) {
            return false;
        } else {
            return cekPrimaRekursif(n, m - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;

        System.out.print("Masukkan bilangan : ");
        bilangan = sc.nextInt();

        boolean hasil = cekPrimaRekursif(bilangan, bilangan / 2);

        if (hasil) {
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        } sc.close();
    }
}
