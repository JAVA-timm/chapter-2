import javax.swing.*;

public class PosterCode
{
    public static void main(String[] args)
    {
        int PostersBought;
        int BoxesFilled;
        int PostersLeft;
        final int BOX_LIMIT = 11;
        String postersboughtstring;
        postersboughtstring = JOptionPane.showInputDialog(null, "how many posters order today? ",
                "order diolog",JOptionPane.INFORMATION_MESSAGE);
        PostersBought = Integer.parseInt(postersboughtstring);

        BoxesFilled = PostersBought / BOX_LIMIT;
        PostersLeft = PostersBought % BOX_LIMIT;

        JOptionPane.showMessageDialog(null, "the number of boxes filled were " +
        BoxesFilled + " with " + PostersLeft + " posters left over");
    }
}
