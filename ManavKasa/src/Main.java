import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14,elma = 3.67, domates = 1.11, muz = 0.95,
                patlican = 5.0, ilkTutar,toplam=0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut miktarını kg cinsinden giriniz :");
        ilkTutar = inp.nextDouble();
         toplam+=(ilkTutar*armut);

        System.out.print("Elma miktarını kg cinsinden giriniz :");
        ilkTutar = inp.nextDouble();
        toplam+=(ilkTutar*elma);

        System.out.print("Domates miktarını kg cinsinden giriniz :");
        ilkTutar = inp.nextDouble();
        toplam+=(ilkTutar*domates);

        System.out.print("Muz miktarını kg cinsinden giriniz :");
        ilkTutar = inp.nextDouble();
        toplam+=(ilkTutar*muz);

        System.out.print("Patlıcan miktarını kg cinsinden giriniz :");
        ilkTutar = inp.nextDouble();
        toplam+=(ilkTutar*patlican);

        System.out.println("Toplam tutar :" + toplam);


    }
}