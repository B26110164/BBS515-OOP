public class ProductManager {
 public void urunBilgileriniGoster(Product product) {
 // TODO 1: Getter metotlarıyla adı,
 // fiyatı ve stok miktarını yazdırınız.
    System.out.println("Ürün: "+product.getName());
    System.out.println("Fiyat: "+ product.getPrice());
    System.out.println("Stok: "+ product.getStock());
    printDashedLine();
 }
 public void satisYap(Product product, int adet) {
 // TODO 2: adet pozitif mi kontrol ediniz.
 // Yeterli stok varsa stoktan düşünüz.
 // Değilse uyarı mesajı gösteriniz.
 // İPUCU: product.getStock(), product.setStock(...)
    if(adet>0){
        if(product.getStock()>=adet){
            product.setStock(product.getStock()-adet);
            System.out.println(adet+" adet "+ product.getName()+" satıldı.");
        } else {
            System.out.println("Yetersiz stok!");
        }
    } else {
        System.out.println("Lütfen pozitif bir satış miktarı giriniz.");
    }
 }
 public void stokEkle(Product product, int adet) {
 // TODO 3: adet pozitifse mevcut stoka ekleyiniz.
 // Güncel stok miktarını yazdırınız.
    if(adet>=0) {
        product.setStock(product.getStock()+adet);
        System.out.println(adet+" adet "+product.getName()+" stoğa eklendi.");
    }
    else {
        System.out.println("Lütfen pozitif bir stok miktarı giriniz.");
    }
 }
 private void printDashedLine(){
    for (int i=0; i<20; i++)
        System.out.print("-");
    System.out.print("\n");
 }
}
