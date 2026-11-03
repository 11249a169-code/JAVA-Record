EXPNO:11(B)
DATE:29/9/26

                    FILE READER

AIM:
To write and execute a Java program to read the contents of a file named sample2.txt using the FileReader class and display the contents on the console.

ALGORITHM:
Start the program.
Import the required Java I/O package.
Create a class named FileReader.
Define the main method.
Use a try block to handle exceptions.
Create a FileReader object to open the file sample2.txt.
Declare an integer variable i to read characters from the file.
Use a while loop to read characters until the end of the file is reached (-1).
Convert each integer value into a character using type casting.
Display each character using the println() method.
Close the file using the close() method.
Handle exceptions using the catch block.
Stop the program

PROGARM:

import java.io.*;

class FileReader
{
    public static void main(String[] args)
    {
        try
        {
            java.io.FileReader fr = new java.io.FileReader("sample2.txt");
            int i;

            while((i = fr.read()) != -1)
            {
                System.out.println((char)i);
            }

            fr.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception:" + e);
        }
    }
}


  OUTPUT:
  A
B
C
D
E
F
G
H
I
J
K
L
M
N
O
P
Q
R
S
T
U
V
W
X
Y
Z


    RESULT:
Thus, the Java program to read and display the contents of the file sample2.txt using the FileReader class was successfully executed.
