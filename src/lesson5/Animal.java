package lesson5;

public class Animal {
    public static void main(String[] args) {
        Animal anim = new Animal();

        anim.sound();

        Cat gato = new Cat();
        gato.sound();
    }
    public void sound() {
        System.out.println("Sounding");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        super.sound();
        System.out.println("Meow");
    }
}
