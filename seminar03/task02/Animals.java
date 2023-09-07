package gb_exceptions.seminar03.task02;

class Animal {
    void makeSound() { // общая реализация для всех животных
    }
}

class Cat extends Animal {
    boolean isHungry;

    Cat(boolean isHungry){
        this.isHungry = isHungry;
    }

    @Override
    void makeSound() throws HungryCatException {
        if (isHungry) {
            throw new HungryCatException("покормите кота");
        }
        System.out.println("Мяу");
    }

}

class Dog extends Animal {
    @Override

    void makeSound() {
        System.out.println("Гав");
    }

}