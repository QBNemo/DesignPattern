package designpattern.abstractfactory;

public class SeaFactory implements AnimalFactory {

	@Override
	public Animal createAnimal() {
		return new Shark();
	}

}
