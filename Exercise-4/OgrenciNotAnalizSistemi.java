import java.util.Scanner;

public class OgrenciNotAnalizSistemi {
	 // 1. Kullanicidan notlari al
	 public static void notlariAl(int[] notlar) {
		 Scanner scanner = new Scanner(System.in);
		 for (int i=0;i<5;i++)
		 {
			 System.out.println((i+1)+". Öğrencinin notunu giriniz:");
			 notlar[i] = scanner.nextInt();
		 }
		 
		 scanner.close();
	 }
	 // 2. Sinif ortalamasini hesapla
	 public static double ortalamaHesapla(int[] notlar) {
		 int toplam = 0;
		 double ortalama = 0;
		 for (int not : notlar)
		 {
			 toplam += not;
		 }
		 ortalama = toplam/5;
		 return ortalama;
	 }
	 // 3. En yuksek notu bul
	 public static int enYuksekNot(int[] notlar) {
		 int enYuksekNot = notlar[0], sayac = 1;
		 do
		 {
			enYuksekNot = (notlar[sayac]>enYuksekNot)?notlar[sayac]:enYuksekNot;
			sayac++;
		 } while(sayac<5);
		 return enYuksekNot;
	 }
	 // 4. Basarili ogrenci sayisini hesapla
	 public static int basariliSayisi(int[] notlar) {
		 int basariliOgrenciSayisi = 0;
		 for (int not : notlar)
		 {
			 if(not>=50)
				 basariliOgrenciSayisi++;
		 }
		 return basariliOgrenciSayisi;
	 }
	 // 5. Sonuclari ekrana yazdir
	 public static void sonuclariYazdir(double ortalama,
	 int enYuksek, int basarili) {
		 System.out.println("===== ANALIZ SONUCLARI =====");
		 System.out.println("Sinif Ortalamasi: "+ ortalama);
		 System.out.println("En Yüksek Not: "+ enYuksek);
		 System.out.println("Basarili Ogrenci Sayisi:" + basarili);
	}
	 public static void main(String[] args) {
	 int[] notlar = new int[5];
	 System.out.println("===== OGRENCI NOT ANALIZ SISTEMI =====");
	 notlariAl(notlar);
	 double ortalama = ortalamaHesapla(notlar);
	 int enYuksek = enYuksekNot(notlar);
	 int basarili = basariliSayisi(notlar);
	 sonuclariYazdir(ortalama, enYuksek, basarili);
	 }
}
