import java.util.Scanner;

public interface madLibs
{
    public static void main(String[] args)
    {
        String color;
        String wordEst;
        String bodyPart;
        String animal;
        String noun;
        String pluarlNoun;




        int a;
        int b;
        int c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a color >>>");
        color = input.nextLine();
        System.out.println("Enter a word ending EST >>>" );
        wordEst = input.nextLine();
        System.out.println("Enter a body part >>>");

        c = a%b;

        System.out.println("The " + color + " dragon is the " + wordEst + " Dragon of all. ");
        System.out.println("It");

    }
}
