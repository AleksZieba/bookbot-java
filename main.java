import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LetterCounter {
    public static void main(String[] args) {
        // Specify the path to your text file
        String filePath = "sample.txt";
        
        int[] letterFrequencies = new int[26];
        int totalLetters = 0;
        
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            
            for (String line : lines) {
                line = line.toLowerCase();
                for (char c : line.toCharArray()) {
                    if (c >= 'a' && c <= 'z') {
                        letterFrequencies[c - 'a']++;
                        totalLetters++;
                    }
                }
            }
            
            System.out.println("Total number of letters: " + totalLetters);
            
            for (int i = 0; i < letterFrequencies.length; i++) {
                char letter = (char) ('a' + i);
                System.out.println(letter + ": " + letterFrequencies[i]);
            }
            
        } catch (IOException e) {
            System.err.println("Error reading file: " + filePath);
            e.printStackTrace();
        }
    }
}