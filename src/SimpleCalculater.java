import java.util.Scanner;

public class SimpleCalculater
{
    public static void main(String[] args)
    {
        int x = 10;
        double y =9.9999999;
        byte z =127;
        long l = 1900000000000000000L;
        short s = 32767;

        System.out.println(x +"number is how large a data se you can use and it is also\n" +
        "4 bytes in size.");
        System.out.println(y +" double data type nuber is larger than a int but in decimals.");
        System.out.println(z +" a byte data type is rather small in size and takes 8 byte.");
        System.out.println(l +" long data type is the largest and taks 8 bytes.");
        System.out.println(s +" short date type is only 2 bytes of memory");
        double entry1 = 0;
        double entry2;
        double total;
        System.out.println("Enter a number >>>>>");
        Scanner inputDevice = new Scanner(System.in);
        entry2 = inputDevice.nextDouble();
        System.out.println("Enter another number >>>>>");

        entry2 = inputDevice.nextDouble();

        total = entry1 + entry2;
        System.out.println(entry1 +" + " + entry2 + " = " + total);



    }
}
