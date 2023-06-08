package lesson5;

public class Person {
    private final String name;

    public String getName() {
        return  this.name;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char gender;
    public double height;

    public void eat(String food) {
        System.out.println("Eating " + food);
    }

    public void move() {
        System.out.println("Moving");
    }

    public void communicate(Person recipient) {
        System.out.println(this.name + " is speaking to " + recipient.name);
    }

    public Person(String name, int age, char gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }
}
