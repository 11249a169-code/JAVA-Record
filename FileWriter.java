EXPNO:11(A)
DATE:29|9|26

                            FILE WRITER

AIM:
To write and execute a Java program to create a file and write the uppercase English alphabets (A to Z) into the file using the FileWriter class.

ALGORITHM:
Start the program
Import the required Java I/O package
Create a class named FileWriter.
Define the main method.
Use a try block to handle exceptions.
Create a FileWriter object to open or create a file named sample2.txt.
Use a for loop with a character variable starting from ASCII value 65 to 90.
Write each character into the file using the write() method.
Close the file using the close() method.
Handle any exceptions using the catch block.
Stop the program.    


PROGARM:


import java.io.*;

class FileWriter
{
    public static void main(String[] args)
    {
        try
        {
            java.io.FileWriter fw = new java.io.FileWriter("sample2.txt");

            for(char i = 65; i < 91; i++)
            {
                fw.write(i);
            }

            fw.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception :" + e);
        }
    }
}


 OUTPUT:

 ABCDEFGHIJKLMNOPQRSTUVWXYZ


     RESULT:
     Thus, the Java program to create a file and write uppercase alphabets from A to Z into the file using the FileWriter class was successfully executed.
