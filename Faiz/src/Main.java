import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı Giriniz : ");
        tutar = input.nextDouble();

        if(tutar >0 && tutar <=1000 ){
            tutar += tutar * 0.18;
            System.out.print("Faizli : " + tutar);
        }
        else{
            tutar += tutar * 0.08;
            System.out.print("Faizli : " + tutar);
        }
    }
}