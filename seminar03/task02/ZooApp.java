package gb_exceptions.seminar03.task02;

public class ZooApp {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        
        Animal cat = new Cat(true);
        Animal dog = new Dog();

        zoo.addAnimal(cat);
        zoo.addAnimal(dog);

        zoo.makeAllSound();       
    }

}
