import java.util.Scanner;
public class DeretDescendingRekursif15 {
    static void rekursif(int n) {
        if (n <= 0) {
            System.out.println(n);
            return;
        }
        System.out.print(n + ", ");
        rekursif(n - 1);
    }
    static void iteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i);
            if (i != 0)
                System.out.print(", ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();
        System.out.println("Deret rekursif: ");
        rekursif(n);
        System.out.println("Deret iteratif: ");
        iteratif(n);
        sc.close();

}
}