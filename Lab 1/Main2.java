import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Main2
 */
public class Main2 {

    public static void main(String[] args) throws IOException {
        
        try {
            FileWriter fw = new FileWriter("QS World University Rankings 2017.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            Unidata ud = new Unidata(2017, "551-600", "Chiang Mai University", 0.0, "https://www.topuniversities.com/universities/chiang-mai-university", "Thailand", "Chiang Mai", "Asia", "https://www.topuniversities.com/sites/default/files/profiles/logos/chiang-mai-university_118_large.jpg");
            
            pw.println(ud.toString());
            pw.flush();
            pw.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}