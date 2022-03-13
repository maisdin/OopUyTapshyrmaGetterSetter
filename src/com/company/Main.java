package com.company;

public class Main {

    public static void main(String[] args) {
        method();
        method1();
        method2();
        method3();

    }
       public static void method() {
        Fish fish = new Fish();
        fish.setSpecies("Trout");
        fish.setLength(15);
        fish.setWeight(5);
        System.out.print(fish.getSpecies()+" ");
        System.out.print(fish.getLength()+" ");
        System.out.println(fish.getWeight());
    }
        public static void method1(){
        Parrot parrot= new Parrot();
        parrot.setName("Totu");
        parrot.setAge(7);
        parrot.setWeight(1);
            System.out.print(parrot.getName()+" ");
            System.out.print(parrot.getAge()+" ");
            System.out.println(parrot.getWeight());
    }
    public static void method2(){
        Cat cat =new Cat();
        cat.setName("Mini");
        cat.setColor("Black");
        cat.setAge(2);
        System.out.print(cat.getName()+" ");
        System.out.print(cat.getColor()+" ");
        System.out.println(cat.getAge());
    }
    public static void method3(){
        Dog dog =new Dog();
        dog.setName("Barboz");
        dog.setColor("Grey");
        dog.setWeight(10);
            System.out.print(dog.getName()+" ");
            System.out.print(dog.getColor()+" ");
            System.out.println(dog.getWeight());
    }
}

