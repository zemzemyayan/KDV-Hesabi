import java.util.Scanner;

public class KDVHesabi {

    /*
     * Pratik - KDV Tutarı Hesaplayan Program
     * 
     * KDV Tutarı Hesaplayan Program
     * Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını
     * hesaplayıp ekrana bastıran programı yazın.
     * 
     * (Not : KDV tutarını 18% olarak alın)
     * 
     * KDV'siz Fiyat = 10;
     * 
     * KDV'li Fiyat = 11.8;
     * 
     * KDV tutarı = 1.8;
     * 
     * Ödev
     * Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000
     * TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı
     * yazınız.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("parayı giriniz: ");
        float para = sc.nextFloat();
        if (0 < para && para < 100) {
            float kdv = (para * 0.18f) + para;
            System.out.println("kdv degeri: " + kdv);
        } else if (para > 100) {
            float kdv = (para * 0.08f) + para;
            System.out.println("kdv degeri :" + kdv);
        }

        sc.close();

    }

}
