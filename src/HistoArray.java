/**
 * Created with IntelliJ IDEA.
 * User: ismail
 * Date: 2013/10/03
 * Time: 8:52 AM
 * To change this template use File | Settings | File Templates.
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class HistoArray {

    public static void main(String[] args) {
        Scanner data = null;
        Integer[] count = {0,0,0,0,0,0,0,0,0,0};
        Integer idx;

        try {
            data = new Scanner(new File("test.dat"));
        }
        catch (IOException e) {
            System.out.println("Unable to open data file");
            e.printStackTrace();
            System.exit(0);
        }

        while(data.hasNextInt()) {
            idx = data.nextInt();
            count[idx] = count[idx] + 1;
        }

        idx = 0;
        for(Integer i : count) {
            System.out.println(idx + " occured " + i + " times.");
            idx++;
        }
    }
}
