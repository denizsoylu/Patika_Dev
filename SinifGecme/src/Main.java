import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = inp.nextInt();
        if ((mat < 0) || (mat > 100)) {
            System.out.println("!!Girdiğiniz not değeri hatalı!!");
            mat=0;
        }

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = inp.nextInt();
        if ((fizik < 0) || (fizik > 100)) {
            System.out.println("!!Girdiğiniz not değeri hatalı!!");
            fizik=0;
        }

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = inp.nextInt();
        if ((turkce < 0) || (turkce > 100)) {
            System.out.println("!!Girdiğiniz not değeri hatalı!!");
            turkce=0;
        }

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = inp.nextInt();
        if ((kimya < 0) || (kimya > 100)) {
            System.out.println("!!Girdiğiniz not değeri hatalı!!");
            kimya=0;
        }

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = inp.nextInt();
        if ((muzik < 0) || (muzik > 100)) {
            System.out.println("!!Girdiğiniz not değeri hatalı!!");
            muzik=0;
        }

        double avarage =(mat+fizik+turkce+kimya+muzik)/5;
        if(avarage>=55){
            System.out.println("Tebrikler sınıfı geçtiniz.");
        }
        else{
            System.out.println("Sınıfta kaldınız.");
        }
        System.out.println("Ortalamanız : "+ avarage);




    }
}