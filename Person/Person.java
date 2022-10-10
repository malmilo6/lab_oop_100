package edu.faf.oop.Person;

import edu.faf.oop.RootClass.Root;

public class Person extends Root {
    private String name;
    protected int age;

    protected Person(String name, int age, String itemId) {
        super(itemId);
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
