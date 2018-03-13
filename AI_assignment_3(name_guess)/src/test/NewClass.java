package test;

/**
 *
 * @author HP-Stream
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NewClass 
{
    public static String arr[] = new String[250];

    int readFile(String fileName) throws IOException 
    {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try 
        {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            int i=0;
            while (line != null) {
                arr[i] = line;
                //sb.append(line);
                //sb.append("\n");
                line = br.readLine();
                i++;
            }
            return i;
        } finally {
            br.close();
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        NewClass class1 = new NewClass();
       
        int len = class1.readFile("input.txt");
        
        for(int i=0; i<3; i++)
        {
            System.out.println("length = " + len + " name = " + arr[i]);
        }
        
        
        
        //System.out.println("file = " + name );

    }
}
