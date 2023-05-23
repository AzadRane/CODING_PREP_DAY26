import java.io.*;

public class CountingFileAndDirectory {

    public static void main(String args[])
    {
        File f = new File(args[0]);

        if(!f.exists())
        {
            System.out.println("Given file does not exits");
        }

        String fnames [] = f.list();

        System.out.println("Total no of Entries :"+fnames.length);

        int  fcnt=0;
        int dcnt=0;

        for(int i=0;i<fnames.length;i++)
        {
            File fob = new File(f.getAbsoluteFile()+"/"+fnames[i]);

            if(fob.isFile())
            {
                fcnt++;
            }
            if(fob.isDirectory())
            {
                dcnt++;
            }

        }

        System.out.println("Files count :"+fcnt);
        System.out.println("Directries count :"+dcnt);
    }
}
