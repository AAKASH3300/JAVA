class Animal{
    void eat(){
        System.out.println("Eating....");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking....");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Meowing....");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping....");
    }
}

public class Inheritance {
    public static void main(String args[]) {

        Dog d = new Dog(); //single inheritance
        d.eat();
        d.bark();

        Cat c = new Cat(); //hierarchical inheritance
        c.eat();
        c.meow();

        BabyDog b = new BabyDog(); //multilevel inheritance
        b.weep();
        b.bark();
        b.eat();
    }
}

/*
Animal -> Dog =>single inheritance
Animal -> Dog , Cat =>hierarchical inheritance
Animal -> Dog -> Baby =>Dog multilevel inheritance
 */
