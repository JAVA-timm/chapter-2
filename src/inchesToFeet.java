import java.util.Scanner;

public class inchesToFeet
{
    public static void main(String[] args)
    {
            int Inches = 12;
            int Feet = 1;
            int userInput;
            int FeetTo;
            int InchesTo;
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the number of inches >>>>>> ");
        userInput = input.nextInt();
        InchesTo = userInput / Inches;
        FeetTo = userInput /  Feet;
        System.out.println("feet " + FeetTo + " Inches " + InchesTo);
    }
}
