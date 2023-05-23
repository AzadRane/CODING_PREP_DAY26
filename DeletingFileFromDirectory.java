import java.io.*;

public class DeletingFileFromDirectory {
  public static void main(String args[])throws Exception
  {
    File f = new File(args[0]);

    if(!f.exists())
    {
        System.out.println("File does not exist good bye");
        
    }
    if(!f.isDirectory())
    {
        System.out.println("Given file is not a directory please send directory name");
    }

    String fnames [] = f.list();

    for(int i=0;i<fnames.length;i++)
    {
        if(fnames[i].endsWith(".txt"))
        {
            System.out.println("Do you want to delete this file "+fnames[i]+" ?");

            System.out.println("Enter choice 1-yes 2-no");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int ch = Integer.parseInt(br.readLine());

            if(ch==1)
            {
                File fob = new File(f.getAbsolutePath()+"/"+fnames[i]);
                fob.delete();

                System.out.println("File is deleted MASTER!!");
            }

        }
    }
  }  
}
