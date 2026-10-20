public class Main {
    public static void main(String[] args) {
        Arac arac1 = new Arac();
        Arac arac2 = new Arac();
        Arac arac3 = new Arac();

        //TODO 1: Araçların özelliklerine değer atayınız.
        arac1.marka = "Toyota";
        arac1.model = "Corolla";
        arac1.gunlukUcret = 1500;
        arac1.kiradaMi = false;

        arac2.marka = "Reno";
        arac2.model = "Clio";
        arac2.gunlukUcret = 1200;
        arac2.kiradaMi = false;

        arac3.marka = "BMW";
        arac3.model = "320i";
        arac3.gunlukUcret = 3000;
        arac3.kiradaMi = true;

        //TODO 2 : Üç aracın bilgilerini ekrana yazdırın.
        System.out.println("=== ARAÇ KİRALAMA SİSTEMİ ===");
        arac1.bilgileriGoster();
        arac2.bilgileriGoster();
        arac3.bilgileriGoster();

        //TODO 3 : araç1 nesnesini kiralayınız
        arac1.kirala();

        //TODO 4 : arac1 nesnesini tekrar kiralamayı deneyiniz
        arac1.kirala();

        //TODO 5 : arac2 için 5 günlük kira bedelini hesaplayınız
        System.out.println("5 günlük kiralama bedeli: "+arac2.kiraBedeliHesapla(5)+" TL");

        //TODO 6 : arac3 nesnesini teslim alınız
        arac3.teslimEt();

        //TODO 7 : Üç aracın güncel bilgilerini yazdırınız
        System.out.println("\n=== GÜNCEL ARAÇ DURUMLARI ===");
        arac1.bilgileriGoster();
        arac2.bilgileriGoster();
        arac3.bilgileriGoster();
    }
}