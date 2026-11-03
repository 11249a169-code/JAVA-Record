
EXPNO:10(B)
 DATE:15|9|26

                         THREAD PRIORITY

 AIM:
To write and execute a Java program to demonstrate thread priorities using the Thread class and its methods setPriority() and getPriority().

ALGORITHM:
Start the program.
Import the required Java I/O package.
Create three classes A, B and C by extending the Thread class.
Override the run() method in each class.
In class A, display the starting message, print numbers from 1 to 4 and display the exit message.
In class B, display the starting message, print numbers from 1 to 4 and display the exit message.
In class C, display the starting message, print numbers from 1 to 4 and display the exit message.
In the main method, create objects of classes A, B and C.
Set the priority of thread C to Thread.MAX_PRIORITY.
Set the priority of thread B to threadA.getPriority() + 1.
Set the priority of thread A to Thread.MIN_PRIORITY.
Start all three threads using the start() method.
Display the end message of the main thread.
Stop the program.

PROGARM:

import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started"); for(int i=1;i<=4;i++)
{
System.out.println("from thread A i="+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started"); for(int j=1;j<=4;j++)
{
System.out.println("from thread B j="+j);
}
System.out.println("exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("thread C started"); for(int k=1;k<=4;k++)
{
System.out.println("thread c ="+k);
}
System.out.println("exit from c");
}
}
class ThreadPriority
{
public static void main(String[]args)
 {
A threadA = new A();
B threadB = new B();
C threadC = new C(); threadC.setPriority(Thread.MAX_PRIORITY); threadB.setPriority(threadA.getPriority()+1); threadA.setPriority(Thread.MIN_PRIORITY); System.out.println("start thread A"); threadA.start();
System.out.println("start thread B"); threadB.start(); System.out.println("start thread C"); threadC.start();
System.out.println("end of main thread");
}
}

  OUTPUT:
start thread A
start thread B
Thread A started
start thread C
Thread B started
thread C started
end of main thread
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
exit from A
from thread B j=1
from thread B j=2
from thread B j=3
from thread B j=4
exit from B
thread c =1
thread c =2
thread c =3
thread c =4
exit from c


RESULT:
Thus, the Java program to demonstrate thread priorities using setPriority(), getPriority(), Thread.MAX_PRIORITY and Thread.MIN_PRIORITY was successfully executed.
