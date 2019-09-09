import javax.swing.JOptionPane;

public class SalaryDialog
{
    public static void main(String[] args)
    {
        String wageString;
        String dependantString;
        int dependents;
        double wage;
        double weeklyPay;
        final double HOURS_IN_WEEK =37.5;
        int seletion;
        boolean isYes;

        wageString = JOptionPane.showInputDialog(null, "enter employee's hourly wage", " Salary Diolog 1", JOptionPane.INFORMATION_MESSAGE);
    weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
    dependantString = JOptionPane.showInputDialog(null, "how many dependents?","Salry Dialog 2",
            JOptionPane.QUESTION_MESSAGE);
    dependents = Integer.parseInt(dependantString);

    JOptionPane.showMessageDialog(null,"weekly salary is $" + weeklyPay + " number of dependents is "+ dependents);
    seletion = JOptionPane.showConfirmDialog(null, "do you want to upgrade to first class?");
    isYes = (seletion == JOptionPane.YES_OPTION);
    JOptionPane.showMessageDialog(null, "you responded " + isYes);



    }


}
