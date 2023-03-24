import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password,select;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız :");
        userName = inp.nextLine();

        System.out.print("Şifreniz :");
        password = inp.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız !");
        }
        else{
            System.out.println("Bilgileriniz Yanlış !!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            System.out.println("Cevabınız evet ise 'E' hayır ise 'H' tuşlaması yapınız.");
            System.out.print("Seçiminiz : ");
            select = inp.nextLine();
            if(select.equals("E")){
                System.out.print("Lütfen yeni bir şifre giriniz : ");
                String newPassword = inp.nextLine();
                if((!newPassword.equals("java123")) && (!newPassword.equals(password))){
                    System.out.println("Şifreniz başarıyla sıfırlanmıştır.");
                }
                else{
                    System.out.println("Şifreniz önceki şifreyle aynı ya da yanlış girdiğiniz " +
                            "şifre ile aynı olduğu için sıfırlama işlemi yapılamıyor.");
                }
            }
            else{
                System.out.println("Şifre sıfırlanamıyor. Sistemden çıkılıyor...");
            }
        }
    }
}