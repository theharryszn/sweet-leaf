package lesson6;

import java.text.DateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Emmanuel", 24 , "male", "Driver", "Transport", "Cheating", 20_000);

        System.out.println(emp.name);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT);
        System.out.println(dateFormat.format(emp.dateEmployed));
    }
}

class Human {
    public String name;
    public int age;
    public String gender;

    public void eat() {
        System.out.println("Eating");
    }

    public Human(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

class Employee extends Human {
    public String role;
    public String department;

    public String status;

    public long salary;

    public Date dateEmployed;

    public Employee(String name, int age, String gender, String role, String department, String status, long salary) {
        super(name, age, gender);
        this.role = role;
        this.department = department;
        this.status = status;
        this.salary= salary;
        this.dateEmployed = new Date();

    }
}
