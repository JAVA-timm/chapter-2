import java.util.Random;
import java.util.Scanner;

public class DataTypes
{
    public static void main(String[] args)
    {
        int monkeys = 5;
        int MonkeysEntered;
        int barrel;

        System.out.println("number of monkeys ="+ monkeys);

        barrel = monkeys;

        System.out.println("number of monkeys in the barrel =" + barrel);
        Scanner InputDevice = new Scanner(System.in);
        MonkeysEntered = InputDevice.nextInt();
        barrel = monkeys + MonkeysEntered;
        barrel = barrel/ (1 +(int)(Math.random()*10));
        System.out.println("due to over population and diseases ypu killed half of the monkeys\n" +
        "there are now only"+ barrel +"monkeys left in the barrel. SAD!");
    }
}
