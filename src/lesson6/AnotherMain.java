package lesson6;

public class AnotherMain {
    public static void main(String[] args) {

    }
}


abstract class AHuman {
    public String name = "";
    public int age = 0;

    public abstract void walk();

    public void eat() {

    }


}

interface IEmployee {
    public String role = "";

    public void work();

}

class Student extends AHuman implements IEmployee {

    public Student(String name, int age, String gender) {

    }

    @Override
    public void work() {

    }


    @Override
    public void walk() {

    }
}


/*
* Create 3 interfaces Carnivore, Omnivore , Herbivore
* Create an abstract class Animal with a constructor
* Create 3 classes of different animals which extends Animal and implements any of the 3 interfaces, and they should hav a constructor
* Each class and interface should have at least 3 properties and 2 methods
* */