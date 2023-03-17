import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class CountFrequencyWords {
        public static Map<String, Integer> getWordCountMap(String fileName) {
            Map<String, Integer> wordCountMap = new HashMap<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] words = line.trim().split("\\s+");
                    for (String word : words) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return wordCountMap;
        }

        public static void printWordFrequency(Map<String, Integer> wordCountMap) {
            List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCountMap.entrySet());
            wordList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
            for (Map.Entry<String, Integer> entry : wordList) {
                System.out.println("Frequency of word <"+entry.getKey() + "> - " + entry.getValue()+ " duplication");
            }
        }
    }

