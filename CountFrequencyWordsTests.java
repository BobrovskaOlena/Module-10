import java.util.Map;

public class CountFrequencyWordsTests {
    public static void main(String[] args) {
        String fileName = "words.txt";
        Map<String, Integer> wordCountMap = CountFrequencyWords.getWordCountMap(fileName);
        CountFrequencyWords.printWordFrequency(wordCountMap);
    }
}
