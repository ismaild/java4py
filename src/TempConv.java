/**
 * Created with IntelliJ IDEA.
 * User: ismail
 * Date: 2013/10/03
 * Time: 8:03 AM
 * To change this template use File | Settings | File Templates.
 */

import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Double fahr;
        Double cel;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter The temp in F: ");
        fahr = in.nextDouble();

        cel = (fahr - 32) * 5.0/9.0;
        System.out.println("The Temp in C is: " + cel);

        System.exit(0);
    }
}
