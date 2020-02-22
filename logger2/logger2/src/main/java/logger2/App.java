package logger2;

/**
 * Hello world!
 *
 */
import java.io.PrintStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import java.lang.Math;
class Interest
{   private static Logger logger=LogManager.getLogger(App.class);
    PrintStream o=new PrintStream(new FileOutputStream(FileDescriptor.out));
    double principal_amount;
    double rate_of_interest;
    int time_in_years;
    Scanner s=new Scanner(System.in);
    public void values()
    {
        logger.info("please enter the principal amount");
        principal_amount=s.nextDouble();
        logger.info("please enter the rate of interest");
        rate_of_interest=s.nextDouble();
        o.println("please enter number of years the amount is deposited or borrowed for");
        time_in_years=s.nextInt();
    }
    public double simple()
    {
        return (principal_amount*rate_of_interest*time_in_years)/100;
    }
    public double compound()
    {
        o.print("please enter the number of times the interest is compounded per year ");
        int number_of_times_of_interest=s.nextInt();
        return principal_amount*(Math.pow((1+(rate_of_interest/number_of_times_of_interest)),(number_of_times_of_interest*time_in_years)));
    }
}
public class App
{
    public static void main (String[] args) {
   
        PrintStream outt=new PrintStream(new FileOutputStream(FileDescriptor.out));
        Interest i=new Interest();
        i.values();
        outt.println("Simple Interest :"+i.simple());
        outt.println("Compound Interest :"+i.compound());
    }
}
