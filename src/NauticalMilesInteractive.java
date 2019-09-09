import java.util.Scanner;

public class NauticalMilesInteractive
{
    public static void main(String[] args)
    {
        //assined variables
        final double NM_TO_MILE = 1.50779;
        final double NM_TO_KILO = 1.850;
        double userInportNM;
        double nautialToMILES;
        double nautialToKILOS;

        //get input
        Scanner  input= new Scanner(System.in);

        System.out.println("enter the number of nautial miles >>>>> " );

        userInportNM = input.nextDouble();

        //make calculations
        nautialToKILOS = NM_TO_KILO * userInportNM;
           nautialToMILES = NM_TO_MILE * userInportNM;

         //wrighte output
        System.out.println("the number of miles in a nautial mile is " + nautialToMILES);
        System.out.println("the number of kilometers in a nautial mile is " + nautialToKILOS);

    }
}
