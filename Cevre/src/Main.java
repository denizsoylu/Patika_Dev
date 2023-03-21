import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,u;
        double alan;
        Scanner inp = new Scanner(System.in);

        System.out.print("İlk kenarı giriniz : ");
        a = inp.nextInt();

        System.out.print("İkinci kenarı giriniz : ");
        b = inp.nextInt();

        System.out.print("Üçüncü kenarı giriniz : ");
        c = inp.nextInt();

        u =(a+b+c)/2;
        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Girdiğiniz kenar bilgileriyle oluşturulan üçgenin alanı : " + alan);
    }
}