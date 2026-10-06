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
