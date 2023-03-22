import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20 , total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz :  ");
        km = input.nextInt();

        total = (km * perKm);

        if(total < 20){
            total = 20;
            System.out.println("Toplam Tutar : " +total);
        }
        else{
            System.out.println("Toplam Tutar : " +total);
        }


    }
}