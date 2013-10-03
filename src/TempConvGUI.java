/**
 * Created with IntelliJ IDEA.
 * User: ismail
 * Date: 2013/10/03
 * Time: 8:41 AM
 * To change this template use File | Settings | File Templates.
 */
import javax.swing.*;

public class TempConvGUI {
    public static void main(String[] args){
        String fahrString;
        Double fahr, cel;

        fahrString = JOptionPane.showInputDialog("Enter the temp in F:");
        fahr = new Double(fahrString);
        cel = (fahr - 32) * 5.0/9.0;

        JOptionPane.showMessageDialog(null, "The Temp in C is " + cel);
    }
}
