
public class KagroDagitim {

	public static void main(String[] args) {
		
		double toplamGelir = 0, temelUcret = 0;
		int mesafe = 5;
		
		for (int teslimat = 1; teslimat<=10; teslimat++)
		{
			if(mesafe<=10)
			{
				temelUcret = 50;
			}else if (mesafe<=30)
			{
				temelUcret = 80;
			}else
			{
				temelUcret=120;
			}
			if(teslimat%3==0)
			{
				temelUcret+=20;
			}
			if(mesafe>=40)
			{
				temelUcret*=0.9;
			}
			
			System.out.println(teslimat+". Teslimat - Mesafe: "+mesafe+" km - Ücret: "+temelUcret + " TL");
			toplamGelir+=temelUcret;
			mesafe +=5;
		}
		System.out.println();
		System.out.println("Toplam Gelir: "+ toplamGelir+ " TL");
	}

}
