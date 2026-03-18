package Slide1;

public class Animal {
	protected String name;
    protected int age; 

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal() {}
    public void eat () {
        System.out.println(name + "dang an");
    }
    public void sleep () {
        System.out.println(name + "dang ngu");
    }
    public void sound () {
        System.out.println(name + "dang sua");
    }
}
