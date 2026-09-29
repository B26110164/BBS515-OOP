
public class TravelCostCalculator {

	public static void main(String[] args) {
		/*
		 Problem
			Bir araçla Ankara’dan başka bir şehre yolculuk yapılacaktır. Araç 100 km’de 7.5 litre yakıt tüketmektedir.
			Yolculuğun toplam mesafesi 450 km, yakıtın litre fiyatı ise 52 TL’dir. Ayrıca yolculuk sırasında 250 TL otoyol
			ücreti ödenecektir. Araçta 3 kişi bulunmaktadır.
		 */
		float consumptionPer100Km = 7.5f, distance= 450f;
		double fuelPrice = 52, highwayFee= 250;
		byte numberOfPeople = 3;
		/*
		 Görev
			1. Yolculuk boyunca tüketilecek toplam yakıt miktarını hesaplayınız.
		 */
		float totalFuelConsumption = (consumptionPer100Km*distance)/100;
		System.out.println("Total Fuel Consumption: "+totalFuelConsumption+" Lt");
		/*
		 * 	2.Toplam yakıt maliyetini hesaplayınız.
		 */
		double fuelCost = totalFuelConsumption*fuelPrice;
		System.out.println("Fuel Cost :"+fuelCost+" TL");
		/*
		 * 	3.Otoyol ücreti dahil toplam yolculuk maliyetini hesaplayınız.
		 */
		double totalTravelCost = fuelCost + highwayFee;
		System.out.println("Total Travel Cost :"+totalTravelCost+" TL");
		/*
		 * 	4. Kişi başına düşen yolculuk maliyetini hesaplayınız.
		 */
		double costPerPerson = totalTravelCost/numberOfPeople;
		System.out.println("Cost Per Person :"+costPerPerson+" TL/person");
	}

}
