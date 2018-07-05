import java.util.*;
import java.io.*;
class Contact
{
    public static void main(String args[]) throws IOException
    {
        char st='y';
        FileWriter fw=new FileWriter("contact.txt",true);
        BufferedWriter writer=new BufferedWriter(fw);
        while(st=='y')
        {
            InputStreamReader std=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(std);
            System.out.print("Enter Name : ");
            
            String Name=br.readLine();

            System.out.print("Mobile No : ");
            String Mobile=br.readLine();

            

            try{
                
                writer.write(Name+" : "+Mobile);
                writer.newLine();
                writer.flush();
                


            }catch(IOException e){
                System.out.println("Something went wrong");
            }

            //System.out.println(Name + Mobile);
            System.out.print("\nAdd More(y/n) : ");
            char s=(char) br.read();
            st=s;

        }
        writer.close();
    }
}