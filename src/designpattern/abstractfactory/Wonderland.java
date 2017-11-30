package designpattern.abstractfactory;

public class Wonderland {
    public Wonderland(AnimalFactory factory) {
    	Animal animal = factory.createAnimal();
    	animal.breath();
    }
}
