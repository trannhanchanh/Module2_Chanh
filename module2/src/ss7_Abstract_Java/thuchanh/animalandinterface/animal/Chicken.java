package ss7_Abstract_Java.thuchanh.animalandinterface.animal;

import ss7_Abstract_Java.thuchanh.animalandinterface.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
