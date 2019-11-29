import java.io.File;
import java.io.IOException;
import java.util.Scanner;

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

    public Integer findHamlet(String input){
        Integer count = 0;
        if (input.matches("Hamlet")) count++;
        return count;
    }

    public Integer findHoratio(String input){
        Integer count = 0;
        if (input.matches("Horatio")) count++;
        return count;
    }

    public String changeHamletToLeon(String input){
        return input.replaceAll("Hamlet", "Leon");
    }

    public String changeHotatioToTariq(String input){
        return input.replaceAll("Horatio", "Tariq");
    }

}
