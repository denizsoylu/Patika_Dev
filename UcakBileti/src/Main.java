import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe,yas,tip;
        double normalTutar,indirimliTutar,yasIndirimi,tipIndirim,ciftYonIndirimi,total;

        Scanner inp = new Scanner(System.in);


        System.out.print("Mesafeyi KM cinsinden giriniz:");
        mesafe = inp.nextInt();
        if(mesafe<0){
            System.out.println("Geçersiz bir değer girdiniz. Tekrar deneyiniz.");
        }




        System.out.print("Yaşınızı giriniz:");
        yas = inp.nextInt();
        if(yas<0){
            System.out.println("Geçersiz bir değer girdiniz. Tekrar deneyiniz.");
        }



        System.out.print("1)Tek-Yön\n2)Gidiş-Dönüş\n");
        System.out.print("Yolculuk tipinizi seçiniz :");
        tip = inp.nextInt();
        if(!(tip==1 || tip==2)){
            System.out.println("Geçersiz bir değer girdiniz. Tekrar deneyiniz.");
        }


        if(tip==1){
            if(yas<=12){
                normalTutar= mesafe *(0.10);
                yasIndirimi=normalTutar*0.5;
                indirimliTutar=normalTutar-yasIndirimi;
                System.out.println(indirimliTutar);


            } else if (yas>12 && yas<25) {
                normalTutar= mesafe *(0.10);
                yasIndirimi=normalTutar*0.1;
                indirimliTutar=normalTutar-yasIndirimi;
                System.out.println(indirimliTutar);

            } else if (yas>=25 && yas<65) {
                normalTutar= mesafe *(0.10);
                System.out.println(normalTutar);

            }else if(yas>65){
                normalTutar= mesafe *(0.10);
                yasIndirimi=normalTutar*0.3;
                indirimliTutar=normalTutar-yasIndirimi;
                System.out.println(indirimliTutar);
            }
            else{
                System.out.println("Yanlış giriş yaptınız.");
            }
        } else if (tip==2) {
            if(yas<=12){
                normalTutar= mesafe *(0.10);
                yasIndirimi=normalTutar*0.5;
                indirimliTutar=normalTutar-yasIndirimi;
                ciftYonIndirimi=indirimliTutar*0.2;
                indirimliTutar-=ciftYonIndirimi;
                total=indirimliTutar*2;
                System.out.println(total);

            } else if (yas>12 && yas<25) {
                normalTutar= mesafe *(0.10);
                yasIndirimi=normalTutar*0.1;
                indirimliTutar=normalTutar-yasIndirimi;
                ciftYonIndirimi=indirimliTutar*0.2;
                indirimliTutar-=ciftYonIndirimi;
                total=indirimliTutar*2;
                System.out.println(total);

            } else if (yas>=25 && yas<65) {
                normalTutar= mesafe *(0.10);
                ciftYonIndirimi=normalTutar*0.2;
                total=(normalTutar-ciftYonIndirimi)*2;
                System.out.println(total);

            }else if(yas>=65){
                normalTutar= mesafe *(0.10);
                yasIndirimi=normalTutar*0.3;
                indirimliTutar=normalTutar-yasIndirimi;
                ciftYonIndirimi=indirimliTutar*0.2;
                indirimliTutar-=ciftYonIndirimi;
                total=indirimliTutar*2;
                System.out.println(total);

            }
            else{
                System.out.println("Yanlış giriş yaptınız.");
            }

        }


    }
}