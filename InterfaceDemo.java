EXPNO:07
 DATE: 18\8\26                        INTERFACE   

AIM: 
      To write a Java program to demonstrate the use of an interface by implementing an interface in a class.

ALGORITHM:
Start 
•  Create an interface named Animal. 
•  Declare the abstract method sound() inside the interface. 
•  Create a class Dog that implements the Animal interface. 
•  Define the sound() method in the Dog class. 
•  Display "Dog Barks" when the sound() method is called. 
•  In the main() method, create an object of the Dog class. 
•  Call the sound() method using the object. 
•  Display the output. 
•  Stop
    
SOURCE CODE:
    
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}


OUTPUT:
    DOG BARKS

    RESULT:
    Thus, the Java program to demonstrate the implementation and use of an interface was successfully executed, and the output "Dog Barks" was displayed.
