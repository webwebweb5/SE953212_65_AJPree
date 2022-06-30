import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("file/QS-World-University-Rankings-2017-2.csv");
        Scanner sc = new Scanner(file);
        sc.useDelimiter(",");

        ArrayList<UniData> uniList = new ArrayList<UniData>();
        
        // Skip the header
        sc.nextLine();
        while (sc.hasNextLine()) {
            UniData ud = new UniData();
            // UniData ud = new UniData(sc.next(), sc.next(), toLower(sc.next()), roundAll(zero(sc.next())), sc.next(), sc.next(), sc.next(), sc.next());
            ud.setYear(sc.next());
            ud.setRank(deleteRank(sc.next()));
            // ud.setRank(sc.next());
            ud.setUniName(toLower(sc.next()));
            // ud.setScore((ud.getRank() == "N/A")? "0" : zero(sc.next()));
            ud.setScore(roundAll(zero(sc.next())));
            ud.setLink(sc.next());
            ud.setCountry(sc.next());
            ud.setCity(sc.next());
            // ud.setRegion(sc.next());
            ud.setLogo(sc.next());
            // System.out.println(ud);
            uniList.add(ud);
            sc.nextLine();
        }

        // System.out.println(uniList.get(0).city);

        // Collections.sort(ArrayList<UniData> uniList);

        sort(uniList);

        // System.out.println(uniList);

        // write all data to csv file.
        // P2 #2 the output of sorted uni name of Part 1 and 2 in a new CSV file
        try {
            FileWriter fw = new FileWriter("QS-World-University-Rankings-2017_updated.csv", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            for (UniData uniData : uniList) {
                pw.println(uniData);
            }
            
            // pw.flush();
            pw.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();

    }
    
    // P1 #1 uniName lower case
    public static String toLower(String str) {
        return str.toLowerCase();
    }
    
    // P1 #2 Replace score to "0"
    public static String zero(String str) {
        if (!isNumericDouble(str) && !isNumericInt(str)) {
            str = "0";
        }
        return str;
    }
    
    // P1 #3 Round all the university scores
    public static String roundAll(String str) {
        double number = Double.parseDouble(str);
        return String.valueOf((int)Math.round(number));
    }
    
    // P1 #4 Remove rank that is not a digit from the list
    public static String deleteRank(String str){
        if (!isNumericInt(str)) {
            str = "-";
        }
        return str;
    }

    public static boolean isNumericInt(String string) {
        int intValue;
            
        if(string == null || string.equals("")) {
            return false;
        }
        
        try {
            intValue = Integer.parseInt(string);
            // doubleValue = Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            
        }
        return false;
    }

    public static boolean isNumericDouble(String string) {
        double doubleValue;
            
        if(string == null || string.equals("")) {
            return false;
        }

        try {
            doubleValue = Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) { 
            
        }
        return false;
    }
    
    // P2 #1 sorting
    public static void sort(ArrayList<UniData> list) {
    
        list.sort((o1, o2)
                  -> o1.uniName.compareTo(
                      o2.uniName));
    }
    
}
