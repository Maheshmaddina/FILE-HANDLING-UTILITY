import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FileHandler {
    public static void readFile(String filePath) {
        System.out.println("Reading file: " + filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public static void writeFile(String filePath, String content) {
        System.out.println("Writing to file: " + filePath);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Write complete.");
        } catch(IOException e){
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    public static void modifyFile(String filePath, String target, String replacement) {
        System.out.println("Modifying file: " + filePath);
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            List<String> modifiedLines = new ArrayList<>();

            for (String line : lines) {
                modifiedLines.add(line.replace(target, replacement));
            }

            Files.write(Paths.get(filePath), modifiedLines);
            System.out.println("Modification complete.");
        } catch(IOException e){
            System.out.println("Error modifying file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String filePath = "example.txt";

        writeFile(filePath, "Hello world!\nThis is a sample file.\nGoodbye world.");

        readFile(filePath);

        modifyFile(filePath, "world", "Java");

        readFile(filePath);
    }
}
