
class Arac {
	protected String marka;
	protected int hiz;
	//TODO: Constructor ekleyiniz
	public Arac(String marka, int hiz) {
		this.marka = marka;
		this.hiz = hiz;
	}
	public void bilgileriYazdir() {
		System.out.print("Marka: "+this.marka);
		System.out.println(", Hız: "+this.hiz);
	}
}
