EXPNO:10(A)
 DATE:13|9|26
                                                 CREATING A SIMPLE THREAD

    AIM:To write and execute a Java program to demonstrate multithreading by creating three threads using the Thread class and implementing the yield(), sleep() methods.

   ALGORITHM:
    
    Start the program.
Import the required Java I/O package.
Create three classes A, B and C by extending the Thread class.
Override the run() method in each thread class.
In thread A:
- Use a for loop from 1 to 5.
- Call Thread.yield() when i == 1 to allow other threads to execute.
- Display the value of i.
In thread B:
- Use a for loop from 1 to 5.
- Display the value of j.
- When j == 3, print the exit message and terminate the loop using break.
In thread C:
- Use a for loop from 1 to 5.
- Display the value of k.
- When k == 1, call Thread.sleep(1500) to pause the thread for 1.5 seconds.
- Handle the InterruptedException.
In the main method, create objects of classes A, B and C.
Start all three threads using the start() method.
Display the exit message from the main thread.
Stop the program.

PROGRAM:

import java.io.*;
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }

            System.out.println("from thread A i=" + i);
        }

        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                break;
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C = " + k);

            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                }
            }
        }
    }
}

public class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");

        a.start();
        b.start();
        c.start();

        System.out.println("exit from main thread");
    }
}

OUTPUT:
Start thread A
exit from main thread
from thread B j=1
from thread B j=2
from thread B j=3
exit from B
thread C = 1
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
from thread A i=5
exit from A
thread C = 2
thread C = 3
thread C = 4
thread C = 5

    RESULT:
Thus, the Java program to demonstrate multithreading using the Thread class and the yield() and sleep() methods was successfully executed.
