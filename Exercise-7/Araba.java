
class Araba extends Arac{
	private String yakitTuru;
	//TODO: Constructor ekleyiniz (super() kullanınız)
	public Araba(String marka, int hiz, String yakitTuru) {
		super(marka, hiz);
		this.yakitTuru = yakitTuru;
	}
	@Override
	public void bilgileriYazdir() {
		System.out.print("Marka: "+this.marka);
		System.out.println(", Hız: "+this.hiz);
		System.out.println("Yakıt Türü: " +this.yakitTuru);
	}
}
