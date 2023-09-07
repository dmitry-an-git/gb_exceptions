package gb_exceptions.seminar03.task02;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    Zoo() {
        animals = new ArrayList<Animal>();
    }

    void addAnimal(Animal animal) {
        animals.add(animal);
    }

    void makeAllSound() {
        for (Animal animal : animals) {
            try {
                animal.makeSound();
            } catch (HungryCatException e) {
                System.out.println("Ошибка: "+e.getMessage());
            }
            
        }
    }
 }
