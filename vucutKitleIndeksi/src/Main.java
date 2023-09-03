import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k;
        double b;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kilonuzu Giriniz: ");
        k = inp.nextInt();

        System.out.print("Boyunuzu (Metre Cinsinde)Giriniz:");
        b = inp.nextDouble();

        System.out.println("Vücüt Kitle İndeksi: " + (k/b*b));






    }
}