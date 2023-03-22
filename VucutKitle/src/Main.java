import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kilo;
        double boy,index;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kilonuzu kg cinsinden giriniz : ");
        kilo = inp.nextInt();
        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        boy = inp.nextDouble();

        index = kilo/(boy*boy);

        System.out.println("Vücut kitle indeksiniz : " + index);
    }
}