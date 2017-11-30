package designpattern.factorymethod;

public class SampleFactoryMethod {

	public static void main(String[] args) {
		PetFactory factory = new PetFactory();
		
		Pet pet = factory.getPet("狗子");
		System.out.println(pet.speek());
		
		pet = factory.getPet("鸭子");
		System.out.println(pet.speek());
	}

}
