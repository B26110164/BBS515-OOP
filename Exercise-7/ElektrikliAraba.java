
public class ElektrikliAraba extends Arac{
	private int bataryaSeviyesi;
	//TODO: Constructor ekleyiniz (super() kullanınız)
	public ElektrikliAraba(String marka, int hiz, int bataryaSeviyesi) {
		super(marka, hiz);
		this.bataryaSeviyesi = bataryaSeviyesi;
	}
	@Override
	public void bilgileriYazdir() {
		System.out.print("Marka: "+this.marka);
		System.out.println(", Hız: "+this.hiz);
		System.out.println("Batarya Seviyesi: %" +this.bataryaSeviyesi);
	}
}
