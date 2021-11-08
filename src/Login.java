import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String userName, password,cevap,newPassword;
        Scanner scn = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı girin: ");
        userName = scn.nextLine();
        System.out.print("Şifrenizi girin: ");
        password = scn.nextLine();
        if (!(userName.equals("patika")) || !(password.equals("java123"))) {
            System.out.println("Giriş başarısız!");
            if(!password.equals("java123")){
                System.out.print("Yanlış şifre. Şifrenizi değiştirmek ister misiniz?: E/H " );
                cevap = scn.nextLine();
                switch (cevap){
                    case "E":
                        System.out.println("Lütfen yeni şifrenizi giriniz: ");
                        newPassword = scn.nextLine();
                        if(newPassword.equals("java123")){
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                            newPassword = scn.nextLine();
                        }
                        else{
                            System.out.println("Şifre oluşturuldu.");
                        }
                        break;
                    case "H":
                        System.out.println("Teşekkürler.");
                        break;
                    default:
                        System.out.println("Lütfen geçerli bir seçim yapınız.");
                }
            }
        }
                else{
            System.out.println("Giriş başarılı!");
        }
    }
}
