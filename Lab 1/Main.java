import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        
        File f = new File("QS World University Rankings 2017.csv");
        Scanner myScan = new Scanner(f);

        while (myScan.hasNext()) {
            String dataLine = myScan.nextLine();
            String[] row = dataLine.split(",");

            for (String string : row) {
                System.out.println(string);
            }
        }

        myScan.close();

    }
}

