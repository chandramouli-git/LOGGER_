package LOGGER;

/**
 * Hello world!
 *
 */
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileDescriptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import java.util.Scanner;
class Construction
{
    PrintStream o=new PrintStream(new FileOutputStream(FileDescriptor.out));
    Scanner s=new Scanner(System.in);
    public int Standards()
    {
        o.println("Select the Standards of the materials of house");
        o.println("1.Standard material\n2.Above Standard material\n3.High Standard material");
        int select_standard=s.nextInt();
        return select_standard;
    }
    public void  Construction_Cost()
    {
        o.println("Enter the total area of the home");
        double area_of_home=s.nextInt();
        switch(Standards())
        {
            case 1: o.println(area_of_home*1200);break;
            case 2: o.println(area_of_home*1500);break;
            case 3: o.println("Do you want your home to be fully auotomated");
                    o.println("1.Yes\n2.No");
                    int auotomated=s.nextInt();
                    switch(auotomated)
                    {
                        case 1:o.println(2500*area_of_home);break;
                        case 2:o.println(1800*area_of_home);break;
                        default :o.println("Invalid selection");
                    }
                    break;
            default :o.println("Invalid selection");
        }
    }
}
public class App
{
     
     public static void main (String[] args) {
         Construction c=new Construction();
         c.Construction_Cost();
    }
}