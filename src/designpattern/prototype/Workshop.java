package designpattern.prototype;

public class Workshop {
	
	public Bike makeJaguar(Bike basicBike) {
		basicBike.makeAdvanced();
		return basicBike;
	}
	
	public static void main(String args[]){
		Bike bike = new Bike();
		
		Bike basicBike = null;
		basicBike = bike.clone();

		Workshop workShop = new Workshop();
		Bike advancedBike = workShop.makeJaguar(basicBike);
		
		System.out.println("Prototype Design Pattern: "+advancedBike.getModel());
	}
}