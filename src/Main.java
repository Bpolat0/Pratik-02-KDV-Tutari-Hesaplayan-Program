import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Değişkenler oluşturuldu
        double Para,Kdv,Sonuc;

        System.out.println("Hoşgeldiniz KDV Hesaplamak İstediğiniz Para Değerini Giriniz");

        Para = input.nextDouble();
        Kdv = Para * ((Para < 1000) ? 0.18 : 0.08); // KDV tutarı hesaplandı

        Sonuc = Para + Kdv; // KDV'li fiyat hesaplandı

        System.out.println("KDV'siz Fiyat : " + Para);
        System.out.println("KDV'li Fiyat : " + Sonuc);
        System.out.println("KDV Tutarı : " + Kdv);
    }
}