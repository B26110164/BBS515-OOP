public class Product {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock){
        // TODO 1: Değerleri alanlara atayınız.
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getStock(){
        return this.stock;
    }
    public void setPrice(double price){
        // TODO 5: price > 0 ise güncelleyiniz;
        if(price<=0)
            System.out.println("Hata: Fiyat 0'dan büyük olmalıdır.");
        else
            this.price = price;
    }
    public void setStock(int stock){
        // TODO 6: stock >= 0 ise güncelleyiniz;
        if(stock<0)
            System.out.println("Hata: Stok 0 veya 0'dan büyük olmalıdır.");
        else
            this.stock = stock;
        }
}