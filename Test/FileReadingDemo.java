import java.io.*;

public class FileReadingDemo
{
    public static void main(String args[])
    {
        File f1 = new File(args[0]);

        if(!f1.isDirectory())
        {
            System.out.println("DIRECTRORY DOES NOT EXISTS BYE");
            System.exit(0);
        }

        String fnames [] = f1.list();

        System.out.println("No of Files "+fnames.length);
        for(String s:fnames)
        {
            System.out.println(s);
        }



    }
}