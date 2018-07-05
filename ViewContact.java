import java.util.*;
import java.io.*;
class ViewContact
{
    public static void main(String args[]) throws IOException
    {
        int ch;
        System.out.print("Enter Name : ");
        InputStreamReader std=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(std);
        String Name=br.readLine();

        FileReader fr=null;

        try{
            fr=new FileReader("contact.txt");
        }
        catch(FileNotFoundException ex){
            System.out.println("File Not Found.");
        }


        Scanner sc=new Scanner(fr);

        String[] con=new String[10];
        while(sc.hasNextLine())
        {
            String Line[]=sc.nextLine().split(":");
            String name=Line[0];
            String mobile=Line[1];
            
            if(name.equalsIgnoreCase(Name+" ")){
                System.out.println("\nMobile No : "+mobile);
                break;
            }
            
            


        }
        

       
    }
}