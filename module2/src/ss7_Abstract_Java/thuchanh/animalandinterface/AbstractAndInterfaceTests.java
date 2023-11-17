package ss7_Abstract_Java.thuchanh.animalandinterface;

import ss7_Abstract_Java.thuchanh.animalandinterface.animal.Animal;
import ss7_Abstract_Java.thuchanh.animalandinterface.animal.Chicken;
import ss7_Abstract_Java.thuchanh.animalandinterface.animal.Tiger;
import ss7_Abstract_Java.thuchanh.animalandinterface.edible.Edible;
import ss7_Abstract_Java.thuchanh.animalandinterface.fruit.Apple;
import ss7_Abstract_Java.thuchanh.animalandinterface.fruit.Fruit;
import ss7_Abstract_Java.thuchanh.animalandinterface.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals) {
            System.out.println(animal.makeSound());

            if(animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit: fruits) {
            System.out.println(fruit.howToEat());
            
        }
    }
}
