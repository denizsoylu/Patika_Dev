import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r,r2,aci;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = inp.nextInt();
        System.out.print("Merkez açının ölçüsünü giriniz : ");
        aci = inp.nextInt();
        System.out.print("Daire diliminin yarıçapını giriniz : ");
        r2 = inp.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double alan2 = (pi*(r2*r2)*aci)/360;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);
        System.out.println("Daire diliminin alanı : " + alan2);


    }
}