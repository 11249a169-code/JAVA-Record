EXPNO:04
DATE:11\8\26                      INHERITANCE
    
AIM:
    :  To write a Java program to demonstrate different types of inheritance, namely Single, Multilevel, Hierarchical, Multiple, and Hybrid inheritance using classes and interfaces.

ALGORIHTM:
1.	Start 
2.	Create a base class Animal with the method eat(). 
3.	Create class Dog that extends Animal and define the method bark(). 
4.	Create class Puppy that extends Dog and define the method play(). 
o	This demonstrates Multilevel Inheritance. 
5.	Create class Cat that extends Animal and define the method meow(). 
o	This demonstrates Hierarchical Inheritance. 
6.	Create interfaces Father and Mother with their respective methods. 
7.	Create class Child that implements both Father and Mother. 
o	This demonstrates Multiple Inheritance using interfaces. 
8.	Create an interface Sports with the method playSports(). 
9.	Create class Student with the method study(). 
10.	Create class CollegeStudent that extends Student and implements Sports. 
o	This demonstrates Hybrid Inheritance using a class and interface. 
11.	In the main() method, create objects of the respective classes. 
12.	Call the methods to demonstrate each type of inheritance. 
13.	Display the results. 
14.	Stop 

SOURCE CODE:

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}
interface Father {
    void fatherProperty();
}
interface Mother {
    void motherProperty();
}
class Child implements Father, Mother {
    public void fatherProperty() {
        System.out.println("Child gets property from Father");
    }
    public void motherProperty() {
        System.out.println("Child gets property from Mother");
    }
}
interface Sports {
    void playSports();
}
class Student {
    void study() {
        System.out.println("Student studies");
    }
}
class CollegeStudent extends Student implements Sports {
    public void playSports() {
        System.out.println("College student plays sports");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();
        System.out.println("\nMultilevel Inheritance:");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();
        System.out.println("\nHierarchical Inheritance:");
        Cat c = new Cat();
        c.eat();
        c.meow();
        System.out.println("\nMultiple Inheritance:");
        Child ch = new Child();
        ch.fatherProperty();
        ch.motherProperty();
        System.out.println("\nHybrid Inheritance:");
        CollegeStudent cs = new CollegeStudent();
        cs.study();
        cs.playSports();
    }
}

OUTPUT:
Single Inheritance:
Animal eats
Dog barks

Multilevel Inheritance:
Animal eats
Dog barks
Puppy plays

Hierarchical Inheritance:
Animal eats
Cat meows

Multiple Inheritance:
Child gets property from Father
Child gets property from Mother

Hybrid Inheritance:
Student studies
College student plays sports


 RESULT:

Thus, the Java program to demonstrate Single, Multilevel, Hierarchical, Multiple, and Hybrid inheritance was successfully executed, and the different types of inheritance were demonstrated using classes and interfaces.

