
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Araba a1 = new Araba("Toyota", 120, "Benzin");
		a1.bilgileriYazdir();
		System.out.println("--------------------------------");
		ElektrikliAraba ea1 = new ElektrikliAraba("Tesla", 140, 80);
		ea1.bilgileriYazdir();
	}

}
