    /**
    *KitaevaJavaHomeWorkSix
    *
    *@author KseniaKitaeva
    *@version 25.11.2021
    */

class KitaevaJavaHomeWorkSix {

    public static void main (String[] args) {
        Cat cat = new Cat(200);
        Dog dog = new Dog(500, 10);

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(250));
            System.out.println(animal.run(550));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
    }
}

class Dog extends Animal {

    Dog (int runLimit, int swimLimit) {
        super (runLimit, swimLimit);
    }
}

class Cat extends Animal {

    Cat(int runLimit, int swimLimit) {
        super(runLimit,swimLimit);
    }

    Cat(int runLimit) {
        super(runLimit, 0);
    }

    //@Override
    public String swim(int distance) {
        System.out.println("Cats are not able to swim");
    }

abstract class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;

    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    @Override
    public String run (int distance) {
        if (distance > runLimit) {
            return "It couldn't run " + distance;
        } else {
            return "It has sucessfully run " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return "It couldn't swim " + distance;
        } else {
            return "It has sucessfully swam " + distance;
        }
    }
}

interface IAnimal {
    String run(int distance);
    String swim( int distance);
    }
}