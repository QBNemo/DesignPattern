package designpattern.factorymethod;

public class PetFactory {
    public Pet getPet(String petType) {
    	Pet pet = null;
    	if("狗子".equals(petType)) {
    		pet = new Dog();
    	} else if("鸭子".equals(petType)) {
    		pet = new Duck();
    	}
    	return pet;
    }
}
