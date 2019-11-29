import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String hamletData;

    public HamletParser(){
        this.hamletData = loadFile();
    }

    private String loadFile(){
//        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File("/Users/jack/Dev/Labs/Week6/Maven.Regex-Hamlet-Parser/src/main/resources/hamlet.txt");
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData(){
        return hamletData;
    }

//    public Pattern findHamlet(){
////        Integer count = 0;
//        Pattern pattern = Pattern.compile("Hamlet");
////        if (input.matches("Hamlet")) count++;
//        return pattern;
//    }
//
//    public Integer findHoratio(String input){
//        Integer count = 0;
//        Pattern pattern = Pattern.compile("Horatio/i");
//        if (input.matches("Horatio")) count++;
//        return count;
//    }

    public String changeHamletToLeon(String input){
        // change standard case
        Pattern pattern = Pattern.compile("Hamlet");
        Matcher matcher = pattern.matcher(input);
        String theTragedyOfLeon = matcher.replaceAll( "Leon");
        // change upper case
        Pattern pattern2 = Pattern.compile("HAMLET");
        Matcher matcher2 = pattern2.matcher(theTragedyOfLeon);
        theTragedyOfLeon = matcher2.replaceAll("LEON");
        // return final product
        return theTragedyOfLeon;
    }

    public String changeHotatioToTariq(String input){
        // change standard case
        Pattern pattern = Pattern.compile("Horatio");
        Matcher matcher = pattern.matcher(input);
        String theTragedyOfLeon = matcher.replaceAll( "Tariq");
        // change upper case
        Pattern pattern2 = Pattern.compile("HORATIO");
        Matcher matcher2 = pattern2.matcher(theTragedyOfLeon);
        theTragedyOfLeon = matcher2.replaceAll("TARIQ");
        // return final product
        return theTragedyOfLeon;    }

}
